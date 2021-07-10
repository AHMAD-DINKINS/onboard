
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

  public static int[] generateArray(int[] array, int kind) {
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
      }
      return array;
  }

/**
 * Return the sum of the elements in array.
 */
private static int sumStu(final int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        count++;
    }
    return count; 
}
private static int sumRef(final int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    
    return sum;
}

private boolean IsEqual(int[] R, int[] C) {
    if (R.length != C.length) return false;
    for (int i = 0; i < R.length; ++i) {
      if (R[i] != C[i]) return false;
    }
    return true;
  }

  /**
   * Beginning of Obsevers
   */
  private static boolean isAllZeros(int[] arr) {
    for (int elem: arr) {
      if (elem != 0) return false;
    }
    return true;
  }

  private static boolean lastElemIsZero(int[] arr) {
    return arr[arr.length - 1] == 0;
  }

  private static boolean indiciesMatchElements(int[] arr) {
    for (int i = 0; i < arr.length; ++i) {
      if (arr[i] != i) return false;
    }
    return true;
  }

  private static boolean isLengthOdd(int[] arr) {
    return arr.length % 2 == 1;
  }}