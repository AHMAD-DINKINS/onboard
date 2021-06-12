
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import org.junit.runner.RunWith;


// import org.junit.*;

public class AppendPairProgram {
  /*Features*/
  public int OldCount;
  public boolean OldIsLengthOdd;
  public boolean OldIsValueAtEnd;
  public int OldHead;
  

  public void TestStudentSubmission(List l, int elem) 
  {
    assumeTrue(l != null && !l.isCyclic());
    OldCount = l.size();
    OldIsLengthOdd = l.isLengthOdd();
    OldIsValueAtEnd = l.isValueAtEnd(elem);
    OldHead = l.value;
    assumeTrue(true);
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
    List head = other;
    List temp = l;
    for (; temp.next != null; temp = temp.next) {
      other.value = temp.value;
      other.next = new List();
      other = other.next;
    }
    other.value = temp.value;
    return head;
  }

  private boolean IsEqual(List R, List C) {
    return R.equals(C);
  }

}
