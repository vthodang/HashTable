/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_hashtable;

/**
 * Hash Table to store Student as chain linked lists (10)
 * @author VNHS
 */
public class HashTable {
    private final int M = 10;
    private StudentLinkedList[] list; 
    {
        list = new StudentLinkedList[M]; // just create arrays of nulls
    }
    
    // hash function modulo M
    private int hash(int key) {
        return key % M;
    }
    
    public int getM() {
        return this.M;
    }
    
    // put a student in the table
    public void put(int xID, String name, double[] grades) {
        int index = hash(xID);
        // if the list at index is null then construct else add 
        if (list[index] == null) {
            list[index] = new StudentLinkedList(new Student(xID, name, grades));
        } else {
            list[index].add(new Student(xID, name, grades));
        }
    }
    
    // search for a student
    public String search(int xID) {
        int index = hash(xID);
        if (list[index] != null) {
            return list[index].search(xID);
        }
        return "No student with " + xID;
    }
    
    // table traverse
    public void traverse() {
        for (int i = 0; i < M; i++) {
            if (list[i] == null) {
                System.out.println("Linked list at " + i + ": The list is empty");
            } else {
                System.out.println("Linked list at " + i + ": " + list[i].toString());
            }
        }
    }
}
