import org.junit.runner.RunWith;
import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import java.util.Arrays;
// import org.junit.*;

public class TestProgram {

    public static boolean allElementsAreSame = false;

    public static void main(String[] args) {
        // int[] arr = {10, 324, 45, 90, 9808};
        // TestStudentSubmission(arr);

        int[] arr = {56, 56};
        TestStudentSubmission(arr);

        int[] arr1 = {-189, -189};
        TestStudentSubmission(arr1);

        int[] arr2 = {10001, 10001};
        TestStudentSubmission(arr2);

        int[] arr3 = {0, 0, 0};
        TestStudentSubmission(arr3);

        int[] arr4 = {10, 10};
        TestStudentSubmission(arr4);

    }

    public static void TestStudentSubmission(int[] arr ){
        System.out.println(Arrays.toString(arr));
        TestProgram.allElementsAreSame = elementsSame(arr);
        // assumeTrue(elementsSame(arr));
	    int resCorrect = ProgramCorrect.findMax(arr);
        int resMaybeNotCorrect  = ProgramIncorrect.findMax(arr);

	    assertTrue(resCorrect == resMaybeNotCorrect);
        // return resCorrect;
    }

    public static boolean elementsSame(int[] arr) {
        if (arr == null || arr.length == 0)
            return false;
        int item = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (item != arr[i])
                return false;
        return true;
    }

    // public static long[] arrayGen(int[] arr) {
    //     long[] ret = new long[arr.length];
    //     for (int i = 0; i < ret.length; i++) {
    //         ret[i] = (long)arr[i];
    //     }
    //     return ret;
    // }

}