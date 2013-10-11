package parallel.suites.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import model.OptBool.OptBoolRoot;
import model.OptBool.repositories.OptBoolRootRepository;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.patterns.ServiceLocator;

public class TestOptBool {
  private static ServiceLocator locator;
  private static OptBoolRootRepository oneBoolRootRepository;


  public static class OptBoolRootFactory implements Iterable<OptBoolRoot> {
    private final int size;
    private final boolean isDefaultSet;
    private final Boolean defaultValue;

    public static OptBoolRootFactory make(final int size) {
      return new OptBoolRootFactory(size, false, null);
    }

    private OptBoolRootFactory(final int size, final boolean isDefaultSet, final Boolean defaultValue) {
      this.size = size;
      this.isDefaultSet = isDefaultSet;
      this.defaultValue = defaultValue;
    }

    public OptBoolRootFactory setDefaultValue(final boolean defaultValue) {
      return new OptBoolRootFactory(size, true, defaultValue);
    }

    public OptBoolRootFactory removeDefaultValue() {
      return isDefaultSet ? new OptBoolRootFactory(size, false, Boolean.FALSE) : this;
    }

    public OptBoolRoot[] toArray() {
      final OptBoolRoot[] roots = new OptBoolRoot[size];
      for (int i = 0; i < size; i++) roots[i] = vendRoot();
      return roots;
    }

    @Override
    public Iterator<OptBoolRoot> iterator() {
      return new OptBoolRootFactoryIterator();
    }

    private OptBoolRoot vendRoot() {
      final OptBoolRoot root = new OptBoolRoot();
      if (isDefaultSet) {
        root.setOptBool(defaultValue);
      }
      return root;
    }

    public class OptBoolRootFactoryIterator implements Iterator<OptBoolRoot> {
      private int remaining = size;

      @Override
      public boolean hasNext() {
        return remaining > 0;
      }

      @Override
      public OptBoolRoot next() {
        remaining--;
        return vendRoot();
      }

      @Override
      public void remove() {
      }
    }
  }

  // ========================== D E F A U L T ==================================

  @BeforeClass
  public static void setUpClass() throws Exception {
    locator = Bootstrap.init(System.getProperty("user.home") + "/.config/DSL-OCD/project.ini");
    oneBoolRootRepository = locator.resolve(OptBoolRootRepository.class);
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    oneBoolRootRepository = null;

    locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
    locator = null;
  }

  @Before
  public void setUp() throws Exception {
    final List<OptBoolRoot> oneBoolRootList = oneBoolRootRepository.findAll().get();
    oneBoolRootRepository.delete(oneBoolRootList).get();
  }

  // ----------------------------------------------------------------------------
  @Test
  /**
   * DEFAULT TYPE
   */
  public void type() throws Exception {
    assertTrue(OptBoolRoot.class.getMethod("getOptBool").getReturnType() == Boolean.class);
    assertEquals(OptBoolRoot.class.getMethod("setOptBool", Boolean.class).getReturnType(), OptBoolRoot.class);
 }
  // ----------------------------------------------------------------------------

  @Test
  /**
   * DEFAULT VALUE
   */
  public void defaultValue() throws IOException {
    final OptBoolRoot root = new OptBoolRoot();
    assertTrue(root.getOptBool() == null);
  }

  @Test
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void defaultValueAfterPersist() throws IOException {
    final OptBoolRoot root = new OptBoolRoot();
    root.persist();
    assertTrue(root.getOptBool() == null);
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void defaultValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final OptBoolRoot root    = new OptBoolRoot();
    root.persist();
    final String      uri     = root.getURI();
    final OptBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOptBool() == null);
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void defaultValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OptBoolRoot root    = new OptBoolRoot();
    final String      uri     = oneBoolRootRepository.insert(root).get();
    final OptBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOptBool() == null);
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void defaultValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OptBoolRoot[]     roots     = OptBoolRootFactory.make(1000).toArray();
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OptBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

    for(final OptBoolRoot root : retRoots) {
      assertTrue(root.getOptBool() == null);
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void defaultValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<OptBoolRoot> roots = OptBoolRootFactory.make(10000);
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OptBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

    for(final OptBoolRoot root : retRoots) {
      assertTrue(root.getOptBool() == null);
    }
  }



  // ============================= T R U E =====================================

  @Test
  /**
   * DEFAULT VALUE AFTER PERSIST
   */
  public void trueValueAfterPersist() throws IOException {
    final OptBoolRoot root = new OptBoolRoot().setOptBool(Boolean.TRUE);
    root.persist();
    assertTrue(root.getOptBool() == Boolean.TRUE);
  }

  @Test
  /**
   * FIND PERSISTED DEFAULT VALUE BOOL
   */
  public void trueValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
    final OptBoolRoot root    = new OptBoolRoot().setOptBool(Boolean.TRUE);
    root.persist();
    final String      uri     = root.getURI();
    final OptBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOptBool() == Boolean.TRUE);
  }

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE BOOL
   */
  public void trueValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OptBoolRoot root    = new OptBoolRoot().setOptBool(Boolean.TRUE);
    final String      uri     = oneBoolRootRepository.insert(root).get();
    final OptBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
    assertEquals(retRoot.getURI(), uri);
    assertTrue(retRoot.getOptBool() == Boolean.TRUE);
  }

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
   */
  public void trueValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final OptBoolRoot[]     roots     = OptBoolRootFactory.make(1000).setDefaultValue(Boolean.TRUE).toArray();
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OptBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

    for(final OptBoolRoot root : retRoots) {
      assertTrue(root.getOptBool() == Boolean.TRUE);
    }
  }

  @Test
  /**
   * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
   */
  public void trueValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<OptBoolRoot> roots = OptBoolRootFactory.make(10000).setDefaultValue(Boolean.TRUE);
    final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
    final List<OptBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

    for(final OptBoolRoot root : retRoots) {
      assertTrue(root.getOptBool() == Boolean.TRUE);
    }
  }

  //============================ F A L S E ====================================

 @Test
 /**
  * DEFAULT VALUE AFTER PERSIST
  */
 public void falseValueAfterPersist() throws IOException {
   final OptBoolRoot root = new OptBoolRoot().setOptBool(Boolean.FALSE);
   root.persist();
   assertTrue(root.getOptBool() == Boolean.FALSE);
 }

 @Test
 /**
  * FIND PERSISTED DEFAULT VALUE BOOL
  */
 public void falseValueAfterPersistViaFind() throws IOException, ExecutionException, InterruptedException {
   final OptBoolRoot root    = new OptBoolRoot().setOptBool(Boolean.FALSE);
   root.persist();
   final String      uri     = root.getURI();
   final OptBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
   assertEquals(retRoot.getURI(), uri);
   assertTrue(retRoot.getOptBool() == Boolean.FALSE);
 }

 @Test
 /**
  * FIND INSERTED DEFAULT VALUE BOOL
  */
 public void falseValueByRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final OptBoolRoot root    = new OptBoolRoot().setOptBool(Boolean.FALSE);
   final String      uri     = oneBoolRootRepository.insert(root).get();
   final OptBoolRoot retRoot = oneBoolRootRepository.find(uri).get();
   assertEquals(retRoot.getURI(), uri);
   assertTrue(retRoot.getOptBool() == Boolean.FALSE);
 }

 @Test
 /**
  * FIND MEDIUM LARGE BATCH INSERTED ARRAY DEFAULT VALUE BOOL
  */
 public void falseValueByMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final OptBoolRoot[]     roots     = OptBoolRootFactory.make(1000).setDefaultValue(Boolean.FALSE).toArray();
   final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
   final List<OptBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

   for(final OptBoolRoot root : retRoots) {
     assertTrue(root.getOptBool() == Boolean.FALSE);
   }
 }

 @Test
 /**
  * FIND LARGE BATCH INSERTED ITERABLE DEFAULT VALUE BOOL
  */
 public void falseValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
   final Iterable<OptBoolRoot> roots = OptBoolRootFactory.make(10000).setDefaultValue(Boolean.FALSE);
   final List<String>      uris     = oneBoolRootRepository.insert(roots).get();
   final List<OptBoolRoot> retRoots = oneBoolRootRepository.find(uris).get();

   for(final OptBoolRoot root : retRoots) {
     assertTrue(root.getOptBool() == Boolean.FALSE);
   }
 }
}
