package backend;

import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;

public class Anggota1841720149AliefTest extends TestCase {
    Anggota1841720149Alief instance;

    public Anggota1841720149AliefTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720149Alief("Alief", "Malang", "619");
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
        ArrayList<Anggota1841720149Alief> expResult = instance.getByNamaAlamatAndTeleponAlief(instance.getmNamaAlief(), instance.getmAlamatAlief(), instance.getmTeleponAlief());
        assertTrue(expResult.size() > 0);
    }


    @Test
    public void testSearchAlief() {
        System.out.println("search test");
        String keyword = "Alief";
        ArrayList<Anggota1841720149Alief> result = instance.searchAlief(keyword);
        ArrayList<Anggota1841720149Alief> expResult = instance.getByNamaAlamatAndTeleponAlief(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}