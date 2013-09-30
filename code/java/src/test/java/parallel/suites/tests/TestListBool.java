package parallel.suites.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import model.ListBool.ListBoolRoot;
import model.ListBool.repositories.ListBoolRootRepository;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.patterns.ServiceLocator;

public class TestListBool {
  private static ServiceLocator locator;
  private static ListBoolRootRepository listBoolRootRepository;

  private final static List<Boolean> defaultVal = new ArrayList<Boolean>();
  private final static List<Boolean> someVal = Arrays.asList(true, false, true, false);

  public static class ListBoolRootFactory implements Iterable<ListBoolRoot> {
    private final int size;
    private final boolean isDefaultSet;
    private final List<Boolean> defaultValue;

    public static ListBoolRootFactory make(final int size) {
      return new ListBoolRootFactory(size, false, defaultVal);
    }

    private ListBoolRootFactory(final int size, final boolean isDefaultSet, final List<Boolean> defaultValue) {
      this.size = size;
      this.isDefaultSet = isDefaultSet;
      this.defaultValue = defaultValue;
    }

    public ListBoolRootFactory setDefaultValue(final List<Boolean> defaultValue) {
      return new ListBoolRootFactory(size, true, defaultValue);
    }

    public ListBoolRootFactory removeDefaultValue() {
      return isDefaultSet ? new ListBoolRootFactory(size, false, defaultVal) : this;
    }

    public ListBoolRoot[] toArray() {
      final ListBoolRoot[] roots = new ListBoolRoot[size];
      for (int i = 0; i < size; i++) roots[i] = vendRoot();
      return roots;
    }

    @Override
    public Iterator<ListBoolRoot> iterator() {
      return new ListBoolRootFactoryIterator();
    }

    private ListBoolRoot vendRoot() {
      final ListBoolRoot root = new ListBoolRoot();
      if (isDefaultSet) {
        root.setListBool(defaultValue);
      }
      return root;
    }

    public class ListBoolRootFactoryIterator implements Iterator<ListBoolRoot> {
      private int remaining = size;

      @Override
      public boolean hasNext() {
        return remaining > 0;
      }

      @Override
      public ListBoolRoot next() {
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
    listBoolRootRepository = locator.resolve(ListBoolRootRepository.class);
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    listBoolRootRepository = null;

    locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
    locator = null;
  }

  @Before
  public void setUp() throws Exception {
    final List<ListBoolRoot> listBoolRootList = listBoolRootRepository.findAll().get();
    listBoolRootRepository.delete(listBoolRootList).get();
  }

  // ========================== D E F A U L T ==================================

  @Test
  /**
   * DEFAULT TYPE
   */
  public void type() throws Exception {
    assertEquals(ListBoolRoot.class.getDeclaredField("listBool").getType(), List.class);
    assertEquals(ListBoolRoot.class.getMethod("getListBool").getReturnType(), List.class);
    assertEquals(ListBoolRoot.class.getMethod("setListBool", List.class).getReturnType(), ListBoolRoot.class);
  }
  // ----------------------------------------------------------------------------

  @Test
  /**
   * DEFAULT VALUE
   */
  public void defaultValue() throws IOException {
    final ListBoolRoot root = new ListBoolRoot();
    assertEquals(root.getListBool(), defaultVal);
  }

  @Test
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void defaultValueAfterPersist() throws IOException {
    final ListBoolRoot root = new ListBoolRoot();
    root.persist();
    assertEquals(root.getListBool(), defaultVal);
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void defaultValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final ListBoolRoot root    = new ListBoolRoot();
    root.persist();
    final String      uri     = root.getURI();
    final ListBoolRoot retRoot = listBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertEquals(retRoot.getListBool(), defaultVal);
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void defaultValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ListBoolRoot root    = new ListBoolRoot();
    final String      uri     = listBoolRootRepository.insert(root).get();
    final ListBoolRoot retRoot = listBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertEquals(retRoot.getListBool(), defaultVal);
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void defaultValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ListBoolRoot[]     roots     = ListBoolRootFactory.make(1000).toArray();
    final List<String>      uris     = listBoolRootRepository.insert(roots).get();
    final List<ListBoolRoot> retRoots = listBoolRootRepository.find(uris.toArray(new String[uris.size()])).get();

    for(final ListBoolRoot root : retRoots) {
      assertEquals(root.getListBool(), defaultVal);
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void defaultValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<ListBoolRoot> roots = ListBoolRootFactory.make(10000);
    final List<String>      uris     = listBoolRootRepository.insert(roots).get();
    final List<ListBoolRoot> retRoots = listBoolRootRepository.find(uris).get();

    for(final ListBoolRoot root : retRoots) {
      assertEquals(root.getListBool(), defaultVal);
    }
  }

  // ============================= V A L U E =====================================

  @Test
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void trueValueAfterPersist() throws IOException {
    final ListBoolRoot root = new ListBoolRoot().setListBool(someVal);
    root.persist();
    assertEquals(root.getListBool(), someVal);
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void trueValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final ListBoolRoot root    = new ListBoolRoot().setListBool(someVal);
    root.persist();
    final String      uri     = root.getURI();
    final ListBoolRoot retRoot = listBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertEquals(retRoot.getListBool(), someVal);
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void trueValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ListBoolRoot root    = new ListBoolRoot().setListBool(someVal);
    final String      uri     = listBoolRootRepository.insert(root).get();
    final ListBoolRoot retRoot = listBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertEquals(retRoot.getListBool(), someVal);
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void trueValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ListBoolRoot[]     roots     = ListBoolRootFactory.make(1000).setDefaultValue(someVal).toArray();
    final List<String>      uris     = listBoolRootRepository.insert(roots).get();
    final List<ListBoolRoot> retRoots = listBoolRootRepository.find(uris.toArray(new String[uris.size()])).get();

    for(final ListBoolRoot root : retRoots) {
      assertEquals(root.getListBool(), someVal);
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void trueValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<ListBoolRoot> roots = ListBoolRootFactory.make(10000).setDefaultValue(someVal);
    final List<String>      uris     = listBoolRootRepository.insert(roots).get();
    final List<ListBoolRoot> retRoots = listBoolRootRepository.find(uris).get();

    for(final ListBoolRoot root : retRoots) {
      assertEquals(root.getListBool(), someVal);
    }
  }


 //========================= R E P O S I T O R Y  U P D A T E  D E F A U L T  T O  ${PropertyTestName} =========================

 @Test
 /**
  * FIND INSERTED DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final ListBoolRoot root    = new ListBoolRoot();
   final String      uri     = listBoolRootRepository.insert(root).get();
   final ListBoolRoot insertedRoot = listBoolRootRepository.find(uri).get();

   assertEquals(insertedRoot.getURI(), uri);
   assertEquals(insertedRoot.getListBool(), defaultVal);

   insertedRoot.setListBool(someVal);

   final ListBoolRoot updatedRoot = listBoolRootRepository.update(insertedRoot).get();
   assertEquals(insertedRoot.getURI(), updatedRoot.getURI());
   assertEquals(insertedRoot.getListBool(), updatedRoot.getListBool());
 }

 @Test
 /**
  * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByMedumLargeArrayBatchRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final ListBoolRoot[]     roots     = ListBoolRootFactory.make(1000).toArray();
   final List<String>      insertedUris     = listBoolRootRepository.insert(roots).get();
   final List<ListBoolRoot> insertedRoots = listBoolRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();

   for(final ListBoolRoot root : insertedRoots) {
     assertEquals(root.getListBool(), defaultVal);
     root.setListBool(someVal); // set to new value
   }

   final List<String> updatedUris = listBoolRootRepository.update(insertedRoots.toArray(new ListBoolRoot[insertedRoots.size()])).get();
   final List<ListBoolRoot> updatedRoots = listBoolRootRepository.find(updatedUris.toArray(new String[updatedUris.size()])).get(); //FIXME
   assertEquals(insertedRoots.size(), updatedRoots.size());
   assertTrue(updatedUris.containsAll(insertedUris));

   for(final ListBoolRoot root : updatedRoots) {
     assertEquals(root.getListBool(), someVal);
   }
 }

 @Test
 /**
  * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByLargeIterableBatchRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final Iterable<ListBoolRoot> roots = ListBoolRootFactory.make(10000);
   final List<String>      insertedUris     = listBoolRootRepository.insert(roots).get();
   final List<ListBoolRoot> insertedRoots = listBoolRootRepository.find(insertedUris).get();

   for(final ListBoolRoot root : insertedRoots) {
     assertEquals(root.getListBool(), defaultVal);
     root.setListBool(someVal); // set to new value
   }

   final List<String> updatedUris = listBoolRootRepository.update(insertedRoots).get();
   final List<ListBoolRoot> updatedRoots = listBoolRootRepository.find(updatedUris).get(); //FIXME
   assertEquals(insertedRoots.size(), updatedRoots.size());
   assertTrue(updatedUris.containsAll(insertedUris));

   for(final ListBoolRoot root : updatedRoots) {
     assertEquals(root.getListBool(), someVal);
   }
 }

 //============================ D E L E T E ====================================

 @Test
 /**
  * DELETE PERSISTED ROOT THEN FIND WITH REPOSITORY
  */
 public void deletePersistedRootThenFind() throws IOException, ExecutionException, InterruptedException {
   final ListBoolRoot root    = new ListBoolRoot();
   root.persist();

   final String      uri     = root.getURI();

   root.delete();

   try {
     listBoolRootRepository.find(uri).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
   }
 }

 @Test
 /**
  * DELETE REPOSITORY INSERTED ROOT THEN FIND
  */
 public void deleteRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final ListBoolRoot root    = new ListBoolRoot();
   final String      uri     = listBoolRootRepository.insert(root).get();

   final ListBoolRoot retRoot = listBoolRootRepository.find(uri).get();
   listBoolRootRepository.delete(retRoot).get();

   try {
     listBoolRootRepository.find(uri).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
   }
 }

 @Test
 /**
  * DELETE MEDIUM LARGE BATCH INSERTED ARRAY THEN FIND
  */
 public void deleteMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final ListBoolRoot[]     roots     = ListBoolRootFactory.make(1000).toArray();
   final List<String>      insertedUris  = listBoolRootRepository.insert(roots).get();
   final List<ListBoolRoot> insertedRoots = listBoolRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();

   listBoolRootRepository.delete(insertedRoots.toArray(new ListBoolRoot[insertedRoots.size()])).get();

   final List<ListBoolRoot> deletedRoots = listBoolRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();
   assertEquals(deletedRoots.size(), 0);
 }

 @Test
 /**
  * DELETE LARGE BATCH INSERTED ITERABLE THEN FIND
  */
 public void deleteLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final Iterable<ListBoolRoot> roots = ListBoolRootFactory.make(10000);
   final List<String>      insertedUris  = listBoolRootRepository.insert(roots).get();
   final List<ListBoolRoot> insertedRoots = listBoolRootRepository.find(insertedUris).get();

   listBoolRootRepository.delete(insertedRoots).get();

   final List<ListBoolRoot> deletedRoots = listBoolRootRepository.find(insertedUris).get();
   assertEquals(deletedRoots.size(), 0);
 }
}
