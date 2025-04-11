/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package requinajagunoscuran;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class RequinaJagunosCuran {
 static class Student {
        String name;
        double grades;

        Student(String name, double grades) {
            this.name = name;
            this.grades = grades;
        }

        public String toString() {
            return name + " - " + grades;
        }

        public static void insertionSort(Student[] arr) {
            for (int i = 1; i < arr.length; i++) {
                Student key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j].grades > key.grades) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }

        }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("How many students? ");
            int numStudent = sc.nextInt();
            sc.nextLine();
            Student[] student = new Student[numStudent];
            for(int i = 0; i < numStudent; i++){
                System.out.println("Enter details for student #" + (i + 1) + ": ");

                System.out.print("Name: ");
                String name = sc.nextLine();
                        

                System.out.print("Grade: ");
                double grades = sc.nextDouble();
                sc.nextLine();
                        
                
                student[i] = new Student(name, grades);
 
            }
                 
                insertionSort(student);
                 System.out.println();
                System.out.println("Sorted Stundents Grade (Ascending)");
                for(Student s : student){
                   System.out.println(s);
                }
        }
    }
    }
    

