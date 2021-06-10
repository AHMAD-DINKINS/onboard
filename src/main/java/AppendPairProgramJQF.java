import org.junit.runner.RunWith;
import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

// import org.junit.*;
@RunWith(JQF.class)
public class AppendPairProgramJQF {

  // public int OldCount;
  // public boolean OldIsLengthOdd;
  @Fuzz
  public void TestStudentSubmission(@From(ListGenerator.class) List l, int elem) 
  {
    assumeTrue(l != null);
    // OldCount = l.size();
    // OldIsLengthOdd = l.isLengthOdd();
    assumeTrue(l != null && l.next != l);
    List copy = clone(l);
    l.addToEndRef(elem);
    copy.addToEndStu(elem);

    assertTrue(IsEqual(l, copy));
  }

  // Generates all possible valid lists
  public static List listgen(int[] init) {
    assumeTrue(init != null);
    List l = new List();
    if (init.length >= 1) {
      l.value = init[0];
    }
    for (int i = 1; i < init.length; i++)
      l.addToEndRef(init[i]);
    return l;
  }

  private static List clone(List l) {
    assumeTrue(l.next != l);
    List other = new List();
    List temp = l;
    for (; temp.next != null; temp = temp.next) {
      other.value = temp.value;
      other.next = new List();
      other = other.next;
    }
    other.value = temp.value;
    return other;
  }

  private boolean IsEqual(List R, List C) {
    return R.equals(C);
  }

}

