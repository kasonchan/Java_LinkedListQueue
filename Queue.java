/**
 * File: Queue.java
 * Created Date: June 08, 2013
 * Status: Completed
 * Programmer: Ka-Son Chan
 * Description: This file contains the Queue and Node classes.
 */ 

/**
 * The Queue class orders elements in a FIFO (first-in-first-out) manner.
 */
public class Queue<I, S> {
  
  /**
   * The Node class represent the datas stores in a node.
   */
  public class Node {
    private I iData;
    private S sData;
    private Node next;

    /**
     * Constructor
     * Creates empty node.
     */
    public Node() {
      iData = null;
      sData = null;
      next = null;
    }

    /**
     * Constructor
     * @param  newIData item to be stored in the node
     * @param  newSData item to be stored in the node
     */
    public Node(final I newIData, final S newSData) {
      iData = newIData;
      sData = newSData;
      next = null;
    }

    /**
     * Constructor
     * @param  newIData  item to be stored in the node
     * @param  newSData  item to be stored in the node
     * @param  nextValue item to be stored in the node
     */
    public Node(final I newIData, final S newSData, final Node nextValue) {
      iData = newIData;
      sData = newSData;
      next = nextValue;
    }

    /**
     * getIData
     * @return iData item stored in the node
     */
    final public I getIData() {
      return iData;
    }

    /**
     * getSData
     * @return sData item stored in the node
     */
    final public S getSData() {
      return sData;
    }

    /**
     * getNext
     * @return next item stored in the node
     */
    final public Node getNext() {
      return next;
    }

    /**
     * setNext
     * Set the next in the node to newNext
     * @param  newNext item stored in the node
     */
    final public void setNext(final Node newNext) {
      this.next = newNext;
    }
  }

  /**
   * Data members of the Queue class
   */
  private Node front;
  private Node back;

  /**
   * Function members of the Queue class
   */
  
  /**
   * Constructor
   * Constructors an empty queue
   */
  public Queue() {
    front = null;
    back = null;
  }

  /**
   * empty
   * Checks if a queue is empty
   * @return true if queue is empty and false otherwise
   */
  public Boolean empty() {
    if (front == null)
      return true;
    return false;
  }

  /**
   * enqueue
   * Modifies a queue by adding a value at the back
   * @param  newIData item to be added to the Node
   * @param  newSData item to be added to the Node
   * @return tempNode if it is added to the Queue and null otherwise
   */
  public Node enqueue(final I newIData, final S newSData) {
    Node newNode = new Node(newIData, newSData);
    Node tempNode = front;

    if (newNode != null) {
      if (!empty()) {
        while (tempNode.getNext() != null) {
          tempNode = tempNode.getNext();
        }

        tempNode.setNext(newNode);

        back = newNode;
      }
      else {
        front = newNode;
        back = newNode;
      }

      return newNode;
    }

    return null;
  }

  /**
   * front
   * Accesses the front queue value; leaves queue unchanged
   * @return front queue value if the queue is not empty and null otherwise
   */
  public Node front() {
    if (!empty())
      return front;
    return null;
  }

  /**
   * back
   * Accesses the back queue value; leaves queue unchanged
   * @return back queue value if the queue is not empty and null otherwise
   */
  public Node back() {
    if (!empty())
      return back;
    return null;
  }

  /**
   * dequeue
   * Modifies queue by removing the value at the front
   * @return front queue value if the queue is not empty and null otherwise
   */
  public Node dequeue() {
    Node tempNode = front;

    if (!empty()) {
      front = front.getNext();
      return tempNode;
    }

    return null;
  }

  /**
   * display
   * Displays all the queue elements
   */
  public void display() {
    Node tempNode = front;

    if (!empty()) { 
      do {
        System.out.println(tempNode.getIData());
        System.out.println(tempNode.getSData());
        tempNode = tempNode.getNext();
      } while (tempNode != null);
    }
    else {
      System.out.println("Queue is empty.");
    }
  }
}
