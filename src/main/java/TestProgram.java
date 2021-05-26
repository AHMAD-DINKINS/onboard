import org.junit.runner.RunWith;
import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import java.util.Arrays;
// import org.junit.*;

@RunWith(JQF.class)
public class TestProgram {

    @Fuzz
    public void TestStudentSubmission(@From(IntArrayGenerator.class) int[] arr ){
        System.out.println(Arrays.toString(arr));
        assumeTrue(elementsSame(arr));
        // int[] arr = {10, 324, 45, 90, 9808};
	    int resCorrect = ProgramCorrect.findMax(arr);
        int resMaybeNotCorrect  = ProgramIncorrect.findMax(arr);

	    assertTrue(resCorrect == resMaybeNotCorrect);
        // return resCorrect;
    }

    public boolean elementsSame(int[] arr) {
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