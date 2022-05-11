package class02;

public class testing {
    @BeforeClass
    public void beforeClass(){
        System.out.println("i am before class method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("i am after class method");
    }
    @BeforeMethod
    public void before(){
        System.out.println("this is my before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("this is my after method");
    }
    @Test
    public void Test(){
        System.out.println("drive me crazy, drive me mad");
    }
    @Test
    public void Test2(){
        System.out.println("hello world");
    }

}
