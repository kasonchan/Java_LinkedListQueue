/**
 * File: QueueDemo.java
 * Created Date: June 08, 2013
 * Status: Completed
 * Programmer: Ka-Son Chan
 * Description: This file is a demo of the Queue and Node classes.
 */ 

import java.util.Scanner;

public class QueueDemo {
  public static void main(String[] args) {  
    String command = null;
    int iInput;
    String sInput;
    int position;
    Scanner keyboard = new Scanner(System.in);

    /**
     * Declares a new Queue called q1
     */
    Queue<Integer, String> q1 = new Queue<Integer, String>();
    
    do {
      System.out.print("Command> ");
      command = keyboard.next();
      if (command.equalsIgnoreCase("empty")) {
        
        /**
         * Calls the empty function from the Queue class
         */
        System.out.println(q1.empty());
      }
      else if (command.equalsIgnoreCase("enqueue")) {
        System.out.print("Integer> ");
        iInput = keyboard.nextInt();
        System.out.print("String> ");
        sInput = keyboard.next();        

        /**
         * Calls the enqueue function from the Queue class
         */
        if (q1.enqueue(iInput, sInput) != null) {
          System.out.println("Enqueued " + iInput + ", " + sInput);
        }
        else {
          System.out.println("Failed enqueuing " + iInput + ", " + sInput);
        }
      }
      else if (command.equalsIgnoreCase("dequeue")) {

        /**
         * Calls the dequeue function from the Queue class
         */
        if (q1.dequeue() != null) {
          System.out.println("Dequeued");
        }
        else {
          System.out.println("Queue is empty.");
        }
      }
      else if (command.equalsIgnoreCase("front")) {
        
        /**
         * Calls the front function from the Queue class
         * Calls the getIData and getSData function from the Node class
         */
        
        if (q1.front() != null) {
          System.out.println(q1.front().getIData());
          System.out.println(q1.front().getSData());          
        }
        else
          System.out.println("Queue is empty.");
      }
      else if (command.equalsIgnoreCase("back")) {

        /**
         * Calls the back function from the Queue class
         * Calls the getIData and getSData functions from the Node class
         */
        if (q1.front() != null) {
          System.out.println(q1.back().getIData());
          System.out.println(q1.back().getSData());          
        }
        else
          System.out.println("Queue is empty.");
      }
      else if (command.equalsIgnoreCase("display")) {


        /**
         * Calls the display functions from the Queue class
         */
        q1.display();
      }
      else if (command.equalsIgnoreCase("exit")) {
        System.exit(0);
      }
      else {
        System.out.println("Error. Invalid command.");
      }
    } while (!command.equalsIgnoreCase("exit"));  
  }
}
