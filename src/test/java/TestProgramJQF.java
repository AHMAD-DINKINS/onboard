import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import static org.junit.Assert.assertEquals;

import org.junit.*;

@RunWith(JQF.class)
public class TestProgramJQF {

    @Fuzz
    public void TestStudentSubmission(long[] arr){
        // long[] arr = {10, 324, 45, 90, 9808};
	    long resCorrect = ProgramCorrect.findMax(arr);
        long resMaybeNotCorrect  = ProgramIncorrect.findMax(arr);

	    assertEquals(resCorrect, resMaybeNotCorrect);
    }   

}