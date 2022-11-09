import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;

/**
 * JUnit test fixtures for toStringWithCommas
 *
 * @author Hojin Yun
 */
public class toStringWithCommasTest {

    /**
     * Test toStringWithCommas with input 0.
     */
    @Test
    public void toStringWithCommasTest1() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(0);
        NaturalNumber nExpected = new NaturalNumber1L(0);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "0";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 7.
     */
    @Test
    public void toStringWithCommasTest2() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(7);
        NaturalNumber nExpected = new NaturalNumber1L(7);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "7";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 24.
     */
    @Test
    public void toStringWithCommasTest3() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(24);
        NaturalNumber nExpected = new NaturalNumber1L(24);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "24";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 596.
     */
    @Test
    public void toStringWithCommasTest4() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(596);
        NaturalNumber nExpected = new NaturalNumber1L(596);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "596";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 3918.
     */
    @Test
    public void toStringWithCommasTest5() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(3918);
        NaturalNumber nExpected = new NaturalNumber1L(3918);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "3,918";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 6000.
     */
    @Test
    public void toStringWithCommasTest6() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(6000);
        NaturalNumber nExpected = new NaturalNumber1L(6000);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "6,000";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 2103981390819.
     */
    @Test
    public void toStringWithCommasTest7() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(2103981390819);
        NaturalNumber nExpected = new NaturalNumber1L(2103981390819);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "2,103,981,390,819";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 598172903481023488714891902834917.
     */
    @Test
    public void toStringWithCommasTest8() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(
                598172903481023488714891902834917);
        NaturalNumber nExpected = new NaturalNumber1L(
                598172903481023488714891902834917);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "598,172,903,481,023,488,714,891,902,834,917";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 999999999.
     */
    @Test
    public void toStringWithCommasTest9() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(999999999);
        NaturalNumber nExpected = new NaturalNumber1L(999999999);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "999,999,999";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

    /**
     * Test toStringWithCommas with input 1000000000.
     */
    @Test
    public void toStringWithCommasTest10() {
        /*
         * Set up variables and call method under test
         */
        NaturalNumber n = new NaturalNumber1L(1000000000);
        NaturalNumber nExpected = new NaturalNumber1L(1000000000);
        String nWithCommas = toStringWithCommas(n);
        String nWithCommasExpected = "1,000,000,000";
        /*
         * Assert that values of variables match expectations
         */
        assertEquals(n, nExpected);
        assertEquals(nWithCommas, nWithCommasExpected);
    }

}
