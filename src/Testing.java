public class Testing {

    @Test(priority = 1)
    public void testMethod1() {
        System.out.println("Test method priority = 1");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("Test method priority = 2");
    }

    @Test(priority = 3)
    public void testMethod3() {
        System.out.println("Test method priority = 3");
    }

    @Test(priority = 4)
    private void testMethod4() {
        System.out.println("Test method priority = 4");
    }

    @AfterSuite
    public void afterMethod() {
        System.out.println("AfterSuiteMethod");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuiteMethod");
    }

}
