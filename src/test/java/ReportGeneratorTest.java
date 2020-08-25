import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class ReportGeneratorTest {

    @Test
    void generate_listOfPrimeTest(){

        ReportGenerator rg = new ReportGenerator();
        Assertions.assertNotNull(rg.generate(1,10));
        Assertions.assertArrayEquals(new Integer[]{2,3,5,7}, rg.generate(1,10).toArray());

        //Test in original order
        List<Integer> testPrimeList = rg.generate(1,10);
        Assertions.assertArrayEquals(new Integer[]{2,3,5,7},testPrimeList.toArray());
        Assertions.assertEquals(4, testPrimeList.size());
        Assertions.assertEquals(2, testPrimeList.get(0));
        Assertions.assertEquals(3, testPrimeList.get(1));
        Assertions.assertEquals(5, testPrimeList.get(2));
        Assertions.assertEquals(7, testPrimeList.get(3));

        //Test in reverse order
        List<Integer> testPrimeListReverse = rg.generate(10,1);
        Assertions.assertArrayEquals(new Integer[]{7,5,3,2},testPrimeListReverse.toArray());
        Assertions.assertEquals(4, testPrimeListReverse.size());
        Assertions.assertEquals(7, testPrimeListReverse.get(0));
        Assertions.assertEquals(5, testPrimeListReverse.get(1));
        Assertions.assertEquals(3, testPrimeListReverse.get(2));
        Assertions.assertEquals(2, testPrimeListReverse.get(3));
    }

    @Test
    void generate_7900thru7920Test(){

        ReportGenerator rg = new ReportGenerator();
        List<Integer> testPrimeList = rg.generate(7900,7920);
        Assertions.assertNotNull(rg.generate(7900,7920));
        Assertions.assertArrayEquals(new Integer[]{7901,7907,7919}, rg.generate(7900,7920).toArray());

        Assertions.assertEquals(3, testPrimeList.size());
        Assertions.assertEquals(7901, testPrimeList.get(0));
        Assertions.assertEquals(7907, testPrimeList.get(1));
        Assertions.assertEquals(7919, testPrimeList.get(2));
    }


    @Test
    void isPrime_singleNumTest(){

        ReportGenerator rg = new ReportGenerator();

        int prime = 97;
        Assertions.assertTrue(rg.isPrime(prime));

        int nonPrime = 100;
        Assertions.assertFalse(rg.isPrime(nonPrime));

    }

}