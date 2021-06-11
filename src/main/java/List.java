/**
 * Class for representing a linked list of ints.
 */
public class List {

  public int value;
  public List next;

  public List() {}

  public List(final int setValue) {
    value = setValue;
  }

  /**
   * Add a value as the last item in the list.
   *
   * Can be called on any item of the list, although will normally be called
   * on the first item.
   */
  public void addToEndStu(final int newValue) {
    if (this.next != null) {
      this.next = new List(newValue);
    }
    this.next = new List(newValue);
  }

  public void addToEndRef(final int newValue) {
    if (this.next == null) {
      this.next = new List(newValue);
    } else {
      this.next.addToEndRef(newValue);
    }
  }

  // public void print() {
  //   for (List curr = this;curr != null; curr = curr.next)
  //     System.out.println("Node: " + curr.value);
  // }

  public int size() {
    int count = 1;
    for (List l = this.next; l != null; l = l.next) count++;
    return count;
  }

  public boolean isCyclic() {
    // @author Javin Paul
    List fast = this;
    List slow = this;
       
    while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        
        //if fast and slow pointers are meeting then LinkedList is cyclic
        if(fast == slow){
            return true;
        }
    }
    return false;
  }

  public boolean isLengthOdd() {
    return size() % 2 == 1;
  }

  public boolean isValueAtEnd(int element) {
    List current = this;
    while (current.next != null) {
      current = current.next;
    }
    return current.value == element;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof List)) return false;
    List other = ((List) o);
    if (other.size() != this.size()) return false;
    for (List l = this; l != null; l = l.next) {
      if (l.value != other.value) return false;
      other = other.next;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return this.getClass().getName().hashCode() * value;
  }
}
