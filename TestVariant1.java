package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestVariant1 {



    @Test(dataProvider = "integerProvider")
    public void testInputTask(int p1, int p3) {
        assertEquals(new Variant1().integerTask(525, 100), 5);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{{200, 100}, {13, 100}};
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeIntegerTest() {
        new Variant1().integerTask(-2, 0);
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void testBooleanTask(int p1, boolean p3) {
        assertEquals(new Variant1().booleanTask(p1), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{7, true}, {0, false}, {-1, false}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void testIfTask(int p1, int p3) {
        assertEquals(new Variant1().ifTask(p1), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{5, 6}, {0, 0}, {-1, -1}};
    }

    //////////////////////////////////////////////////


    @Test(dataProvider = "caseProvider")
    public void testCaseTask(int p1, String p2) {
        assertEquals(new Variant1().caseTask(p1), p2);
    }

    @DataProvider
    public Object[][] caseProvider() {
        return new Object[][]{{3, "Wednesday"}, {6, "Saturday"}, {1, "Monday"}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeCaseTest() {
        new Variant1().caseTask(8);
    }


    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int p1, int p2, int p3) {
        assertEquals(new Variant1().forTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{{13, 4, 4}, {7, 2, 2}};
    }


    @Test(expectedExceptions = AssertionError.class, dataProvider = "incorrectNProvider")
    public void forTaskIncorrectNTest(int incorrectN) {
        new Variant1().forTask(8, incorrectN);
    }

    @DataProvider
    public Object[][] incorrectNProvider() {
        return new Object[][]{{-20}, {0}, {-1}};
    }

    ///////////////////////////////////////////////////


    @Test(dataProvider = "whileProvider")
    public void testWhileTask(int a, int b, int c) {
        assertEquals(new Variant1().whileTask(a, b), c);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{13, 10, 3}, {10, 9, 1}, {25, 7, 18}};
    }

    @Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(int a, int b) {
        new Variant1().whileTask(a, b);
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][]{{1, 2}, {10, 14}, {0,5}};
    }


    //////////////////////////////////////////


    @Test(dataProvider = "arrayProvider")
    public void testArrayTask(int[] A,  int[] B) {
        assertEquals(new Variant1().arrayTask(A), B);
    }


    @DataProvider
    public Object[][] arrayProvider() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] outputArray = {1, 3, 5, 7, 9};
        return new Object[][]{{inputArray, outputArray}};
    }


    ////////////////////////////////////////


    @Test(dataProvider = "matrixProvider")
    public void testMatrixTask(int[][] A, int[][] B){
        assertEquals(new Variant1().matrixTask(A), B);
    }
    @DataProvider
    public Object[][] matrixProvider() {
        int[][] inputArray1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] outputArray1 = {{0, 0, 0}, {10, 10, 10}, {20,20,20}};
        return new Object[][]{{inputArray1, outputArray1}};
    }


}

