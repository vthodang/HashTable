/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_hashtable;

/**
 * Linked List of students
 * @author VNHS
 */

public class StudentLinkedList {
    private Node head;
    
    
    // constructor
    public StudentLinkedList(Student student) {
        this.head = new Node(student, null);
    } 
    
    private boolean isEmpty() {
        return this.head == null;
    }
    
    // add to the head
    public void add(Student st) {
        this.head = new Node(st, head);
    }
    
    @Override
    public String toString() {
        String s = "";
        Node st = head;
        while (st != null) {
            s += st.getStudent().toString();
            st = st.getNext();
        }
        return s;
    }
    
    // search with ID in the linked list and return Student.toString if found
    public String search(int xID) {
        Node st = head;
        while (st != null) {
            if (st.getStudent().getID() == xID) {
                return st.getStudent().toString();
            } else {
                st = st.getNext();
            }
        }
        return "No student with " + xID;
    }
}

// StudentNode
class Node {
    private Student student;
    private Node next;
    
    //constructors
    public Node(Student student, Node next) {
        this.student = student;
        this.next = next;
    }
    
    //getter
    public Student getStudent() {
        return this.student;
    } 
    public Node getNext() {
        return this.next;
    }
    
}
