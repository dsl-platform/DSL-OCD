package templates

trait DefaultValueCheck {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  //val PropertyName = "OneBool"
  //val PropertyClass = "boolean"

  //val PropertyDefaultValue = "false"

  val rootRepositoryName = "oneBoolRootRepository"
  val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  private static ServiceLocator locator;
  private static ${RootClassFactoryName} ${rootRepositoryName};

  @BeforeClass
  public static void setUpClass() throws Exception {
    locator = Bootstrap.init(Main.class.getResourceAsStream("/project.ini"));
    ${rootRepositoryName} = locator.resolve(${RootClassFactoryName}.class);
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
    ${rootRepositoryName} = null;

    locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
    locator = null;
  }

  @Before
  public void setUp() throws Exception {
    final List<${RootClass}> allRootItems = ${rootRepositoryName}.findAll().get();
    ${rootRepositoryName}.delete(allRootItems).get();
  }"""
}
