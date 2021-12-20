
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import org.junit.runner.RunWith;


// import org.junit.*;

public class PairProgram {
  /*Features*/
  public int OldCount;
  public int OldHead;
  public int OldElem;
  public boolean OldIsLengthOdd;
  public boolean OldIsValueAtEnd;
  public boolean safe = false;
  //public static void main(String[] args){
  //  PairProgram pairP = new PairProgram();
  // List l = new List(-2);
  //  l.addToEndRef(3);
  //  l.addToEndRef(5`);
  //}
  
  public void TestStudentSubmission(List l, int elem)
  {
    assumeTrue(l != null && !l.isCyclic());
<<<<<<< HEAD
=======
    OldCount = l.size();
    OldHead = l.value;
    OldElem = elem;
    OldIsLengthOdd = l.isLengthOdd();
    OldIsValueAtEnd = l.isValueAtEnd(elem);
>>>>>>> fa74af3297a65c157b2bec41b9209ea0b3a3ef91
    assumeTrue(true);
    List copy = clone(l);
    System.out.println("size before: " + copy.size());
    l.addToEndRef(elem);
    copy.addToEndStu(elem);
    System.out.println("size after: " +copy.size());
    
    //assumeTrue(IsEqual(l, copy));
    
    boolean isEqual = !copy.isCyclic() && IsEqual(l,copy);
    if (isEqual)
      safe = true;
    System.out.println("safe? "+ this.safe);
    assertTrue(isEqual);
    
  }

  // Generates all possible valid lists
  public static List generateList(int[] init) {
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
