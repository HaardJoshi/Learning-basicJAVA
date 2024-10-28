/** @author: Hard Joshi
* @version: 22.10.2024
*/

import java.util.*;

// Node class to represent each element in linked list
class Node{
    int data; // data stored in the node
    Node next; // reference to the next node

    //constructor to create a new node
    public Node(int data)
    {
        this.data = data;
        this.next = null; // next node is set to null by default
    }
}
// Linkedlist class to manage the linked list
public class linkedList
{
    
    Node first; //head of the linked list

    // constructor to initialise linked list
    public linkedListSelf()
    {
        this.first = null;
    }

    // method to add a new node
    public void append(int data)
    {
        Node newNode = new Node(data); // create a new node

        // if the list is empty, make this the new head
        if(first == null)
        {
            first = newNode;
        }else
        {
        // if the list is not empty, add the new node to the end of the linked list
        //traversing to the end of the node
        Node current = first;
        while (current.next != null) 
        {
            current = current.next;
        }

        // link the last node to the new node
        current.next = newNode;
        }
    }

    // method to print the data in the linked list
    public void printMe()
    {
        Node current = first;
        
        if(first == null)
        {
            System.out.println("The list is empty!");
            return;
        }

        System.out.println("The linked list is: " + "\n");
        // traverse through the list and print each element
        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        // message to mrk the end of the list
        System.out.println("Null" + "\n");
    }

    // method to print ana element at specific index
    public void printSpecificdata(int index)
    {
        // check if the list is empty
        if(first == null)
        {
            System.out.println("The list is empty.");
            return;
        }else
        {
            // traverse to the index
            Node current = first;
            int counter = 0;
            while( current != null)
            {
                if(counter == index)
                {
                    System.out.println("The element at Index " + index + " is: " + current.data);
                    return;
                }
                current = current.next;
                counter++;
            }
            System.out.println("Index out of bounds !");
        }
    }

    // method to delete any element
    public void deleteElement(int element)
    {
        Node current = first;
        Node previous = null; //creating a null node to keep track of previous nodes while traversing
        
        if(first == null)
        {
            System.out.println("The list is empty.");
            return;
        }

        //if the node to be deleted id the head node
        if(element == first.data)
        {
            first = first.next; // assigning the next node as the head/first node
            return;
        }

        //traverse to the element
        while(current != null && current.data != element)
        {
            previous = current; //keep track of previous node
            current = current.next; // move onto next node
        }

        //if the element is not there
        if(current == null)
        {
            System.out.println("Node with value: " + element + " not found.");
            return;
        }
        
        //changing the address of the previous node's next address pointer
        previous.next = current.next;
    }

    // main method to test the linked list implementation
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner(System.in); //initiating the kbd scanner to get user input
        linkedListSelf linkedList = new linkedListSelf();

        // starting the program
        System.out.println("--- WELCOME TO THE LINKED LIST PROGRAM ! ---");

        //asking user to specify the number of elements they want in the linked list
        System.out.println("How many elements would to like to have in your linked list ?");
        int numElements = kbd.nextInt();

        //asking the user to populate the linked list
        System.out.println("You wish to have " + numElements + " in your linked list.");
        System.out.println("Let's start inserting the values !!");

        //user input for all the elements
        for(int i=0; i< numElements; i++)
        {
            System.out.print("Enter Element " + (i+1) + ":");
            int value = kbd.nextInt();
            linkedList.append(value);
        }

        //printing the linked list
        System.out.println("Thanks for your patience! The list we have ended up with is as follows :");
        linkedList.printMe();

        //printing element at given index
        System.out.println("Please enter the index for the element you want to print: ");
        int index = kbd.nextInt();
        linkedList.printSpecificdata(index);

        //deleting the given element
        System.out.println("Please enter the element you would like to DELETE: ");
        int element = kbd.nextInt();
        linkedList.deleteElement(element);
        System.out.println("The element has been deleted SUCCESSFULLY! ");
        linkedList.printMe();

        //end message
        System.out.println("Thank you for using the LINKED LIST program!!");
        kbd.close();
    }
}
