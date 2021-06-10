import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray7 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list8, 10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list9, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list9, (int) '4');
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list9, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 100);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray7 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list8, (int) (byte) 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray12 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, (int) (short) 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray12 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list14, (int) '#');
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        List list4 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list4, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list4, (int) (short) -1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        AppendPairProgram appendPairProgram5 = new AppendPairProgram();
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        appendPairProgram5.TestStudentSubmission(list8, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list8, 10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        List list4 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list4, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 100);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray12 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list14, 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list11, (int) (short) 1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray12 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list13 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, 100);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray15 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list16 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, (int) (short) 1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list13, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, 1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        appendPairProgram13.TestStudentSubmission(list19, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, 1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list9, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list9, 100);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        List list4 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list4, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list4, 10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        int[] intArray17 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (byte) 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray11 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        appendPairProgram13.TestStudentSubmission(list19, (int) (byte) -1);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        appendPairProgram13.TestStudentSubmission(list24, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) '#');
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        AppendPairProgram appendPairProgram5 = new AppendPairProgram();
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        appendPairProgram5.TestStudentSubmission(list8, (int) (byte) 10);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram5.TestStudentSubmission(list15, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray12 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        appendPairProgram13.TestStudentSubmission(list19, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray21 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 100);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list17, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, (int) (short) 100);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list12, 10);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        appendPairProgram9.TestStudentSubmission(list21, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (byte) 10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray19 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 100);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list9, (int) (short) 1);
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram7.TestStudentSubmission(list13, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list14, 10);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        List list23 = AppendPairProgram.listgen(intArray17);
        appendPairProgram11.TestStudentSubmission(list23, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, 1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list19, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) ' ');
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        List list4 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list4, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list19, 0);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        appendPairProgram11.TestStudentSubmission(list24, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) -1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list10, (int) '#');
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray15 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, (int) (byte) -1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray17 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) '#');
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray19 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray19 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, 1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray19 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (short) 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list14, (int) (byte) 10);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        appendPairProgram11.TestStudentSubmission(list21, (-1));
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        List list31 = AppendPairProgram.listgen(intArray24);
        appendPairProgram11.TestStudentSubmission(list31, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, 1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list8, (int) (short) 1);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        appendPairProgram6.TestStudentSubmission(list12, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list12, 10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray12 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 100);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        AppendPairProgram appendPairProgram15 = new AppendPairProgram();
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        appendPairProgram15.TestStudentSubmission(list17, (int) (short) 1);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram15.TestStudentSubmission(list21, (int) (byte) -1);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        appendPairProgram15.TestStudentSubmission(list26, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray21 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list22 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) 'a');
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        int[] intArray29 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list30 = AppendPairProgram.listgen(intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, 10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, 10);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        appendPairProgram19.TestStudentSubmission(list31, 100);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        appendPairProgram19.TestStudentSubmission(list35, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list35, (int) 'a');
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        List list10 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list10, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list10, (int) (byte) 10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list16, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, (-1));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray12 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list24, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray22 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list23 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray25 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (byte) 10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray19 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list20 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, 10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        List list10 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list10, 10);
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        appendPairProgram7.TestStudentSubmission(list19, 100);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        appendPairProgram7.TestStudentSubmission(list23, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, (int) (short) 100);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list19, (int) (byte) 10);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        appendPairProgram16.TestStudentSubmission(list26, (-1));
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        List list34 = AppendPairProgram.listgen(intArray29);
        List list35 = AppendPairProgram.listgen(intArray29);
        List list36 = AppendPairProgram.listgen(intArray29);
        appendPairProgram16.TestStudentSubmission(list36, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, (int) (short) -1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        int[] intArray29 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        List list34 = AppendPairProgram.listgen(intArray29);
        List list35 = AppendPairProgram.listgen(intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list35, 10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray20 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) '#');
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list18, (int) (short) 1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        appendPairProgram16.TestStudentSubmission(list22, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) '#');
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        AppendPairProgram appendPairProgram15 = new AppendPairProgram();
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram15.TestStudentSubmission(list19, (int) (byte) 10);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        appendPairProgram15.TestStudentSubmission(list30, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, 100);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        int[] intArray20 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        int[] intArray24 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) 1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray24 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, 10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list16, 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        appendPairProgram13.TestStudentSubmission(list24, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list20, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (short) 1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        List list10 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list10, (int) (byte) 10);
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram7.TestStudentSubmission(list17, (-1));
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram7.TestStudentSubmission(list22, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list8, (int) (short) 1);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        appendPairProgram6.TestStudentSubmission(list14, 0);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        appendPairProgram6.TestStudentSubmission(list19, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) '4');
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list19, 0);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        appendPairProgram11.TestStudentSubmission(list24, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        appendPairProgram13.TestStudentSubmission(list19, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (short) 100);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray13 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        List list4 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list4, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list4, (int) '4');
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray12 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, (int) ' ');
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray12 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        List list16 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, (-1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list3, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray24 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list25 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (byte) 10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list21, (int) (short) 1);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        appendPairProgram19.TestStudentSubmission(list25, (int) (byte) -1);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        appendPairProgram19.TestStudentSubmission(list30, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, 0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list22, 0);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        appendPairProgram14.TestStudentSubmission(list29, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (short) 1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list33, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) ' ');
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list12, 10);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        appendPairProgram9.TestStudentSubmission(list21, 100);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        appendPairProgram9.TestStudentSubmission(list25, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, 10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray12 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list14, (int) (byte) 1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray19 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) 100);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        int[] intArray29 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (short) -1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list23, (int) (byte) 10);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        List list33 = AppendPairProgram.listgen(intArray26);
        List list34 = AppendPairProgram.listgen(intArray26);
        appendPairProgram19.TestStudentSubmission(list34, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (short) 100);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list9, (int) (byte) 10);
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        List list16 = AppendPairProgram.listgen(intArray12);
        appendPairProgram6.TestStudentSubmission(list16, (-1));
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        appendPairProgram6.TestStudentSubmission(list26, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (short) 1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list13, (int) (byte) 10);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram9.TestStudentSubmission(list24, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) '4');
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list14, (int) (byte) 10);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        appendPairProgram11.TestStudentSubmission(list21, (-1));
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        appendPairProgram11.TestStudentSubmission(list26, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (byte) 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        AppendPairProgram appendPairProgram27 = new AppendPairProgram();
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram27.TestStudentSubmission(list29, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) ' ');
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray36 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list41, (int) (short) -1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray13 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 100);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list21, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, 1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list33, 10);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        appendPairProgram30.TestStudentSubmission(list42, 100);
        int[] intArray45 = new int[] {};
        List list46 = AppendPairProgram.listgen(intArray45);
        appendPairProgram30.TestStudentSubmission(list46, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list46, (int) (byte) -1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        int[] intArray17 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) 'a');
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        int[] intArray20 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) (byte) 10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        List list10 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list10, (int) (byte) 10);
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram7.TestStudentSubmission(list17, (-1));
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        appendPairProgram7.TestStudentSubmission(list24, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray24 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list25 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, 1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray20 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list21 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (byte) 1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        AppendPairProgram appendPairProgram21 = new AppendPairProgram();
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        appendPairProgram21.TestStudentSubmission(list23, (int) (short) 1);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        appendPairProgram21.TestStudentSubmission(list31, 100);
        int[] intArray35 = new int[] { (byte) 10 };
        List list36 = AppendPairProgram.listgen(intArray35);
        appendPairProgram21.TestStudentSubmission(list36, (int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, (int) '#');
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        List list4 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list4, 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram1.TestStudentSubmission(list13, 100);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        appendPairProgram1.TestStudentSubmission(list17, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, 1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray20 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list21 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list22, 0);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram14.TestStudentSubmission(list27, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list33, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) 'a');
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        int[] intArray24 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (short) 100);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list8, (int) (short) 1);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        appendPairProgram6.TestStudentSubmission(list14, 0);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        appendPairProgram6.TestStudentSubmission(list21, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, 1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        AppendPairProgram appendPairProgram23 = new AppendPairProgram();
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        appendPairProgram23.TestStudentSubmission(list25, (int) (short) 1);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        appendPairProgram23.TestStudentSubmission(list31, 0);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        appendPairProgram23.TestStudentSubmission(list36, 0);
        int[] intArray39 = new int[] {};
        List list40 = AppendPairProgram.listgen(intArray39);
        List list41 = AppendPairProgram.listgen(intArray39);
        List list42 = AppendPairProgram.listgen(intArray39);
        List list43 = AppendPairProgram.listgen(intArray39);
        List list44 = AppendPairProgram.listgen(intArray39);
        List list45 = AppendPairProgram.listgen(intArray39);
        List list46 = AppendPairProgram.listgen(intArray39);
        List list47 = AppendPairProgram.listgen(intArray39);
        appendPairProgram23.TestStudentSubmission(list47, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list47, (int) (short) 10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        AppendPairProgram appendPairProgram27 = new AppendPairProgram();
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        appendPairProgram27.TestStudentSubmission(list30, 10);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        List list38 = AppendPairProgram.listgen(intArray33);
        List list39 = AppendPairProgram.listgen(intArray33);
        appendPairProgram27.TestStudentSubmission(list39, 100);
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        appendPairProgram27.TestStudentSubmission(list43, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, 100);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray13 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list18, 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray10 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list11, (int) '4');
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray33 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list34 = AppendPairProgram.listgen(intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (short) 1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        AppendPairProgram appendPairProgram15 = new AppendPairProgram();
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram15.TestStudentSubmission(list18, 10);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        appendPairProgram15.TestStudentSubmission(list26, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (byte) 100);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list35 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list35, (int) (byte) 10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray20 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list33, (int) (byte) -1);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram18.TestStudentSubmission(list43, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray15 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (byte) 10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray38 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray24 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, (int) ' ');
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray38 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list41, (int) '4');
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray38 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list39 = AppendPairProgram.listgen(intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, 10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list17, 0);
        int[] intArray26 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (short) 10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list21, 10);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        appendPairProgram18.TestStudentSubmission(list30, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) (short) -1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list19, 0);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        appendPairProgram11.TestStudentSubmission(list24, 0);
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        List list30 = AppendPairProgram.listgen(intArray27);
        List list31 = AppendPairProgram.listgen(intArray27);
        List list32 = AppendPairProgram.listgen(intArray27);
        List list33 = AppendPairProgram.listgen(intArray27);
        List list34 = AppendPairProgram.listgen(intArray27);
        List list35 = AppendPairProgram.listgen(intArray27);
        appendPairProgram11.TestStudentSubmission(list35, (int) (short) 0);
        int[] intArray39 = new int[] { (byte) 10 };
        List list40 = AppendPairProgram.listgen(intArray39);
        appendPairProgram11.TestStudentSubmission(list40, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) -1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray12 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list14, (int) (short) 100);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        appendPairProgram13.TestStudentSubmission(list21, 0);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        appendPairProgram13.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        List list34 = AppendPairProgram.listgen(intArray29);
        List list35 = AppendPairProgram.listgen(intArray29);
        List list36 = AppendPairProgram.listgen(intArray29);
        List list37 = AppendPairProgram.listgen(intArray29);
        appendPairProgram13.TestStudentSubmission(list37, (int) (short) 0);
        int[] intArray41 = new int[] { (byte) 10 };
        List list42 = AppendPairProgram.listgen(intArray41);
        appendPairProgram13.TestStudentSubmission(list42, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (int) (short) 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray41 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (short) 10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list40, (int) (short) 10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        AppendPairProgram appendPairProgram5 = new AppendPairProgram();
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        appendPairProgram5.TestStudentSubmission(list8, 10);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        List list16 = AppendPairProgram.listgen(intArray11);
        List list17 = AppendPairProgram.listgen(intArray11);
        appendPairProgram5.TestStudentSubmission(list17, 100);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram5.TestStudentSubmission(list21, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) -1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list32, (int) (short) 1);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        appendPairProgram30.TestStudentSubmission(list36, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list33, (int) (byte) -1);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram18.TestStudentSubmission(list43, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 100);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray43 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list44 = AppendPairProgram.listgen(intArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, (int) '4');
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        AppendPairProgram appendPairProgram21 = new AppendPairProgram();
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        appendPairProgram21.TestStudentSubmission(list25, (int) (byte) 10);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        appendPairProgram21.TestStudentSubmission(list34, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (short) 10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        AppendPairProgram appendPairProgram46 = new AppendPairProgram();
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        List list49 = AppendPairProgram.listgen(intArray47);
        appendPairProgram46.TestStudentSubmission(list49, 10);
        int[] intArray52 = new int[] {};
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        List list57 = AppendPairProgram.listgen(intArray52);
        List list58 = AppendPairProgram.listgen(intArray52);
        appendPairProgram46.TestStudentSubmission(list58, 100);
        int[] intArray62 = new int[] { (byte) 10 };
        List list63 = AppendPairProgram.listgen(intArray62);
        List list64 = AppendPairProgram.listgen(intArray62);
        appendPairProgram46.TestStudentSubmission(list64, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list64, (int) (byte) 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram9.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        appendPairProgram9.TestStudentSubmission(list20, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (short) -1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list17, 0);
        AppendPairProgram appendPairProgram20 = new AppendPairProgram();
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        appendPairProgram20.TestStudentSubmission(list22, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) '#');
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray21 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, 10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list39, (int) (short) 1);
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        appendPairProgram37.TestStudentSubmission(list43, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (short) 10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        int[] intArray18 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, 10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list39, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, 100);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        appendPairProgram9.TestStudentSubmission(list17, 0);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram9.TestStudentSubmission(list22, 0);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        appendPairProgram9.TestStudentSubmission(list33, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) -1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (short) 100);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        AppendPairProgram appendPairProgram27 = new AppendPairProgram();
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram27.TestStudentSubmission(list29, (int) (short) 1);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        appendPairProgram27.TestStudentSubmission(list33, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) -1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        int[] intArray17 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 100);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        int[] intArray46 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list50, (int) (short) 100);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        int[] intArray17 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) ' ');
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray10 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, 1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list31, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) '4');
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        AppendPairProgram appendPairProgram40 = new AppendPairProgram();
        int[] intArray41 = new int[] {};
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        appendPairProgram40.TestStudentSubmission(list43, (int) (byte) 10);
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        appendPairProgram40.TestStudentSubmission(list50, (-1));
        int[] intArray53 = new int[] {};
        List list54 = AppendPairProgram.listgen(intArray53);
        List list55 = AppendPairProgram.listgen(intArray53);
        List list56 = AppendPairProgram.listgen(intArray53);
        List list57 = AppendPairProgram.listgen(intArray53);
        appendPairProgram40.TestStudentSubmission(list57, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list57, (int) (byte) 100);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray25 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        appendPairProgram9.TestStudentSubmission(list17, 0);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        appendPairProgram9.TestStudentSubmission(list24, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        int[] intArray43 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list46, (int) 'a');
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        AppendPairProgram appendPairProgram27 = new AppendPairProgram();
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram27.TestStudentSubmission(list29, (int) (short) 1);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        appendPairProgram27.TestStudentSubmission(list33, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (short) 1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list40, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list40, (int) (short) 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) (byte) 10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        List list15 = AppendPairProgram.listgen(intArray9);
        List list16 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 0);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, 10);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        appendPairProgram19.TestStudentSubmission(list31, 100);
        int[] intArray35 = new int[] { (byte) 10 };
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        appendPairProgram19.TestStudentSubmission(list37, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) (short) -1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray33 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) (byte) 100);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list13, (int) (byte) 10);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram9.TestStudentSubmission(list22, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 100);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list14, (int) (byte) 1);
        AppendPairProgram appendPairProgram17 = new AppendPairProgram();
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        appendPairProgram17.TestStudentSubmission(list19, (int) (short) 1);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        appendPairProgram17.TestStudentSubmission(list25, 0);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        appendPairProgram17.TestStudentSubmission(list30, 0);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        List list38 = AppendPairProgram.listgen(intArray33);
        List list39 = AppendPairProgram.listgen(intArray33);
        List list40 = AppendPairProgram.listgen(intArray33);
        List list41 = AppendPairProgram.listgen(intArray33);
        appendPairProgram17.TestStudentSubmission(list41, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list41, (int) ' ');
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray25 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) (byte) 1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        AppendPairProgram appendPairProgram26 = new AppendPairProgram();
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        appendPairProgram26.TestStudentSubmission(list28, (int) (short) 1);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        appendPairProgram26.TestStudentSubmission(list32, (int) (byte) -1);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        appendPairProgram26.TestStudentSubmission(list37, (int) (byte) -1);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        appendPairProgram26.TestStudentSubmission(list42, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, 100);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        int[] intArray52 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        List list57 = AppendPairProgram.listgen(intArray52);
        List list58 = AppendPairProgram.listgen(intArray52);
        List list59 = AppendPairProgram.listgen(intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list59, (int) (byte) 10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        int[] intArray20 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list21 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) -1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list8, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list8, (int) (byte) 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        AppendPairProgram appendPairProgram26 = new AppendPairProgram();
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        appendPairProgram26.TestStudentSubmission(list28, (int) (short) 1);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        appendPairProgram26.TestStudentSubmission(list32, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (byte) 10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        int[] intArray24 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, (int) (short) -1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        AppendPairProgram appendPairProgram28 = new AppendPairProgram();
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        appendPairProgram28.TestStudentSubmission(list30, (int) (short) 1);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram28.TestStudentSubmission(list34, (int) (byte) -1);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        appendPairProgram28.TestStudentSubmission(list39, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, (int) (byte) 1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray15 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        List list22 = AppendPairProgram.listgen(intArray15);
        List list23 = AppendPairProgram.listgen(intArray15);
        List list24 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) -1);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        AppendPairProgram appendPairProgram46 = new AppendPairProgram();
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram46.TestStudentSubmission(list48, (int) (short) 1);
        int[] intArray51 = new int[] {};
        List list52 = AppendPairProgram.listgen(intArray51);
        appendPairProgram46.TestStudentSubmission(list52, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list52, (int) (short) 100);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        AppendPairProgram appendPairProgram28 = new AppendPairProgram();
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        appendPairProgram28.TestStudentSubmission(list30, (int) (short) 1);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram28.TestStudentSubmission(list34, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (short) 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list26, (int) (short) 1);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        appendPairProgram24.TestStudentSubmission(list32, 0);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        appendPairProgram24.TestStudentSubmission(list39, (int) (byte) -1);
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        List list47 = AppendPairProgram.listgen(intArray42);
        List list48 = AppendPairProgram.listgen(intArray42);
        List list49 = AppendPairProgram.listgen(intArray42);
        appendPairProgram24.TestStudentSubmission(list49, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list49, (int) (byte) 10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        AppendPairProgram appendPairProgram26 = new AppendPairProgram();
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        appendPairProgram26.TestStudentSubmission(list28, (int) (short) 1);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        appendPairProgram26.TestStudentSubmission(list32, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (byte) 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list40, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list40, 1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list24, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (-1));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray41 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        List list44 = AppendPairProgram.listgen(intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, 100);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list26, (int) (short) 1);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        appendPairProgram24.TestStudentSubmission(list30, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) (byte) -1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list17, (int) (byte) 10);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        List list25 = AppendPairProgram.listgen(intArray20);
        List list26 = AppendPairProgram.listgen(intArray20);
        appendPairProgram13.TestStudentSubmission(list26, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) '4');
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (short) -1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list14, (int) (byte) 1);
        AppendPairProgram appendPairProgram17 = new AppendPairProgram();
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        appendPairProgram17.TestStudentSubmission(list20, (int) (byte) 10);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        List list27 = AppendPairProgram.listgen(intArray23);
        appendPairProgram17.TestStudentSubmission(list27, (-1));
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        List list36 = AppendPairProgram.listgen(intArray30);
        List list37 = AppendPairProgram.listgen(intArray30);
        appendPairProgram17.TestStudentSubmission(list37, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) (byte) 10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, 0);
        int[] intArray20 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) -1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, 0);
        int[] intArray18 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) (byte) 0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) -1);
        int[] intArray22 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        AppendPairProgram appendPairProgram27 = new AppendPairProgram();
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        appendPairProgram27.TestStudentSubmission(list30, 10);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        List list38 = AppendPairProgram.listgen(intArray33);
        appendPairProgram27.TestStudentSubmission(list38, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list38, (int) ' ');
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram9.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        appendPairProgram9.TestStudentSubmission(list20, (int) (byte) -1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        appendPairProgram9.TestStudentSubmission(list25, (int) (byte) 10);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        appendPairProgram9.TestStudentSubmission(list32, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (byte) 10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        int[] intArray30 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, 100);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        List list31 = AppendPairProgram.listgen(intArray22);
        List list32 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, 1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list9, 10);
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        List list16 = AppendPairProgram.listgen(intArray12);
        List list17 = AppendPairProgram.listgen(intArray12);
        List list18 = AppendPairProgram.listgen(intArray12);
        appendPairProgram6.TestStudentSubmission(list18, 100);
        int[] intArray22 = new int[] { (byte) 10 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        appendPairProgram6.TestStudentSubmission(list24, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list19, 10);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        appendPairProgram16.TestStudentSubmission(list28, 100);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        appendPairProgram16.TestStudentSubmission(list32, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (byte) 100);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list20, 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        List list27 = AppendPairProgram.listgen(intArray23);
        List list28 = AppendPairProgram.listgen(intArray23);
        List list29 = AppendPairProgram.listgen(intArray23);
        List list30 = AppendPairProgram.listgen(intArray23);
        appendPairProgram14.TestStudentSubmission(list30, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) '#');
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray25 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (byte) 1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray10 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list12, (-1));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, 100);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 100);
        AppendPairProgram appendPairProgram43 = new AppendPairProgram();
        int[] intArray44 = new int[] {};
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        List list47 = AppendPairProgram.listgen(intArray44);
        appendPairProgram43.TestStudentSubmission(list47, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list47, 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray9 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list12, (int) 'a');
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        AppendPairProgram appendPairProgram46 = new AppendPairProgram();
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram46.TestStudentSubmission(list48, (int) (short) 1);
        int[] intArray51 = new int[] {};
        List list52 = AppendPairProgram.listgen(intArray51);
        List list53 = AppendPairProgram.listgen(intArray51);
        List list54 = AppendPairProgram.listgen(intArray51);
        appendPairProgram46.TestStudentSubmission(list54, 0);
        int[] intArray57 = new int[] {};
        List list58 = AppendPairProgram.listgen(intArray57);
        List list59 = AppendPairProgram.listgen(intArray57);
        appendPairProgram46.TestStudentSubmission(list59, 0);
        int[] intArray62 = new int[] {};
        List list63 = AppendPairProgram.listgen(intArray62);
        List list64 = AppendPairProgram.listgen(intArray62);
        List list65 = AppendPairProgram.listgen(intArray62);
        List list66 = AppendPairProgram.listgen(intArray62);
        List list67 = AppendPairProgram.listgen(intArray62);
        List list68 = AppendPairProgram.listgen(intArray62);
        List list69 = AppendPairProgram.listgen(intArray62);
        List list70 = AppendPairProgram.listgen(intArray62);
        appendPairProgram46.TestStudentSubmission(list70, (int) (short) 0);
        int[] intArray74 = new int[] { (byte) 10 };
        List list75 = AppendPairProgram.listgen(intArray74);
        appendPairProgram46.TestStudentSubmission(list75, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list75, (int) (byte) 1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        AppendPairProgram appendPairProgram28 = new AppendPairProgram();
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        appendPairProgram28.TestStudentSubmission(list31, 10);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        appendPairProgram28.TestStudentSubmission(list40, 100);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        appendPairProgram28.TestStudentSubmission(list44, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        int[] intArray30 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (-1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray22 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list23 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 100);
        int[] intArray49 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list50 = AppendPairProgram.listgen(intArray49);
        List list51 = AppendPairProgram.listgen(intArray49);
        List list52 = AppendPairProgram.listgen(intArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list52, 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray13 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        List list21 = AppendPairProgram.listgen(intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (byte) 10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list8, (int) (short) 1);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        appendPairProgram6.TestStudentSubmission(list14, 0);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        appendPairProgram6.TestStudentSubmission(list19, 0);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        appendPairProgram6.TestStudentSubmission(list30, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, 100);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, 10);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        appendPairProgram19.TestStudentSubmission(list31, 100);
        int[] intArray35 = new int[] { (byte) 10 };
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        appendPairProgram19.TestStudentSubmission(list37, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        List list10 = AppendPairProgram.listgen(intArray8);
        List list11 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list11, (int) (byte) 10);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        appendPairProgram7.TestStudentSubmission(list20, 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        List list27 = AppendPairProgram.listgen(intArray23);
        List list28 = AppendPairProgram.listgen(intArray23);
        List list29 = AppendPairProgram.listgen(intArray23);
        appendPairProgram7.TestStudentSubmission(list29, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) ' ');
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray12 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        List list16 = AppendPairProgram.listgen(intArray12);
        List list17 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, (-1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray13 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list14 = AppendPairProgram.listgen(intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list14, 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        AppendPairProgram appendPairProgram15 = new AppendPairProgram();
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        appendPairProgram15.TestStudentSubmission(list17, (int) (short) 1);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram15.TestStudentSubmission(list21, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) 10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (short) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) '#');
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list19, (int) (byte) 10);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        appendPairProgram16.TestStudentSubmission(list26, (-1));
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        List list34 = AppendPairProgram.listgen(intArray29);
        List list35 = AppendPairProgram.listgen(intArray29);
        List list36 = AppendPairProgram.listgen(intArray29);
        appendPairProgram16.TestStudentSubmission(list36, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, (int) (short) 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list12, 10);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        appendPairProgram9.TestStudentSubmission(list21, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) (byte) 1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray20 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        List list25 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (short) 10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list41, (int) (byte) 10);
        int[] intArray44 = new int[] {};
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        List list47 = AppendPairProgram.listgen(intArray44);
        List list48 = AppendPairProgram.listgen(intArray44);
        List list49 = AppendPairProgram.listgen(intArray44);
        List list50 = AppendPairProgram.listgen(intArray44);
        appendPairProgram37.TestStudentSubmission(list50, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list50, (int) '#');
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram9.TestStudentSubmission(list15, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 100);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list13, (int) (byte) 10);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram9.TestStudentSubmission(list22, 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        appendPairProgram9.TestStudentSubmission(list31, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, 100);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray4 = new int[] { 0, '#', (short) -1 };
        List list5 = AppendPairProgram.listgen(intArray4);
        List list6 = AppendPairProgram.listgen(intArray4);
        List list7 = AppendPairProgram.listgen(intArray4);
        List list8 = AppendPairProgram.listgen(intArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list8, (int) (byte) 10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list40, 10);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        List list47 = AppendPairProgram.listgen(intArray43);
        List list48 = AppendPairProgram.listgen(intArray43);
        List list49 = AppendPairProgram.listgen(intArray43);
        appendPairProgram37.TestStudentSubmission(list49, 100);
        int[] intArray52 = new int[] {};
        List list53 = AppendPairProgram.listgen(intArray52);
        appendPairProgram37.TestStudentSubmission(list53, (int) (byte) 100);
        int[] intArray56 = new int[] {};
        List list57 = AppendPairProgram.listgen(intArray56);
        List list58 = AppendPairProgram.listgen(intArray56);
        List list59 = AppendPairProgram.listgen(intArray56);
        List list60 = AppendPairProgram.listgen(intArray56);
        List list61 = AppendPairProgram.listgen(intArray56);
        List list62 = AppendPairProgram.listgen(intArray56);
        List list63 = AppendPairProgram.listgen(intArray56);
        List list64 = AppendPairProgram.listgen(intArray56);
        appendPairProgram37.TestStudentSubmission(list64, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list64, (int) (short) 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray15 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        AppendPairProgram appendPairProgram32 = new AppendPairProgram();
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        appendPairProgram32.TestStudentSubmission(list36, (int) (byte) 10);
        int[] intArray39 = new int[] {};
        List list40 = AppendPairProgram.listgen(intArray39);
        List list41 = AppendPairProgram.listgen(intArray39);
        appendPairProgram32.TestStudentSubmission(list41, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list41, (int) ' ');
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list9, 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, 0);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list17, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, 0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray22 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (byte) -1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) -1);
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list18, (int) (short) 1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        appendPairProgram16.TestStudentSubmission(list24, 0);
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        List list30 = AppendPairProgram.listgen(intArray27);
        List list31 = AppendPairProgram.listgen(intArray27);
        appendPairProgram16.TestStudentSubmission(list31, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) (short) 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray7 = new int[] { (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list8, 100);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list19, 0);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        appendPairProgram11.TestStudentSubmission(list24, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list14, (int) (byte) 1);
        int[] intArray23 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray7 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, 100);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list17, 0);
        AppendPairProgram appendPairProgram20 = new AppendPairProgram();
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        appendPairProgram20.TestStudentSubmission(list23, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, 0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list40, (int) (byte) 10);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        appendPairProgram37.TestStudentSubmission(list45, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) (short) 100);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        int[] intArray48 = new int[] { 10, (byte) 0 };
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list50, 100);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) (byte) 1);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray29 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (short) 1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list19, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 100);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray31 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list35, (int) (byte) -1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray10 = new int[] { (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
        int[] intArray25 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) ' ');
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        AppendPairProgram appendPairProgram28 = new AppendPairProgram();
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        appendPairProgram28.TestStudentSubmission(list32, (int) (byte) 10);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        appendPairProgram28.TestStudentSubmission(list37, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) (short) -1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram13.TestStudentSubmission(list23, (-1));
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        appendPairProgram13.TestStudentSubmission(list28, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, (int) ' ');
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list18, (int) (short) 1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        appendPairProgram16.TestStudentSubmission(list24, 0);
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        appendPairProgram16.TestStudentSubmission(list29, 0);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram16.TestStudentSubmission(list40, (int) (short) 0);
        int[] intArray44 = new int[] { (byte) 10 };
        List list45 = AppendPairProgram.listgen(intArray44);
        appendPairProgram16.TestStudentSubmission(list45, 100);
        int[] intArray49 = new int[] { (byte) 10 };
        List list50 = AppendPairProgram.listgen(intArray49);
        appendPairProgram16.TestStudentSubmission(list50, (-1));
        int[] intArray53 = new int[] {};
        List list54 = AppendPairProgram.listgen(intArray53);
        List list55 = AppendPairProgram.listgen(intArray53);
        List list56 = AppendPairProgram.listgen(intArray53);
        List list57 = AppendPairProgram.listgen(intArray53);
        List list58 = AppendPairProgram.listgen(intArray53);
        List list59 = AppendPairProgram.listgen(intArray53);
        appendPairProgram16.TestStudentSubmission(list59, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list59, (int) (byte) 10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray20 = new int[] { (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram0.TestStudentSubmission(list21, (-1));
        int[] intArray28 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (byte) 10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        int[] intArray17 = new int[] { 0, '#', (short) -1 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) '#');
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list25 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, 10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list19, 0);
        AppendPairProgram appendPairProgram22 = new AppendPairProgram();
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        appendPairProgram22.TestStudentSubmission(list25, (int) (byte) 10);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        appendPairProgram22.TestStudentSubmission(list32, (-1));
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        List list40 = AppendPairProgram.listgen(intArray35);
        List list41 = AppendPairProgram.listgen(intArray35);
        List list42 = AppendPairProgram.listgen(intArray35);
        appendPairProgram22.TestStudentSubmission(list42, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list17, (int) (byte) 10);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        appendPairProgram14.TestStudentSubmission(list24, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray11 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list8, (int) (byte) 100);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list15, (int) (byte) 10);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        appendPairProgram11.TestStudentSubmission(list20, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, 1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray10 = new int[] { (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
        int[] intArray25 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, (int) (byte) -1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        AppendPairProgram appendPairProgram32 = new AppendPairProgram();
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram32.TestStudentSubmission(list34, (int) (short) 1);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        appendPairProgram32.TestStudentSubmission(list40, 0);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        appendPairProgram32.TestStudentSubmission(list45, 0);
        int[] intArray48 = new int[] {};
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        List list51 = AppendPairProgram.listgen(intArray48);
        List list52 = AppendPairProgram.listgen(intArray48);
        List list53 = AppendPairProgram.listgen(intArray48);
        List list54 = AppendPairProgram.listgen(intArray48);
        List list55 = AppendPairProgram.listgen(intArray48);
        List list56 = AppendPairProgram.listgen(intArray48);
        appendPairProgram32.TestStudentSubmission(list56, (int) (short) 0);
        int[] intArray60 = new int[] { (byte) 10 };
        List list61 = AppendPairProgram.listgen(intArray60);
        appendPairProgram32.TestStudentSubmission(list61, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list61, (int) (short) 10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray9 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list10 = AppendPairProgram.listgen(intArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list10, (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, 0);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list22, 0);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram14.TestStudentSubmission(list27, 0);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        List list36 = AppendPairProgram.listgen(intArray30);
        List list37 = AppendPairProgram.listgen(intArray30);
        List list38 = AppendPairProgram.listgen(intArray30);
        appendPairProgram14.TestStudentSubmission(list38, (int) (short) 0);
        int[] intArray42 = new int[] { (byte) 10 };
        List list43 = AppendPairProgram.listgen(intArray42);
        appendPairProgram14.TestStudentSubmission(list43, 100);
        int[] intArray47 = new int[] { (byte) 10 };
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram14.TestStudentSubmission(list48, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list48, (int) 'a');
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list9, (int) (short) 1);
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        appendPairProgram7.TestStudentSubmission(list15, 0);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        appendPairProgram7.TestStudentSubmission(list20, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (short) 100);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        List list4 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list4, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list4, (int) (short) 100);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list18, (int) (short) 1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        appendPairProgram16.TestStudentSubmission(list22, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray31 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        List list36 = AppendPairProgram.listgen(intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, 1);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray20 = new int[] { (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram0.TestStudentSubmission(list21, (-1));
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list26, (int) (short) 1);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        appendPairProgram24.TestStudentSubmission(list30, (int) (byte) -1);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        appendPairProgram24.TestStudentSubmission(list35, (int) (byte) -1);
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        List list42 = AppendPairProgram.listgen(intArray38);
        List list43 = AppendPairProgram.listgen(intArray38);
        List list44 = AppendPairProgram.listgen(intArray38);
        List list45 = AppendPairProgram.listgen(intArray38);
        appendPairProgram24.TestStudentSubmission(list45, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) (byte) 10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        int[] intArray43 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list44 = AppendPairProgram.listgen(intArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, (int) (byte) 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray17 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list18 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list18, (int) (short) 10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, 0);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list17, (int) (byte) 10);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        appendPairProgram14.TestStudentSubmission(list24, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) -1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray10 = new int[] { (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
        int[] intArray25 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (short) 100);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list15, (int) (short) 1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        appendPairProgram13.TestStudentSubmission(list19, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (short) 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 0);
        AppendPairProgram appendPairProgram12 = new AppendPairProgram();
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        appendPairProgram12.TestStudentSubmission(list14, (int) (short) 1);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram12.TestStudentSubmission(list18, (int) (byte) -1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        appendPairProgram12.TestStudentSubmission(list23, (int) (byte) -1);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        appendPairProgram12.TestStudentSubmission(list28, (int) (byte) 10);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        appendPairProgram12.TestStudentSubmission(list35, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list35, 10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray21 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) ' ');
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray38 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list41, 100);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        AppendPairProgram appendPairProgram28 = new AppendPairProgram();
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        appendPairProgram28.TestStudentSubmission(list31, 10);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        appendPairProgram28.TestStudentSubmission(list40, 100);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        appendPairProgram28.TestStudentSubmission(list44, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, (int) ' ');
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        AppendPairProgram appendPairProgram21 = new AppendPairProgram();
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        appendPairProgram21.TestStudentSubmission(list25, (int) (byte) 10);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        appendPairProgram21.TestStudentSubmission(list36, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list14, (int) (byte) 1);
        AppendPairProgram appendPairProgram17 = new AppendPairProgram();
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        appendPairProgram17.TestStudentSubmission(list19, (int) (short) 1);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        appendPairProgram17.TestStudentSubmission(list23, (int) (byte) -1);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        appendPairProgram17.TestStudentSubmission(list28, (int) (byte) -1);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        appendPairProgram17.TestStudentSubmission(list33, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) -1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list20, (int) (byte) 10);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        List list27 = AppendPairProgram.listgen(intArray23);
        List list28 = AppendPairProgram.listgen(intArray23);
        List list29 = AppendPairProgram.listgen(intArray23);
        List list30 = AppendPairProgram.listgen(intArray23);
        List list31 = AppendPairProgram.listgen(intArray23);
        appendPairProgram16.TestStudentSubmission(list31, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, 10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        int[] intArray46 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list53, (int) ' ');
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        AppendPairProgram appendPairProgram23 = new AppendPairProgram();
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        appendPairProgram23.TestStudentSubmission(list25, (int) (short) 1);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram23.TestStudentSubmission(list29, (int) (byte) -1);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        appendPairProgram23.TestStudentSubmission(list34, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (short) 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray36 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        appendPairProgram0.TestStudentSubmission(list35, (int) (byte) -1);
        AppendPairProgram appendPairProgram38 = new AppendPairProgram();
        int[] intArray39 = new int[] {};
        List list40 = AppendPairProgram.listgen(intArray39);
        appendPairProgram38.TestStudentSubmission(list40, (int) (short) 1);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        appendPairProgram38.TestStudentSubmission(list46, 0);
        int[] intArray49 = new int[] {};
        List list50 = AppendPairProgram.listgen(intArray49);
        List list51 = AppendPairProgram.listgen(intArray49);
        List list52 = AppendPairProgram.listgen(intArray49);
        List list53 = AppendPairProgram.listgen(intArray49);
        appendPairProgram38.TestStudentSubmission(list53, (int) (byte) -1);
        int[] intArray56 = new int[] {};
        List list57 = AppendPairProgram.listgen(intArray56);
        List list58 = AppendPairProgram.listgen(intArray56);
        List list59 = AppendPairProgram.listgen(intArray56);
        List list60 = AppendPairProgram.listgen(intArray56);
        List list61 = AppendPairProgram.listgen(intArray56);
        List list62 = AppendPairProgram.listgen(intArray56);
        List list63 = AppendPairProgram.listgen(intArray56);
        appendPairProgram38.TestStudentSubmission(list63, (-1));
        int[] intArray66 = new int[] {};
        List list67 = AppendPairProgram.listgen(intArray66);
        List list68 = AppendPairProgram.listgen(intArray66);
        List list69 = AppendPairProgram.listgen(intArray66);
        List list70 = AppendPairProgram.listgen(intArray66);
        List list71 = AppendPairProgram.listgen(intArray66);
        List list72 = AppendPairProgram.listgen(intArray66);
        List list73 = AppendPairProgram.listgen(intArray66);
        List list74 = AppendPairProgram.listgen(intArray66);
        List list75 = AppendPairProgram.listgen(intArray66);
        appendPairProgram38.TestStudentSubmission(list75, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list75, (int) '4');
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list19, 0);
        int[] intArray28 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) '#');
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list21, 10);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        appendPairProgram18.TestStudentSubmission(list30, 100);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram18.TestStudentSubmission(list34, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (byte) 1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        int[] intArray30 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list35, 100);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list10, (int) (byte) 10);
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        appendPairProgram6.TestStudentSubmission(list19, 1);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        appendPairProgram6.TestStudentSubmission(list28, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, (int) (byte) 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        AppendPairProgram appendPairProgram40 = new AppendPairProgram();
        int[] intArray41 = new int[] {};
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        appendPairProgram40.TestStudentSubmission(list43, (int) (byte) 10);
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        appendPairProgram40.TestStudentSubmission(list50, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list50, (int) (byte) 10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        List list31 = AppendPairProgram.listgen(intArray24);
        List list32 = AppendPairProgram.listgen(intArray24);
        List list33 = AppendPairProgram.listgen(intArray24);
        List list34 = AppendPairProgram.listgen(intArray24);
        List list35 = AppendPairProgram.listgen(intArray24);
        List list36 = AppendPairProgram.listgen(intArray24);
        List list37 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) (byte) 1);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray19 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        List list28 = AppendPairProgram.listgen(intArray19);
        List list29 = AppendPairProgram.listgen(intArray19);
        List list30 = AppendPairProgram.listgen(intArray19);
        List list31 = AppendPairProgram.listgen(intArray19);
        List list32 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (byte) 1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray19 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (short) -1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray48 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        List list51 = AppendPairProgram.listgen(intArray48);
        List list52 = AppendPairProgram.listgen(intArray48);
        List list53 = AppendPairProgram.listgen(intArray48);
        List list54 = AppendPairProgram.listgen(intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list54, (int) (byte) 10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        AppendPairProgram appendPairProgram23 = new AppendPairProgram();
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        appendPairProgram23.TestStudentSubmission(list27, (int) (byte) 10);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        appendPairProgram23.TestStudentSubmission(list34, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, 100);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray10 = new int[] { 0, '#', (short) -1 };
        List list11 = AppendPairProgram.listgen(intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        List list13 = AppendPairProgram.listgen(intArray6);
        List list14 = AppendPairProgram.listgen(intArray6);
        List list15 = AppendPairProgram.listgen(intArray6);
        List list16 = AppendPairProgram.listgen(intArray6);
        List list17 = AppendPairProgram.listgen(intArray6);
        List list18 = AppendPairProgram.listgen(intArray6);
        List list19 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        AppendPairProgram appendPairProgram22 = new AppendPairProgram();
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram22.TestStudentSubmission(list26, (int) (byte) 10);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        List list34 = AppendPairProgram.listgen(intArray29);
        List list35 = AppendPairProgram.listgen(intArray29);
        appendPairProgram22.TestStudentSubmission(list35, 1);
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        List list42 = AppendPairProgram.listgen(intArray38);
        List list43 = AppendPairProgram.listgen(intArray38);
        List list44 = AppendPairProgram.listgen(intArray38);
        appendPairProgram22.TestStudentSubmission(list44, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, (int) (short) 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        AppendPairProgram appendPairProgram25 = new AppendPairProgram();
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        appendPairProgram25.TestStudentSubmission(list28, (int) (byte) 10);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        List list36 = AppendPairProgram.listgen(intArray31);
        List list37 = AppendPairProgram.listgen(intArray31);
        List list38 = AppendPairProgram.listgen(intArray31);
        List list39 = AppendPairProgram.listgen(intArray31);
        List list40 = AppendPairProgram.listgen(intArray31);
        List list41 = AppendPairProgram.listgen(intArray31);
        List list42 = AppendPairProgram.listgen(intArray31);
        List list43 = AppendPairProgram.listgen(intArray31);
        List list44 = AppendPairProgram.listgen(intArray31);
        appendPairProgram25.TestStudentSubmission(list44, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, 10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        AppendPairProgram appendPairProgram32 = new AppendPairProgram();
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram32.TestStudentSubmission(list34, (int) (short) 1);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        appendPairProgram32.TestStudentSubmission(list42, 100);
        int[] intArray46 = new int[] { (byte) 10 };
        List list47 = AppendPairProgram.listgen(intArray46);
        appendPairProgram32.TestStudentSubmission(list47, (int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list47, (int) (byte) -1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray12 = new int[] { 0, '#', (short) -1 };
        List list13 = AppendPairProgram.listgen(intArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) 1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list10, (int) (byte) 10);
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        appendPairProgram6.TestStudentSubmission(list19, 1);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        appendPairProgram6.TestStudentSubmission(list28, (int) (short) 1);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        List list36 = AppendPairProgram.listgen(intArray31);
        List list37 = AppendPairProgram.listgen(intArray31);
        List list38 = AppendPairProgram.listgen(intArray31);
        List list39 = AppendPairProgram.listgen(intArray31);
        List list40 = AppendPairProgram.listgen(intArray31);
        List list41 = AppendPairProgram.listgen(intArray31);
        List list42 = AppendPairProgram.listgen(intArray31);
        List list43 = AppendPairProgram.listgen(intArray31);
        List list44 = AppendPairProgram.listgen(intArray31);
        List list45 = AppendPairProgram.listgen(intArray31);
        appendPairProgram6.TestStudentSubmission(list45, (int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) ' ');
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        AppendPairProgram appendPairProgram25 = new AppendPairProgram();
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        appendPairProgram25.TestStudentSubmission(list27, (int) (short) 1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        appendPairProgram25.TestStudentSubmission(list33, 0);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        appendPairProgram25.TestStudentSubmission(list38, 0);
        int[] intArray41 = new int[] {};
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        List list44 = AppendPairProgram.listgen(intArray41);
        List list45 = AppendPairProgram.listgen(intArray41);
        List list46 = AppendPairProgram.listgen(intArray41);
        List list47 = AppendPairProgram.listgen(intArray41);
        List list48 = AppendPairProgram.listgen(intArray41);
        List list49 = AppendPairProgram.listgen(intArray41);
        appendPairProgram25.TestStudentSubmission(list49, (int) (short) 0);
        int[] intArray53 = new int[] { (byte) 10 };
        List list54 = AppendPairProgram.listgen(intArray53);
        appendPairProgram25.TestStudentSubmission(list54, 100);
        int[] intArray58 = new int[] { (byte) 10 };
        List list59 = AppendPairProgram.listgen(intArray58);
        appendPairProgram25.TestStudentSubmission(list59, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list59, (int) (byte) 100);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray39 = new int[] { 10, (byte) 0 };
        List list40 = AppendPairProgram.listgen(intArray39);
        List list41 = AppendPairProgram.listgen(intArray39);
        List list42 = AppendPairProgram.listgen(intArray39);
        List list43 = AppendPairProgram.listgen(intArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray25 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list33, 10);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        appendPairProgram30.TestStudentSubmission(list42, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list39, (int) (short) 1);
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        appendPairProgram37.TestStudentSubmission(list45, 0);
        int[] intArray48 = new int[] {};
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        appendPairProgram37.TestStudentSubmission(list50, 0);
        int[] intArray53 = new int[] {};
        List list54 = AppendPairProgram.listgen(intArray53);
        List list55 = AppendPairProgram.listgen(intArray53);
        List list56 = AppendPairProgram.listgen(intArray53);
        List list57 = AppendPairProgram.listgen(intArray53);
        List list58 = AppendPairProgram.listgen(intArray53);
        List list59 = AppendPairProgram.listgen(intArray53);
        List list60 = AppendPairProgram.listgen(intArray53);
        List list61 = AppendPairProgram.listgen(intArray53);
        appendPairProgram37.TestStudentSubmission(list61, (int) (short) 0);
        int[] intArray65 = new int[] { (byte) 10 };
        List list66 = AppendPairProgram.listgen(intArray65);
        appendPairProgram37.TestStudentSubmission(list66, 100);
        int[] intArray70 = new int[] { (byte) 10 };
        List list71 = AppendPairProgram.listgen(intArray70);
        appendPairProgram37.TestStudentSubmission(list71, (-1));
        int[] intArray74 = new int[] {};
        List list75 = AppendPairProgram.listgen(intArray74);
        List list76 = AppendPairProgram.listgen(intArray74);
        List list77 = AppendPairProgram.listgen(intArray74);
        List list78 = AppendPairProgram.listgen(intArray74);
        List list79 = AppendPairProgram.listgen(intArray74);
        List list80 = AppendPairProgram.listgen(intArray74);
        appendPairProgram37.TestStudentSubmission(list80, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list80, (int) ' ');
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list14, (int) (byte) 10);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        appendPairProgram11.TestStudentSubmission(list21, (-1));
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        appendPairProgram11.TestStudentSubmission(list28, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, 100);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        int[] intArray27 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        List list30 = AppendPairProgram.listgen(intArray27);
        List list31 = AppendPairProgram.listgen(intArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) '#');
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) 10);
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list28, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, (int) '4');
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        int[] intArray22 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, 10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        AppendPairProgram appendPairProgram7 = new AppendPairProgram();
        int[] intArray8 = new int[] {};
        List list9 = AppendPairProgram.listgen(intArray8);
        appendPairProgram7.TestStudentSubmission(list9, (int) (short) 1);
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        appendPairProgram7.TestStudentSubmission(list15, 0);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        appendPairProgram7.TestStudentSubmission(list22, (int) (byte) -1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        appendPairProgram7.TestStudentSubmission(list32, (-1));
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        List list40 = AppendPairProgram.listgen(intArray35);
        List list41 = AppendPairProgram.listgen(intArray35);
        List list42 = AppendPairProgram.listgen(intArray35);
        List list43 = AppendPairProgram.listgen(intArray35);
        List list44 = AppendPairProgram.listgen(intArray35);
        appendPairProgram7.TestStudentSubmission(list44, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, 10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        AppendPairProgram appendPairProgram13 = new AppendPairProgram();
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram13.TestStudentSubmission(list16, 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        appendPairProgram13.TestStudentSubmission(list25, 100);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram13.TestStudentSubmission(list29, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (-1));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        AppendPairProgram appendPairProgram27 = new AppendPairProgram();
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        appendPairProgram27.TestStudentSubmission(list30, (int) (byte) 10);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        appendPairProgram27.TestStudentSubmission(list37, (-1));
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        List list43 = AppendPairProgram.listgen(intArray40);
        List list44 = AppendPairProgram.listgen(intArray40);
        appendPairProgram27.TestStudentSubmission(list44, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, (int) '4');
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray13 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, (int) '4');
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list18, (int) (short) 1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        appendPairProgram16.TestStudentSubmission(list22, (int) (byte) -1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram16.TestStudentSubmission(list27, (int) (byte) -1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        List list36 = AppendPairProgram.listgen(intArray30);
        List list37 = AppendPairProgram.listgen(intArray30);
        appendPairProgram16.TestStudentSubmission(list37, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) 'a');
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 100);
        AppendPairProgram appendPairProgram43 = new AppendPairProgram();
        int[] intArray44 = new int[] {};
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        List list47 = AppendPairProgram.listgen(intArray44);
        appendPairProgram43.TestStudentSubmission(list47, (int) (byte) 10);
        int[] intArray50 = new int[] {};
        List list51 = AppendPairProgram.listgen(intArray50);
        List list52 = AppendPairProgram.listgen(intArray50);
        List list53 = AppendPairProgram.listgen(intArray50);
        List list54 = AppendPairProgram.listgen(intArray50);
        List list55 = AppendPairProgram.listgen(intArray50);
        List list56 = AppendPairProgram.listgen(intArray50);
        List list57 = AppendPairProgram.listgen(intArray50);
        List list58 = AppendPairProgram.listgen(intArray50);
        appendPairProgram43.TestStudentSubmission(list58, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list58, (int) (byte) 100);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray17 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (short) 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        AppendPairProgram appendPairProgram28 = new AppendPairProgram();
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        appendPairProgram28.TestStudentSubmission(list30, (int) (short) 1);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        appendPairProgram28.TestStudentSubmission(list36, 0);
        int[] intArray39 = new int[] {};
        List list40 = AppendPairProgram.listgen(intArray39);
        List list41 = AppendPairProgram.listgen(intArray39);
        appendPairProgram28.TestStudentSubmission(list41, 0);
        int[] intArray44 = new int[] {};
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        List list47 = AppendPairProgram.listgen(intArray44);
        List list48 = AppendPairProgram.listgen(intArray44);
        List list49 = AppendPairProgram.listgen(intArray44);
        List list50 = AppendPairProgram.listgen(intArray44);
        List list51 = AppendPairProgram.listgen(intArray44);
        List list52 = AppendPairProgram.listgen(intArray44);
        appendPairProgram28.TestStudentSubmission(list52, (int) (short) 0);
        int[] intArray56 = new int[] { (byte) 10 };
        List list57 = AppendPairProgram.listgen(intArray56);
        appendPairProgram28.TestStudentSubmission(list57, 100);
        int[] intArray61 = new int[] { (byte) 10 };
        List list62 = AppendPairProgram.listgen(intArray61);
        appendPairProgram28.TestStudentSubmission(list62, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list62, (int) (short) 10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list31, 0);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        appendPairProgram18.TestStudentSubmission(list42, (int) (short) 0);
        int[] intArray46 = new int[] { (byte) 10 };
        List list47 = AppendPairProgram.listgen(intArray46);
        appendPairProgram18.TestStudentSubmission(list47, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list47, (int) (byte) 1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        AppendPairProgram appendPairProgram40 = new AppendPairProgram();
        int[] intArray41 = new int[] {};
        List list42 = AppendPairProgram.listgen(intArray41);
        appendPairProgram40.TestStudentSubmission(list42, (int) (short) 1);
        int[] intArray45 = new int[] {};
        List list46 = AppendPairProgram.listgen(intArray45);
        appendPairProgram40.TestStudentSubmission(list46, (int) (byte) -1);
        int[] intArray49 = new int[] {};
        List list50 = AppendPairProgram.listgen(intArray49);
        List list51 = AppendPairProgram.listgen(intArray49);
        appendPairProgram40.TestStudentSubmission(list51, (int) (byte) -1);
        int[] intArray54 = new int[] {};
        List list55 = AppendPairProgram.listgen(intArray54);
        List list56 = AppendPairProgram.listgen(intArray54);
        List list57 = AppendPairProgram.listgen(intArray54);
        List list58 = AppendPairProgram.listgen(intArray54);
        List list59 = AppendPairProgram.listgen(intArray54);
        List list60 = AppendPairProgram.listgen(intArray54);
        List list61 = AppendPairProgram.listgen(intArray54);
        appendPairProgram40.TestStudentSubmission(list61, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list61, (int) '#');
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray10 = new int[] { (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, (int) (byte) 10);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        appendPairProgram19.TestStudentSubmission(list38, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list38, (int) (byte) 100);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        appendPairProgram0.TestStudentSubmission(list35, (int) (byte) -1);
        AppendPairProgram appendPairProgram38 = new AppendPairProgram();
        int[] intArray39 = new int[] {};
        List list40 = AppendPairProgram.listgen(intArray39);
        appendPairProgram38.TestStudentSubmission(list40, (int) (short) 1);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        appendPairProgram38.TestStudentSubmission(list46, 0);
        int[] intArray49 = new int[] {};
        List list50 = AppendPairProgram.listgen(intArray49);
        List list51 = AppendPairProgram.listgen(intArray49);
        appendPairProgram38.TestStudentSubmission(list51, 0);
        int[] intArray54 = new int[] {};
        List list55 = AppendPairProgram.listgen(intArray54);
        List list56 = AppendPairProgram.listgen(intArray54);
        List list57 = AppendPairProgram.listgen(intArray54);
        List list58 = AppendPairProgram.listgen(intArray54);
        List list59 = AppendPairProgram.listgen(intArray54);
        List list60 = AppendPairProgram.listgen(intArray54);
        List list61 = AppendPairProgram.listgen(intArray54);
        List list62 = AppendPairProgram.listgen(intArray54);
        appendPairProgram38.TestStudentSubmission(list62, (int) (short) 0);
        int[] intArray66 = new int[] { (byte) 10 };
        List list67 = AppendPairProgram.listgen(intArray66);
        appendPairProgram38.TestStudentSubmission(list67, 100);
        int[] intArray71 = new int[] { (byte) 10 };
        List list72 = AppendPairProgram.listgen(intArray71);
        appendPairProgram38.TestStudentSubmission(list72, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list72, (int) (short) 1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        List list13 = AppendPairProgram.listgen(intArray6);
        List list14 = AppendPairProgram.listgen(intArray6);
        List list15 = AppendPairProgram.listgen(intArray6);
        List list16 = AppendPairProgram.listgen(intArray6);
        List list17 = AppendPairProgram.listgen(intArray6);
        List list18 = AppendPairProgram.listgen(intArray6);
        List list19 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        int[] intArray26 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (byte) 10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list17, 0);
        int[] intArray26 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (short) 10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list23, (int) (byte) 10);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram19.TestStudentSubmission(list32, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (short) 10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) 10);
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list26, (int) (short) 1);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        appendPairProgram24.TestStudentSubmission(list32, 0);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        appendPairProgram24.TestStudentSubmission(list37, (int) '4');
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        List list43 = AppendPairProgram.listgen(intArray40);
        List list44 = AppendPairProgram.listgen(intArray40);
        List list45 = AppendPairProgram.listgen(intArray40);
        List list46 = AppendPairProgram.listgen(intArray40);
        List list47 = AppendPairProgram.listgen(intArray40);
        List list48 = AppendPairProgram.listgen(intArray40);
        List list49 = AppendPairProgram.listgen(intArray40);
        List list50 = AppendPairProgram.listgen(intArray40);
        appendPairProgram24.TestStudentSubmission(list50, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list50, 10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list41, (int) (byte) 10);
        int[] intArray44 = new int[] {};
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        appendPairProgram37.TestStudentSubmission(list46, (int) (short) 0);
        int[] intArray49 = new int[] {};
        List list50 = AppendPairProgram.listgen(intArray49);
        List list51 = AppendPairProgram.listgen(intArray49);
        List list52 = AppendPairProgram.listgen(intArray49);
        List list53 = AppendPairProgram.listgen(intArray49);
        List list54 = AppendPairProgram.listgen(intArray49);
        List list55 = AppendPairProgram.listgen(intArray49);
        List list56 = AppendPairProgram.listgen(intArray49);
        List list57 = AppendPairProgram.listgen(intArray49);
        List list58 = AppendPairProgram.listgen(intArray49);
        List list59 = AppendPairProgram.listgen(intArray49);
        appendPairProgram37.TestStudentSubmission(list59, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list59, (int) (short) 100);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list17, 0);
        AppendPairProgram appendPairProgram20 = new AppendPairProgram();
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        appendPairProgram20.TestStudentSubmission(list24, (int) (byte) 10);
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        List list30 = AppendPairProgram.listgen(intArray27);
        List list31 = AppendPairProgram.listgen(intArray27);
        appendPairProgram20.TestStudentSubmission(list31, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) (byte) 10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list17, (int) (byte) -1);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram11.TestStudentSubmission(list22, (int) (byte) -1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram11.TestStudentSubmission(list27, (int) (byte) 10);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        appendPairProgram11.TestStudentSubmission(list34, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (byte) 1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray7 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        List list16 = AppendPairProgram.listgen(intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (short) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list21, (int) (short) 1);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        appendPairProgram19.TestStudentSubmission(list27, 0);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        appendPairProgram19.TestStudentSubmission(list32, (int) '4');
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        List list40 = AppendPairProgram.listgen(intArray35);
        List list41 = AppendPairProgram.listgen(intArray35);
        List list42 = AppendPairProgram.listgen(intArray35);
        List list43 = AppendPairProgram.listgen(intArray35);
        List list44 = AppendPairProgram.listgen(intArray35);
        List list45 = AppendPairProgram.listgen(intArray35);
        appendPairProgram19.TestStudentSubmission(list45, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) (byte) 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list8, (int) (byte) 100);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list13, (int) (short) 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram11.TestStudentSubmission(list19, 0);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        appendPairProgram11.TestStudentSubmission(list24, 0);
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        List list30 = AppendPairProgram.listgen(intArray27);
        List list31 = AppendPairProgram.listgen(intArray27);
        List list32 = AppendPairProgram.listgen(intArray27);
        List list33 = AppendPairProgram.listgen(intArray27);
        List list34 = AppendPairProgram.listgen(intArray27);
        List list35 = AppendPairProgram.listgen(intArray27);
        appendPairProgram11.TestStudentSubmission(list35, (int) (short) 0);
        int[] intArray39 = new int[] { (byte) 10 };
        List list40 = AppendPairProgram.listgen(intArray39);
        appendPairProgram11.TestStudentSubmission(list40, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) -1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray15 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list16 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, 10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        List list21 = AppendPairProgram.listgen(intArray13);
        List list22 = AppendPairProgram.listgen(intArray13);
        List list23 = AppendPairProgram.listgen(intArray13);
        List list24 = AppendPairProgram.listgen(intArray13);
        List list25 = AppendPairProgram.listgen(intArray13);
        List list26 = AppendPairProgram.listgen(intArray13);
        List list27 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list34, (int) (byte) 10);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram30.TestStudentSubmission(list43, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (short) 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        List list31 = AppendPairProgram.listgen(intArray24);
        List list32 = AppendPairProgram.listgen(intArray24);
        List list33 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        List list47 = AppendPairProgram.listgen(intArray42);
        List list48 = AppendPairProgram.listgen(intArray42);
        List list49 = AppendPairProgram.listgen(intArray42);
        List list50 = AppendPairProgram.listgen(intArray42);
        List list51 = AppendPairProgram.listgen(intArray42);
        appendPairProgram0.TestStudentSubmission(list51, (int) 'a');
        AppendPairProgram appendPairProgram54 = new AppendPairProgram();
        int[] intArray55 = new int[] {};
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        List list58 = AppendPairProgram.listgen(intArray55);
        appendPairProgram54.TestStudentSubmission(list58, (int) (byte) 10);
        int[] intArray61 = new int[] {};
        List list62 = AppendPairProgram.listgen(intArray61);
        List list63 = AppendPairProgram.listgen(intArray61);
        appendPairProgram54.TestStudentSubmission(list63, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list63, (-1));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        AppendPairProgram appendPairProgram46 = new AppendPairProgram();
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        List list49 = AppendPairProgram.listgen(intArray47);
        appendPairProgram46.TestStudentSubmission(list49, (int) (byte) 10);
        int[] intArray52 = new int[] {};
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        appendPairProgram46.TestStudentSubmission(list56, (-1));
        int[] intArray59 = new int[] {};
        List list60 = AppendPairProgram.listgen(intArray59);
        List list61 = AppendPairProgram.listgen(intArray59);
        List list62 = AppendPairProgram.listgen(intArray59);
        List list63 = AppendPairProgram.listgen(intArray59);
        List list64 = AppendPairProgram.listgen(intArray59);
        List list65 = AppendPairProgram.listgen(intArray59);
        List list66 = AppendPairProgram.listgen(intArray59);
        List list67 = AppendPairProgram.listgen(intArray59);
        List list68 = AppendPairProgram.listgen(intArray59);
        List list69 = AppendPairProgram.listgen(intArray59);
        List list70 = AppendPairProgram.listgen(intArray59);
        List list71 = AppendPairProgram.listgen(intArray59);
        List list72 = AppendPairProgram.listgen(intArray59);
        List list73 = AppendPairProgram.listgen(intArray59);
        appendPairProgram46.TestStudentSubmission(list73, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list73, (int) (byte) 100);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) -1);
        int[] intArray19 = new int[] { 0, '#', (short) -1 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (-1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        AppendPairProgram appendPairProgram28 = new AppendPairProgram();
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        appendPairProgram28.TestStudentSubmission(list30, (int) (short) 1);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        appendPairProgram28.TestStudentSubmission(list36, 0);
        int[] intArray39 = new int[] {};
        List list40 = AppendPairProgram.listgen(intArray39);
        List list41 = AppendPairProgram.listgen(intArray39);
        List list42 = AppendPairProgram.listgen(intArray39);
        List list43 = AppendPairProgram.listgen(intArray39);
        appendPairProgram28.TestStudentSubmission(list43, (int) (byte) -1);
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        appendPairProgram28.TestStudentSubmission(list53, (-1));
        int[] intArray56 = new int[] {};
        List list57 = AppendPairProgram.listgen(intArray56);
        List list58 = AppendPairProgram.listgen(intArray56);
        List list59 = AppendPairProgram.listgen(intArray56);
        List list60 = AppendPairProgram.listgen(intArray56);
        List list61 = AppendPairProgram.listgen(intArray56);
        List list62 = AppendPairProgram.listgen(intArray56);
        List list63 = AppendPairProgram.listgen(intArray56);
        List list64 = AppendPairProgram.listgen(intArray56);
        List list65 = AppendPairProgram.listgen(intArray56);
        appendPairProgram28.TestStudentSubmission(list65, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list65, (int) (short) 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray21 = new int[] { 0, '#', (short) -1 };
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) ' ');
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        appendPairProgram9.TestStudentSubmission(list17, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, (int) 'a');
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        int[] intArray17 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (int) '4');
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list14, (int) (byte) 1);
        int[] intArray23 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (byte) 100);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list13, (int) (byte) 10);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram9.TestStudentSubmission(list24, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray22 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, 100);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        AppendPairProgram appendPairProgram5 = new AppendPairProgram();
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        appendPairProgram5.TestStudentSubmission(list7, (int) (short) 1);
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        appendPairProgram5.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram5.TestStudentSubmission(list18, 0);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        List list28 = AppendPairProgram.listgen(intArray21);
        List list29 = AppendPairProgram.listgen(intArray21);
        appendPairProgram5.TestStudentSubmission(list29, (int) (short) 0);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram5.TestStudentSubmission(list34, 100);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        List list44 = AppendPairProgram.listgen(intArray37);
        List list45 = AppendPairProgram.listgen(intArray37);
        appendPairProgram5.TestStudentSubmission(list45, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (-1));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        int[] intArray22 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 1 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, 10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        List list13 = AppendPairProgram.listgen(intArray6);
        List list14 = AppendPairProgram.listgen(intArray6);
        List list15 = AppendPairProgram.listgen(intArray6);
        List list16 = AppendPairProgram.listgen(intArray6);
        List list17 = AppendPairProgram.listgen(intArray6);
        List list18 = AppendPairProgram.listgen(intArray6);
        List list19 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        int[] intArray25 = new int[] { 0, '#', (short) -1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        int[] intArray48 = new int[] { 10, (byte) 0 };
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list50, (int) '#');
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list17, (int) (byte) 10);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        appendPairProgram14.TestStudentSubmission(list24, (-1));
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        List list30 = AppendPairProgram.listgen(intArray27);
        List list31 = AppendPairProgram.listgen(intArray27);
        List list32 = AppendPairProgram.listgen(intArray27);
        List list33 = AppendPairProgram.listgen(intArray27);
        List list34 = AppendPairProgram.listgen(intArray27);
        List list35 = AppendPairProgram.listgen(intArray27);
        List list36 = AppendPairProgram.listgen(intArray27);
        List list37 = AppendPairProgram.listgen(intArray27);
        List list38 = AppendPairProgram.listgen(intArray27);
        List list39 = AppendPairProgram.listgen(intArray27);
        List list40 = AppendPairProgram.listgen(intArray27);
        List list41 = AppendPairProgram.listgen(intArray27);
        appendPairProgram14.TestStudentSubmission(list41, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list41, (int) (byte) 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list8, (int) (byte) 100);
        int[] intArray17 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        List list23 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, (int) (short) 100);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        List list15 = AppendPairProgram.listgen(intArray9);
        List list16 = AppendPairProgram.listgen(intArray9);
        List list17 = AppendPairProgram.listgen(intArray9);
        List list18 = AppendPairProgram.listgen(intArray9);
        List list19 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        int[] intArray28 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list29 = AppendPairProgram.listgen(intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, 0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 0);
        int[] intArray18 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list18, (int) (byte) 10);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        appendPairProgram14.TestStudentSubmission(list27, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        int[] intArray52 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        List list57 = AppendPairProgram.listgen(intArray52);
        List list58 = AppendPairProgram.listgen(intArray52);
        List list59 = AppendPairProgram.listgen(intArray52);
        List list60 = AppendPairProgram.listgen(intArray52);
        List list61 = AppendPairProgram.listgen(intArray52);
        List list62 = AppendPairProgram.listgen(intArray52);
        List list63 = AppendPairProgram.listgen(intArray52);
        List list64 = AppendPairProgram.listgen(intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list64, 1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) 10);
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list26, (int) (short) 1);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        appendPairProgram24.TestStudentSubmission(list32, 0);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        appendPairProgram24.TestStudentSubmission(list37, 0);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        List list43 = AppendPairProgram.listgen(intArray40);
        List list44 = AppendPairProgram.listgen(intArray40);
        List list45 = AppendPairProgram.listgen(intArray40);
        List list46 = AppendPairProgram.listgen(intArray40);
        List list47 = AppendPairProgram.listgen(intArray40);
        List list48 = AppendPairProgram.listgen(intArray40);
        appendPairProgram24.TestStudentSubmission(list48, (int) (short) 0);
        int[] intArray52 = new int[] { (byte) 10 };
        List list53 = AppendPairProgram.listgen(intArray52);
        appendPairProgram24.TestStudentSubmission(list53, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list53, (int) 'a');
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray7 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list8 = AppendPairProgram.listgen(intArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list8, (int) (short) -1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        List list15 = AppendPairProgram.listgen(intArray9);
        List list16 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 0);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, 10);
        int[] intArray26 = new int[] { (byte) 10 };
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        appendPairProgram19.TestStudentSubmission(list30, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) 'a');
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray20 = new int[] { (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram0.TestStudentSubmission(list21, (-1));
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list27, 10);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        List list36 = AppendPairProgram.listgen(intArray30);
        appendPairProgram24.TestStudentSubmission(list36, 100);
        int[] intArray40 = new int[] { (byte) 10 };
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        appendPairProgram24.TestStudentSubmission(list42, (int) (byte) -1);
        int[] intArray45 = new int[] {};
        List list46 = AppendPairProgram.listgen(intArray45);
        List list47 = AppendPairProgram.listgen(intArray45);
        List list48 = AppendPairProgram.listgen(intArray45);
        List list49 = AppendPairProgram.listgen(intArray45);
        List list50 = AppendPairProgram.listgen(intArray45);
        List list51 = AppendPairProgram.listgen(intArray45);
        List list52 = AppendPairProgram.listgen(intArray45);
        List list53 = AppendPairProgram.listgen(intArray45);
        List list54 = AppendPairProgram.listgen(intArray45);
        appendPairProgram24.TestStudentSubmission(list54, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list54, (int) (byte) 10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        int[] intArray24 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        List list31 = AppendPairProgram.listgen(intArray24);
        List list32 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray21 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (short) 1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list18, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        int[] intArray30 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        List list36 = AppendPairProgram.listgen(intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, (int) (byte) 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        int[] intArray52 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list53 = AppendPairProgram.listgen(intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list53, 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        int[] intArray21 = new int[] { 0, '#', (short) -1 };
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        List list28 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, (int) (byte) 100);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list17, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, (int) (short) -1);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        AppendPairProgram appendPairProgram15 = new AppendPairProgram();
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram15.TestStudentSubmission(list18, 10);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        appendPairProgram15.TestStudentSubmission(list27, 100);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        appendPairProgram15.TestStudentSubmission(list32, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (short) -1);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray16 = new int[] { 0, '#', (short) -1 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 100);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        int[] intArray52 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        List list57 = AppendPairProgram.listgen(intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list57, (int) (byte) 1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        AppendPairProgram appendPairProgram23 = new AppendPairProgram();
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        appendPairProgram23.TestStudentSubmission(list26, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list26, (int) (short) 1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        List list43 = AppendPairProgram.listgen(intArray40);
        List list44 = AppendPairProgram.listgen(intArray40);
        List list45 = AppendPairProgram.listgen(intArray40);
        List list46 = AppendPairProgram.listgen(intArray40);
        List list47 = AppendPairProgram.listgen(intArray40);
        List list48 = AppendPairProgram.listgen(intArray40);
        List list49 = AppendPairProgram.listgen(intArray40);
        List list50 = AppendPairProgram.listgen(intArray40);
        List list51 = AppendPairProgram.listgen(intArray40);
        List list52 = AppendPairProgram.listgen(intArray40);
        appendPairProgram0.TestStudentSubmission(list52, (int) (short) 100);
        int[] intArray59 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 1 };
        List list60 = AppendPairProgram.listgen(intArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list60, (int) (short) 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray23 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        List list27 = AppendPairProgram.listgen(intArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) 100);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        AppendPairProgram appendPairProgram46 = new AppendPairProgram();
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        List list49 = AppendPairProgram.listgen(intArray47);
        appendPairProgram46.TestStudentSubmission(list49, 10);
        int[] intArray52 = new int[] {};
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        List list57 = AppendPairProgram.listgen(intArray52);
        List list58 = AppendPairProgram.listgen(intArray52);
        appendPairProgram46.TestStudentSubmission(list58, 100);
        int[] intArray61 = new int[] {};
        List list62 = AppendPairProgram.listgen(intArray61);
        appendPairProgram46.TestStudentSubmission(list62, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list62, (int) (short) -1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        appendPairProgram9.TestStudentSubmission(list19, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 100);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray15 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        List list22 = AppendPairProgram.listgen(intArray15);
        List list23 = AppendPairProgram.listgen(intArray15);
        List list24 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) 'a');
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        AppendPairProgram appendPairProgram1 = new AppendPairProgram();
        int[] intArray2 = new int[] {};
        List list3 = AppendPairProgram.listgen(intArray2);
        appendPairProgram1.TestStudentSubmission(list3, (int) (short) 1);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        appendPairProgram1.TestStudentSubmission(list7, (int) (byte) -1);
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        List list17 = AppendPairProgram.listgen(intArray10);
        List list18 = AppendPairProgram.listgen(intArray10);
        List list19 = AppendPairProgram.listgen(intArray10);
        List list20 = AppendPairProgram.listgen(intArray10);
        appendPairProgram1.TestStudentSubmission(list20, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (short) 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list8, (int) (byte) 100);
        int[] intArray17 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (short) 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray25 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) 10);
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list27, 10);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        List list36 = AppendPairProgram.listgen(intArray30);
        appendPairProgram24.TestStudentSubmission(list36, 100);
        int[] intArray40 = new int[] { (byte) 10 };
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        appendPairProgram24.TestStudentSubmission(list42, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (int) (short) 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        List list43 = AppendPairProgram.listgen(intArray40);
        List list44 = AppendPairProgram.listgen(intArray40);
        List list45 = AppendPairProgram.listgen(intArray40);
        List list46 = AppendPairProgram.listgen(intArray40);
        List list47 = AppendPairProgram.listgen(intArray40);
        List list48 = AppendPairProgram.listgen(intArray40);
        List list49 = AppendPairProgram.listgen(intArray40);
        List list50 = AppendPairProgram.listgen(intArray40);
        List list51 = AppendPairProgram.listgen(intArray40);
        List list52 = AppendPairProgram.listgen(intArray40);
        appendPairProgram0.TestStudentSubmission(list52, (int) (short) 100);
        int[] intArray61 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list62 = AppendPairProgram.listgen(intArray61);
        List list63 = AppendPairProgram.listgen(intArray61);
        List list64 = AppendPairProgram.listgen(intArray61);
        List list65 = AppendPairProgram.listgen(intArray61);
        List list66 = AppendPairProgram.listgen(intArray61);
        List list67 = AppendPairProgram.listgen(intArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list67, (int) (short) 10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        appendPairProgram0.TestStudentSubmission(list53, (int) (short) 1);
        AppendPairProgram appendPairProgram56 = new AppendPairProgram();
        int[] intArray57 = new int[] {};
        List list58 = AppendPairProgram.listgen(intArray57);
        appendPairProgram56.TestStudentSubmission(list58, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list58, (int) (byte) -1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray21 = new int[] { 0, '#', (short) -1 };
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray15 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        List list22 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, 100);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray17 = new int[] { 0, '#', (short) -1 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        List list23 = AppendPairProgram.listgen(intArray17);
        List list24 = AppendPairProgram.listgen(intArray17);
        List list25 = AppendPairProgram.listgen(intArray17);
        List list26 = AppendPairProgram.listgen(intArray17);
        List list27 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) '#');
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        List list21 = AppendPairProgram.listgen(intArray13);
        List list22 = AppendPairProgram.listgen(intArray13);
        List list23 = AppendPairProgram.listgen(intArray13);
        List list24 = AppendPairProgram.listgen(intArray13);
        List list25 = AppendPairProgram.listgen(intArray13);
        List list26 = AppendPairProgram.listgen(intArray13);
        List list27 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list33, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (short) 100);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray22 = new int[] { 0, '#', (short) -1 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (byte) -1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 0);
        int[] intArray22 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (-1));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (short) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, 10);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        appendPairProgram19.TestStudentSubmission(list31, 100);
        int[] intArray35 = new int[] { (byte) 10 };
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        appendPairProgram19.TestStudentSubmission(list37, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) (byte) 1);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        List list15 = AppendPairProgram.listgen(intArray9);
        List list16 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 0);
        int[] intArray25 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) (short) -1);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        List list15 = AppendPairProgram.listgen(intArray9);
        List list16 = AppendPairProgram.listgen(intArray9);
        List list17 = AppendPairProgram.listgen(intArray9);
        List list18 = AppendPairProgram.listgen(intArray9);
        List list19 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        int[] intArray25 = new int[] { 0, '#', (short) -1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) -1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list24, (int) (byte) -1);
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        appendPairProgram18.TestStudentSubmission(list29, (int) (byte) -1);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        appendPairProgram18.TestStudentSubmission(list34, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) 'a');
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        AppendPairProgram appendPairProgram21 = new AppendPairProgram();
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        appendPairProgram21.TestStudentSubmission(list23, (int) (short) 1);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        appendPairProgram21.TestStudentSubmission(list29, 0);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        appendPairProgram21.TestStudentSubmission(list34, 0);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        List list44 = AppendPairProgram.listgen(intArray37);
        List list45 = AppendPairProgram.listgen(intArray37);
        appendPairProgram21.TestStudentSubmission(list45, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) (byte) 100);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        int[] intArray24 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        List list31 = AppendPairProgram.listgen(intArray24);
        List list32 = AppendPairProgram.listgen(intArray24);
        List list33 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) '#');
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        List list28 = AppendPairProgram.listgen(intArray21);
        List list29 = AppendPairProgram.listgen(intArray21);
        List list30 = AppendPairProgram.listgen(intArray21);
        appendPairProgram0.TestStudentSubmission(list30, (int) (short) -1);
        int[] intArray39 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list40 = AppendPairProgram.listgen(intArray39);
        List list41 = AppendPairProgram.listgen(intArray39);
        List list42 = AppendPairProgram.listgen(intArray39);
        List list43 = AppendPairProgram.listgen(intArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list14, (int) (byte) 1);
        int[] intArray23 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        List list27 = AppendPairProgram.listgen(intArray23);
        List list28 = AppendPairProgram.listgen(intArray23);
        List list29 = AppendPairProgram.listgen(intArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) '#');
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray17 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) '#');
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        List list47 = AppendPairProgram.listgen(intArray42);
        List list48 = AppendPairProgram.listgen(intArray42);
        List list49 = AppendPairProgram.listgen(intArray42);
        List list50 = AppendPairProgram.listgen(intArray42);
        List list51 = AppendPairProgram.listgen(intArray42);
        appendPairProgram0.TestStudentSubmission(list51, (int) 'a');
        AppendPairProgram appendPairProgram54 = new AppendPairProgram();
        int[] intArray55 = new int[] {};
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        List list58 = AppendPairProgram.listgen(intArray55);
        appendPairProgram54.TestStudentSubmission(list58, (int) (byte) 10);
        int[] intArray61 = new int[] {};
        List list62 = AppendPairProgram.listgen(intArray61);
        List list63 = AppendPairProgram.listgen(intArray61);
        List list64 = AppendPairProgram.listgen(intArray61);
        List list65 = AppendPairProgram.listgen(intArray61);
        List list66 = AppendPairProgram.listgen(intArray61);
        List list67 = AppendPairProgram.listgen(intArray61);
        appendPairProgram54.TestStudentSubmission(list67, 1);
        int[] intArray70 = new int[] {};
        List list71 = AppendPairProgram.listgen(intArray70);
        List list72 = AppendPairProgram.listgen(intArray70);
        List list73 = AppendPairProgram.listgen(intArray70);
        List list74 = AppendPairProgram.listgen(intArray70);
        List list75 = AppendPairProgram.listgen(intArray70);
        List list76 = AppendPairProgram.listgen(intArray70);
        appendPairProgram54.TestStudentSubmission(list76, (int) (short) 1);
        int[] intArray79 = new int[] {};
        List list80 = AppendPairProgram.listgen(intArray79);
        List list81 = AppendPairProgram.listgen(intArray79);
        List list82 = AppendPairProgram.listgen(intArray79);
        List list83 = AppendPairProgram.listgen(intArray79);
        List list84 = AppendPairProgram.listgen(intArray79);
        List list85 = AppendPairProgram.listgen(intArray79);
        List list86 = AppendPairProgram.listgen(intArray79);
        List list87 = AppendPairProgram.listgen(intArray79);
        List list88 = AppendPairProgram.listgen(intArray79);
        List list89 = AppendPairProgram.listgen(intArray79);
        List list90 = AppendPairProgram.listgen(intArray79);
        List list91 = AppendPairProgram.listgen(intArray79);
        List list92 = AppendPairProgram.listgen(intArray79);
        List list93 = AppendPairProgram.listgen(intArray79);
        appendPairProgram54.TestStudentSubmission(list93, (int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list93, (int) (byte) 100);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray20 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list21 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) '#');
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        List list43 = AppendPairProgram.listgen(intArray34);
        List list44 = AppendPairProgram.listgen(intArray34);
        List list45 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) (byte) -1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        AppendPairProgram appendPairProgram25 = new AppendPairProgram();
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        appendPairProgram25.TestStudentSubmission(list28, 10);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        List list36 = AppendPairProgram.listgen(intArray31);
        List list37 = AppendPairProgram.listgen(intArray31);
        appendPairProgram25.TestStudentSubmission(list37, 100);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        appendPairProgram25.TestStudentSubmission(list42, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (int) (short) -1);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray48 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        List list51 = AppendPairProgram.listgen(intArray48);
        List list52 = AppendPairProgram.listgen(intArray48);
        List list53 = AppendPairProgram.listgen(intArray48);
        List list54 = AppendPairProgram.listgen(intArray48);
        List list55 = AppendPairProgram.listgen(intArray48);
        List list56 = AppendPairProgram.listgen(intArray48);
        List list57 = AppendPairProgram.listgen(intArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list57, 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        appendPairProgram0.TestStudentSubmission(list53, (int) (short) 1);
        AppendPairProgram appendPairProgram56 = new AppendPairProgram();
        int[] intArray57 = new int[] {};
        List list58 = AppendPairProgram.listgen(intArray57);
        appendPairProgram56.TestStudentSubmission(list58, (int) (short) 1);
        int[] intArray61 = new int[] {};
        List list62 = AppendPairProgram.listgen(intArray61);
        appendPairProgram56.TestStudentSubmission(list62, (int) (byte) -1);
        int[] intArray65 = new int[] {};
        List list66 = AppendPairProgram.listgen(intArray65);
        List list67 = AppendPairProgram.listgen(intArray65);
        appendPairProgram56.TestStudentSubmission(list67, (int) (byte) -1);
        int[] intArray70 = new int[] {};
        List list71 = AppendPairProgram.listgen(intArray70);
        List list72 = AppendPairProgram.listgen(intArray70);
        appendPairProgram56.TestStudentSubmission(list72, (int) (byte) 10);
        int[] intArray75 = new int[] {};
        List list76 = AppendPairProgram.listgen(intArray75);
        List list77 = AppendPairProgram.listgen(intArray75);
        List list78 = AppendPairProgram.listgen(intArray75);
        List list79 = AppendPairProgram.listgen(intArray75);
        appendPairProgram56.TestStudentSubmission(list79, (int) (byte) 0);
        int[] intArray82 = new int[] {};
        List list83 = AppendPairProgram.listgen(intArray82);
        List list84 = AppendPairProgram.listgen(intArray82);
        List list85 = AppendPairProgram.listgen(intArray82);
        List list86 = AppendPairProgram.listgen(intArray82);
        List list87 = AppendPairProgram.listgen(intArray82);
        List list88 = AppendPairProgram.listgen(intArray82);
        appendPairProgram56.TestStudentSubmission(list88, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list88, (int) (byte) 10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        AppendPairProgram appendPairProgram9 = new AppendPairProgram();
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        appendPairProgram9.TestStudentSubmission(list12, (int) (byte) 10);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        List list22 = AppendPairProgram.listgen(intArray15);
        List list23 = AppendPairProgram.listgen(intArray15);
        List list24 = AppendPairProgram.listgen(intArray15);
        List list25 = AppendPairProgram.listgen(intArray15);
        List list26 = AppendPairProgram.listgen(intArray15);
        List list27 = AppendPairProgram.listgen(intArray15);
        List list28 = AppendPairProgram.listgen(intArray15);
        appendPairProgram9.TestStudentSubmission(list28, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        List list31 = AppendPairProgram.listgen(intArray22);
        List list32 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, 100);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray7 = new int[] { (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray20 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        List list25 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) (short) -1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        AppendPairProgram appendPairProgram42 = new AppendPairProgram();
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        appendPairProgram42.TestStudentSubmission(list44, (int) (short) 1);
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        List list49 = AppendPairProgram.listgen(intArray47);
        List list50 = AppendPairProgram.listgen(intArray47);
        appendPairProgram42.TestStudentSubmission(list50, 0);
        int[] intArray53 = new int[] {};
        List list54 = AppendPairProgram.listgen(intArray53);
        List list55 = AppendPairProgram.listgen(intArray53);
        appendPairProgram42.TestStudentSubmission(list55, 0);
        int[] intArray58 = new int[] {};
        List list59 = AppendPairProgram.listgen(intArray58);
        List list60 = AppendPairProgram.listgen(intArray58);
        List list61 = AppendPairProgram.listgen(intArray58);
        List list62 = AppendPairProgram.listgen(intArray58);
        List list63 = AppendPairProgram.listgen(intArray58);
        List list64 = AppendPairProgram.listgen(intArray58);
        List list65 = AppendPairProgram.listgen(intArray58);
        List list66 = AppendPairProgram.listgen(intArray58);
        appendPairProgram42.TestStudentSubmission(list66, (int) (short) 0);
        int[] intArray70 = new int[] { (byte) 10 };
        List list71 = AppendPairProgram.listgen(intArray70);
        appendPairProgram42.TestStudentSubmission(list71, 100);
        int[] intArray74 = new int[] {};
        List list75 = AppendPairProgram.listgen(intArray74);
        List list76 = AppendPairProgram.listgen(intArray74);
        List list77 = AppendPairProgram.listgen(intArray74);
        List list78 = AppendPairProgram.listgen(intArray74);
        List list79 = AppendPairProgram.listgen(intArray74);
        List list80 = AppendPairProgram.listgen(intArray74);
        List list81 = AppendPairProgram.listgen(intArray74);
        List list82 = AppendPairProgram.listgen(intArray74);
        appendPairProgram42.TestStudentSubmission(list82, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list82, (int) (byte) 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 100);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        List list47 = AppendPairProgram.listgen(intArray43);
        List list48 = AppendPairProgram.listgen(intArray43);
        List list49 = AppendPairProgram.listgen(intArray43);
        List list50 = AppendPairProgram.listgen(intArray43);
        List list51 = AppendPairProgram.listgen(intArray43);
        List list52 = AppendPairProgram.listgen(intArray43);
        List list53 = AppendPairProgram.listgen(intArray43);
        List list54 = AppendPairProgram.listgen(intArray43);
        List list55 = AppendPairProgram.listgen(intArray43);
        appendPairProgram0.TestStudentSubmission(list55, (int) '4');
        AppendPairProgram appendPairProgram58 = new AppendPairProgram();
        int[] intArray59 = new int[] {};
        List list60 = AppendPairProgram.listgen(intArray59);
        appendPairProgram58.TestStudentSubmission(list60, (int) (short) 1);
        int[] intArray63 = new int[] {};
        List list64 = AppendPairProgram.listgen(intArray63);
        appendPairProgram58.TestStudentSubmission(list64, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list64, (int) (byte) 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        List list21 = AppendPairProgram.listgen(intArray13);
        List list22 = AppendPairProgram.listgen(intArray13);
        List list23 = AppendPairProgram.listgen(intArray13);
        List list24 = AppendPairProgram.listgen(intArray13);
        List list25 = AppendPairProgram.listgen(intArray13);
        List list26 = AppendPairProgram.listgen(intArray13);
        List list27 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray33 = new int[] { 0, '#', (short) -1 };
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        List list38 = AppendPairProgram.listgen(intArray33);
        List list39 = AppendPairProgram.listgen(intArray33);
        List list40 = AppendPairProgram.listgen(intArray33);
        List list41 = AppendPairProgram.listgen(intArray33);
        List list42 = AppendPairProgram.listgen(intArray33);
        List list43 = AppendPairProgram.listgen(intArray33);
        List list44 = AppendPairProgram.listgen(intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list44, 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 0);
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        List list16 = AppendPairProgram.listgen(intArray12);
        List list17 = AppendPairProgram.listgen(intArray12);
        List list18 = AppendPairProgram.listgen(intArray12);
        List list19 = AppendPairProgram.listgen(intArray12);
        List list20 = AppendPairProgram.listgen(intArray12);
        List list21 = AppendPairProgram.listgen(intArray12);
        List list22 = AppendPairProgram.listgen(intArray12);
        appendPairProgram0.TestStudentSubmission(list22, (int) (byte) 0);
        int[] intArray31 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        List list36 = AppendPairProgram.listgen(intArray31);
        List list37 = AppendPairProgram.listgen(intArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, 1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        List list47 = AppendPairProgram.listgen(intArray42);
        List list48 = AppendPairProgram.listgen(intArray42);
        List list49 = AppendPairProgram.listgen(intArray42);
        List list50 = AppendPairProgram.listgen(intArray42);
        List list51 = AppendPairProgram.listgen(intArray42);
        appendPairProgram0.TestStudentSubmission(list51, (int) 'a');
        int[] intArray60 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list61 = AppendPairProgram.listgen(intArray60);
        List list62 = AppendPairProgram.listgen(intArray60);
        List list63 = AppendPairProgram.listgen(intArray60);
        List list64 = AppendPairProgram.listgen(intArray60);
        List list65 = AppendPairProgram.listgen(intArray60);
        List list66 = AppendPairProgram.listgen(intArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list66, (int) '#');
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray38 = new int[] { 0, '#', (short) -1 };
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        List list42 = AppendPairProgram.listgen(intArray38);
        List list43 = AppendPairProgram.listgen(intArray38);
        List list44 = AppendPairProgram.listgen(intArray38);
        List list45 = AppendPairProgram.listgen(intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) (short) 10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 1);
        int[] intArray15 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        List list20 = AppendPairProgram.listgen(intArray15);
        List list21 = AppendPairProgram.listgen(intArray15);
        List list22 = AppendPairProgram.listgen(intArray15);
        List list23 = AppendPairProgram.listgen(intArray15);
        List list24 = AppendPairProgram.listgen(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (-1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) -1);
        int[] intArray22 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) 100);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray20 = new int[] { (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram0.TestStudentSubmission(list21, (-1));
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list27, (int) (byte) 10);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        appendPairProgram24.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        appendPairProgram24.TestStudentSubmission(list41, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list41, 100);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray10 = new int[] { (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list21, (int) (short) 1);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        appendPairProgram19.TestStudentSubmission(list27, 0);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        appendPairProgram19.TestStudentSubmission(list32, 0);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        List list40 = AppendPairProgram.listgen(intArray35);
        List list41 = AppendPairProgram.listgen(intArray35);
        List list42 = AppendPairProgram.listgen(intArray35);
        List list43 = AppendPairProgram.listgen(intArray35);
        appendPairProgram19.TestStudentSubmission(list43, (int) (short) 0);
        int[] intArray47 = new int[] { (byte) 10 };
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram19.TestStudentSubmission(list48, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list48, (int) (short) -1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        List list13 = AppendPairProgram.listgen(intArray6);
        List list14 = AppendPairProgram.listgen(intArray6);
        List list15 = AppendPairProgram.listgen(intArray6);
        List list16 = AppendPairProgram.listgen(intArray6);
        List list17 = AppendPairProgram.listgen(intArray6);
        List list18 = AppendPairProgram.listgen(intArray6);
        List list19 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        int[] intArray25 = new int[] { 0, '#', (short) -1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) (byte) 10);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        appendPairProgram0.TestStudentSubmission(list53, (int) (short) 1);
        AppendPairProgram appendPairProgram56 = new AppendPairProgram();
        int[] intArray57 = new int[] {};
        List list58 = AppendPairProgram.listgen(intArray57);
        List list59 = AppendPairProgram.listgen(intArray57);
        List list60 = AppendPairProgram.listgen(intArray57);
        appendPairProgram56.TestStudentSubmission(list60, (int) (byte) 10);
        int[] intArray63 = new int[] {};
        List list64 = AppendPairProgram.listgen(intArray63);
        List list65 = AppendPairProgram.listgen(intArray63);
        List list66 = AppendPairProgram.listgen(intArray63);
        List list67 = AppendPairProgram.listgen(intArray63);
        List list68 = AppendPairProgram.listgen(intArray63);
        List list69 = AppendPairProgram.listgen(intArray63);
        appendPairProgram56.TestStudentSubmission(list69, 1);
        int[] intArray72 = new int[] {};
        List list73 = AppendPairProgram.listgen(intArray72);
        List list74 = AppendPairProgram.listgen(intArray72);
        List list75 = AppendPairProgram.listgen(intArray72);
        List list76 = AppendPairProgram.listgen(intArray72);
        List list77 = AppendPairProgram.listgen(intArray72);
        List list78 = AppendPairProgram.listgen(intArray72);
        appendPairProgram56.TestStudentSubmission(list78, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list78, (int) '4');
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        List list21 = AppendPairProgram.listgen(intArray13);
        List list22 = AppendPairProgram.listgen(intArray13);
        List list23 = AppendPairProgram.listgen(intArray13);
        List list24 = AppendPairProgram.listgen(intArray13);
        List list25 = AppendPairProgram.listgen(intArray13);
        List list26 = AppendPairProgram.listgen(intArray13);
        List list27 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list33, 10);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        appendPairProgram30.TestStudentSubmission(list42, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (int) '4');
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list17, 0);
        AppendPairProgram appendPairProgram20 = new AppendPairProgram();
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        appendPairProgram20.TestStudentSubmission(list23, 10);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram20.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        appendPairProgram20.TestStudentSubmission(list38, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list38, (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        int[] intArray24 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        List list31 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) '4');
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        List list43 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, 10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list35, 100);
        AppendPairProgram appendPairProgram38 = new AppendPairProgram();
        int[] intArray39 = new int[] {};
        List list40 = AppendPairProgram.listgen(intArray39);
        appendPairProgram38.TestStudentSubmission(list40, (int) (short) 1);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        appendPairProgram38.TestStudentSubmission(list46, 0);
        int[] intArray49 = new int[] {};
        List list50 = AppendPairProgram.listgen(intArray49);
        List list51 = AppendPairProgram.listgen(intArray49);
        appendPairProgram38.TestStudentSubmission(list51, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list51, (int) (short) -1);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray7 = new int[] { (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, (int) (short) 1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list22, 0);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        appendPairProgram14.TestStudentSubmission(list29, (int) (byte) -1);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        appendPairProgram14.TestStudentSubmission(list39, (-1));
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        List list47 = AppendPairProgram.listgen(intArray42);
        List list48 = AppendPairProgram.listgen(intArray42);
        List list49 = AppendPairProgram.listgen(intArray42);
        List list50 = AppendPairProgram.listgen(intArray42);
        List list51 = AppendPairProgram.listgen(intArray42);
        appendPairProgram14.TestStudentSubmission(list51, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list51, (int) (byte) 100);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        int[] intArray41 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 1 };
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        List list44 = AppendPairProgram.listgen(intArray41);
        List list45 = AppendPairProgram.listgen(intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (-1));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        List list25 = AppendPairProgram.listgen(intArray16);
        List list26 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list26, (int) (byte) 1);
        AppendPairProgram appendPairProgram29 = new AppendPairProgram();
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        appendPairProgram29.TestStudentSubmission(list31, (int) (short) 1);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        appendPairProgram29.TestStudentSubmission(list37, 0);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        appendPairProgram29.TestStudentSubmission(list42, 0);
        int[] intArray45 = new int[] {};
        List list46 = AppendPairProgram.listgen(intArray45);
        List list47 = AppendPairProgram.listgen(intArray45);
        List list48 = AppendPairProgram.listgen(intArray45);
        List list49 = AppendPairProgram.listgen(intArray45);
        List list50 = AppendPairProgram.listgen(intArray45);
        List list51 = AppendPairProgram.listgen(intArray45);
        List list52 = AppendPairProgram.listgen(intArray45);
        List list53 = AppendPairProgram.listgen(intArray45);
        appendPairProgram29.TestStudentSubmission(list53, (int) (short) 0);
        int[] intArray57 = new int[] { (byte) 10 };
        List list58 = AppendPairProgram.listgen(intArray57);
        appendPairProgram29.TestStudentSubmission(list58, 100);
        int[] intArray61 = new int[] {};
        List list62 = AppendPairProgram.listgen(intArray61);
        List list63 = AppendPairProgram.listgen(intArray61);
        List list64 = AppendPairProgram.listgen(intArray61);
        List list65 = AppendPairProgram.listgen(intArray61);
        List list66 = AppendPairProgram.listgen(intArray61);
        List list67 = AppendPairProgram.listgen(intArray61);
        List list68 = AppendPairProgram.listgen(intArray61);
        List list69 = AppendPairProgram.listgen(intArray61);
        appendPairProgram29.TestStudentSubmission(list69, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list69, 10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray10 = new int[] { (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        List list28 = AppendPairProgram.listgen(intArray19);
        List list29 = AppendPairProgram.listgen(intArray19);
        List list30 = AppendPairProgram.listgen(intArray19);
        List list31 = AppendPairProgram.listgen(intArray19);
        List list32 = AppendPairProgram.listgen(intArray19);
        List list33 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) 1);
        int[] intArray42 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        List list47 = AppendPairProgram.listgen(intArray42);
        List list48 = AppendPairProgram.listgen(intArray42);
        List list49 = AppendPairProgram.listgen(intArray42);
        List list50 = AppendPairProgram.listgen(intArray42);
        List list51 = AppendPairProgram.listgen(intArray42);
        List list52 = AppendPairProgram.listgen(intArray42);
        List list53 = AppendPairProgram.listgen(intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list53, (int) ' ');
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        int[] intArray27 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 1 };
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        List list30 = AppendPairProgram.listgen(intArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list37, (int) '#');
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        AppendPairProgram appendPairProgram30 = new AppendPairProgram();
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        appendPairProgram30.TestStudentSubmission(list32, (int) (short) 1);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        appendPairProgram30.TestStudentSubmission(list38, 0);
        int[] intArray41 = new int[] {};
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        appendPairProgram30.TestStudentSubmission(list43, 0);
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        List list54 = AppendPairProgram.listgen(intArray46);
        appendPairProgram30.TestStudentSubmission(list54, (int) (short) 0);
        int[] intArray58 = new int[] { (byte) 10 };
        List list59 = AppendPairProgram.listgen(intArray58);
        appendPairProgram30.TestStudentSubmission(list59, 100);
        int[] intArray63 = new int[] { (byte) 10 };
        List list64 = AppendPairProgram.listgen(intArray63);
        appendPairProgram30.TestStudentSubmission(list64, (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list64, (int) 'a');
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        AppendPairProgram appendPairProgram46 = new AppendPairProgram();
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram46.TestStudentSubmission(list48, (int) (short) 1);
        int[] intArray51 = new int[] {};
        List list52 = AppendPairProgram.listgen(intArray51);
        List list53 = AppendPairProgram.listgen(intArray51);
        List list54 = AppendPairProgram.listgen(intArray51);
        appendPairProgram46.TestStudentSubmission(list54, 0);
        int[] intArray57 = new int[] {};
        List list58 = AppendPairProgram.listgen(intArray57);
        List list59 = AppendPairProgram.listgen(intArray57);
        appendPairProgram46.TestStudentSubmission(list59, (int) '4');
        int[] intArray62 = new int[] {};
        List list63 = AppendPairProgram.listgen(intArray62);
        List list64 = AppendPairProgram.listgen(intArray62);
        List list65 = AppendPairProgram.listgen(intArray62);
        List list66 = AppendPairProgram.listgen(intArray62);
        List list67 = AppendPairProgram.listgen(intArray62);
        List list68 = AppendPairProgram.listgen(intArray62);
        List list69 = AppendPairProgram.listgen(intArray62);
        List list70 = AppendPairProgram.listgen(intArray62);
        List list71 = AppendPairProgram.listgen(intArray62);
        List list72 = AppendPairProgram.listgen(intArray62);
        appendPairProgram46.TestStudentSubmission(list72, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list72, (int) (short) 1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        AppendPairProgram appendPairProgram5 = new AppendPairProgram();
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        appendPairProgram5.TestStudentSubmission(list7, (int) (short) 1);
        int[] intArray10 = new int[] {};
        List list11 = AppendPairProgram.listgen(intArray10);
        appendPairProgram5.TestStudentSubmission(list11, 0);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        appendPairProgram5.TestStudentSubmission(list19, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) '4');
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        List list47 = AppendPairProgram.listgen(intArray42);
        List list48 = AppendPairProgram.listgen(intArray42);
        List list49 = AppendPairProgram.listgen(intArray42);
        List list50 = AppendPairProgram.listgen(intArray42);
        List list51 = AppendPairProgram.listgen(intArray42);
        appendPairProgram0.TestStudentSubmission(list51, (int) 'a');
        AppendPairProgram appendPairProgram54 = new AppendPairProgram();
        int[] intArray55 = new int[] {};
        List list56 = AppendPairProgram.listgen(intArray55);
        appendPairProgram54.TestStudentSubmission(list56, (int) (short) 1);
        int[] intArray59 = new int[] {};
        List list60 = AppendPairProgram.listgen(intArray59);
        List list61 = AppendPairProgram.listgen(intArray59);
        List list62 = AppendPairProgram.listgen(intArray59);
        List list63 = AppendPairProgram.listgen(intArray59);
        List list64 = AppendPairProgram.listgen(intArray59);
        appendPairProgram54.TestStudentSubmission(list64, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list64, (int) (short) 1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        appendPairProgram0.TestStudentSubmission(list35, (int) (byte) -1);
        int[] intArray41 = new int[] { 0, '#', (short) -1 };
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (short) -1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 0);
        int[] intArray18 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list19 = AppendPairProgram.listgen(intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (short) 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray38 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        List list42 = AppendPairProgram.listgen(intArray38);
        List list43 = AppendPairProgram.listgen(intArray38);
        List list44 = AppendPairProgram.listgen(intArray38);
        List list45 = AppendPairProgram.listgen(intArray38);
        List list46 = AppendPairProgram.listgen(intArray38);
        List list47 = AppendPairProgram.listgen(intArray38);
        List list48 = AppendPairProgram.listgen(intArray38);
        List list49 = AppendPairProgram.listgen(intArray38);
        List list50 = AppendPairProgram.listgen(intArray38);
        List list51 = AppendPairProgram.listgen(intArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list51, 100);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        List list25 = AppendPairProgram.listgen(intArray16);
        List list26 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list26, (int) (byte) 1);
        int[] intArray35 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, (int) '4');
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        int[] intArray41 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 1 };
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        List list44 = AppendPairProgram.listgen(intArray41);
        List list45 = AppendPairProgram.listgen(intArray41);
        List list46 = AppendPairProgram.listgen(intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list46, (int) (short) 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        int[] intArray30 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        List list28 = AppendPairProgram.listgen(intArray21);
        List list29 = AppendPairProgram.listgen(intArray21);
        List list30 = AppendPairProgram.listgen(intArray21);
        appendPairProgram0.TestStudentSubmission(list30, (int) (short) -1);
        int[] intArray37 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list38 = AppendPairProgram.listgen(intArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list38, (int) 'a');
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        int[] intArray30 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        List list36 = AppendPairProgram.listgen(intArray30);
        List list37 = AppendPairProgram.listgen(intArray30);
        List list38 = AppendPairProgram.listgen(intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list38, (int) (short) 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, 0);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list17, 10);
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        List list25 = AppendPairProgram.listgen(intArray20);
        List list26 = AppendPairProgram.listgen(intArray20);
        appendPairProgram14.TestStudentSubmission(list26, 100);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        appendPairProgram14.TestStudentSubmission(list31, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) 'a');
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray7 = new int[] { (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, (int) (short) 1);
        int[] intArray20 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list21 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, (int) ' ');
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray22 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 1 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray7 = new int[] { (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, (int) (short) 1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list22, 0);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        appendPairProgram14.TestStudentSubmission(list29, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (byte) 10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray17 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        List list23 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) -1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        List list14 = AppendPairProgram.listgen(intArray7);
        List list15 = AppendPairProgram.listgen(intArray7);
        List list16 = AppendPairProgram.listgen(intArray7);
        List list17 = AppendPairProgram.listgen(intArray7);
        List list18 = AppendPairProgram.listgen(intArray7);
        List list19 = AppendPairProgram.listgen(intArray7);
        List list20 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list20, (int) '#');
        AppendPairProgram appendPairProgram23 = new AppendPairProgram();
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        appendPairProgram23.TestStudentSubmission(list25, (int) (short) 1);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram23.TestStudentSubmission(list29, (int) (byte) -1);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        appendPairProgram23.TestStudentSubmission(list34, (int) (byte) -1);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        appendPairProgram23.TestStudentSubmission(list39, (int) (byte) 10);
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        List list46 = AppendPairProgram.listgen(intArray42);
        appendPairProgram23.TestStudentSubmission(list46, (int) (byte) 0);
        int[] intArray49 = new int[] {};
        List list50 = AppendPairProgram.listgen(intArray49);
        List list51 = AppendPairProgram.listgen(intArray49);
        List list52 = AppendPairProgram.listgen(intArray49);
        List list53 = AppendPairProgram.listgen(intArray49);
        List list54 = AppendPairProgram.listgen(intArray49);
        List list55 = AppendPairProgram.listgen(intArray49);
        appendPairProgram23.TestStudentSubmission(list55, 100);
        int[] intArray59 = new int[] { (byte) 10 };
        List list60 = AppendPairProgram.listgen(intArray59);
        List list61 = AppendPairProgram.listgen(intArray59);
        List list62 = AppendPairProgram.listgen(intArray59);
        List list63 = AppendPairProgram.listgen(intArray59);
        List list64 = AppendPairProgram.listgen(intArray59);
        List list65 = AppendPairProgram.listgen(intArray59);
        List list66 = AppendPairProgram.listgen(intArray59);
        appendPairProgram23.TestStudentSubmission(list66, 100);
        int[] intArray69 = new int[] {};
        List list70 = AppendPairProgram.listgen(intArray69);
        List list71 = AppendPairProgram.listgen(intArray69);
        List list72 = AppendPairProgram.listgen(intArray69);
        List list73 = AppendPairProgram.listgen(intArray69);
        List list74 = AppendPairProgram.listgen(intArray69);
        List list75 = AppendPairProgram.listgen(intArray69);
        List list76 = AppendPairProgram.listgen(intArray69);
        appendPairProgram23.TestStudentSubmission(list76, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list76, (int) (byte) 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        int[] intArray24 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (byte) 10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray11 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        List list16 = AppendPairProgram.listgen(intArray11);
        List list17 = AppendPairProgram.listgen(intArray11);
        List list18 = AppendPairProgram.listgen(intArray11);
        List list19 = AppendPairProgram.listgen(intArray11);
        List list20 = AppendPairProgram.listgen(intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list20, (int) (byte) 100);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray41 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list42 = AppendPairProgram.listgen(intArray41);
        List list43 = AppendPairProgram.listgen(intArray41);
        List list44 = AppendPairProgram.listgen(intArray41);
        List list45 = AppendPairProgram.listgen(intArray41);
        List list46 = AppendPairProgram.listgen(intArray41);
        List list47 = AppendPairProgram.listgen(intArray41);
        List list48 = AppendPairProgram.listgen(intArray41);
        List list49 = AppendPairProgram.listgen(intArray41);
        List list50 = AppendPairProgram.listgen(intArray41);
        List list51 = AppendPairProgram.listgen(intArray41);
        List list52 = AppendPairProgram.listgen(intArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list52, (int) (byte) 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        AppendPairProgram appendPairProgram6 = new AppendPairProgram();
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        appendPairProgram6.TestStudentSubmission(list8, (int) (short) 1);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        appendPairProgram6.TestStudentSubmission(list14, 0);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        appendPairProgram6.TestStudentSubmission(list19, 0);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        appendPairProgram6.TestStudentSubmission(list30, (int) (short) 0);
        int[] intArray34 = new int[] { (byte) 10 };
        List list35 = AppendPairProgram.listgen(intArray34);
        appendPairProgram6.TestStudentSubmission(list35, 100);
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        List list42 = AppendPairProgram.listgen(intArray38);
        List list43 = AppendPairProgram.listgen(intArray38);
        List list44 = AppendPairProgram.listgen(intArray38);
        List list45 = AppendPairProgram.listgen(intArray38);
        List list46 = AppendPairProgram.listgen(intArray38);
        appendPairProgram6.TestStudentSubmission(list46, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list46, (int) (byte) 100);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 0);
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        List list16 = AppendPairProgram.listgen(intArray12);
        List list17 = AppendPairProgram.listgen(intArray12);
        List list18 = AppendPairProgram.listgen(intArray12);
        List list19 = AppendPairProgram.listgen(intArray12);
        List list20 = AppendPairProgram.listgen(intArray12);
        List list21 = AppendPairProgram.listgen(intArray12);
        List list22 = AppendPairProgram.listgen(intArray12);
        appendPairProgram0.TestStudentSubmission(list22, (int) (byte) 0);
        AppendPairProgram appendPairProgram25 = new AppendPairProgram();
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        appendPairProgram25.TestStudentSubmission(list28, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        AppendPairProgram appendPairProgram16 = new AppendPairProgram();
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        appendPairProgram16.TestStudentSubmission(list18, (int) (short) 1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        appendPairProgram16.TestStudentSubmission(list22, (int) (byte) -1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        appendPairProgram16.TestStudentSubmission(list27, (int) (byte) -1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        appendPairProgram16.TestStudentSubmission(list32, (int) (byte) 10);
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        appendPairProgram16.TestStudentSubmission(list39, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, (int) (byte) 100);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        int[] intArray17 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        List list23 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, (int) '#');
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, 0);
        int[] intArray20 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        List list23 = AppendPairProgram.listgen(intArray20);
        List list24 = AppendPairProgram.listgen(intArray20);
        List list25 = AppendPairProgram.listgen(intArray20);
        List list26 = AppendPairProgram.listgen(intArray20);
        List list27 = AppendPairProgram.listgen(intArray20);
        List list28 = AppendPairProgram.listgen(intArray20);
        List list29 = AppendPairProgram.listgen(intArray20);
        List list30 = AppendPairProgram.listgen(intArray20);
        List list31 = AppendPairProgram.listgen(intArray20);
        List list32 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (byte) 1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        appendPairProgram0.TestStudentSubmission(list35, (int) (byte) -1);
        int[] intArray42 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, (int) (short) 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        AppendPairProgram appendPairProgram11 = new AppendPairProgram();
        int[] intArray12 = new int[] {};
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        appendPairProgram11.TestStudentSubmission(list14, 10);
        int[] intArray17 = new int[] {};
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        List list22 = AppendPairProgram.listgen(intArray17);
        List list23 = AppendPairProgram.listgen(intArray17);
        appendPairProgram11.TestStudentSubmission(list23, 100);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        appendPairProgram11.TestStudentSubmission(list27, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, 0);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list17, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, (int) (byte) 1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, 1);
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list39, (int) (short) 1);
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        appendPairProgram37.TestStudentSubmission(list45, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray12 = new int[] { (byte) 10 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        appendPairProgram0.TestStudentSubmission(list15, 10);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list31, 0);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        appendPairProgram18.TestStudentSubmission(list42, (int) (short) 0);
        int[] intArray46 = new int[] { (byte) 10 };
        List list47 = AppendPairProgram.listgen(intArray46);
        appendPairProgram18.TestStudentSubmission(list47, 100);
        int[] intArray51 = new int[] { (byte) 10 };
        List list52 = AppendPairProgram.listgen(intArray51);
        appendPairProgram18.TestStudentSubmission(list52, (-1));
        int[] intArray55 = new int[] {};
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        List list58 = AppendPairProgram.listgen(intArray55);
        List list59 = AppendPairProgram.listgen(intArray55);
        List list60 = AppendPairProgram.listgen(intArray55);
        List list61 = AppendPairProgram.listgen(intArray55);
        appendPairProgram18.TestStudentSubmission(list61, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list61, (int) (byte) -1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        List list28 = AppendPairProgram.listgen(intArray21);
        List list29 = AppendPairProgram.listgen(intArray21);
        List list30 = AppendPairProgram.listgen(intArray21);
        appendPairProgram0.TestStudentSubmission(list30, (int) (short) -1);
        AppendPairProgram appendPairProgram33 = new AppendPairProgram();
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        appendPairProgram33.TestStudentSubmission(list37, (int) (byte) 10);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        appendPairProgram33.TestStudentSubmission(list42, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (int) (short) 10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list19, 0);
        int[] intArray28 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        List list17 = AppendPairProgram.listgen(intArray14);
        List list18 = AppendPairProgram.listgen(intArray14);
        List list19 = AppendPairProgram.listgen(intArray14);
        List list20 = AppendPairProgram.listgen(intArray14);
        List list21 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list21, (int) '4');
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list28, (int) (byte) 10);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        List list34 = AppendPairProgram.listgen(intArray31);
        List list35 = AppendPairProgram.listgen(intArray31);
        List list36 = AppendPairProgram.listgen(intArray31);
        List list37 = AppendPairProgram.listgen(intArray31);
        appendPairProgram24.TestStudentSubmission(list37, 1);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        List list43 = AppendPairProgram.listgen(intArray40);
        List list44 = AppendPairProgram.listgen(intArray40);
        List list45 = AppendPairProgram.listgen(intArray40);
        List list46 = AppendPairProgram.listgen(intArray40);
        appendPairProgram24.TestStudentSubmission(list46, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list46, (int) (byte) 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        List list43 = AppendPairProgram.listgen(intArray34);
        List list44 = AppendPairProgram.listgen(intArray34);
        List list45 = AppendPairProgram.listgen(intArray34);
        List list46 = AppendPairProgram.listgen(intArray34);
        List list47 = AppendPairProgram.listgen(intArray34);
        List list48 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list48, (int) (short) 100);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray18 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list19 = AppendPairProgram.listgen(intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 10);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        List list16 = AppendPairProgram.listgen(intArray11);
        List list17 = AppendPairProgram.listgen(intArray11);
        List list18 = AppendPairProgram.listgen(intArray11);
        List list19 = AppendPairProgram.listgen(intArray11);
        List list20 = AppendPairProgram.listgen(intArray11);
        List list21 = AppendPairProgram.listgen(intArray11);
        List list22 = AppendPairProgram.listgen(intArray11);
        List list23 = AppendPairProgram.listgen(intArray11);
        List list24 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 0);
        int[] intArray33 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        List list38 = AppendPairProgram.listgen(intArray33);
        List list39 = AppendPairProgram.listgen(intArray33);
        List list40 = AppendPairProgram.listgen(intArray33);
        List list41 = AppendPairProgram.listgen(intArray33);
        List list42 = AppendPairProgram.listgen(intArray33);
        List list43 = AppendPairProgram.listgen(intArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray17 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list18 = AppendPairProgram.listgen(intArray17);
        List list19 = AppendPairProgram.listgen(intArray17);
        List list20 = AppendPairProgram.listgen(intArray17);
        List list21 = AppendPairProgram.listgen(intArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list21, 100);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 0);
        int[] intArray18 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list25, (int) 'a');
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        int[] intArray52 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        List list57 = AppendPairProgram.listgen(intArray52);
        List list58 = AppendPairProgram.listgen(intArray52);
        List list59 = AppendPairProgram.listgen(intArray52);
        List list60 = AppendPairProgram.listgen(intArray52);
        List list61 = AppendPairProgram.listgen(intArray52);
        List list62 = AppendPairProgram.listgen(intArray52);
        List list63 = AppendPairProgram.listgen(intArray52);
        List list64 = AppendPairProgram.listgen(intArray52);
        List list65 = AppendPairProgram.listgen(intArray52);
        List list66 = AppendPairProgram.listgen(intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list66, (int) (short) 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) 1);
        int[] intArray22 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list24, (int) (byte) 1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list37, 10);
        int[] intArray46 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        List list54 = AppendPairProgram.listgen(intArray46);
        List list55 = AppendPairProgram.listgen(intArray46);
        List list56 = AppendPairProgram.listgen(intArray46);
        List list57 = AppendPairProgram.listgen(intArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list57, (int) (byte) 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        appendPairProgram0.TestStudentSubmission(list45, 10);
        int[] intArray52 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list53 = AppendPairProgram.listgen(intArray52);
        List list54 = AppendPairProgram.listgen(intArray52);
        List list55 = AppendPairProgram.listgen(intArray52);
        List list56 = AppendPairProgram.listgen(intArray52);
        List list57 = AppendPairProgram.listgen(intArray52);
        List list58 = AppendPairProgram.listgen(intArray52);
        List list59 = AppendPairProgram.listgen(intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list59, 1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray19 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        List list28 = AppendPairProgram.listgen(intArray19);
        List list29 = AppendPairProgram.listgen(intArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (short) 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) 10);
        int[] intArray25 = new int[] { (byte) 10 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        AppendPairProgram appendPairProgram32 = new AppendPairProgram();
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram32.TestStudentSubmission(list34, (int) (short) 1);
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        appendPairProgram32.TestStudentSubmission(list40, 0);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        appendPairProgram32.TestStudentSubmission(list45, 0);
        int[] intArray48 = new int[] {};
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        List list51 = AppendPairProgram.listgen(intArray48);
        List list52 = AppendPairProgram.listgen(intArray48);
        List list53 = AppendPairProgram.listgen(intArray48);
        List list54 = AppendPairProgram.listgen(intArray48);
        List list55 = AppendPairProgram.listgen(intArray48);
        List list56 = AppendPairProgram.listgen(intArray48);
        appendPairProgram32.TestStudentSubmission(list56, (int) (short) 0);
        int[] intArray60 = new int[] { (byte) 10 };
        List list61 = AppendPairProgram.listgen(intArray60);
        appendPairProgram32.TestStudentSubmission(list61, 100);
        int[] intArray64 = new int[] {};
        List list65 = AppendPairProgram.listgen(intArray64);
        List list66 = AppendPairProgram.listgen(intArray64);
        List list67 = AppendPairProgram.listgen(intArray64);
        List list68 = AppendPairProgram.listgen(intArray64);
        List list69 = AppendPairProgram.listgen(intArray64);
        List list70 = AppendPairProgram.listgen(intArray64);
        List list71 = AppendPairProgram.listgen(intArray64);
        List list72 = AppendPairProgram.listgen(intArray64);
        appendPairProgram32.TestStudentSubmission(list72, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list72, (int) ' ');
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list23, 100);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list17, (int) (short) 1);
        int[] intArray26 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list29, (int) (short) 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 100);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        List list47 = AppendPairProgram.listgen(intArray43);
        List list48 = AppendPairProgram.listgen(intArray43);
        List list49 = AppendPairProgram.listgen(intArray43);
        List list50 = AppendPairProgram.listgen(intArray43);
        List list51 = AppendPairProgram.listgen(intArray43);
        List list52 = AppendPairProgram.listgen(intArray43);
        List list53 = AppendPairProgram.listgen(intArray43);
        List list54 = AppendPairProgram.listgen(intArray43);
        List list55 = AppendPairProgram.listgen(intArray43);
        appendPairProgram0.TestStudentSubmission(list55, (int) '4');
        int[] intArray64 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list65 = AppendPairProgram.listgen(intArray64);
        List list66 = AppendPairProgram.listgen(intArray64);
        List list67 = AppendPairProgram.listgen(intArray64);
        List list68 = AppendPairProgram.listgen(intArray64);
        List list69 = AppendPairProgram.listgen(intArray64);
        List list70 = AppendPairProgram.listgen(intArray64);
        List list71 = AppendPairProgram.listgen(intArray64);
        List list72 = AppendPairProgram.listgen(intArray64);
        List list73 = AppendPairProgram.listgen(intArray64);
        List list74 = AppendPairProgram.listgen(intArray64);
        List list75 = AppendPairProgram.listgen(intArray64);
        List list76 = AppendPairProgram.listgen(intArray64);
        List list77 = AppendPairProgram.listgen(intArray64);
        List list78 = AppendPairProgram.listgen(intArray64);
        List list79 = AppendPairProgram.listgen(intArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list79, (int) (short) 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        AppendPairProgram appendPairProgram37 = new AppendPairProgram();
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        appendPairProgram37.TestStudentSubmission(list39, (int) (short) 1);
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        appendPairProgram37.TestStudentSubmission(list45, 0);
        int[] intArray48 = new int[] {};
        List list49 = AppendPairProgram.listgen(intArray48);
        List list50 = AppendPairProgram.listgen(intArray48);
        appendPairProgram37.TestStudentSubmission(list50, 0);
        int[] intArray53 = new int[] {};
        List list54 = AppendPairProgram.listgen(intArray53);
        List list55 = AppendPairProgram.listgen(intArray53);
        List list56 = AppendPairProgram.listgen(intArray53);
        List list57 = AppendPairProgram.listgen(intArray53);
        List list58 = AppendPairProgram.listgen(intArray53);
        List list59 = AppendPairProgram.listgen(intArray53);
        List list60 = AppendPairProgram.listgen(intArray53);
        List list61 = AppendPairProgram.listgen(intArray53);
        appendPairProgram37.TestStudentSubmission(list61, (int) (short) 0);
        int[] intArray65 = new int[] { (byte) 10 };
        List list66 = AppendPairProgram.listgen(intArray65);
        appendPairProgram37.TestStudentSubmission(list66, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list66, (int) 'a');
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list9, (int) (short) 0);
        int[] intArray18 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list19 = AppendPairProgram.listgen(intArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list24, (int) (byte) -1);
        int[] intArray27 = new int[] {};
        List list28 = AppendPairProgram.listgen(intArray27);
        List list29 = AppendPairProgram.listgen(intArray27);
        appendPairProgram18.TestStudentSubmission(list29, (int) (byte) -1);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        appendPairProgram18.TestStudentSubmission(list34, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, 1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        List list31 = AppendPairProgram.listgen(intArray22);
        List list32 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list32, (int) (byte) 100);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        appendPairProgram0.TestStudentSubmission(list34, (-1));
        int[] intArray37 = new int[] {};
        List list38 = AppendPairProgram.listgen(intArray37);
        List list39 = AppendPairProgram.listgen(intArray37);
        List list40 = AppendPairProgram.listgen(intArray37);
        List list41 = AppendPairProgram.listgen(intArray37);
        List list42 = AppendPairProgram.listgen(intArray37);
        List list43 = AppendPairProgram.listgen(intArray37);
        appendPairProgram0.TestStudentSubmission(list43, (int) (byte) 0);
        AppendPairProgram appendPairProgram46 = new AppendPairProgram();
        int[] intArray47 = new int[] {};
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram46.TestStudentSubmission(list48, (int) (short) 1);
        int[] intArray51 = new int[] {};
        List list52 = AppendPairProgram.listgen(intArray51);
        appendPairProgram46.TestStudentSubmission(list52, (int) (byte) -1);
        int[] intArray55 = new int[] {};
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        appendPairProgram46.TestStudentSubmission(list57, (int) (byte) -1);
        int[] intArray60 = new int[] {};
        List list61 = AppendPairProgram.listgen(intArray60);
        List list62 = AppendPairProgram.listgen(intArray60);
        List list63 = AppendPairProgram.listgen(intArray60);
        List list64 = AppendPairProgram.listgen(intArray60);
        List list65 = AppendPairProgram.listgen(intArray60);
        List list66 = AppendPairProgram.listgen(intArray60);
        List list67 = AppendPairProgram.listgen(intArray60);
        appendPairProgram46.TestStudentSubmission(list67, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list67, 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        List list15 = AppendPairProgram.listgen(intArray9);
        List list16 = AppendPairProgram.listgen(intArray9);
        List list17 = AppendPairProgram.listgen(intArray9);
        List list18 = AppendPairProgram.listgen(intArray9);
        List list19 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        int[] intArray22 = new int[] {};
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        appendPairProgram0.TestStudentSubmission(list25, (int) 'a');
        int[] intArray34 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (int) (byte) 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list17, (int) (short) 1);
        AppendPairProgram appendPairProgram20 = new AppendPairProgram();
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        appendPairProgram20.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        appendPairProgram20.TestStudentSubmission(list28, 0);
        int[] intArray31 = new int[] {};
        List list32 = AppendPairProgram.listgen(intArray31);
        List list33 = AppendPairProgram.listgen(intArray31);
        appendPairProgram20.TestStudentSubmission(list33, 0);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        List list44 = AppendPairProgram.listgen(intArray36);
        appendPairProgram20.TestStudentSubmission(list44, (int) (short) 0);
        int[] intArray48 = new int[] { (byte) 10 };
        List list49 = AppendPairProgram.listgen(intArray48);
        appendPairProgram20.TestStudentSubmission(list49, 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list49, (-1));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray7 = new int[] { (byte) 10 };
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list11, (int) (short) 1);
        AppendPairProgram appendPairProgram14 = new AppendPairProgram();
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram14.TestStudentSubmission(list16, (int) (short) 1);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram14.TestStudentSubmission(list20, (int) (byte) -1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        appendPairProgram14.TestStudentSubmission(list25, (int) (byte) -1);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        appendPairProgram14.TestStudentSubmission(list30, (int) (byte) 10);
        int[] intArray33 = new int[] {};
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        List list37 = AppendPairProgram.listgen(intArray33);
        appendPairProgram14.TestStudentSubmission(list37, (int) (byte) 0);
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        List list42 = AppendPairProgram.listgen(intArray40);
        List list43 = AppendPairProgram.listgen(intArray40);
        List list44 = AppendPairProgram.listgen(intArray40);
        List list45 = AppendPairProgram.listgen(intArray40);
        List list46 = AppendPairProgram.listgen(intArray40);
        appendPairProgram14.TestStudentSubmission(list46, 100);
        int[] intArray50 = new int[] { (byte) 10 };
        List list51 = AppendPairProgram.listgen(intArray50);
        List list52 = AppendPairProgram.listgen(intArray50);
        List list53 = AppendPairProgram.listgen(intArray50);
        List list54 = AppendPairProgram.listgen(intArray50);
        List list55 = AppendPairProgram.listgen(intArray50);
        List list56 = AppendPairProgram.listgen(intArray50);
        List list57 = AppendPairProgram.listgen(intArray50);
        appendPairProgram14.TestStudentSubmission(list57, 100);
        int[] intArray61 = new int[] { (byte) 10 };
        List list62 = AppendPairProgram.listgen(intArray61);
        appendPairProgram14.TestStudentSubmission(list62, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list62, 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 100);
        int[] intArray43 = new int[] {};
        List list44 = AppendPairProgram.listgen(intArray43);
        List list45 = AppendPairProgram.listgen(intArray43);
        List list46 = AppendPairProgram.listgen(intArray43);
        List list47 = AppendPairProgram.listgen(intArray43);
        List list48 = AppendPairProgram.listgen(intArray43);
        List list49 = AppendPairProgram.listgen(intArray43);
        List list50 = AppendPairProgram.listgen(intArray43);
        List list51 = AppendPairProgram.listgen(intArray43);
        List list52 = AppendPairProgram.listgen(intArray43);
        List list53 = AppendPairProgram.listgen(intArray43);
        List list54 = AppendPairProgram.listgen(intArray43);
        List list55 = AppendPairProgram.listgen(intArray43);
        appendPairProgram0.TestStudentSubmission(list55, (int) '4');
        int[] intArray64 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list65 = AppendPairProgram.listgen(intArray64);
        List list66 = AppendPairProgram.listgen(intArray64);
        List list67 = AppendPairProgram.listgen(intArray64);
        List list68 = AppendPairProgram.listgen(intArray64);
        List list69 = AppendPairProgram.listgen(intArray64);
        List list70 = AppendPairProgram.listgen(intArray64);
        List list71 = AppendPairProgram.listgen(intArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list71, (int) 'a');
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        List list12 = AppendPairProgram.listgen(intArray9);
        List list13 = AppendPairProgram.listgen(intArray9);
        List list14 = AppendPairProgram.listgen(intArray9);
        List list15 = AppendPairProgram.listgen(intArray9);
        List list16 = AppendPairProgram.listgen(intArray9);
        List list17 = AppendPairProgram.listgen(intArray9);
        List list18 = AppendPairProgram.listgen(intArray9);
        List list19 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 1);
        int[] intArray28 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        List list38 = AppendPairProgram.listgen(intArray28);
        List list39 = AppendPairProgram.listgen(intArray28);
        List list40 = AppendPairProgram.listgen(intArray28);
        List list41 = AppendPairProgram.listgen(intArray28);
        List list42 = AppendPairProgram.listgen(intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list42, (int) '4');
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        int[] intArray47 = new int[] { (byte) 10 };
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram0.TestStudentSubmission(list48, (int) (byte) 0);
        int[] intArray55 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        List list58 = AppendPairProgram.listgen(intArray55);
        List list59 = AppendPairProgram.listgen(intArray55);
        List list60 = AppendPairProgram.listgen(intArray55);
        List list61 = AppendPairProgram.listgen(intArray55);
        List list62 = AppendPairProgram.listgen(intArray55);
        List list63 = AppendPairProgram.listgen(intArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list63, (int) 'a');
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list23, (int) (byte) 0);
        int[] intArray26 = new int[] {};
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        appendPairProgram0.TestStudentSubmission(list32, 100);
        int[] intArray36 = new int[] { (byte) 10 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram0.TestStudentSubmission(list43, 100);
        int[] intArray47 = new int[] { (byte) 10 };
        List list48 = AppendPairProgram.listgen(intArray47);
        appendPairProgram0.TestStudentSubmission(list48, (int) (byte) 0);
        int[] intArray57 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list58 = AppendPairProgram.listgen(intArray57);
        List list59 = AppendPairProgram.listgen(intArray57);
        List list60 = AppendPairProgram.listgen(intArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list60, (int) (byte) 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) -1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list19, (int) '4');
        int[] intArray25 = new int[] { 0, '#', (short) -1 };
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (byte) 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (short) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, (int) (byte) 10);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        appendPairProgram19.TestStudentSubmission(list29, (-1));
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        appendPairProgram19.TestStudentSubmission(list34, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list34, (int) (short) -1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray30 = new int[] { (byte) 10 };
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        appendPairProgram18.TestStudentSubmission(list33, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list33, (int) (byte) 100);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, (int) (byte) 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list10, (-1));
        int[] intArray13 = new int[] {};
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        List list17 = AppendPairProgram.listgen(intArray13);
        List list18 = AppendPairProgram.listgen(intArray13);
        List list19 = AppendPairProgram.listgen(intArray13);
        List list20 = AppendPairProgram.listgen(intArray13);
        appendPairProgram0.TestStudentSubmission(list20, (-1));
        AppendPairProgram appendPairProgram23 = new AppendPairProgram();
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        appendPairProgram23.TestStudentSubmission(list25, (int) (short) 1);
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        appendPairProgram23.TestStudentSubmission(list31, 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) (byte) 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray10 = new int[] { (byte) 10 };
        List list11 = AppendPairProgram.listgen(intArray10);
        List list12 = AppendPairProgram.listgen(intArray10);
        List list13 = AppendPairProgram.listgen(intArray10);
        List list14 = AppendPairProgram.listgen(intArray10);
        List list15 = AppendPairProgram.listgen(intArray10);
        List list16 = AppendPairProgram.listgen(intArray10);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 1);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list22, 10);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        appendPairProgram19.TestStudentSubmission(list31, 100);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        appendPairProgram19.TestStudentSubmission(list35, (int) (byte) 100);
        int[] intArray38 = new int[] {};
        List list39 = AppendPairProgram.listgen(intArray38);
        List list40 = AppendPairProgram.listgen(intArray38);
        List list41 = AppendPairProgram.listgen(intArray38);
        List list42 = AppendPairProgram.listgen(intArray38);
        List list43 = AppendPairProgram.listgen(intArray38);
        List list44 = AppendPairProgram.listgen(intArray38);
        List list45 = AppendPairProgram.listgen(intArray38);
        List list46 = AppendPairProgram.listgen(intArray38);
        appendPairProgram19.TestStudentSubmission(list46, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list46, (int) (short) -1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray29 = new int[] { 'a', (short) 10, (short) 100, (byte) 0 };
        List list30 = AppendPairProgram.listgen(intArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) (short) 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray34 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        List list43 = AppendPairProgram.listgen(intArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list43, 100);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list21, (int) (short) 10);
        int[] intArray26 = new int[] { 10, (byte) 0 };
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list28, (int) (short) 10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        List list33 = AppendPairProgram.listgen(intArray30);
        List list34 = AppendPairProgram.listgen(intArray30);
        List list35 = AppendPairProgram.listgen(intArray30);
        appendPairProgram0.TestStudentSubmission(list35, (int) (byte) -1);
        int[] intArray44 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        List list47 = AppendPairProgram.listgen(intArray44);
        List list48 = AppendPairProgram.listgen(intArray44);
        List list49 = AppendPairProgram.listgen(intArray44);
        List list50 = AppendPairProgram.listgen(intArray44);
        List list51 = AppendPairProgram.listgen(intArray44);
        List list52 = AppendPairProgram.listgen(intArray44);
        List list53 = AppendPairProgram.listgen(intArray44);
        List list54 = AppendPairProgram.listgen(intArray44);
        List list55 = AppendPairProgram.listgen(intArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list55, (int) '#');
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list21, (int) (short) 1);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        appendPairProgram19.TestStudentSubmission(list27, 0);
        int[] intArray30 = new int[] {};
        List list31 = AppendPairProgram.listgen(intArray30);
        List list32 = AppendPairProgram.listgen(intArray30);
        appendPairProgram19.TestStudentSubmission(list32, (int) '4');
        int[] intArray35 = new int[] {};
        List list36 = AppendPairProgram.listgen(intArray35);
        List list37 = AppendPairProgram.listgen(intArray35);
        List list38 = AppendPairProgram.listgen(intArray35);
        List list39 = AppendPairProgram.listgen(intArray35);
        List list40 = AppendPairProgram.listgen(intArray35);
        List list41 = AppendPairProgram.listgen(intArray35);
        List list42 = AppendPairProgram.listgen(intArray35);
        List list43 = AppendPairProgram.listgen(intArray35);
        List list44 = AppendPairProgram.listgen(intArray35);
        List list45 = AppendPairProgram.listgen(intArray35);
        appendPairProgram19.TestStudentSubmission(list45, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list45, 10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list17, (int) (short) 1);
        int[] intArray24 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray24 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        List list30 = AppendPairProgram.listgen(intArray24);
        List list31 = AppendPairProgram.listgen(intArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list31, (int) (byte) 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        List list21 = AppendPairProgram.listgen(intArray19);
        List list22 = AppendPairProgram.listgen(intArray19);
        List list23 = AppendPairProgram.listgen(intArray19);
        List list24 = AppendPairProgram.listgen(intArray19);
        List list25 = AppendPairProgram.listgen(intArray19);
        List list26 = AppendPairProgram.listgen(intArray19);
        List list27 = AppendPairProgram.listgen(intArray19);
        appendPairProgram0.TestStudentSubmission(list27, (int) (short) -1);
        int[] intArray36 = new int[] { 0, (short) 10, (short) -1, '#', (byte) 100, 1 };
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list40, 10);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, 0);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        List list23 = AppendPairProgram.listgen(intArray16);
        List list24 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list24, (int) (short) 0);
        int[] intArray28 = new int[] { (byte) 10 };
        List list29 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list29, 100);
        int[] intArray32 = new int[] {};
        List list33 = AppendPairProgram.listgen(intArray32);
        List list34 = AppendPairProgram.listgen(intArray32);
        List list35 = AppendPairProgram.listgen(intArray32);
        List list36 = AppendPairProgram.listgen(intArray32);
        List list37 = AppendPairProgram.listgen(intArray32);
        List list38 = AppendPairProgram.listgen(intArray32);
        List list39 = AppendPairProgram.listgen(intArray32);
        List list40 = AppendPairProgram.listgen(intArray32);
        appendPairProgram0.TestStudentSubmission(list40, (int) (byte) 100);
        AppendPairProgram appendPairProgram43 = new AppendPairProgram();
        int[] intArray44 = new int[] {};
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        List list47 = AppendPairProgram.listgen(intArray44);
        appendPairProgram43.TestStudentSubmission(list47, (int) (byte) 10);
        int[] intArray50 = new int[] {};
        List list51 = AppendPairProgram.listgen(intArray50);
        List list52 = AppendPairProgram.listgen(intArray50);
        appendPairProgram43.TestStudentSubmission(list52, (int) (short) 0);
        int[] intArray55 = new int[] {};
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        List list58 = AppendPairProgram.listgen(intArray55);
        List list59 = AppendPairProgram.listgen(intArray55);
        List list60 = AppendPairProgram.listgen(intArray55);
        List list61 = AppendPairProgram.listgen(intArray55);
        List list62 = AppendPairProgram.listgen(intArray55);
        List list63 = AppendPairProgram.listgen(intArray55);
        List list64 = AppendPairProgram.listgen(intArray55);
        List list65 = AppendPairProgram.listgen(intArray55);
        appendPairProgram43.TestStudentSubmission(list65, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list65, (int) (short) -1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, 1);
        int[] intArray16 = new int[] {};
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        List list19 = AppendPairProgram.listgen(intArray16);
        List list20 = AppendPairProgram.listgen(intArray16);
        List list21 = AppendPairProgram.listgen(intArray16);
        List list22 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list22, (int) (short) 1);
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        List list27 = AppendPairProgram.listgen(intArray25);
        List list28 = AppendPairProgram.listgen(intArray25);
        List list29 = AppendPairProgram.listgen(intArray25);
        List list30 = AppendPairProgram.listgen(intArray25);
        List list31 = AppendPairProgram.listgen(intArray25);
        List list32 = AppendPairProgram.listgen(intArray25);
        List list33 = AppendPairProgram.listgen(intArray25);
        List list34 = AppendPairProgram.listgen(intArray25);
        List list35 = AppendPairProgram.listgen(intArray25);
        List list36 = AppendPairProgram.listgen(intArray25);
        List list37 = AppendPairProgram.listgen(intArray25);
        List list38 = AppendPairProgram.listgen(intArray25);
        List list39 = AppendPairProgram.listgen(intArray25);
        appendPairProgram0.TestStudentSubmission(list39, (int) '#');
        int[] intArray42 = new int[] {};
        List list43 = AppendPairProgram.listgen(intArray42);
        List list44 = AppendPairProgram.listgen(intArray42);
        List list45 = AppendPairProgram.listgen(intArray42);
        appendPairProgram0.TestStudentSubmission(list45, 10);
        AppendPairProgram appendPairProgram48 = new AppendPairProgram();
        int[] intArray49 = new int[] {};
        List list50 = AppendPairProgram.listgen(intArray49);
        appendPairProgram48.TestStudentSubmission(list50, (int) (short) 1);
        int[] intArray53 = new int[] {};
        List list54 = AppendPairProgram.listgen(intArray53);
        appendPairProgram48.TestStudentSubmission(list54, 1);
        int[] intArray57 = new int[] {};
        List list58 = AppendPairProgram.listgen(intArray57);
        List list59 = AppendPairProgram.listgen(intArray57);
        List list60 = AppendPairProgram.listgen(intArray57);
        List list61 = AppendPairProgram.listgen(intArray57);
        List list62 = AppendPairProgram.listgen(intArray57);
        List list63 = AppendPairProgram.listgen(intArray57);
        List list64 = AppendPairProgram.listgen(intArray57);
        appendPairProgram48.TestStudentSubmission(list64, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list64, 100);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) 0);
        int[] intArray15 = new int[] { (byte) 10 };
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        List list18 = AppendPairProgram.listgen(intArray15);
        List list19 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list19, (int) (byte) 100);
        int[] intArray28 = new int[] { (short) -1, '#', '4', (short) -1, (short) 100, (byte) -1 };
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, 10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 100);
        int[] intArray20 = new int[] { (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram0.TestStudentSubmission(list21, (-1));
        AppendPairProgram appendPairProgram24 = new AppendPairProgram();
        int[] intArray25 = new int[] {};
        List list26 = AppendPairProgram.listgen(intArray25);
        appendPairProgram24.TestStudentSubmission(list26, (int) (short) 1);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        List list34 = AppendPairProgram.listgen(intArray29);
        appendPairProgram24.TestStudentSubmission(list34, 100);
        int[] intArray38 = new int[] { (byte) 10 };
        List list39 = AppendPairProgram.listgen(intArray38);
        appendPairProgram24.TestStudentSubmission(list39, (int) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list39, (int) (byte) -1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, (int) (byte) -1);
        int[] intArray9 = new int[] {};
        List list10 = AppendPairProgram.listgen(intArray9);
        List list11 = AppendPairProgram.listgen(intArray9);
        appendPairProgram0.TestStudentSubmission(list11, (int) (byte) -1);
        int[] intArray14 = new int[] {};
        List list15 = AppendPairProgram.listgen(intArray14);
        List list16 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list16, (int) (byte) 10);
        AppendPairProgram appendPairProgram19 = new AppendPairProgram();
        int[] intArray20 = new int[] {};
        List list21 = AppendPairProgram.listgen(intArray20);
        appendPairProgram19.TestStudentSubmission(list21, (int) (short) 1);
        int[] intArray24 = new int[] {};
        List list25 = AppendPairProgram.listgen(intArray24);
        List list26 = AppendPairProgram.listgen(intArray24);
        List list27 = AppendPairProgram.listgen(intArray24);
        List list28 = AppendPairProgram.listgen(intArray24);
        List list29 = AppendPairProgram.listgen(intArray24);
        appendPairProgram19.TestStudentSubmission(list29, 100);
        int[] intArray33 = new int[] { (byte) 10 };
        List list34 = AppendPairProgram.listgen(intArray33);
        List list35 = AppendPairProgram.listgen(intArray33);
        List list36 = AppendPairProgram.listgen(intArray33);
        appendPairProgram19.TestStudentSubmission(list36, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list36, (int) (short) 10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray15 = new int[] {};
        List list16 = AppendPairProgram.listgen(intArray15);
        List list17 = AppendPairProgram.listgen(intArray15);
        appendPairProgram0.TestStudentSubmission(list17, (int) (short) 1);
        int[] intArray26 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list27 = AppendPairProgram.listgen(intArray26);
        List list28 = AppendPairProgram.listgen(intArray26);
        List list29 = AppendPairProgram.listgen(intArray26);
        List list30 = AppendPairProgram.listgen(intArray26);
        List list31 = AppendPairProgram.listgen(intArray26);
        List list32 = AppendPairProgram.listgen(intArray26);
        List list33 = AppendPairProgram.listgen(intArray26);
        List list34 = AppendPairProgram.listgen(intArray26);
        List list35 = AppendPairProgram.listgen(intArray26);
        List list36 = AppendPairProgram.listgen(intArray26);
        List list37 = AppendPairProgram.listgen(intArray26);
        List list38 = AppendPairProgram.listgen(intArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list38, (int) (short) 100);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        List list28 = AppendPairProgram.listgen(intArray21);
        List list29 = AppendPairProgram.listgen(intArray21);
        List list30 = AppendPairProgram.listgen(intArray21);
        List list31 = AppendPairProgram.listgen(intArray21);
        List list32 = AppendPairProgram.listgen(intArray21);
        List list33 = AppendPairProgram.listgen(intArray21);
        List list34 = AppendPairProgram.listgen(intArray21);
        List list35 = AppendPairProgram.listgen(intArray21);
        List list36 = AppendPairProgram.listgen(intArray21);
        appendPairProgram0.TestStudentSubmission(list36, (int) (short) 1);
        AppendPairProgram appendPairProgram39 = new AppendPairProgram();
        int[] intArray40 = new int[] {};
        List list41 = AppendPairProgram.listgen(intArray40);
        appendPairProgram39.TestStudentSubmission(list41, (int) (short) 1);
        int[] intArray44 = new int[] {};
        List list45 = AppendPairProgram.listgen(intArray44);
        List list46 = AppendPairProgram.listgen(intArray44);
        List list47 = AppendPairProgram.listgen(intArray44);
        appendPairProgram39.TestStudentSubmission(list47, 0);
        int[] intArray50 = new int[] {};
        List list51 = AppendPairProgram.listgen(intArray50);
        List list52 = AppendPairProgram.listgen(intArray50);
        appendPairProgram39.TestStudentSubmission(list52, (int) '4');
        int[] intArray55 = new int[] {};
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        List list58 = AppendPairProgram.listgen(intArray55);
        List list59 = AppendPairProgram.listgen(intArray55);
        List list60 = AppendPairProgram.listgen(intArray55);
        List list61 = AppendPairProgram.listgen(intArray55);
        List list62 = AppendPairProgram.listgen(intArray55);
        List list63 = AppendPairProgram.listgen(intArray55);
        List list64 = AppendPairProgram.listgen(intArray55);
        List list65 = AppendPairProgram.listgen(intArray55);
        appendPairProgram39.TestStudentSubmission(list65, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list65, 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list15, (int) (byte) -1);
        int[] intArray18 = new int[] {};
        List list19 = AppendPairProgram.listgen(intArray18);
        List list20 = AppendPairProgram.listgen(intArray18);
        List list21 = AppendPairProgram.listgen(intArray18);
        List list22 = AppendPairProgram.listgen(intArray18);
        List list23 = AppendPairProgram.listgen(intArray18);
        List list24 = AppendPairProgram.listgen(intArray18);
        List list25 = AppendPairProgram.listgen(intArray18);
        appendPairProgram0.TestStudentSubmission(list25, (-1));
        int[] intArray28 = new int[] {};
        List list29 = AppendPairProgram.listgen(intArray28);
        List list30 = AppendPairProgram.listgen(intArray28);
        List list31 = AppendPairProgram.listgen(intArray28);
        List list32 = AppendPairProgram.listgen(intArray28);
        List list33 = AppendPairProgram.listgen(intArray28);
        List list34 = AppendPairProgram.listgen(intArray28);
        List list35 = AppendPairProgram.listgen(intArray28);
        List list36 = AppendPairProgram.listgen(intArray28);
        List list37 = AppendPairProgram.listgen(intArray28);
        List list38 = AppendPairProgram.listgen(intArray28);
        List list39 = AppendPairProgram.listgen(intArray28);
        List list40 = AppendPairProgram.listgen(intArray28);
        List list41 = AppendPairProgram.listgen(intArray28);
        List list42 = AppendPairProgram.listgen(intArray28);
        appendPairProgram0.TestStudentSubmission(list42, (int) (short) 0);
        AppendPairProgram appendPairProgram45 = new AppendPairProgram();
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        appendPairProgram45.TestStudentSubmission(list47, (int) (short) 1);
        int[] intArray50 = new int[] {};
        List list51 = AppendPairProgram.listgen(intArray50);
        appendPairProgram45.TestStudentSubmission(list51, (int) (byte) -1);
        int[] intArray55 = new int[] { (byte) 10 };
        List list56 = AppendPairProgram.listgen(intArray55);
        List list57 = AppendPairProgram.listgen(intArray55);
        List list58 = AppendPairProgram.listgen(intArray55);
        List list59 = AppendPairProgram.listgen(intArray55);
        List list60 = AppendPairProgram.listgen(intArray55);
        List list61 = AppendPairProgram.listgen(intArray55);
        appendPairProgram45.TestStudentSubmission(list61, (int) (byte) 1);
        int[] intArray64 = new int[] {};
        List list65 = AppendPairProgram.listgen(intArray64);
        List list66 = AppendPairProgram.listgen(intArray64);
        List list67 = AppendPairProgram.listgen(intArray64);
        List list68 = AppendPairProgram.listgen(intArray64);
        List list69 = AppendPairProgram.listgen(intArray64);
        List list70 = AppendPairProgram.listgen(intArray64);
        List list71 = AppendPairProgram.listgen(intArray64);
        List list72 = AppendPairProgram.listgen(intArray64);
        List list73 = AppendPairProgram.listgen(intArray64);
        List list74 = AppendPairProgram.listgen(intArray64);
        List list75 = AppendPairProgram.listgen(intArray64);
        List list76 = AppendPairProgram.listgen(intArray64);
        List list77 = AppendPairProgram.listgen(intArray64);
        List list78 = AppendPairProgram.listgen(intArray64);
        appendPairProgram45.TestStudentSubmission(list78, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list78, (int) (byte) 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list3, 10);
        int[] intArray6 = new int[] {};
        List list7 = AppendPairProgram.listgen(intArray6);
        List list8 = AppendPairProgram.listgen(intArray6);
        List list9 = AppendPairProgram.listgen(intArray6);
        List list10 = AppendPairProgram.listgen(intArray6);
        List list11 = AppendPairProgram.listgen(intArray6);
        List list12 = AppendPairProgram.listgen(intArray6);
        appendPairProgram0.TestStudentSubmission(list12, 100);
        int[] intArray16 = new int[] { (byte) 10 };
        List list17 = AppendPairProgram.listgen(intArray16);
        List list18 = AppendPairProgram.listgen(intArray16);
        appendPairProgram0.TestStudentSubmission(list18, (int) (byte) -1);
        int[] intArray21 = new int[] {};
        List list22 = AppendPairProgram.listgen(intArray21);
        List list23 = AppendPairProgram.listgen(intArray21);
        List list24 = AppendPairProgram.listgen(intArray21);
        List list25 = AppendPairProgram.listgen(intArray21);
        List list26 = AppendPairProgram.listgen(intArray21);
        List list27 = AppendPairProgram.listgen(intArray21);
        List list28 = AppendPairProgram.listgen(intArray21);
        List list29 = AppendPairProgram.listgen(intArray21);
        List list30 = AppendPairProgram.listgen(intArray21);
        List list31 = AppendPairProgram.listgen(intArray21);
        List list32 = AppendPairProgram.listgen(intArray21);
        List list33 = AppendPairProgram.listgen(intArray21);
        List list34 = AppendPairProgram.listgen(intArray21);
        List list35 = AppendPairProgram.listgen(intArray21);
        List list36 = AppendPairProgram.listgen(intArray21);
        appendPairProgram0.TestStudentSubmission(list36, (int) (short) 1);
        int[] intArray45 = new int[] { (byte) 0, (short) -1, ' ', 'a', (byte) 100, (byte) 10 };
        List list46 = AppendPairProgram.listgen(intArray45);
        List list47 = AppendPairProgram.listgen(intArray45);
        List list48 = AppendPairProgram.listgen(intArray45);
        List list49 = AppendPairProgram.listgen(intArray45);
        List list50 = AppendPairProgram.listgen(intArray45);
        List list51 = AppendPairProgram.listgen(intArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list51, (int) '4');
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list6, 0);
        int[] intArray13 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list14 = AppendPairProgram.listgen(intArray13);
        List list15 = AppendPairProgram.listgen(intArray13);
        List list16 = AppendPairProgram.listgen(intArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list16, (int) (short) 100);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray12 = new int[] { (byte) 10 };
        List list13 = AppendPairProgram.listgen(intArray12);
        List list14 = AppendPairProgram.listgen(intArray12);
        List list15 = AppendPairProgram.listgen(intArray12);
        appendPairProgram0.TestStudentSubmission(list15, 10);
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        List list32 = AppendPairProgram.listgen(intArray29);
        List list33 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list33, (int) (byte) -1);
        int[] intArray36 = new int[] {};
        List list37 = AppendPairProgram.listgen(intArray36);
        List list38 = AppendPairProgram.listgen(intArray36);
        List list39 = AppendPairProgram.listgen(intArray36);
        List list40 = AppendPairProgram.listgen(intArray36);
        List list41 = AppendPairProgram.listgen(intArray36);
        List list42 = AppendPairProgram.listgen(intArray36);
        List list43 = AppendPairProgram.listgen(intArray36);
        appendPairProgram18.TestStudentSubmission(list43, (-1));
        int[] intArray46 = new int[] {};
        List list47 = AppendPairProgram.listgen(intArray46);
        List list48 = AppendPairProgram.listgen(intArray46);
        List list49 = AppendPairProgram.listgen(intArray46);
        List list50 = AppendPairProgram.listgen(intArray46);
        List list51 = AppendPairProgram.listgen(intArray46);
        List list52 = AppendPairProgram.listgen(intArray46);
        List list53 = AppendPairProgram.listgen(intArray46);
        List list54 = AppendPairProgram.listgen(intArray46);
        List list55 = AppendPairProgram.listgen(intArray46);
        appendPairProgram18.TestStudentSubmission(list55, 10);
        int[] intArray58 = new int[] {};
        List list59 = AppendPairProgram.listgen(intArray58);
        List list60 = AppendPairProgram.listgen(intArray58);
        List list61 = AppendPairProgram.listgen(intArray58);
        List list62 = AppendPairProgram.listgen(intArray58);
        List list63 = AppendPairProgram.listgen(intArray58);
        List list64 = AppendPairProgram.listgen(intArray58);
        List list65 = AppendPairProgram.listgen(intArray58);
        List list66 = AppendPairProgram.listgen(intArray58);
        List list67 = AppendPairProgram.listgen(intArray58);
        List list68 = AppendPairProgram.listgen(intArray58);
        List list69 = AppendPairProgram.listgen(intArray58);
        List list70 = AppendPairProgram.listgen(intArray58);
        appendPairProgram18.TestStudentSubmission(list70, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list70, (int) (byte) 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray11 = new int[] { (-1), (byte) 100, (byte) 1, (byte) 1 };
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        List list14 = AppendPairProgram.listgen(intArray11);
        List list15 = AppendPairProgram.listgen(intArray11);
        List list16 = AppendPairProgram.listgen(intArray11);
        List list17 = AppendPairProgram.listgen(intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list17, (int) (short) -1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        List list3 = AppendPairProgram.listgen(intArray1);
        List list4 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list4, (int) (byte) 10);
        int[] intArray7 = new int[] {};
        List list8 = AppendPairProgram.listgen(intArray7);
        List list9 = AppendPairProgram.listgen(intArray7);
        List list10 = AppendPairProgram.listgen(intArray7);
        List list11 = AppendPairProgram.listgen(intArray7);
        List list12 = AppendPairProgram.listgen(intArray7);
        List list13 = AppendPairProgram.listgen(intArray7);
        appendPairProgram0.TestStudentSubmission(list13, (int) (short) -1);
        int[] intArray22 = new int[] { (short) 0, (byte) 0, (byte) 1, 0, (-1), (byte) 100 };
        List list23 = AppendPairProgram.listgen(intArray22);
        List list24 = AppendPairProgram.listgen(intArray22);
        List list25 = AppendPairProgram.listgen(intArray22);
        List list26 = AppendPairProgram.listgen(intArray22);
        List list27 = AppendPairProgram.listgen(intArray22);
        List list28 = AppendPairProgram.listgen(intArray22);
        List list29 = AppendPairProgram.listgen(intArray22);
        List list30 = AppendPairProgram.listgen(intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list30, (int) (short) 100);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list8, 0);
        int[] intArray11 = new int[] {};
        List list12 = AppendPairProgram.listgen(intArray11);
        List list13 = AppendPairProgram.listgen(intArray11);
        appendPairProgram0.TestStudentSubmission(list13, (int) '4');
        int[] intArray20 = new int[] { 'a', (byte) -1, 100, (byte) 10 };
        List list21 = AppendPairProgram.listgen(intArray20);
        List list22 = AppendPairProgram.listgen(intArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list22, (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        AppendPairProgram appendPairProgram0 = new AppendPairProgram();
        int[] intArray1 = new int[] {};
        List list2 = AppendPairProgram.listgen(intArray1);
        appendPairProgram0.TestStudentSubmission(list2, (int) (short) 1);
        int[] intArray5 = new int[] {};
        List list6 = AppendPairProgram.listgen(intArray5);
        List list7 = AppendPairProgram.listgen(intArray5);
        List list8 = AppendPairProgram.listgen(intArray5);
        List list9 = AppendPairProgram.listgen(intArray5);
        List list10 = AppendPairProgram.listgen(intArray5);
        appendPairProgram0.TestStudentSubmission(list10, 100);
        int[] intArray14 = new int[] { (byte) 10 };
        List list15 = AppendPairProgram.listgen(intArray14);
        appendPairProgram0.TestStudentSubmission(list15, (int) '#');
        AppendPairProgram appendPairProgram18 = new AppendPairProgram();
        int[] intArray19 = new int[] {};
        List list20 = AppendPairProgram.listgen(intArray19);
        appendPairProgram18.TestStudentSubmission(list20, (int) (short) 1);
        int[] intArray23 = new int[] {};
        List list24 = AppendPairProgram.listgen(intArray23);
        List list25 = AppendPairProgram.listgen(intArray23);
        List list26 = AppendPairProgram.listgen(intArray23);
        appendPairProgram18.TestStudentSubmission(list26, 0);
        int[] intArray29 = new int[] {};
        List list30 = AppendPairProgram.listgen(intArray29);
        List list31 = AppendPairProgram.listgen(intArray29);
        appendPairProgram18.TestStudentSubmission(list31, 0);
        int[] intArray34 = new int[] {};
        List list35 = AppendPairProgram.listgen(intArray34);
        List list36 = AppendPairProgram.listgen(intArray34);
        List list37 = AppendPairProgram.listgen(intArray34);
        List list38 = AppendPairProgram.listgen(intArray34);
        List list39 = AppendPairProgram.listgen(intArray34);
        List list40 = AppendPairProgram.listgen(intArray34);
        List list41 = AppendPairProgram.listgen(intArray34);
        List list42 = AppendPairProgram.listgen(intArray34);
        appendPairProgram18.TestStudentSubmission(list42, (int) (short) 0);
        int[] intArray46 = new int[] { (byte) 10 };
        List list47 = AppendPairProgram.listgen(intArray46);
        appendPairProgram18.TestStudentSubmission(list47, 100);
        int[] intArray51 = new int[] { (byte) 10 };
        List list52 = AppendPairProgram.listgen(intArray51);
        appendPairProgram18.TestStudentSubmission(list52, (-1));
        int[] intArray56 = new int[] { (byte) 10 };
        List list57 = AppendPairProgram.listgen(intArray56);
        List list58 = AppendPairProgram.listgen(intArray56);
        List list59 = AppendPairProgram.listgen(intArray56);
        List list60 = AppendPairProgram.listgen(intArray56);
        List list61 = AppendPairProgram.listgen(intArray56);
        List list62 = AppendPairProgram.listgen(intArray56);
        List list63 = AppendPairProgram.listgen(intArray56);
        List list64 = AppendPairProgram.listgen(intArray56);
        List list65 = AppendPairProgram.listgen(intArray56);
        List list66 = AppendPairProgram.listgen(intArray56);
        appendPairProgram18.TestStudentSubmission(list66, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        appendPairProgram0.TestStudentSubmission(list66, (int) (short) 10);
    }
}

