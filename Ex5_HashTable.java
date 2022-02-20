/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_hashtable;

import java.util.Scanner;

/**
 * Main Menu of the Program
 * @author VNHS
 */
public class Ex5_HashTable {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashTable t = new HashTable();
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("*** Nhập tác vụ ***");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Hiện sinh viên");
            System.out.println("3. Tìm sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Tác vụ (1/2/3): ");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> StudentInput(t);
                case 2 -> t.traverse();
                case 3 -> StudentSeek(t);
                case 0 -> exit = true;
            }
        }
        
    }
    
    private static void StudentInput(HashTable t) {
        System.out.println();
        Scanner inp = new Scanner(System.in);
        System.out.print("Mời bạn nhập số sinh viên: ");
        int n = inp.nextInt();
        inp.nextLine();  // read the remain enter of the input line
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String s = inp.nextLine();
            // break student information for a row
            String[] st = s.split(" ");
            int xID = Integer.parseInt(st[0]);
            String name = st[1];
            double[] grades = new double[st.length - 2]; // grades
            for (int j = 0; j < grades.length; j++) {
                grades[j] = Double.parseDouble(st[j + 2]);
            }
            // put the row to hash table
            t.put(xID, name, grades);
        }
        System.out.println("End of Input.");
        System.out.println();
    }

    private static void StudentSeek(HashTable t) {
        System.out.print("Nhập mã ID sinh viên cần tìm: ");
        Scanner input = new Scanner(System.in);
        int xID = input.nextInt();
        System.out.println("Output: " + t.search(xID));
    }
}
