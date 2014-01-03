package parallel.suites.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import model.OneBool.OneBoolRoot;
import model.OneBool.repositories.OneBoolRootRepository;

import org.junit.*;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.patterns.ServiceLocator;

public class TestOneBool {
  private static ServiceLocator locator;
  private static OneBoolRootRepository oneBoolRootRepository;


  public static class OneBoolRootFactory implements Iterable<OneBoolRoot> {
    private final int size;
    private final boolean isDefaultSet;
    private final boolean defaultValue;

    public static OneBoolRootFactory make(final int size) {
      return new OneBoolRootFactory(size, false, false);
    }

    private OneBoolRootFactory(final int size, final boolean isDefaultSet, final boolean defaultValue) {
      this.size = size;
      this.isDefaultSet = isDefaultSet;
      this.defaultValue = defaultValue;
    }

    public OneBoolRootFactory setDefaultValue(final boolean defaultValue) {
      return new OneBoolRootFactory(size, true, defaultValue);
    }

    public OneBoolRootFactory removeDefaultValue() {
      return isDefaultSet ? new OneBoolRootFactory(size, false, false) : this;
    }

    public OneBoolRoot[] toArray() {
      final OneBoolRoot[] roots = new OneBoolRoot[size];
      for (int i = 0; i < size; i++) roots[i] = vendRoot();
      return roots;
    }

    @Override
    public Iterator<OneBoolRoot> iterator() {
      return new OneBoolRootFactoryIterator();
    }

    private OneBoolRoot vendRoot() {
      final OneBoolRoot root = new OneBoolRoot();
      if (isDefaultSet) {
        root.setOneBool(defaultValue);
      }
      return root;
    }

    public class OneBoolRootFactoryIterator implements Iterator<OneBoolRoot> {
      private int remaining = size;

      @Override
      public boolean hasNext() {
        return remaining > 0;
      }

      @Override
      public OneBoolRoot next() {
        remaining--;
        return vendRoot();
      }

      @Override
      public void remove() {
      }
    }
  }

  // ----------------------------------------------------------------------------

  @BeforeClass
  public static void setUpClass() throws Exception {
    locator = Bootstrap.init(System.getProperty("user.home") + "/.config/DSL-OCD/project.ini");
    oneBoolRootRepository = locator.resolve(OneBoolRootRepository.class);
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    oneBoolRootRepository = null;

    locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
    locator = null;
  }

  @Before
  public void setUp() throws Exception {
    final List<OneBoolRoot> oneBoolRootList = oneBoolRootRepository.findAll().get();
    oneBoolRootRepository.delete(oneBoolRootList).get();
  }

  // ========================== D E F A U L T ==================================

  @Test
  /**
   * DEFAULT TYPE
   */
  public void type() throws Exception {
    assertEquals(OneBoolRoot.class.getDeclaredField("oneBool").getType(), boolean.class);
    assertEquals(OneBoolRoot.class.getMethod("getOneBool").getReturnType(), boolean.class);
    assertEquals(OneBoolRoot.class.getMethod("setOneBool", boolean.class).getReturnType(), OneBoolRoot.class);
  }
  // ----------------------------------------------------------------------------

  @Test
  /**
   * DEFAULT VALUE
   */
  public void defaultValue() throws IOException {
    final OneBoolRoot root = new OneBoolRoot();
    assertTrue(root.getOneBool() == false);
  }

  @Test
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void defaultValueAfterPersist() throws IOException {
    final OneBoolRoot root = new OneBoolRoot();
    root.persist();
    assertTrue(root.getOneBool() == false);
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void defaultValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final OneBoolRoot root    = new OneBoolRoot();
    root.persist();
    final String      uri     = root.getURI();
    final OneBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOneBool() == false);
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void defaultValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OneBoolRoot root    = new OneBoolRoot();
    final String      uri     = oneBoolRootRepository.insert(root).get();
    final OneBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOneBool() == false);
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void defaultValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OneBoolRoot[]     roots     = OneBoolRootFactory.make(1000).toArray();
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OneBoolRoot> retRoots = oneBoolRootRepository.find(uris.toArray(new String[uris.size()])).get();

    for(final OneBoolRoot root : retRoots) {
      assertTrue(root.getOneBool() == false);
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void defaultValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<OneBoolRoot> roots = OneBoolRootFactory.make(10000);
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OneBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

    for(final OneBoolRoot root : retRoots) {
      assertTrue(root.getOneBool() == false);
    }
  }

  // ============================= T R U E =====================================

  @Test
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void trueValueAfterPersist() throws IOException {
    final OneBoolRoot root = new OneBoolRoot().setOneBool(true);
    root.persist();
    assertTrue(root.getOneBool() == true);
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void trueValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final OneBoolRoot root    = new OneBoolRoot().setOneBool(true);
    root.persist();
    final String      uri     = root.getURI();
    final OneBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOneBool() == true);
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void trueValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OneBoolRoot root    = new OneBoolRoot().setOneBool(true);
    final String      uri     = oneBoolRootRepository.insert(root).get();
    final OneBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOneBool() == true);
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void trueValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OneBoolRoot[]     roots     = OneBoolRootFactory.make(1000).setDefaultValue(true).toArray();
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OneBoolRoot> retRoots = oneBoolRootRepository.find(uris.toArray(new String[uris.size()])).get();

    for(final OneBoolRoot root : retRoots) {
      assertTrue(root.getOneBool() == true);
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void trueValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<OneBoolRoot> roots = OneBoolRootFactory.make(10000).setDefaultValue(true);
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OneBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

    for(final OneBoolRoot root : retRoots) {
      assertTrue(root.getOneBool() == true);
    }
  }

  //============================ F A L S E ====================================

 @Test
 /**
  * DEFAULT VALUE AFTER PERSIST
  */
 public void falseValueAfterPersist() throws IOException {
   final OneBoolRoot root = new OneBoolRoot().setOneBool(false);
   root.persist();
   assertTrue(root.getOneBool() == false);
 }

 @Test
 /**
  * FIND PERSISTED DEFAULT VALUE BOOL
  */
 public void falseValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot root    = new OneBoolRoot().setOneBool(false);
   root.persist();
   final String      uri     = root.getURI();
   final OneBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
   assertEquals(retRoot.getURI(), uri);
   assertTrue(retRoot.getOneBool() == false);
 }

 @Test
 /**
  * FIND INSERTED DEFAULT VALUE BOOL
  */
 public void falseValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot root    = new OneBoolRoot().setOneBool(false);
   final String      uri     = oneBoolRootRepository.insert(root).get();
   final OneBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
   assertEquals(retRoot.getURI(), uri);
   assertTrue(retRoot.getOneBool() == false);
 }

 @Test
 /**
  * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
  */
 public void falseValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot[]     roots     = OneBoolRootFactory.make(1000).setDefaultValue(false).toArray();
   final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
   final List<OneBoolRoot> retRoots = oneBoolRootRepository.find(uris.toArray(new String[uris.size()])).get();

   for(final OneBoolRoot root : retRoots) {
     assertTrue(root.getOneBool() == false);
   }
 }

 @Test
 /**
  * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
  */
 public void falseValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final Iterable<OneBoolRoot> roots = OneBoolRootFactory.make(10000).setDefaultValue(false);
   final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
   final List<OneBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

   for(final OneBoolRoot root : retRoots) {
     assertTrue(root.getOneBool() == false);
   }
 }
 //========================= R E P O S I T O R Y  U P D A T E  D E F A U L T  T O  ${PropertyTestName} =========================

 @Test
 /**
  * FIND INSERTED DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot root    = new OneBoolRoot();
   final String      uri     = oneBoolRootRepository.insert(root).get();
   final OneBoolRoot insertedRoot = oneBoolRootRepository.find(uri).get();

   assertEquals(insertedRoot.getURI(), uri);
   assertEquals(insertedRoot.getOneBool(), false);

   insertedRoot.setOneBool(true);

   final OneBoolRoot updatedRoot = oneBoolRootRepository.update(insertedRoot).get();
   assertEquals(insertedRoot.getURI(), updatedRoot.getURI());
   assertEquals(insertedRoot.getOneBool(), updatedRoot.getOneBool());
 }

 @Test
 /**
  * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByMedumLargeArrayBatchRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot[]     roots     = OneBoolRootFactory.make(1000).toArray();
   final List<String>      insertedUris     = oneBoolRootRepository.insert(roots).get();
   final List<OneBoolRoot> insertedRoots = oneBoolRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();

   for(final OneBoolRoot root : insertedRoots) {
     assertEquals(root.getOneBool(), false);
     root.setOneBool(true); // set to new value
   }

   final List<String> updatedUris = oneBoolRootRepository.update(insertedRoots.toArray(new OneBoolRoot[insertedRoots.size()])).get();
   final List<OneBoolRoot> updatedRoots = oneBoolRootRepository.find(updatedUris.toArray(new String[updatedUris.size()])).get(); //FIXME
   assertEquals(insertedRoots.size(), updatedRoots.size());
   assertTrue(updatedUris.containsAll(insertedUris));

   for(final OneBoolRoot root : updatedRoots) {
     assertEquals(root.getOneBool(), true);
   }
 }

 @Test
 /**
  * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByLargeIterableBatchRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final Iterable<OneBoolRoot> roots = OneBoolRootFactory.make(10000);
   final List<String>      insertedUris     = oneBoolRootRepository.insert(roots).get();
   final List<OneBoolRoot> insertedRoots = oneBoolRootRepository.find(insertedUris).get();

   for(final OneBoolRoot root : insertedRoots) {
     assertEquals(root.getOneBool(), false);
     root.setOneBool(true); // set to new value
   }

   final List<String> updatedUris = oneBoolRootRepository.update(insertedRoots).get();
   final List<OneBoolRoot> updatedRoots = oneBoolRootRepository.find(updatedUris).get(); //FIXME
   assertEquals(insertedRoots.size(), updatedRoots.size());
   assertTrue(updatedUris.containsAll(insertedUris));

   for(final OneBoolRoot root : updatedRoots) {
     assertEquals(root.getOneBool(), true);
   }
 }

 //============================ D E L E T E ====================================

 @Test
 /**
  * DELETE PERSISTED ROOT THEN FIND WITH REPOSITORY
  */
 public void deletePersistedRootThenFind() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot root    = new OneBoolRoot();
   root.persist();

   final String      uri     = root.getURI();

   root.delete();

   try {
     oneBoolRootRepository.find(uri).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
   }
 }

 @Test
 /**
  * DELETE REPOSITORY INSERTED ROOT THEN FIND
  */
 public void deleteRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot root    = new OneBoolRoot();
   final String      uri     = oneBoolRootRepository.insert(root).get();

   final OneBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
   oneBoolRootRepository.delete(retRoot).get();

   try {
     oneBoolRootRepository.find(uri).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
   }
 }

 @Test
 /**
  * DELETE MEDIUM LARGE BATCH INSERTED ARRAY THEN FIND
  */
 public void deleteMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final OneBoolRoot[]     roots     = OneBoolRootFactory.make(1000).toArray();
   final List<String>      insertedUris  = oneBoolRootRepository.insert(roots).get();
   final List<OneBoolRoot> insertedRoots = oneBoolRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();

   oneBoolRootRepository.delete(insertedRoots.toArray(new OneBoolRoot[insertedRoots.size()])).get();

   final List<OneBoolRoot> deletedRoots = oneBoolRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();
   assertEquals(deletedRoots.size(), 0);
 }

 @Test
 /**
  * DELETE LARGE BATCH INSERTED ITERABLE THEN FIND
  */
 public void deleteLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final Iterable<OneBoolRoot> roots = OneBoolRootFactory.make(10000);
   final List<String>      insertedUris  = oneBoolRootRepository.insert(roots).get();
   final List<OneBoolRoot> insertedRoots = oneBoolRootRepository.find(insertedUris).get();

   oneBoolRootRepository.delete(insertedRoots).get();

   final List<OneBoolRoot> deletedRoots = oneBoolRootRepository.find(insertedUris).get();
   assertEquals(deletedRoots.size(), 0);
 }
}
