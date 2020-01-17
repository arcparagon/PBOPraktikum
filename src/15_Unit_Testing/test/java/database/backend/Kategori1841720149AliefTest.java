package backend;

import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;

public class Kategori1841720149AliefTest extends TestCase {
    Kategori1841720149Alief instance;

    public Kategori1841720149AliefTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720149Alief("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", instance.getmNamaAlief());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getmNamaAlief());
    }

    @Test
    public void testSaveAlief() {
        System.out.println("save test");
        instance.saveAlief();
        ArrayList<Kategori1841720149Alief> expResult = instance.getByNamaAndKeteranganAlief(instance.getmNamaAlief(), instance.getmKeteranganAlief());
        assertTrue(expResult.size() > 0);
//        Assert.fail("The test case is a prototype.");
    }

    @Test
    public void testSearchAlief() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720149Alief> result = instance.searchAlief(keyword);
        ArrayList<Kategori1841720149Alief> expResult = instance.getByNamaAndKeteranganAlief(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}