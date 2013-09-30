package parallel.suites.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import model.ArrBool.ArrBoolRoot;
import model.ArrBool.repositories.ArrBoolRootRepository;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.patterns.ServiceLocator;

public class TestArrBool {
  private static ServiceLocator locator;
  private static ArrBoolRootRepository listArrRootRepository;

  private final static boolean[] defaultVal = {};
  private final static boolean[] someVal = {true, false, true, false};

  private static boolean compareArrays(boolean[] a, boolean[] b) {
    if (a == null && b != null) return false;
    if (a != null && b == null) return false;
    if (a == null && b == null) return true;
    if (a.length != b.length) return false;

    for (int index = 0; index < a.length; index++) {
      if (!a[index] == b[index]) return false;
    }
    return true;
  }

  public static class ArrBoolRootFactory implements Iterable<ArrBoolRoot> {
    private final int size;
    private final boolean isDefaultSet;
    private final boolean[] defaultValue;

    public static ArrBoolRootFactory make(final int size) {
      return new ArrBoolRootFactory(size, false, defaultVal);
    }

    private ArrBoolRootFactory(final int size, final boolean isDefaultSet, final boolean[] defaultValue) {
      this.size = size;
      this.isDefaultSet = isDefaultSet;
      this.defaultValue = defaultValue;
    }

    public ArrBoolRootFactory setDefaultValue(final boolean[] defaultValue) {
      return new ArrBoolRootFactory(size, true, defaultValue);
    }

    public ArrBoolRootFactory removeDefaultValue() {
      return isDefaultSet ? new ArrBoolRootFactory(size, false, defaultVal) : this;
    }

    public ArrBoolRoot[] toArray() {
      final ArrBoolRoot[] roots = new ArrBoolRoot[size];
      for (int i = 0; i < size; i++) roots[i] = vendRoot();
      return roots;
    }

    @Override
    public Iterator<ArrBoolRoot> iterator() {
      return new ArrBoolRootFactoryIterator();
    }

    private ArrBoolRoot vendRoot() {
      final ArrBoolRoot root = new ArrBoolRoot();
      if (isDefaultSet) {
        root.setArrBool(defaultValue);
      }
      return root;
    }

    public class ArrBoolRootFactoryIterator implements Iterator<ArrBoolRoot> {
      private int remaining = size;

      @Override
      public boolean hasNext() {
        return remaining > 0;
      }

      @Override
      public ArrBoolRoot next() {
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
    listArrRootRepository = locator.resolve(ArrBoolRootRepository.class);
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    listArrRootRepository = null;

    locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
    locator = null;
  }

  @Before
  public void setUp() throws Exception {
    final List<ArrBoolRoot> rootList = listArrRootRepository.findAll().get();
    listArrRootRepository.delete(rootList).get();
  }

  // ========================== D E F A U L T ==================================

  @Test
  /**
   * DEFAULT TYPE
   */
  public void type() throws Exception {
    assertEquals(ArrBoolRoot.class.getDeclaredField("arrBool").getType(), boolean[].class);
    assertEquals(ArrBoolRoot.class.getMethod("getArrBool").getReturnType(), boolean[].class);
    assertEquals(ArrBoolRoot.class.getMethod("setArrBool", boolean[].class).getReturnType(), ArrBoolRoot.class);
  }
  // ----------------------------------------------------------------------------

  @Test
  /**
   * DEFAULT VALUE
   */
  public void defaultValue() throws IOException {
    final ArrBoolRoot root = new ArrBoolRoot();
    //assertEquals(root.getArrBool(), defaultVal);
    assertTrue(compareArrays(root.getArrBool(), defaultVal));
  }

  @Test
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void defaultValueAfterPersist() throws IOException {
    final ArrBoolRoot root = new ArrBoolRoot();
    root.persist();
    //assertEquals(root.getArrBool(), defaultVal);
    assertTrue(compareArrays(root.getArrBool(), defaultVal));
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void defaultValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot root    = new ArrBoolRoot();
    root.persist();
    final String      uri     = root.getURI();
    final ArrBoolRoot retRoot = listArrRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    //assertEquals(retRoot.getArrBool(), defaultVal);
    assertTrue(compareArrays(retRoot.getArrBool(), defaultVal));
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void defaultValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot root    = new ArrBoolRoot();
    final String      uri     = listArrRootRepository.insert(root).get();
    final ArrBoolRoot retRoot = listArrRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    //assertEquals(retRoot.getArrBool(), defaultVal);
    assertTrue(compareArrays(retRoot.getArrBool(), defaultVal));
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void defaultValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot[]     roots     = ArrBoolRootFactory.make(1000).toArray();
    final List<String>      uris     = listArrRootRepository.insert(roots).get();
    final List<ArrBoolRoot> retRoots = listArrRootRepository.find(uris.toArray(new String[uris.size()])).get();

    for(final ArrBoolRoot root : retRoots) {
      //assertEquals(root.getArrBool(), defaultVal);
      assertTrue(compareArrays(root.getArrBool(), defaultVal));
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void defaultValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<ArrBoolRoot> roots = ArrBoolRootFactory.make(10000);
    final List<String>      uris     = listArrRootRepository.insert(roots).get();
    final List<ArrBoolRoot> retRoots = listArrRootRepository.find(uris).get();

    for(final ArrBoolRoot root : retRoots) {
      //assertEquals(root.getArrBool(), defaultVal);
      assertTrue(compareArrays(root.getArrBool(), defaultVal));
    }
  }

  // ============================= V A L U E =====================================

  @Test(expected=IllegalArgumentException.class)
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void trueValueAfterPersist() throws IOException {
    final ArrBoolRoot root = new ArrBoolRoot().setArrBool(null);
    root.persist();
    //assertEquals(root.getArrBool(), someVal);
    assertTrue(compareArrays(root.getArrBool(), someVal));
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void trueValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot root    = new ArrBoolRoot().setArrBool(someVal);
    root.persist();
    final String      uri     = root.getURI();
    final ArrBoolRoot retRoot = listArrRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    //assertEquals(retRoot.getArrBool(), someVal);
    assertTrue(compareArrays(retRoot.getArrBool(), someVal));
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void trueValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot root    = new ArrBoolRoot().setArrBool(someVal);
    final String      uri     = listArrRootRepository.insert(root).get();
    final ArrBoolRoot retRoot = listArrRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    //assertEquals(retRoot.getArrBool(), someVal);
    assertTrue(compareArrays(retRoot.getArrBool(), someVal));
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void trueValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot[]     roots     = ArrBoolRootFactory.make(1000).setDefaultValue(someVal).toArray();
    final List<String>      uris     = listArrRootRepository.insert(roots).get();
    final List<ArrBoolRoot> retRoots = listArrRootRepository.find(uris.toArray(new String[uris.size()])).get();

    for(final ArrBoolRoot root : retRoots) {
      //assertEquals(root.getArrBool(), someVal);
      assertTrue(compareArrays(root.getArrBool(), someVal));
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void trueValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<ArrBoolRoot> roots = ArrBoolRootFactory.make(10000).setDefaultValue(someVal);
    final List<String>      uris     = listArrRootRepository.insert(roots).get();
    final List<ArrBoolRoot> retRoots = listArrRootRepository.find(uris).get();

    for(final ArrBoolRoot root : retRoots) {
      //assertEquals(root.getArrBool(), someVal);
      assertTrue(compareArrays(root.getArrBool(), someVal));
    }
  }


 //========================= R E P O S I T O R Y  U P D A T E  D E F A U L T  T O  ${PropertyTestName} =========================

 @Test
 /**
  * FIND INSERTED DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot root    = new ArrBoolRoot();
   final String      uri     = listArrRootRepository.insert(root).get();
   final ArrBoolRoot insertedRoot = listArrRootRepository.find(uri).get();

   assertEquals(insertedRoot.getURI(), uri);
   //assertEquals(insertedRoot.getArrBool(), defaultVal);
   assertTrue(compareArrays(insertedRoot.getArrBool(), defaultVal));

   insertedRoot.setArrBool(someVal);

   final ArrBoolRoot updatedRoot = listArrRootRepository.update(insertedRoot).get();
   assertEquals(insertedRoot.getURI(), updatedRoot.getURI());
   //assertEquals(insertedRoot.getArrBool(), updatedRoot.getArrBool());
   assertTrue(compareArrays(insertedRoot.getArrBool(), updatedRoot.getArrBool()));
 }

 @Test
 /**
  * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByMedumLargeArrayBatchRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot[]     roots     = ArrBoolRootFactory.make(1000).toArray();
   final List<String>      insertedUris     = listArrRootRepository.insert(roots).get();
   final List<ArrBoolRoot> insertedRoots = listArrRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();

   for(final ArrBoolRoot root : insertedRoots) {
     //assertEquals(root.getArrBool(), defaultVal);
     assertTrue(compareArrays(root.getArrBool(), defaultVal));
     root.setArrBool(someVal); // set to new value
   }

   final List<String> updatedUris = listArrRootRepository.update(insertedRoots.toArray(new ArrBoolRoot[insertedRoots.size()])).get();
   final List<ArrBoolRoot> updatedRoots = listArrRootRepository.find(updatedUris.toArray(new String[updatedUris.size()])).get(); //FIXME
   assertEquals(insertedRoots.size(), updatedRoots.size());
   assertTrue(updatedUris.containsAll(insertedUris));

   for(final ArrBoolRoot root : updatedRoots) {
     //assertEquals(root.getArrBool(), someVal);
     assertTrue(compareArrays(root.getArrBool(), someVal));
   }
 }

 @Test
 /**
  * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
  */
 public void updateDefaultValueByLargeIterableBatchRepositoryInsertToTrue() throws IOException, ExecutionException, InterruptedException {
   final Iterable<ArrBoolRoot> roots = ArrBoolRootFactory.make(10000);
   final List<String>      insertedUris     = listArrRootRepository.insert(roots).get();
   final List<ArrBoolRoot> insertedRoots = listArrRootRepository.find(insertedUris).get();

   for(final ArrBoolRoot root : insertedRoots) {
     //assertEquals(root.getArrBool(), defaultVal);
     assertTrue(compareArrays(root.getArrBool(), defaultVal));
     root.setArrBool(someVal); // set to new value
   }

   final List<String> updatedUris = listArrRootRepository.update(insertedRoots).get();
   final List<ArrBoolRoot> updatedRoots = listArrRootRepository.find(updatedUris).get(); //FIXME
   assertEquals(insertedRoots.size(), updatedRoots.size());
   assertTrue(updatedUris.containsAll(insertedUris));

   for(final ArrBoolRoot root : updatedRoots) {
     //assertEquals(root.getArrBool(), someVal);
     assertTrue(compareArrays(root.getArrBool(), someVal));
   }
 }

 //============================ D E L E T E ====================================

 @Test
 /**
  * DELETE PERSISTED ROOT THEN FIND WITH REPOSITORY
  */
 public void deletePersistedRootThenFind() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot root    = new ArrBoolRoot();
   root.persist();

   final String      uri     = root.getURI();

   root.delete();

   try {
     listArrRootRepository.find(uri).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
   }
 }

 // ------------------------ DELETE EXCEPTIONS
 @Test
 public void rootDeleteException() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot root = new ArrBoolRoot();
   try {
     root.delete();
   } catch (IllegalArgumentException e) {
     if (!e.getMessage().startsWith("uri can't be null.")) throw e;
   }
 }

 @Test
 public void repositoryDeleteException() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot root    = new ArrBoolRoot();

   try {
     listArrRootRepository.delete(root).get();
   } catch (IllegalArgumentException e) {
     if (!e.getMessage().startsWith("uri can't be null.")) throw e;
   }
 }


 @Test
 public void repositoryBatchDeleteMedumLargeArray() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot[]     roots     = ArrBoolRootFactory.make(1000).toArray();

   try {
     listArrRootRepository.delete(roots).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.util.concurrent.ExecutionException: java.io.IOException: Unexpected return code: 400, response: ERROR: P0001: Deleted 0 row(s). Expected to delete 1000 row(s).")) throw e;
   }
 }

 @Test
 public void repositoryBatchDeleteLargeIterableException() throws IOException, ExecutionException, InterruptedException {
   final Iterable<ArrBoolRoot> roots = ArrBoolRootFactory.make(10000);

   try {
     listArrRootRepository.delete(roots).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.util.concurrent.ExecutionException: java.io.IOException: Unexpected return code: 400, response: ERROR: P0001: Deleted 0 row(s). Expected to delete 10000 row(s).")) throw e;
   }
 }

 // --------------- INSERT
 @Test
 public void deleteRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot root    = new ArrBoolRoot();
   final String      uri     = listArrRootRepository.insert(root).get();

   final ArrBoolRoot retRoot = listArrRootRepository.find(uri).get();
   listArrRootRepository.delete(retRoot).get();

   try {
     listArrRootRepository.find(uri).get();
   } catch (ExecutionException e) {
     if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
   }
 }

 @Test
 /**
  * DELETE MEDIUM LARGE BATCH INSERTED ARRAY THEN FIND
  */
 public void deleteMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final ArrBoolRoot[]     roots     = ArrBoolRootFactory.make(1000).toArray();
   final List<String>      insertedUris  = listArrRootRepository.insert(roots).get();
   final List<ArrBoolRoot> insertedRoots = listArrRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();

   listArrRootRepository.delete(insertedRoots.toArray(new ArrBoolRoot[insertedRoots.size()])).get();

   final List<ArrBoolRoot> deletedRoots = listArrRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();
   assertEquals(deletedRoots.size(), 0);
 }

 @Test
 /**
  * DELETE LARGE BATCH INSERTED ITERABLE THEN FIND
  */
 public void deleteLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final Iterable<ArrBoolRoot> roots = ArrBoolRootFactory.make(10000);
   final List<String>      insertedUris  = listArrRootRepository.insert(roots).get();
   final List<ArrBoolRoot> insertedRoots = listArrRootRepository.find(insertedUris).get();

   listArrRootRepository.delete(insertedRoots).get();

   final List<ArrBoolRoot> deletedRoots = listArrRootRepository.find(insertedUris).get();
   assertEquals(deletedRoots.size(), 0);
 }

  // --------------- INSERT EXCEPTIONS

  @Test(expected = ExecutionException.class) // TODO UNIQUE ID VIOLATION?
  public void repositoryInsertException() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot root    = new ArrBoolRoot();

    final String insertedUri = listArrRootRepository.insert(root).get();

    final ArrBoolRoot insertedRoot = listArrRootRepository.find(insertedUri).get();

    final String retUri = listArrRootRepository.insert(insertedRoot).get();

    assertEquals(insertedUri, retUri);
  }

  @Test // TODO
  public void repositoryBatchInsertMedumLargeArrayException() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot[]     roots     = ArrBoolRootFactory.make(1000).toArray();
    final List<String>      insertedUris  = listArrRootRepository.insert(roots).get();
    final List<ArrBoolRoot> insertedRoots = listArrRootRepository.find(insertedUris.toArray(new String[insertedUris.size()])).get();

    final List<String> retUris = listArrRootRepository.insert(insertedRoots.toArray(new ArrBoolRoot[insertedRoots.size()])).get();

    assertEquals(insertedUris, retUris);
  }

  @Test // TODO
  public void repositoryBatchInsertLargeIterableException() throws IOException, ExecutionException, InterruptedException {
    final Iterable<ArrBoolRoot> roots = ArrBoolRootFactory.make(10000);
    final List<String>      insertedUris  = listArrRootRepository.insert(roots).get();
    final List<ArrBoolRoot> insertedRoots = listArrRootRepository.find(insertedUris).get();

    final List<String> retUris = listArrRootRepository.insert(insertedRoots).get();

    assertEquals(insertedUris, retUris);
  }

  // --------------- UPDATE EXCEPTIONS

  @Test // FIXME NotFoundException ?
  public void repositoryUpdateException() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot root    = new ArrBoolRoot();

    try {
      listArrRootRepository.update(root).get();
    } catch (IllegalArgumentException e) {
      if (!e.getMessage().startsWith("uri can't be null.")) throw e;
    }
  }

  @Test // FIXME NotFoundException ?
  public void repositoryBatchUpdateMedumLargeArrayException() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot[]     roots     = ArrBoolRootFactory.make(1000).toArray();
    listArrRootRepository.update(roots).get();
  }

  @Test // FIXME NotFoundException ?
  public void repositoryBatchUpdateLargeIterableException() throws IOException, ExecutionException, InterruptedException {
    final Iterable<ArrBoolRoot> roots = ArrBoolRootFactory.make(10000);
    listArrRootRepository.update(roots).get();
  }

  // --------------- FIND EXCEPTIONS

  @Test // SHOULD BE NOT FOUND EXCEPTION OR RESULT NULL
  public void repositoryFindSingleException() throws IOException, ExecutionException, InterruptedException {
    try {
      listArrRootRepository.find("1234567890").get();
    } catch (ExecutionException e) {
      if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
    }
  }

  @Test(expected = IllegalArgumentException.class) // WHY IS URI STRING?
  public void repositoryFindNonExistentUriException() throws IOException, ExecutionException, InterruptedException {
    try {
      listArrRootRepository.find("nonExistentUri").get();
    } catch (ExecutionException e) {
      if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
    }
  }

  @Test
  public void repositoryFindNullUriException() throws IOException, ExecutionException, InterruptedException {
    try {
      listArrRootRepository.find((String)null).get();
    } catch (IllegalArgumentException e) {
      if (!e.getMessage().startsWith("uri can't be null.")) throw e;
    }
  }

  @Test (expected = IllegalArgumentException.class) // WHY NO EXCEPTION?
  public void repositoryFindArrayException() throws IOException, ExecutionException, InterruptedException {
    final String[] uris = { null };

    List<ArrBoolRoot> ret = listArrRootRepository.find(uris).get();
    assertEquals(ret.size(), 0);
  }

  @Test (expected = IllegalArgumentException.class) // WHY NO EXCEPTION?
  public void repositoryBatchFindLargeIterableException() throws IOException, ExecutionException, InterruptedException {
    final List<String> uris = new ArrayList<String>();
    uris.add(null);

    List<ArrBoolRoot> ret = listArrRootRepository.find(uris).get();
    assertEquals(ret.size(), 0);
  }
}
