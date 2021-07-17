
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import org.junit.runner.RunWith;


// import org.junit.*;

public class PairProgram {
  /*Features*/
  public int OldCount;
  public boolean OldIsAllZeros;
  public boolean OldLastElemIsZero;
  public boolean OldIsLengthOdd;
  public boolean OldIndiciesMatchElements;
  public boolean OldLengthEqualsSum;
  public boolean safe = false;

  public void TestStudentSubmission(int[] array)
  {
    assumeTrue(array != null);
    assumeTrue(true);
    int[] copy = clone(array);

    int refSum = sumRef(array);
    int stuSum = sumStu(copy);
    
    boolean isEqual = refSum == stuSum && IsEqual(array, copy);
    if (isEqual)
      safe = true;
    
    assertTrue(isEqual);
    
  }

  private static int[] clone(int[] arr) {
    int[] copy = new int[arr.length];
    for (int i = 0; i < arr.length; ++i) {
      copy[i] = arr[i];
    }
    return copy;
  }

  public int[] generateArray(int[] array, int kind) {
      assumeTrue(array != null);
      int[] toRet = new int[array.length];
      boolean empty = toRet.length == 0;
      if (empty) {
        return toRet;
      }
      switch (kind) {
        case 0:
          // generate all zeros array
          return toRet;
        case 1:
          // generate indiciesMatchElems array
          for (int i = 0; i < toRet.length; ++i) {
            toRet[i] = i;
          }
          return toRet;
        case 2:
          // generate last elem is zero
          array[array.length - 1] = 0;
          return array;
        case 3:
          // generate length equals sum
          toRet[toRet.length - 1] = toRet.length;
          return toRet;
      }
      return array;
  }
}