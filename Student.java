/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_hashtable;

/**
 * Student object: ID, Name, grades
 * @author VNHS
 */
public class Student {
    private int ID;
    private String Name;
    private double[] grades;
    
    // constructors
    public Student(int ID, String Name, double[] grades) {
        this.ID = ID;
        this.Name = Name;
        this.grades = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = grades[i];
        }
    }
    
    //getters
    public int getID() {
        return this.ID;
    }
    public String getName() {
        return this.Name;
    }
    public double[] getGrades() {
        return this.grades;
    }
    
    // toString
   public String toString() {
       String s = ID + " " + Name;
       for (double grade: grades) {
           s += " " + grade;
       }
       return s + ". ";
   }
}
