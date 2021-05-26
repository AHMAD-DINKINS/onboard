import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray5 = new int[] { (short) 1, (short) 10, (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray3 = new int[] { '4', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        int[] intArray9 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray9);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        int[] intArray15 = new int[] { 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray15);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        int[] intArray18 = new int[] { (byte) 10, 10, (byte) 100, 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray18);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        int[] intArray26 = new int[] { ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray26);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        testProgram1.TestStudentSubmission(intArray11);
        testProgram0.TestStudentSubmission(intArray11);
        TestProgram testProgram15 = new TestProgram();
        int[] intArray19 = new int[] { 1, (short) 1, 1 };
        testProgram15.TestStudentSubmission(intArray19);
        TestProgram testProgram21 = new TestProgram();
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        TestProgram testProgram28 = new TestProgram();
        int[] intArray32 = new int[] { 1, (short) 1, 1 };
        testProgram28.TestStudentSubmission(intArray32);
        testProgram22.TestStudentSubmission(intArray32);
        testProgram21.TestStudentSubmission(intArray32);
        testProgram15.TestStudentSubmission(intArray32);
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        testProgram15.TestStudentSubmission(intArray41);
        testProgram0.TestStudentSubmission(intArray41);
        int[] intArray48 = new int[] { 'a', (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray48);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        int[] intArray10 = new int[] { 'a', ' ', (-1), (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        TestProgram testProgram24 = new TestProgram();
        int[] intArray28 = new int[] { 1, (short) 1, 1 };
        testProgram24.TestStudentSubmission(intArray28);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        testProgram24.TestStudentSubmission(intArray34);
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        TestProgram testProgram43 = new TestProgram();
        TestProgram testProgram44 = new TestProgram();
        int[] intArray48 = new int[] { 1, (short) 1, 1 };
        testProgram44.TestStudentSubmission(intArray48);
        TestProgram testProgram50 = new TestProgram();
        int[] intArray54 = new int[] { 1, (short) 1, 1 };
        testProgram50.TestStudentSubmission(intArray54);
        testProgram44.TestStudentSubmission(intArray54);
        testProgram43.TestStudentSubmission(intArray54);
        testProgram37.TestStudentSubmission(intArray54);
        testProgram24.TestStudentSubmission(intArray54);
        TestProgram testProgram60 = new TestProgram();
        int[] intArray64 = new int[] { 1, (short) 1, 1 };
        testProgram60.TestStudentSubmission(intArray64);
        TestProgram testProgram66 = new TestProgram();
        TestProgram testProgram67 = new TestProgram();
        int[] intArray71 = new int[] { 1, (short) 1, 1 };
        testProgram67.TestStudentSubmission(intArray71);
        TestProgram testProgram73 = new TestProgram();
        int[] intArray77 = new int[] { 1, (short) 1, 1 };
        testProgram73.TestStudentSubmission(intArray77);
        testProgram67.TestStudentSubmission(intArray77);
        testProgram66.TestStudentSubmission(intArray77);
        testProgram60.TestStudentSubmission(intArray77);
        TestProgram testProgram82 = new TestProgram();
        int[] intArray86 = new int[] { 1, (short) 1, 1 };
        testProgram82.TestStudentSubmission(intArray86);
        testProgram60.TestStudentSubmission(intArray86);
        testProgram24.TestStudentSubmission(intArray86);
        testProgram0.TestStudentSubmission(intArray86);
        int[] intArray94 = new int[] { '4', (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray94);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        TestProgram testProgram24 = new TestProgram();
        int[] intArray28 = new int[] { 1, (short) 1, 1 };
        testProgram24.TestStudentSubmission(intArray28);
        testProgram0.TestStudentSubmission(intArray28);
        TestProgram testProgram31 = new TestProgram();
        TestProgram testProgram32 = new TestProgram();
        int[] intArray36 = new int[] { 1, (short) 1, 1 };
        testProgram32.TestStudentSubmission(intArray36);
        TestProgram testProgram38 = new TestProgram();
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        testProgram39.TestStudentSubmission(intArray49);
        testProgram38.TestStudentSubmission(intArray49);
        testProgram32.TestStudentSubmission(intArray49);
        testProgram31.TestStudentSubmission(intArray49);
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        testProgram31.TestStudentSubmission(intArray59);
        testProgram0.TestStudentSubmission(intArray59);
        TestProgram testProgram63 = new TestProgram();
        TestProgram testProgram64 = new TestProgram();
        int[] intArray68 = new int[] { 1, (short) 1, 1 };
        testProgram64.TestStudentSubmission(intArray68);
        TestProgram testProgram70 = new TestProgram();
        TestProgram testProgram71 = new TestProgram();
        int[] intArray75 = new int[] { 1, (short) 1, 1 };
        testProgram71.TestStudentSubmission(intArray75);
        TestProgram testProgram77 = new TestProgram();
        int[] intArray81 = new int[] { 1, (short) 1, 1 };
        testProgram77.TestStudentSubmission(intArray81);
        testProgram71.TestStudentSubmission(intArray81);
        testProgram70.TestStudentSubmission(intArray81);
        testProgram64.TestStudentSubmission(intArray81);
        testProgram63.TestStudentSubmission(intArray81);
        testProgram0.TestStudentSubmission(intArray81);
        int[] intArray90 = new int[] { (short) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray90);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        testProgram20.TestStudentSubmission(intArray30);
        testProgram19.TestStudentSubmission(intArray30);
        testProgram13.TestStudentSubmission(intArray30);
        testProgram0.TestStudentSubmission(intArray30);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        TestProgram testProgram42 = new TestProgram();
        int[] intArray46 = new int[] { 1, (short) 1, 1 };
        testProgram42.TestStudentSubmission(intArray46);
        testProgram36.TestStudentSubmission(intArray46);
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        TestProgram testProgram55 = new TestProgram();
        TestProgram testProgram56 = new TestProgram();
        int[] intArray60 = new int[] { 1, (short) 1, 1 };
        testProgram56.TestStudentSubmission(intArray60);
        TestProgram testProgram62 = new TestProgram();
        int[] intArray66 = new int[] { 1, (short) 1, 1 };
        testProgram62.TestStudentSubmission(intArray66);
        testProgram56.TestStudentSubmission(intArray66);
        testProgram55.TestStudentSubmission(intArray66);
        testProgram49.TestStudentSubmission(intArray66);
        testProgram36.TestStudentSubmission(intArray66);
        testProgram0.TestStudentSubmission(intArray66);
        int[] intArray76 = new int[] { (short) -1, ' ', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray76);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        testProgram0.TestStudentSubmission(intArray26);
        TestProgram testProgram29 = new TestProgram();
        int[] intArray33 = new int[] { 1, (short) 1, 1 };
        testProgram29.TestStudentSubmission(intArray33);
        TestProgram testProgram35 = new TestProgram();
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        TestProgram testProgram42 = new TestProgram();
        int[] intArray46 = new int[] { 1, (short) 1, 1 };
        testProgram42.TestStudentSubmission(intArray46);
        testProgram36.TestStudentSubmission(intArray46);
        testProgram35.TestStudentSubmission(intArray46);
        testProgram29.TestStudentSubmission(intArray46);
        TestProgram testProgram51 = new TestProgram();
        int[] intArray55 = new int[] { 1, (short) 1, 1 };
        testProgram51.TestStudentSubmission(intArray55);
        TestProgram testProgram57 = new TestProgram();
        TestProgram testProgram58 = new TestProgram();
        int[] intArray62 = new int[] { 1, (short) 1, 1 };
        testProgram58.TestStudentSubmission(intArray62);
        TestProgram testProgram64 = new TestProgram();
        int[] intArray68 = new int[] { 1, (short) 1, 1 };
        testProgram64.TestStudentSubmission(intArray68);
        testProgram58.TestStudentSubmission(intArray68);
        testProgram57.TestStudentSubmission(intArray68);
        testProgram51.TestStudentSubmission(intArray68);
        TestProgram testProgram73 = new TestProgram();
        int[] intArray77 = new int[] { 1, (short) 1, 1 };
        testProgram73.TestStudentSubmission(intArray77);
        testProgram51.TestStudentSubmission(intArray77);
        testProgram29.TestStudentSubmission(intArray77);
        testProgram0.TestStudentSubmission(intArray77);
        int[] intArray85 = new int[] { (short) 10, (short) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray85);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        TestProgram testProgram24 = new TestProgram();
        int[] intArray28 = new int[] { 1, (short) 1, 1 };
        testProgram24.TestStudentSubmission(intArray28);
        testProgram0.TestStudentSubmission(intArray28);
        TestProgram testProgram31 = new TestProgram();
        int[] intArray35 = new int[] { 1, (short) 1, 1 };
        testProgram31.TestStudentSubmission(intArray35);
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        testProgram31.TestStudentSubmission(intArray41);
        TestProgram testProgram44 = new TestProgram();
        int[] intArray48 = new int[] { 1, (short) 1, 1 };
        testProgram44.TestStudentSubmission(intArray48);
        TestProgram testProgram50 = new TestProgram();
        TestProgram testProgram51 = new TestProgram();
        int[] intArray55 = new int[] { 1, (short) 1, 1 };
        testProgram51.TestStudentSubmission(intArray55);
        TestProgram testProgram57 = new TestProgram();
        int[] intArray61 = new int[] { 1, (short) 1, 1 };
        testProgram57.TestStudentSubmission(intArray61);
        testProgram51.TestStudentSubmission(intArray61);
        testProgram50.TestStudentSubmission(intArray61);
        testProgram44.TestStudentSubmission(intArray61);
        testProgram31.TestStudentSubmission(intArray61);
        TestProgram testProgram67 = new TestProgram();
        int[] intArray71 = new int[] { 1, (short) 1, 1 };
        testProgram67.TestStudentSubmission(intArray71);
        testProgram31.TestStudentSubmission(intArray71);
        testProgram0.TestStudentSubmission(intArray71);
        int[] intArray78 = new int[] { (byte) 1, 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray78);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        TestProgram testProgram9 = new TestProgram();
        int[] intArray13 = new int[] { 1, (short) 1, 1 };
        testProgram9.TestStudentSubmission(intArray13);
        TestProgram testProgram15 = new TestProgram();
        int[] intArray19 = new int[] { 1, (short) 1, 1 };
        testProgram15.TestStudentSubmission(intArray19);
        testProgram9.TestStudentSubmission(intArray19);
        testProgram8.TestStudentSubmission(intArray19);
        testProgram2.TestStudentSubmission(intArray19);
        testProgram1.TestStudentSubmission(intArray19);
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        testProgram1.TestStudentSubmission(intArray29);
        testProgram0.TestStudentSubmission(intArray29);
        TestProgram testProgram33 = new TestProgram();
        int[] intArray37 = new int[] { 1, (short) 1, 1 };
        testProgram33.TestStudentSubmission(intArray37);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        testProgram33.TestStudentSubmission(intArray43);
        TestProgram testProgram46 = new TestProgram();
        int[] intArray50 = new int[] { 1, (short) 1, 1 };
        testProgram46.TestStudentSubmission(intArray50);
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        testProgram46.TestStudentSubmission(intArray56);
        TestProgram testProgram59 = new TestProgram();
        int[] intArray63 = new int[] { 1, (short) 1, 1 };
        testProgram59.TestStudentSubmission(intArray63);
        TestProgram testProgram65 = new TestProgram();
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        TestProgram testProgram72 = new TestProgram();
        int[] intArray76 = new int[] { 1, (short) 1, 1 };
        testProgram72.TestStudentSubmission(intArray76);
        testProgram66.TestStudentSubmission(intArray76);
        testProgram65.TestStudentSubmission(intArray76);
        testProgram59.TestStudentSubmission(intArray76);
        testProgram46.TestStudentSubmission(intArray76);
        testProgram33.TestStudentSubmission(intArray76);
        testProgram0.TestStudentSubmission(intArray76);
        int[] intArray86 = new int[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray86);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        TestProgram testProgram28 = new TestProgram();
        int[] intArray32 = new int[] { 1, (short) 1, 1 };
        testProgram28.TestStudentSubmission(intArray32);
        testProgram22.TestStudentSubmission(intArray32);
        testProgram0.TestStudentSubmission(intArray32);
        TestProgram testProgram36 = new TestProgram();
        TestProgram testProgram37 = new TestProgram();
        TestProgram testProgram38 = new TestProgram();
        int[] intArray42 = new int[] { 1, (short) 1, 1 };
        testProgram38.TestStudentSubmission(intArray42);
        TestProgram testProgram44 = new TestProgram();
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        TestProgram testProgram51 = new TestProgram();
        int[] intArray55 = new int[] { 1, (short) 1, 1 };
        testProgram51.TestStudentSubmission(intArray55);
        testProgram45.TestStudentSubmission(intArray55);
        testProgram44.TestStudentSubmission(intArray55);
        testProgram38.TestStudentSubmission(intArray55);
        testProgram37.TestStudentSubmission(intArray55);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        testProgram37.TestStudentSubmission(intArray65);
        testProgram36.TestStudentSubmission(intArray65);
        testProgram0.TestStudentSubmission(intArray65);
        TestProgram testProgram70 = new TestProgram();
        TestProgram testProgram71 = new TestProgram();
        int[] intArray75 = new int[] { 1, (short) 1, 1 };
        testProgram71.TestStudentSubmission(intArray75);
        TestProgram testProgram77 = new TestProgram();
        TestProgram testProgram78 = new TestProgram();
        int[] intArray82 = new int[] { 1, (short) 1, 1 };
        testProgram78.TestStudentSubmission(intArray82);
        TestProgram testProgram84 = new TestProgram();
        int[] intArray88 = new int[] { 1, (short) 1, 1 };
        testProgram84.TestStudentSubmission(intArray88);
        testProgram78.TestStudentSubmission(intArray88);
        testProgram77.TestStudentSubmission(intArray88);
        testProgram71.TestStudentSubmission(intArray88);
        testProgram70.TestStudentSubmission(intArray88);
        testProgram0.TestStudentSubmission(intArray88);
        int[] intArray97 = new int[] { 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray97);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        int[] intArray23 = new int[] { 1, (short) 1, 1 };
        testProgram19.TestStudentSubmission(intArray23);
        testProgram13.TestStudentSubmission(intArray23);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        TestProgram testProgram32 = new TestProgram();
        TestProgram testProgram33 = new TestProgram();
        int[] intArray37 = new int[] { 1, (short) 1, 1 };
        testProgram33.TestStudentSubmission(intArray37);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        testProgram33.TestStudentSubmission(intArray43);
        testProgram32.TestStudentSubmission(intArray43);
        testProgram26.TestStudentSubmission(intArray43);
        testProgram13.TestStudentSubmission(intArray43);
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        testProgram13.TestStudentSubmission(intArray53);
        testProgram0.TestStudentSubmission(intArray53);
        int[] intArray58 = new int[] { 'a' };
        testProgram0.TestStudentSubmission(intArray58);
        TestProgram testProgram60 = new TestProgram();
        int[] intArray64 = new int[] { 1, (short) 1, 1 };
        testProgram60.TestStudentSubmission(intArray64);
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        testProgram60.TestStudentSubmission(intArray70);
        testProgram0.TestStudentSubmission(intArray70);
        int[] intArray80 = new int[] { (short) 1, 'a', ' ', 1, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray80);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        int[] intArray8 = new int[] { (short) 10, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        TestProgram testProgram23 = new TestProgram();
        int[] intArray27 = new int[] { 1, (short) 1, 1 };
        testProgram23.TestStudentSubmission(intArray27);
        testProgram1.TestStudentSubmission(intArray27);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        testProgram30.TestStudentSubmission(intArray40);
        TestProgram testProgram43 = new TestProgram();
        int[] intArray47 = new int[] { 1, (short) 1, 1 };
        testProgram43.TestStudentSubmission(intArray47);
        TestProgram testProgram49 = new TestProgram();
        TestProgram testProgram50 = new TestProgram();
        int[] intArray54 = new int[] { 1, (short) 1, 1 };
        testProgram50.TestStudentSubmission(intArray54);
        TestProgram testProgram56 = new TestProgram();
        int[] intArray60 = new int[] { 1, (short) 1, 1 };
        testProgram56.TestStudentSubmission(intArray60);
        testProgram50.TestStudentSubmission(intArray60);
        testProgram49.TestStudentSubmission(intArray60);
        testProgram43.TestStudentSubmission(intArray60);
        testProgram30.TestStudentSubmission(intArray60);
        testProgram1.TestStudentSubmission(intArray60);
        testProgram0.TestStudentSubmission(intArray60);
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        TestProgram testProgram74 = new TestProgram();
        TestProgram testProgram75 = new TestProgram();
        int[] intArray79 = new int[] { 1, (short) 1, 1 };
        testProgram75.TestStudentSubmission(intArray79);
        TestProgram testProgram81 = new TestProgram();
        int[] intArray85 = new int[] { 1, (short) 1, 1 };
        testProgram81.TestStudentSubmission(intArray85);
        testProgram75.TestStudentSubmission(intArray85);
        testProgram74.TestStudentSubmission(intArray85);
        testProgram68.TestStudentSubmission(intArray85);
        testProgram0.TestStudentSubmission(intArray85);
        int[] intArray94 = new int[] { (short) 0, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray94);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        int[] intArray23 = new int[] { 1, (short) 1, 1 };
        testProgram19.TestStudentSubmission(intArray23);
        testProgram13.TestStudentSubmission(intArray23);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        TestProgram testProgram32 = new TestProgram();
        TestProgram testProgram33 = new TestProgram();
        int[] intArray37 = new int[] { 1, (short) 1, 1 };
        testProgram33.TestStudentSubmission(intArray37);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        testProgram33.TestStudentSubmission(intArray43);
        testProgram32.TestStudentSubmission(intArray43);
        testProgram26.TestStudentSubmission(intArray43);
        testProgram13.TestStudentSubmission(intArray43);
        testProgram0.TestStudentSubmission(intArray43);
        TestProgram testProgram50 = new TestProgram();
        TestProgram testProgram51 = new TestProgram();
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        TestProgram testProgram58 = new TestProgram();
        TestProgram testProgram59 = new TestProgram();
        int[] intArray63 = new int[] { 1, (short) 1, 1 };
        testProgram59.TestStudentSubmission(intArray63);
        TestProgram testProgram65 = new TestProgram();
        int[] intArray69 = new int[] { 1, (short) 1, 1 };
        testProgram65.TestStudentSubmission(intArray69);
        testProgram59.TestStudentSubmission(intArray69);
        testProgram58.TestStudentSubmission(intArray69);
        testProgram52.TestStudentSubmission(intArray69);
        testProgram51.TestStudentSubmission(intArray69);
        TestProgram testProgram75 = new TestProgram();
        int[] intArray79 = new int[] { 1, (short) 1, 1 };
        testProgram75.TestStudentSubmission(intArray79);
        testProgram51.TestStudentSubmission(intArray79);
        testProgram50.TestStudentSubmission(intArray79);
        testProgram0.TestStudentSubmission(intArray79);
        int[] intArray87 = new int[] { (short) 100, 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray87);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        int[] intArray23 = new int[] { 1, (short) 1, 1 };
        testProgram19.TestStudentSubmission(intArray23);
        testProgram13.TestStudentSubmission(intArray23);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        TestProgram testProgram32 = new TestProgram();
        TestProgram testProgram33 = new TestProgram();
        int[] intArray37 = new int[] { 1, (short) 1, 1 };
        testProgram33.TestStudentSubmission(intArray37);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        testProgram33.TestStudentSubmission(intArray43);
        testProgram32.TestStudentSubmission(intArray43);
        testProgram26.TestStudentSubmission(intArray43);
        testProgram13.TestStudentSubmission(intArray43);
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        testProgram13.TestStudentSubmission(intArray53);
        testProgram0.TestStudentSubmission(intArray53);
        int[] intArray58 = new int[] { 'a' };
        testProgram0.TestStudentSubmission(intArray58);
        TestProgram testProgram60 = new TestProgram();
        int[] intArray64 = new int[] { 1, (short) 1, 1 };
        testProgram60.TestStudentSubmission(intArray64);
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        testProgram60.TestStudentSubmission(intArray70);
        testProgram0.TestStudentSubmission(intArray70);
        int[] intArray79 = new int[] { (short) -1, (byte) 10, 1, (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray79);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        testProgram20.TestStudentSubmission(intArray30);
        testProgram19.TestStudentSubmission(intArray30);
        testProgram13.TestStudentSubmission(intArray30);
        testProgram0.TestStudentSubmission(intArray30);
        int[] intArray40 = new int[] { 1, (-1), (short) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray40);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        testProgram2.TestStudentSubmission(intArray12);
        testProgram1.TestStudentSubmission(intArray12);
        testProgram0.TestStudentSubmission(intArray12);
        TestProgram testProgram17 = new TestProgram();
        int[] intArray21 = new int[] { 1, (short) 1, 1 };
        testProgram17.TestStudentSubmission(intArray21);
        TestProgram testProgram23 = new TestProgram();
        int[] intArray27 = new int[] { 1, (short) 1, 1 };
        testProgram23.TestStudentSubmission(intArray27);
        testProgram17.TestStudentSubmission(intArray27);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        TestProgram testProgram43 = new TestProgram();
        int[] intArray47 = new int[] { 1, (short) 1, 1 };
        testProgram43.TestStudentSubmission(intArray47);
        testProgram37.TestStudentSubmission(intArray47);
        testProgram36.TestStudentSubmission(intArray47);
        testProgram30.TestStudentSubmission(intArray47);
        testProgram17.TestStudentSubmission(intArray47);
        testProgram0.TestStudentSubmission(intArray47);
        int[] intArray60 = new int[] { ' ', (short) 100, 10, (-1), (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray60);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        TestProgram testProgram24 = new TestProgram();
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        TestProgram testProgram31 = new TestProgram();
        int[] intArray35 = new int[] { 1, (short) 1, 1 };
        testProgram31.TestStudentSubmission(intArray35);
        testProgram25.TestStudentSubmission(intArray35);
        testProgram24.TestStudentSubmission(intArray35);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        TestProgram testProgram45 = new TestProgram();
        TestProgram testProgram46 = new TestProgram();
        int[] intArray50 = new int[] { 1, (short) 1, 1 };
        testProgram46.TestStudentSubmission(intArray50);
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        testProgram46.TestStudentSubmission(intArray56);
        testProgram45.TestStudentSubmission(intArray56);
        testProgram39.TestStudentSubmission(intArray56);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        testProgram39.TestStudentSubmission(intArray65);
        testProgram24.TestStudentSubmission(intArray65);
        TestProgram testProgram69 = new TestProgram();
        int[] intArray73 = new int[] { 1, (short) 1, 1 };
        testProgram69.TestStudentSubmission(intArray73);
        TestProgram testProgram75 = new TestProgram();
        int[] intArray79 = new int[] { 1, (short) 1, 1 };
        testProgram75.TestStudentSubmission(intArray79);
        testProgram69.TestStudentSubmission(intArray79);
        testProgram24.TestStudentSubmission(intArray79);
        testProgram0.TestStudentSubmission(intArray79);
        int[] intArray87 = new int[] { 0, (byte) 1, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray87);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        TestProgram testProgram23 = new TestProgram();
        int[] intArray27 = new int[] { 1, (short) 1, 1 };
        testProgram23.TestStudentSubmission(intArray27);
        TestProgram testProgram29 = new TestProgram();
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        testProgram30.TestStudentSubmission(intArray40);
        testProgram29.TestStudentSubmission(intArray40);
        testProgram23.TestStudentSubmission(intArray40);
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        testProgram23.TestStudentSubmission(intArray49);
        testProgram1.TestStudentSubmission(intArray49);
        testProgram0.TestStudentSubmission(intArray49);
        TestProgram testProgram54 = new TestProgram();
        int[] intArray58 = new int[] { 1, (short) 1, 1 };
        testProgram54.TestStudentSubmission(intArray58);
        testProgram0.TestStudentSubmission(intArray58);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        TestProgram testProgram67 = new TestProgram();
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        TestProgram testProgram74 = new TestProgram();
        int[] intArray78 = new int[] { 1, (short) 1, 1 };
        testProgram74.TestStudentSubmission(intArray78);
        testProgram68.TestStudentSubmission(intArray78);
        testProgram67.TestStudentSubmission(intArray78);
        testProgram61.TestStudentSubmission(intArray78);
        testProgram0.TestStudentSubmission(intArray78);
        int[] intArray90 = new int[] { (short) 10, (-1), (short) 1, (short) 0, (-1), 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray90);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        TestProgram testProgram24 = new TestProgram();
        int[] intArray28 = new int[] { 1, (short) 1, 1 };
        testProgram24.TestStudentSubmission(intArray28);
        testProgram0.TestStudentSubmission(intArray28);
        TestProgram testProgram31 = new TestProgram();
        int[] intArray35 = new int[] { 1, (short) 1, 1 };
        testProgram31.TestStudentSubmission(intArray35);
        TestProgram testProgram37 = new TestProgram();
        TestProgram testProgram38 = new TestProgram();
        int[] intArray42 = new int[] { 1, (short) 1, 1 };
        testProgram38.TestStudentSubmission(intArray42);
        TestProgram testProgram44 = new TestProgram();
        int[] intArray48 = new int[] { 1, (short) 1, 1 };
        testProgram44.TestStudentSubmission(intArray48);
        testProgram38.TestStudentSubmission(intArray48);
        testProgram37.TestStudentSubmission(intArray48);
        testProgram31.TestStudentSubmission(intArray48);
        TestProgram testProgram53 = new TestProgram();
        int[] intArray57 = new int[] { 1, (short) 1, 1 };
        testProgram53.TestStudentSubmission(intArray57);
        TestProgram testProgram59 = new TestProgram();
        int[] intArray63 = new int[] { 1, (short) 1, 1 };
        testProgram59.TestStudentSubmission(intArray63);
        testProgram53.TestStudentSubmission(intArray63);
        testProgram31.TestStudentSubmission(intArray63);
        testProgram0.TestStudentSubmission(intArray63);
        int[] intArray73 = new int[] { (short) 100, 10, '#', '#', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray73);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        testProgram20.TestStudentSubmission(intArray30);
        testProgram19.TestStudentSubmission(intArray30);
        testProgram13.TestStudentSubmission(intArray30);
        testProgram0.TestStudentSubmission(intArray30);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        testProgram0.TestStudentSubmission(intArray40);
        TestProgram testProgram43 = new TestProgram();
        TestProgram testProgram44 = new TestProgram();
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        TestProgram testProgram51 = new TestProgram();
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        TestProgram testProgram58 = new TestProgram();
        int[] intArray62 = new int[] { 1, (short) 1, 1 };
        testProgram58.TestStudentSubmission(intArray62);
        testProgram52.TestStudentSubmission(intArray62);
        testProgram51.TestStudentSubmission(intArray62);
        testProgram45.TestStudentSubmission(intArray62);
        testProgram44.TestStudentSubmission(intArray62);
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        testProgram44.TestStudentSubmission(intArray72);
        testProgram43.TestStudentSubmission(intArray72);
        testProgram0.TestStudentSubmission(intArray72);
        int[] intArray83 = new int[] { (byte) 10, (-1), 10, (-1), (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray83);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        testProgram1.TestStudentSubmission(intArray11);
        testProgram0.TestStudentSubmission(intArray11);
        TestProgram testProgram15 = new TestProgram();
        TestProgram testProgram16 = new TestProgram();
        int[] intArray20 = new int[] { 1, (short) 1, 1 };
        testProgram16.TestStudentSubmission(intArray20);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        testProgram16.TestStudentSubmission(intArray26);
        testProgram15.TestStudentSubmission(intArray26);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        TestProgram testProgram43 = new TestProgram();
        int[] intArray47 = new int[] { 1, (short) 1, 1 };
        testProgram43.TestStudentSubmission(intArray47);
        testProgram37.TestStudentSubmission(intArray47);
        testProgram36.TestStudentSubmission(intArray47);
        testProgram30.TestStudentSubmission(intArray47);
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        TestProgram testProgram58 = new TestProgram();
        TestProgram testProgram59 = new TestProgram();
        int[] intArray63 = new int[] { 1, (short) 1, 1 };
        testProgram59.TestStudentSubmission(intArray63);
        TestProgram testProgram65 = new TestProgram();
        int[] intArray69 = new int[] { 1, (short) 1, 1 };
        testProgram65.TestStudentSubmission(intArray69);
        testProgram59.TestStudentSubmission(intArray69);
        testProgram58.TestStudentSubmission(intArray69);
        testProgram52.TestStudentSubmission(intArray69);
        TestProgram testProgram74 = new TestProgram();
        int[] intArray78 = new int[] { 1, (short) 1, 1 };
        testProgram74.TestStudentSubmission(intArray78);
        testProgram52.TestStudentSubmission(intArray78);
        testProgram30.TestStudentSubmission(intArray78);
        testProgram15.TestStudentSubmission(intArray78);
        testProgram0.TestStudentSubmission(intArray78);
        int[] intArray89 = new int[] { (short) 10, (byte) 100, (short) 100, (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray89);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        testProgram2.TestStudentSubmission(intArray12);
        testProgram1.TestStudentSubmission(intArray12);
        testProgram0.TestStudentSubmission(intArray12);
        TestProgram testProgram17 = new TestProgram();
        TestProgram testProgram18 = new TestProgram();
        int[] intArray22 = new int[] { 1, (short) 1, 1 };
        testProgram18.TestStudentSubmission(intArray22);
        TestProgram testProgram24 = new TestProgram();
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        TestProgram testProgram31 = new TestProgram();
        int[] intArray35 = new int[] { 1, (short) 1, 1 };
        testProgram31.TestStudentSubmission(intArray35);
        testProgram25.TestStudentSubmission(intArray35);
        testProgram24.TestStudentSubmission(intArray35);
        testProgram18.TestStudentSubmission(intArray35);
        testProgram17.TestStudentSubmission(intArray35);
        TestProgram testProgram41 = new TestProgram();
        int[] intArray45 = new int[] { 1, (short) 1, 1 };
        testProgram41.TestStudentSubmission(intArray45);
        TestProgram testProgram47 = new TestProgram();
        int[] intArray51 = new int[] { 1, (short) 1, 1 };
        testProgram47.TestStudentSubmission(intArray51);
        testProgram41.TestStudentSubmission(intArray51);
        testProgram17.TestStudentSubmission(intArray51);
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        TestProgram testProgram61 = new TestProgram();
        TestProgram testProgram62 = new TestProgram();
        int[] intArray66 = new int[] { 1, (short) 1, 1 };
        testProgram62.TestStudentSubmission(intArray66);
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        testProgram62.TestStudentSubmission(intArray72);
        testProgram61.TestStudentSubmission(intArray72);
        testProgram55.TestStudentSubmission(intArray72);
        testProgram17.TestStudentSubmission(intArray72);
        testProgram0.TestStudentSubmission(intArray72);
        TestProgram testProgram79 = new TestProgram();
        int[] intArray83 = new int[] { 1, (short) 1, 1 };
        testProgram79.TestStudentSubmission(intArray83);
        TestProgram testProgram85 = new TestProgram();
        int[] intArray89 = new int[] { 1, (short) 1, 1 };
        testProgram85.TestStudentSubmission(intArray89);
        testProgram79.TestStudentSubmission(intArray89);
        testProgram0.TestStudentSubmission(intArray89);
        int[] intArray96 = new int[] { 100, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray96);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        TestProgram testProgram9 = new TestProgram();
        int[] intArray13 = new int[] { 1, (short) 1, 1 };
        testProgram9.TestStudentSubmission(intArray13);
        TestProgram testProgram15 = new TestProgram();
        int[] intArray19 = new int[] { 1, (short) 1, 1 };
        testProgram15.TestStudentSubmission(intArray19);
        testProgram9.TestStudentSubmission(intArray19);
        testProgram8.TestStudentSubmission(intArray19);
        testProgram2.TestStudentSubmission(intArray19);
        testProgram1.TestStudentSubmission(intArray19);
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        testProgram1.TestStudentSubmission(intArray29);
        TestProgram testProgram32 = new TestProgram();
        TestProgram testProgram33 = new TestProgram();
        int[] intArray37 = new int[] { 1, (short) 1, 1 };
        testProgram33.TestStudentSubmission(intArray37);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        testProgram33.TestStudentSubmission(intArray43);
        testProgram32.TestStudentSubmission(intArray43);
        TestProgram testProgram47 = new TestProgram();
        TestProgram testProgram48 = new TestProgram();
        int[] intArray52 = new int[] { 1, (short) 1, 1 };
        testProgram48.TestStudentSubmission(intArray52);
        TestProgram testProgram54 = new TestProgram();
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        testProgram55.TestStudentSubmission(intArray65);
        testProgram54.TestStudentSubmission(intArray65);
        testProgram48.TestStudentSubmission(intArray65);
        testProgram47.TestStudentSubmission(intArray65);
        testProgram32.TestStudentSubmission(intArray65);
        testProgram1.TestStudentSubmission(intArray65);
        testProgram0.TestStudentSubmission(intArray65);
        int[] intArray76 = new int[] { 'a', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray76);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        TestProgram testProgram9 = new TestProgram();
        int[] intArray13 = new int[] { 1, (short) 1, 1 };
        testProgram9.TestStudentSubmission(intArray13);
        TestProgram testProgram15 = new TestProgram();
        int[] intArray19 = new int[] { 1, (short) 1, 1 };
        testProgram15.TestStudentSubmission(intArray19);
        testProgram9.TestStudentSubmission(intArray19);
        testProgram8.TestStudentSubmission(intArray19);
        testProgram2.TestStudentSubmission(intArray19);
        testProgram1.TestStudentSubmission(intArray19);
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        TestProgram testProgram31 = new TestProgram();
        int[] intArray35 = new int[] { 1, (short) 1, 1 };
        testProgram31.TestStudentSubmission(intArray35);
        testProgram25.TestStudentSubmission(intArray35);
        TestProgram testProgram38 = new TestProgram();
        int[] intArray42 = new int[] { 1, (short) 1, 1 };
        testProgram38.TestStudentSubmission(intArray42);
        TestProgram testProgram44 = new TestProgram();
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        TestProgram testProgram51 = new TestProgram();
        int[] intArray55 = new int[] { 1, (short) 1, 1 };
        testProgram51.TestStudentSubmission(intArray55);
        testProgram45.TestStudentSubmission(intArray55);
        testProgram44.TestStudentSubmission(intArray55);
        testProgram38.TestStudentSubmission(intArray55);
        testProgram25.TestStudentSubmission(intArray55);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        TestProgram testProgram67 = new TestProgram();
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        TestProgram testProgram74 = new TestProgram();
        int[] intArray78 = new int[] { 1, (short) 1, 1 };
        testProgram74.TestStudentSubmission(intArray78);
        testProgram68.TestStudentSubmission(intArray78);
        testProgram67.TestStudentSubmission(intArray78);
        testProgram61.TestStudentSubmission(intArray78);
        TestProgram testProgram83 = new TestProgram();
        int[] intArray87 = new int[] { 1, (short) 1, 1 };
        testProgram83.TestStudentSubmission(intArray87);
        testProgram61.TestStudentSubmission(intArray87);
        testProgram25.TestStudentSubmission(intArray87);
        testProgram1.TestStudentSubmission(intArray87);
        testProgram0.TestStudentSubmission(intArray87);
        int[] intArray97 = new int[] { 0, (byte) 10, 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray97);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        TestProgram testProgram28 = new TestProgram();
        int[] intArray32 = new int[] { 1, (short) 1, 1 };
        testProgram28.TestStudentSubmission(intArray32);
        TestProgram testProgram34 = new TestProgram();
        TestProgram testProgram35 = new TestProgram();
        int[] intArray39 = new int[] { 1, (short) 1, 1 };
        testProgram35.TestStudentSubmission(intArray39);
        TestProgram testProgram41 = new TestProgram();
        int[] intArray45 = new int[] { 1, (short) 1, 1 };
        testProgram41.TestStudentSubmission(intArray45);
        testProgram35.TestStudentSubmission(intArray45);
        testProgram34.TestStudentSubmission(intArray45);
        testProgram28.TestStudentSubmission(intArray45);
        testProgram22.TestStudentSubmission(intArray45);
        TestProgram testProgram51 = new TestProgram();
        int[] intArray55 = new int[] { 1, (short) 1, 1 };
        testProgram51.TestStudentSubmission(intArray55);
        TestProgram testProgram57 = new TestProgram();
        int[] intArray61 = new int[] { 1, (short) 1, 1 };
        testProgram57.TestStudentSubmission(intArray61);
        testProgram51.TestStudentSubmission(intArray61);
        TestProgram testProgram64 = new TestProgram();
        int[] intArray68 = new int[] { 1, (short) 1, 1 };
        testProgram64.TestStudentSubmission(intArray68);
        TestProgram testProgram70 = new TestProgram();
        TestProgram testProgram71 = new TestProgram();
        int[] intArray75 = new int[] { 1, (short) 1, 1 };
        testProgram71.TestStudentSubmission(intArray75);
        TestProgram testProgram77 = new TestProgram();
        int[] intArray81 = new int[] { 1, (short) 1, 1 };
        testProgram77.TestStudentSubmission(intArray81);
        testProgram71.TestStudentSubmission(intArray81);
        testProgram70.TestStudentSubmission(intArray81);
        testProgram64.TestStudentSubmission(intArray81);
        testProgram51.TestStudentSubmission(intArray81);
        testProgram22.TestStudentSubmission(intArray81);
        testProgram0.TestStudentSubmission(intArray81);
        int[] intArray95 = new int[] { (byte) 100, (short) 0, '4', 1, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray95);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        testProgram20.TestStudentSubmission(intArray30);
        testProgram19.TestStudentSubmission(intArray30);
        testProgram13.TestStudentSubmission(intArray30);
        testProgram0.TestStudentSubmission(intArray30);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        TestProgram testProgram42 = new TestProgram();
        int[] intArray46 = new int[] { 1, (short) 1, 1 };
        testProgram42.TestStudentSubmission(intArray46);
        testProgram36.TestStudentSubmission(intArray46);
        testProgram0.TestStudentSubmission(intArray46);
        int[] intArray56 = new int[] { (-1), '4', (short) 0, (byte) 1, (-1), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray56);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        testProgram0.TestStudentSubmission(intArray26);
        int[] intArray31 = new int[] { 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray31);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        TestProgram testProgram28 = new TestProgram();
        int[] intArray32 = new int[] { 1, (short) 1, 1 };
        testProgram28.TestStudentSubmission(intArray32);
        testProgram22.TestStudentSubmission(intArray32);
        testProgram0.TestStudentSubmission(intArray32);
        TestProgram testProgram36 = new TestProgram();
        TestProgram testProgram37 = new TestProgram();
        TestProgram testProgram38 = new TestProgram();
        int[] intArray42 = new int[] { 1, (short) 1, 1 };
        testProgram38.TestStudentSubmission(intArray42);
        TestProgram testProgram44 = new TestProgram();
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        TestProgram testProgram51 = new TestProgram();
        int[] intArray55 = new int[] { 1, (short) 1, 1 };
        testProgram51.TestStudentSubmission(intArray55);
        testProgram45.TestStudentSubmission(intArray55);
        testProgram44.TestStudentSubmission(intArray55);
        testProgram38.TestStudentSubmission(intArray55);
        testProgram37.TestStudentSubmission(intArray55);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        testProgram37.TestStudentSubmission(intArray65);
        testProgram36.TestStudentSubmission(intArray65);
        testProgram0.TestStudentSubmission(intArray65);
        int[] intArray74 = new int[] { (byte) 0, '#', '#', 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray74);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        testProgram1.TestStudentSubmission(intArray11);
        testProgram0.TestStudentSubmission(intArray11);
        TestProgram testProgram15 = new TestProgram();
        int[] intArray19 = new int[] { 1, (short) 1, 1 };
        testProgram15.TestStudentSubmission(intArray19);
        TestProgram testProgram21 = new TestProgram();
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        TestProgram testProgram28 = new TestProgram();
        int[] intArray32 = new int[] { 1, (short) 1, 1 };
        testProgram28.TestStudentSubmission(intArray32);
        testProgram22.TestStudentSubmission(intArray32);
        testProgram21.TestStudentSubmission(intArray32);
        testProgram15.TestStudentSubmission(intArray32);
        TestProgram testProgram37 = new TestProgram();
        TestProgram testProgram38 = new TestProgram();
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        testProgram39.TestStudentSubmission(intArray49);
        testProgram38.TestStudentSubmission(intArray49);
        testProgram37.TestStudentSubmission(intArray49);
        testProgram15.TestStudentSubmission(intArray49);
        testProgram0.TestStudentSubmission(intArray49);
        TestProgram testProgram56 = new TestProgram();
        TestProgram testProgram57 = new TestProgram();
        int[] intArray61 = new int[] { 1, (short) 1, 1 };
        testProgram57.TestStudentSubmission(intArray61);
        TestProgram testProgram63 = new TestProgram();
        int[] intArray67 = new int[] { 1, (short) 1, 1 };
        testProgram63.TestStudentSubmission(intArray67);
        testProgram57.TestStudentSubmission(intArray67);
        testProgram56.TestStudentSubmission(intArray67);
        testProgram0.TestStudentSubmission(intArray67);
        int[] intArray75 = new int[] { (short) 1, '4', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray75);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        TestProgram testProgram23 = new TestProgram();
        int[] intArray27 = new int[] { 1, (short) 1, 1 };
        testProgram23.TestStudentSubmission(intArray27);
        testProgram1.TestStudentSubmission(intArray27);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        testProgram30.TestStudentSubmission(intArray40);
        TestProgram testProgram43 = new TestProgram();
        int[] intArray47 = new int[] { 1, (short) 1, 1 };
        testProgram43.TestStudentSubmission(intArray47);
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        testProgram43.TestStudentSubmission(intArray53);
        TestProgram testProgram56 = new TestProgram();
        int[] intArray60 = new int[] { 1, (short) 1, 1 };
        testProgram56.TestStudentSubmission(intArray60);
        TestProgram testProgram62 = new TestProgram();
        TestProgram testProgram63 = new TestProgram();
        int[] intArray67 = new int[] { 1, (short) 1, 1 };
        testProgram63.TestStudentSubmission(intArray67);
        TestProgram testProgram69 = new TestProgram();
        int[] intArray73 = new int[] { 1, (short) 1, 1 };
        testProgram69.TestStudentSubmission(intArray73);
        testProgram63.TestStudentSubmission(intArray73);
        testProgram62.TestStudentSubmission(intArray73);
        testProgram56.TestStudentSubmission(intArray73);
        testProgram43.TestStudentSubmission(intArray73);
        TestProgram testProgram79 = new TestProgram();
        int[] intArray83 = new int[] { 1, (short) 1, 1 };
        testProgram79.TestStudentSubmission(intArray83);
        testProgram43.TestStudentSubmission(intArray83);
        testProgram30.TestStudentSubmission(intArray83);
        testProgram1.TestStudentSubmission(intArray83);
        testProgram0.TestStudentSubmission(intArray83);
        int[] intArray93 = new int[] { 100, (-1), 1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray93);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        testProgram0.TestStudentSubmission(intArray26);
        TestProgram testProgram29 = new TestProgram();
        int[] intArray33 = new int[] { 1, (short) 1, 1 };
        testProgram29.TestStudentSubmission(intArray33);
        TestProgram testProgram35 = new TestProgram();
        int[] intArray39 = new int[] { 1, (short) 1, 1 };
        testProgram35.TestStudentSubmission(intArray39);
        testProgram29.TestStudentSubmission(intArray39);
        TestProgram testProgram42 = new TestProgram();
        int[] intArray46 = new int[] { 1, (short) 1, 1 };
        testProgram42.TestStudentSubmission(intArray46);
        TestProgram testProgram48 = new TestProgram();
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        testProgram49.TestStudentSubmission(intArray59);
        testProgram48.TestStudentSubmission(intArray59);
        testProgram42.TestStudentSubmission(intArray59);
        testProgram29.TestStudentSubmission(intArray59);
        testProgram0.TestStudentSubmission(intArray59);
        int[] intArray68 = new int[] { (byte) 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray68);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        testProgram14.TestStudentSubmission(intArray24);
        testProgram13.TestStudentSubmission(intArray24);
        testProgram7.TestStudentSubmission(intArray24);
        testProgram6.TestStudentSubmission(intArray24);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        testProgram6.TestStudentSubmission(intArray34);
        TestProgram testProgram37 = new TestProgram();
        TestProgram testProgram38 = new TestProgram();
        int[] intArray42 = new int[] { 1, (short) 1, 1 };
        testProgram38.TestStudentSubmission(intArray42);
        TestProgram testProgram44 = new TestProgram();
        int[] intArray48 = new int[] { 1, (short) 1, 1 };
        testProgram44.TestStudentSubmission(intArray48);
        testProgram38.TestStudentSubmission(intArray48);
        testProgram37.TestStudentSubmission(intArray48);
        TestProgram testProgram52 = new TestProgram();
        TestProgram testProgram53 = new TestProgram();
        int[] intArray57 = new int[] { 1, (short) 1, 1 };
        testProgram53.TestStudentSubmission(intArray57);
        TestProgram testProgram59 = new TestProgram();
        TestProgram testProgram60 = new TestProgram();
        int[] intArray64 = new int[] { 1, (short) 1, 1 };
        testProgram60.TestStudentSubmission(intArray64);
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        testProgram60.TestStudentSubmission(intArray70);
        testProgram59.TestStudentSubmission(intArray70);
        testProgram53.TestStudentSubmission(intArray70);
        testProgram52.TestStudentSubmission(intArray70);
        testProgram37.TestStudentSubmission(intArray70);
        testProgram6.TestStudentSubmission(intArray70);
        testProgram0.TestStudentSubmission(intArray70);
        int[] intArray85 = new int[] { ' ', '#', 0, ' ', (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray85);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        testProgram20.TestStudentSubmission(intArray30);
        testProgram19.TestStudentSubmission(intArray30);
        testProgram13.TestStudentSubmission(intArray30);
        testProgram0.TestStudentSubmission(intArray30);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        testProgram0.TestStudentSubmission(intArray40);
        TestProgram testProgram43 = new TestProgram();
        TestProgram testProgram44 = new TestProgram();
        int[] intArray48 = new int[] { 1, (short) 1, 1 };
        testProgram44.TestStudentSubmission(intArray48);
        TestProgram testProgram50 = new TestProgram();
        int[] intArray54 = new int[] { 1, (short) 1, 1 };
        testProgram50.TestStudentSubmission(intArray54);
        testProgram44.TestStudentSubmission(intArray54);
        testProgram43.TestStudentSubmission(intArray54);
        TestProgram testProgram58 = new TestProgram();
        int[] intArray62 = new int[] { 1, (short) 1, 1 };
        testProgram58.TestStudentSubmission(intArray62);
        TestProgram testProgram64 = new TestProgram();
        TestProgram testProgram65 = new TestProgram();
        int[] intArray69 = new int[] { 1, (short) 1, 1 };
        testProgram65.TestStudentSubmission(intArray69);
        TestProgram testProgram71 = new TestProgram();
        int[] intArray75 = new int[] { 1, (short) 1, 1 };
        testProgram71.TestStudentSubmission(intArray75);
        testProgram65.TestStudentSubmission(intArray75);
        testProgram64.TestStudentSubmission(intArray75);
        testProgram58.TestStudentSubmission(intArray75);
        TestProgram testProgram80 = new TestProgram();
        int[] intArray84 = new int[] { 1, (short) 1, 1 };
        testProgram80.TestStudentSubmission(intArray84);
        testProgram58.TestStudentSubmission(intArray84);
        testProgram43.TestStudentSubmission(intArray84);
        testProgram0.TestStudentSubmission(intArray84);
        int[] intArray91 = new int[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray91);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        testProgram20.TestStudentSubmission(intArray30);
        testProgram19.TestStudentSubmission(intArray30);
        testProgram13.TestStudentSubmission(intArray30);
        testProgram0.TestStudentSubmission(intArray30);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        testProgram0.TestStudentSubmission(intArray40);
        TestProgram testProgram43 = new TestProgram();
        TestProgram testProgram44 = new TestProgram();
        int[] intArray48 = new int[] { 1, (short) 1, 1 };
        testProgram44.TestStudentSubmission(intArray48);
        TestProgram testProgram50 = new TestProgram();
        int[] intArray54 = new int[] { 1, (short) 1, 1 };
        testProgram50.TestStudentSubmission(intArray54);
        testProgram44.TestStudentSubmission(intArray54);
        testProgram43.TestStudentSubmission(intArray54);
        TestProgram testProgram58 = new TestProgram();
        int[] intArray62 = new int[] { 1, (short) 1, 1 };
        testProgram58.TestStudentSubmission(intArray62);
        TestProgram testProgram64 = new TestProgram();
        TestProgram testProgram65 = new TestProgram();
        int[] intArray69 = new int[] { 1, (short) 1, 1 };
        testProgram65.TestStudentSubmission(intArray69);
        TestProgram testProgram71 = new TestProgram();
        int[] intArray75 = new int[] { 1, (short) 1, 1 };
        testProgram71.TestStudentSubmission(intArray75);
        testProgram65.TestStudentSubmission(intArray75);
        testProgram64.TestStudentSubmission(intArray75);
        testProgram58.TestStudentSubmission(intArray75);
        TestProgram testProgram80 = new TestProgram();
        int[] intArray84 = new int[] { 1, (short) 1, 1 };
        testProgram80.TestStudentSubmission(intArray84);
        testProgram58.TestStudentSubmission(intArray84);
        testProgram43.TestStudentSubmission(intArray84);
        testProgram0.TestStudentSubmission(intArray84);
        int[] intArray95 = new int[] { '#', (-1), 'a', (-1), (byte) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray95);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        TestProgram testProgram23 = new TestProgram();
        int[] intArray27 = new int[] { 1, (short) 1, 1 };
        testProgram23.TestStudentSubmission(intArray27);
        TestProgram testProgram29 = new TestProgram();
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        testProgram30.TestStudentSubmission(intArray40);
        testProgram29.TestStudentSubmission(intArray40);
        testProgram23.TestStudentSubmission(intArray40);
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        testProgram23.TestStudentSubmission(intArray49);
        testProgram1.TestStudentSubmission(intArray49);
        TestProgram testProgram53 = new TestProgram();
        int[] intArray57 = new int[] { 1, (short) 1, 1 };
        testProgram53.TestStudentSubmission(intArray57);
        TestProgram testProgram59 = new TestProgram();
        int[] intArray63 = new int[] { 1, (short) 1, 1 };
        testProgram59.TestStudentSubmission(intArray63);
        TestProgram testProgram65 = new TestProgram();
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        TestProgram testProgram72 = new TestProgram();
        int[] intArray76 = new int[] { 1, (short) 1, 1 };
        testProgram72.TestStudentSubmission(intArray76);
        testProgram66.TestStudentSubmission(intArray76);
        testProgram65.TestStudentSubmission(intArray76);
        testProgram59.TestStudentSubmission(intArray76);
        testProgram53.TestStudentSubmission(intArray76);
        testProgram1.TestStudentSubmission(intArray76);
        testProgram0.TestStudentSubmission(intArray76);
        TestProgram testProgram84 = new TestProgram();
        int[] intArray88 = new int[] { 1, (short) 1, 1 };
        testProgram84.TestStudentSubmission(intArray88);
        testProgram0.TestStudentSubmission(intArray88);
        int[] intArray97 = new int[] { (short) -1, (byte) -1, 0, (short) 10, '#', (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray97);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        TestProgram testProgram15 = new TestProgram();
        int[] intArray19 = new int[] { 1, (short) 1, 1 };
        testProgram15.TestStudentSubmission(intArray19);
        TestProgram testProgram21 = new TestProgram();
        int[] intArray25 = new int[] { 1, (short) 1, 1 };
        testProgram21.TestStudentSubmission(intArray25);
        testProgram15.TestStudentSubmission(intArray25);
        testProgram14.TestStudentSubmission(intArray25);
        testProgram8.TestStudentSubmission(intArray25);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        TestProgram testProgram43 = new TestProgram();
        int[] intArray47 = new int[] { 1, (short) 1, 1 };
        testProgram43.TestStudentSubmission(intArray47);
        testProgram37.TestStudentSubmission(intArray47);
        testProgram36.TestStudentSubmission(intArray47);
        testProgram30.TestStudentSubmission(intArray47);
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        testProgram30.TestStudentSubmission(intArray56);
        testProgram8.TestStudentSubmission(intArray56);
        testProgram7.TestStudentSubmission(intArray56);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        testProgram7.TestStudentSubmission(intArray65);
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        TestProgram testProgram74 = new TestProgram();
        TestProgram testProgram75 = new TestProgram();
        int[] intArray79 = new int[] { 1, (short) 1, 1 };
        testProgram75.TestStudentSubmission(intArray79);
        TestProgram testProgram81 = new TestProgram();
        int[] intArray85 = new int[] { 1, (short) 1, 1 };
        testProgram81.TestStudentSubmission(intArray85);
        testProgram75.TestStudentSubmission(intArray85);
        testProgram74.TestStudentSubmission(intArray85);
        testProgram68.TestStudentSubmission(intArray85);
        testProgram7.TestStudentSubmission(intArray85);
        testProgram6.TestStudentSubmission(intArray85);
        testProgram0.TestStudentSubmission(intArray85);
        int[] intArray95 = new int[] { (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray95);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        testProgram0.TestStudentSubmission(intArray26);
        TestProgram testProgram29 = new TestProgram();
        int[] intArray33 = new int[] { 1, (short) 1, 1 };
        testProgram29.TestStudentSubmission(intArray33);
        TestProgram testProgram35 = new TestProgram();
        int[] intArray39 = new int[] { 1, (short) 1, 1 };
        testProgram35.TestStudentSubmission(intArray39);
        testProgram29.TestStudentSubmission(intArray39);
        TestProgram testProgram42 = new TestProgram();
        int[] intArray46 = new int[] { 1, (short) 1, 1 };
        testProgram42.TestStudentSubmission(intArray46);
        TestProgram testProgram48 = new TestProgram();
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        testProgram49.TestStudentSubmission(intArray59);
        testProgram48.TestStudentSubmission(intArray59);
        testProgram42.TestStudentSubmission(intArray59);
        testProgram29.TestStudentSubmission(intArray59);
        testProgram0.TestStudentSubmission(intArray59);
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        TestProgram testProgram72 = new TestProgram();
        int[] intArray76 = new int[] { 1, (short) 1, 1 };
        testProgram72.TestStudentSubmission(intArray76);
        testProgram66.TestStudentSubmission(intArray76);
        testProgram0.TestStudentSubmission(intArray76);
        TestProgram testProgram80 = new TestProgram();
        int[] intArray84 = new int[] { 1, (short) 1, 1 };
        testProgram80.TestStudentSubmission(intArray84);
        testProgram0.TestStudentSubmission(intArray84);
        int[] intArray92 = new int[] { (short) -1, 'a', (short) -1, '4', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray92);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        testProgram0.TestStudentSubmission(intArray26);
        TestProgram testProgram29 = new TestProgram();
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        TestProgram testProgram36 = new TestProgram();
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        TestProgram testProgram43 = new TestProgram();
        int[] intArray47 = new int[] { 1, (short) 1, 1 };
        testProgram43.TestStudentSubmission(intArray47);
        testProgram37.TestStudentSubmission(intArray47);
        testProgram36.TestStudentSubmission(intArray47);
        testProgram30.TestStudentSubmission(intArray47);
        testProgram29.TestStudentSubmission(intArray47);
        TestProgram testProgram53 = new TestProgram();
        int[] intArray57 = new int[] { 1, (short) 1, 1 };
        testProgram53.TestStudentSubmission(intArray57);
        TestProgram testProgram59 = new TestProgram();
        TestProgram testProgram60 = new TestProgram();
        int[] intArray64 = new int[] { 1, (short) 1, 1 };
        testProgram60.TestStudentSubmission(intArray64);
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        testProgram60.TestStudentSubmission(intArray70);
        testProgram59.TestStudentSubmission(intArray70);
        testProgram53.TestStudentSubmission(intArray70);
        testProgram29.TestStudentSubmission(intArray70);
        TestProgram testProgram76 = new TestProgram();
        int[] intArray80 = new int[] { 1, (short) 1, 1 };
        testProgram76.TestStudentSubmission(intArray80);
        testProgram29.TestStudentSubmission(intArray80);
        testProgram0.TestStudentSubmission(intArray80);
        TestProgram testProgram84 = new TestProgram();
        int[] intArray88 = new int[] { 1, (short) 1, 1 };
        testProgram84.TestStudentSubmission(intArray88);
        testProgram0.TestStudentSubmission(intArray88);
        int[] intArray96 = new int[] { (-1), (byte) 10, (byte) 1, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray96);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        testProgram2.TestStudentSubmission(intArray12);
        testProgram1.TestStudentSubmission(intArray12);
        testProgram0.TestStudentSubmission(intArray12);
        TestProgram testProgram17 = new TestProgram();
        int[] intArray21 = new int[] { 1, (short) 1, 1 };
        testProgram17.TestStudentSubmission(intArray21);
        TestProgram testProgram23 = new TestProgram();
        TestProgram testProgram24 = new TestProgram();
        int[] intArray28 = new int[] { 1, (short) 1, 1 };
        testProgram24.TestStudentSubmission(intArray28);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        testProgram24.TestStudentSubmission(intArray34);
        testProgram23.TestStudentSubmission(intArray34);
        testProgram17.TestStudentSubmission(intArray34);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        testProgram17.TestStudentSubmission(intArray43);
        TestProgram testProgram46 = new TestProgram();
        int[] intArray50 = new int[] { 1, (short) 1, 1 };
        testProgram46.TestStudentSubmission(intArray50);
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        testProgram46.TestStudentSubmission(intArray56);
        TestProgram testProgram59 = new TestProgram();
        int[] intArray63 = new int[] { 1, (short) 1, 1 };
        testProgram59.TestStudentSubmission(intArray63);
        TestProgram testProgram65 = new TestProgram();
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        TestProgram testProgram72 = new TestProgram();
        int[] intArray76 = new int[] { 1, (short) 1, 1 };
        testProgram72.TestStudentSubmission(intArray76);
        testProgram66.TestStudentSubmission(intArray76);
        testProgram65.TestStudentSubmission(intArray76);
        testProgram59.TestStudentSubmission(intArray76);
        testProgram46.TestStudentSubmission(intArray76);
        testProgram17.TestStudentSubmission(intArray76);
        testProgram0.TestStudentSubmission(intArray76);
        int[] intArray87 = new int[] { 1, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray87);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        int[] intArray23 = new int[] { 1, (short) 1, 1 };
        testProgram19.TestStudentSubmission(intArray23);
        testProgram13.TestStudentSubmission(intArray23);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        TestProgram testProgram32 = new TestProgram();
        TestProgram testProgram33 = new TestProgram();
        int[] intArray37 = new int[] { 1, (short) 1, 1 };
        testProgram33.TestStudentSubmission(intArray37);
        TestProgram testProgram39 = new TestProgram();
        int[] intArray43 = new int[] { 1, (short) 1, 1 };
        testProgram39.TestStudentSubmission(intArray43);
        testProgram33.TestStudentSubmission(intArray43);
        testProgram32.TestStudentSubmission(intArray43);
        testProgram26.TestStudentSubmission(intArray43);
        testProgram13.TestStudentSubmission(intArray43);
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        testProgram13.TestStudentSubmission(intArray53);
        testProgram0.TestStudentSubmission(intArray53);
        int[] intArray58 = new int[] { 'a' };
        testProgram0.TestStudentSubmission(intArray58);
        int[] intArray63 = new int[] { (byte) 1, '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray63);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        testProgram2.TestStudentSubmission(intArray12);
        testProgram1.TestStudentSubmission(intArray12);
        TestProgram testProgram16 = new TestProgram();
        TestProgram testProgram17 = new TestProgram();
        int[] intArray21 = new int[] { 1, (short) 1, 1 };
        testProgram17.TestStudentSubmission(intArray21);
        TestProgram testProgram23 = new TestProgram();
        TestProgram testProgram24 = new TestProgram();
        int[] intArray28 = new int[] { 1, (short) 1, 1 };
        testProgram24.TestStudentSubmission(intArray28);
        TestProgram testProgram30 = new TestProgram();
        int[] intArray34 = new int[] { 1, (short) 1, 1 };
        testProgram30.TestStudentSubmission(intArray34);
        testProgram24.TestStudentSubmission(intArray34);
        testProgram23.TestStudentSubmission(intArray34);
        testProgram17.TestStudentSubmission(intArray34);
        testProgram16.TestStudentSubmission(intArray34);
        TestProgram testProgram40 = new TestProgram();
        int[] intArray44 = new int[] { 1, (short) 1, 1 };
        testProgram40.TestStudentSubmission(intArray44);
        testProgram16.TestStudentSubmission(intArray44);
        TestProgram testProgram47 = new TestProgram();
        TestProgram testProgram48 = new TestProgram();
        int[] intArray52 = new int[] { 1, (short) 1, 1 };
        testProgram48.TestStudentSubmission(intArray52);
        TestProgram testProgram54 = new TestProgram();
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        testProgram55.TestStudentSubmission(intArray65);
        testProgram54.TestStudentSubmission(intArray65);
        testProgram48.TestStudentSubmission(intArray65);
        testProgram47.TestStudentSubmission(intArray65);
        TestProgram testProgram71 = new TestProgram();
        int[] intArray75 = new int[] { 1, (short) 1, 1 };
        testProgram71.TestStudentSubmission(intArray75);
        testProgram47.TestStudentSubmission(intArray75);
        testProgram16.TestStudentSubmission(intArray75);
        testProgram1.TestStudentSubmission(intArray75);
        testProgram0.TestStudentSubmission(intArray75);
        int[] intArray84 = new int[] { '#', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray84);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        TestProgram testProgram24 = new TestProgram();
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        TestProgram testProgram31 = new TestProgram();
        TestProgram testProgram32 = new TestProgram();
        int[] intArray36 = new int[] { 1, (short) 1, 1 };
        testProgram32.TestStudentSubmission(intArray36);
        TestProgram testProgram38 = new TestProgram();
        int[] intArray42 = new int[] { 1, (short) 1, 1 };
        testProgram38.TestStudentSubmission(intArray42);
        testProgram32.TestStudentSubmission(intArray42);
        testProgram31.TestStudentSubmission(intArray42);
        testProgram25.TestStudentSubmission(intArray42);
        TestProgram testProgram47 = new TestProgram();
        TestProgram testProgram48 = new TestProgram();
        int[] intArray52 = new int[] { 1, (short) 1, 1 };
        testProgram48.TestStudentSubmission(intArray52);
        TestProgram testProgram54 = new TestProgram();
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        testProgram55.TestStudentSubmission(intArray65);
        testProgram54.TestStudentSubmission(intArray65);
        testProgram48.TestStudentSubmission(intArray65);
        testProgram47.TestStudentSubmission(intArray65);
        testProgram25.TestStudentSubmission(intArray65);
        testProgram24.TestStudentSubmission(intArray65);
        testProgram0.TestStudentSubmission(intArray65);
        int[] intArray79 = new int[] { 100, 0, (byte) 1, (short) 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray79);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        TestProgram testProgram12 = new TestProgram();
        int[] intArray16 = new int[] { 1, (short) 1, 1 };
        testProgram12.TestStudentSubmission(intArray16);
        TestProgram testProgram18 = new TestProgram();
        int[] intArray22 = new int[] { 1, (short) 1, 1 };
        testProgram18.TestStudentSubmission(intArray22);
        testProgram12.TestStudentSubmission(intArray22);
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        TestProgram testProgram31 = new TestProgram();
        TestProgram testProgram32 = new TestProgram();
        int[] intArray36 = new int[] { 1, (short) 1, 1 };
        testProgram32.TestStudentSubmission(intArray36);
        TestProgram testProgram38 = new TestProgram();
        int[] intArray42 = new int[] { 1, (short) 1, 1 };
        testProgram38.TestStudentSubmission(intArray42);
        testProgram32.TestStudentSubmission(intArray42);
        testProgram31.TestStudentSubmission(intArray42);
        testProgram25.TestStudentSubmission(intArray42);
        testProgram12.TestStudentSubmission(intArray42);
        testProgram6.TestStudentSubmission(intArray42);
        testProgram0.TestStudentSubmission(intArray42);
        TestProgram testProgram50 = new TestProgram();
        int[] intArray54 = new int[] { 1, (short) 1, 1 };
        testProgram50.TestStudentSubmission(intArray54);
        testProgram0.TestStudentSubmission(intArray54);
        int[] intArray62 = new int[] { (short) 0, ' ', (byte) 10, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray62);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        TestProgram testProgram19 = new TestProgram();
        TestProgram testProgram20 = new TestProgram();
        int[] intArray24 = new int[] { 1, (short) 1, 1 };
        testProgram20.TestStudentSubmission(intArray24);
        TestProgram testProgram26 = new TestProgram();
        int[] intArray30 = new int[] { 1, (short) 1, 1 };
        testProgram26.TestStudentSubmission(intArray30);
        testProgram20.TestStudentSubmission(intArray30);
        testProgram19.TestStudentSubmission(intArray30);
        testProgram13.TestStudentSubmission(intArray30);
        testProgram0.TestStudentSubmission(intArray30);
        TestProgram testProgram36 = new TestProgram();
        int[] intArray40 = new int[] { 1, (short) 1, 1 };
        testProgram36.TestStudentSubmission(intArray40);
        TestProgram testProgram42 = new TestProgram();
        int[] intArray46 = new int[] { 1, (short) 1, 1 };
        testProgram42.TestStudentSubmission(intArray46);
        testProgram36.TestStudentSubmission(intArray46);
        testProgram0.TestStudentSubmission(intArray46);
        TestProgram testProgram50 = new TestProgram();
        TestProgram testProgram51 = new TestProgram();
        int[] intArray55 = new int[] { 1, (short) 1, 1 };
        testProgram51.TestStudentSubmission(intArray55);
        TestProgram testProgram57 = new TestProgram();
        int[] intArray61 = new int[] { 1, (short) 1, 1 };
        testProgram57.TestStudentSubmission(intArray61);
        testProgram51.TestStudentSubmission(intArray61);
        testProgram50.TestStudentSubmission(intArray61);
        TestProgram testProgram65 = new TestProgram();
        TestProgram testProgram66 = new TestProgram();
        int[] intArray70 = new int[] { 1, (short) 1, 1 };
        testProgram66.TestStudentSubmission(intArray70);
        TestProgram testProgram72 = new TestProgram();
        TestProgram testProgram73 = new TestProgram();
        int[] intArray77 = new int[] { 1, (short) 1, 1 };
        testProgram73.TestStudentSubmission(intArray77);
        TestProgram testProgram79 = new TestProgram();
        int[] intArray83 = new int[] { 1, (short) 1, 1 };
        testProgram79.TestStudentSubmission(intArray83);
        testProgram73.TestStudentSubmission(intArray83);
        testProgram72.TestStudentSubmission(intArray83);
        testProgram66.TestStudentSubmission(intArray83);
        testProgram65.TestStudentSubmission(intArray83);
        testProgram50.TestStudentSubmission(intArray83);
        testProgram0.TestStudentSubmission(intArray83);
        int[] intArray96 = new int[] { (short) 10, '4', 1, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray96);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        int[] intArray5 = new int[] { 1, (short) 1, 1 };
        testProgram1.TestStudentSubmission(intArray5);
        TestProgram testProgram7 = new TestProgram();
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        testProgram8.TestStudentSubmission(intArray18);
        testProgram7.TestStudentSubmission(intArray18);
        testProgram1.TestStudentSubmission(intArray18);
        testProgram0.TestStudentSubmission(intArray18);
        TestProgram testProgram24 = new TestProgram();
        int[] intArray28 = new int[] { 1, (short) 1, 1 };
        testProgram24.TestStudentSubmission(intArray28);
        TestProgram testProgram30 = new TestProgram();
        TestProgram testProgram31 = new TestProgram();
        int[] intArray35 = new int[] { 1, (short) 1, 1 };
        testProgram31.TestStudentSubmission(intArray35);
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        testProgram31.TestStudentSubmission(intArray41);
        testProgram30.TestStudentSubmission(intArray41);
        testProgram24.TestStudentSubmission(intArray41);
        testProgram0.TestStudentSubmission(intArray41);
        int[] intArray50 = new int[] { 0, (short) 1, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray50);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        int[] intArray10 = new int[] { 1, (short) 1, 1 };
        testProgram6.TestStudentSubmission(intArray10);
        testProgram0.TestStudentSubmission(intArray10);
        TestProgram testProgram13 = new TestProgram();
        TestProgram testProgram14 = new TestProgram();
        int[] intArray18 = new int[] { 1, (short) 1, 1 };
        testProgram14.TestStudentSubmission(intArray18);
        TestProgram testProgram20 = new TestProgram();
        TestProgram testProgram21 = new TestProgram();
        int[] intArray25 = new int[] { 1, (short) 1, 1 };
        testProgram21.TestStudentSubmission(intArray25);
        TestProgram testProgram27 = new TestProgram();
        int[] intArray31 = new int[] { 1, (short) 1, 1 };
        testProgram27.TestStudentSubmission(intArray31);
        testProgram21.TestStudentSubmission(intArray31);
        testProgram20.TestStudentSubmission(intArray31);
        testProgram14.TestStudentSubmission(intArray31);
        testProgram13.TestStudentSubmission(intArray31);
        TestProgram testProgram37 = new TestProgram();
        int[] intArray41 = new int[] { 1, (short) 1, 1 };
        testProgram37.TestStudentSubmission(intArray41);
        testProgram13.TestStudentSubmission(intArray41);
        TestProgram testProgram44 = new TestProgram();
        TestProgram testProgram45 = new TestProgram();
        int[] intArray49 = new int[] { 1, (short) 1, 1 };
        testProgram45.TestStudentSubmission(intArray49);
        TestProgram testProgram51 = new TestProgram();
        TestProgram testProgram52 = new TestProgram();
        int[] intArray56 = new int[] { 1, (short) 1, 1 };
        testProgram52.TestStudentSubmission(intArray56);
        TestProgram testProgram58 = new TestProgram();
        int[] intArray62 = new int[] { 1, (short) 1, 1 };
        testProgram58.TestStudentSubmission(intArray62);
        testProgram52.TestStudentSubmission(intArray62);
        testProgram51.TestStudentSubmission(intArray62);
        testProgram45.TestStudentSubmission(intArray62);
        testProgram44.TestStudentSubmission(intArray62);
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        testProgram44.TestStudentSubmission(intArray72);
        testProgram13.TestStudentSubmission(intArray72);
        testProgram0.TestStudentSubmission(intArray72);
        int[] intArray79 = new int[] { (byte) 10, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray79);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        TestProgram testProgram0 = new TestProgram();
        TestProgram testProgram1 = new TestProgram();
        TestProgram testProgram2 = new TestProgram();
        int[] intArray6 = new int[] { 1, (short) 1, 1 };
        testProgram2.TestStudentSubmission(intArray6);
        TestProgram testProgram8 = new TestProgram();
        int[] intArray12 = new int[] { 1, (short) 1, 1 };
        testProgram8.TestStudentSubmission(intArray12);
        testProgram2.TestStudentSubmission(intArray12);
        testProgram1.TestStudentSubmission(intArray12);
        testProgram0.TestStudentSubmission(intArray12);
        TestProgram testProgram17 = new TestProgram();
        TestProgram testProgram18 = new TestProgram();
        int[] intArray22 = new int[] { 1, (short) 1, 1 };
        testProgram18.TestStudentSubmission(intArray22);
        TestProgram testProgram24 = new TestProgram();
        TestProgram testProgram25 = new TestProgram();
        int[] intArray29 = new int[] { 1, (short) 1, 1 };
        testProgram25.TestStudentSubmission(intArray29);
        TestProgram testProgram31 = new TestProgram();
        int[] intArray35 = new int[] { 1, (short) 1, 1 };
        testProgram31.TestStudentSubmission(intArray35);
        testProgram25.TestStudentSubmission(intArray35);
        testProgram24.TestStudentSubmission(intArray35);
        testProgram18.TestStudentSubmission(intArray35);
        testProgram17.TestStudentSubmission(intArray35);
        TestProgram testProgram41 = new TestProgram();
        int[] intArray45 = new int[] { 1, (short) 1, 1 };
        testProgram41.TestStudentSubmission(intArray45);
        testProgram17.TestStudentSubmission(intArray45);
        TestProgram testProgram48 = new TestProgram();
        int[] intArray52 = new int[] { 1, (short) 1, 1 };
        testProgram48.TestStudentSubmission(intArray52);
        TestProgram testProgram54 = new TestProgram();
        int[] intArray58 = new int[] { 1, (short) 1, 1 };
        testProgram54.TestStudentSubmission(intArray58);
        testProgram48.TestStudentSubmission(intArray58);
        TestProgram testProgram61 = new TestProgram();
        int[] intArray65 = new int[] { 1, (short) 1, 1 };
        testProgram61.TestStudentSubmission(intArray65);
        TestProgram testProgram67 = new TestProgram();
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        TestProgram testProgram74 = new TestProgram();
        int[] intArray78 = new int[] { 1, (short) 1, 1 };
        testProgram74.TestStudentSubmission(intArray78);
        testProgram68.TestStudentSubmission(intArray78);
        testProgram67.TestStudentSubmission(intArray78);
        testProgram61.TestStudentSubmission(intArray78);
        testProgram48.TestStudentSubmission(intArray78);
        testProgram17.TestStudentSubmission(intArray78);
        testProgram0.TestStudentSubmission(intArray78);
        int[] intArray91 = new int[] { (-1), '4', 0, (short) 1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray91);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        TestProgram testProgram0 = new TestProgram();
        int[] intArray4 = new int[] { 1, (short) 1, 1 };
        testProgram0.TestStudentSubmission(intArray4);
        TestProgram testProgram6 = new TestProgram();
        TestProgram testProgram7 = new TestProgram();
        int[] intArray11 = new int[] { 1, (short) 1, 1 };
        testProgram7.TestStudentSubmission(intArray11);
        TestProgram testProgram13 = new TestProgram();
        int[] intArray17 = new int[] { 1, (short) 1, 1 };
        testProgram13.TestStudentSubmission(intArray17);
        testProgram7.TestStudentSubmission(intArray17);
        testProgram6.TestStudentSubmission(intArray17);
        testProgram0.TestStudentSubmission(intArray17);
        TestProgram testProgram22 = new TestProgram();
        int[] intArray26 = new int[] { 1, (short) 1, 1 };
        testProgram22.TestStudentSubmission(intArray26);
        testProgram0.TestStudentSubmission(intArray26);
        TestProgram testProgram29 = new TestProgram();
        int[] intArray33 = new int[] { 1, (short) 1, 1 };
        testProgram29.TestStudentSubmission(intArray33);
        TestProgram testProgram35 = new TestProgram();
        int[] intArray39 = new int[] { 1, (short) 1, 1 };
        testProgram35.TestStudentSubmission(intArray39);
        testProgram29.TestStudentSubmission(intArray39);
        TestProgram testProgram42 = new TestProgram();
        int[] intArray46 = new int[] { 1, (short) 1, 1 };
        testProgram42.TestStudentSubmission(intArray46);
        TestProgram testProgram48 = new TestProgram();
        TestProgram testProgram49 = new TestProgram();
        int[] intArray53 = new int[] { 1, (short) 1, 1 };
        testProgram49.TestStudentSubmission(intArray53);
        TestProgram testProgram55 = new TestProgram();
        int[] intArray59 = new int[] { 1, (short) 1, 1 };
        testProgram55.TestStudentSubmission(intArray59);
        testProgram49.TestStudentSubmission(intArray59);
        testProgram48.TestStudentSubmission(intArray59);
        testProgram42.TestStudentSubmission(intArray59);
        testProgram29.TestStudentSubmission(intArray59);
        testProgram0.TestStudentSubmission(intArray59);
        TestProgram testProgram66 = new TestProgram();
        TestProgram testProgram67 = new TestProgram();
        TestProgram testProgram68 = new TestProgram();
        int[] intArray72 = new int[] { 1, (short) 1, 1 };
        testProgram68.TestStudentSubmission(intArray72);
        TestProgram testProgram74 = new TestProgram();
        int[] intArray78 = new int[] { 1, (short) 1, 1 };
        testProgram74.TestStudentSubmission(intArray78);
        testProgram68.TestStudentSubmission(intArray78);
        testProgram67.TestStudentSubmission(intArray78);
        testProgram66.TestStudentSubmission(intArray78);
        testProgram0.TestStudentSubmission(intArray78);
        int[] intArray90 = new int[] { (short) 100, (byte) 1, (byte) 0, ' ', (byte) 10, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        testProgram0.TestStudentSubmission(intArray90);
    }
}

