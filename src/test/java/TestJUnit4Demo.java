import org.junit.*;

import static org.junit.Assert.assertTrue;

public class TestJUnit4Demo {
    @BeforeClass
    public static void beforeAllTestCase(){
        System.out.println("I'm @BeforeAllClass");
    }
    @AfterClass
    public static void afterAllTestCase(){
        System.out.println("I'm @afteAllrClass");
    }
    @Before
    public void beforeTestCase(){
        System.out.println("I'm @before");
    }
    @After
    public void afterTestCase(){
        System.out.println("I'm @after");
    }
    @Test
    public void testDemo3(){
        System.out.println("testDemo3");
        assertTrue(false);
    }
    @Test
    public void testDemo1(){
        System.out.println("testDemo1");
        assertTrue(true);
    }
    @Test
    public void testDemo2(){
        System.out.println("testDemo2");
        assertTrue(false);
        System.out.println("testDemo2");
        System.out.println("branch1");
    }

}
