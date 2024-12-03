//CIE/Student.java 
package CIE; 
import java.util.Scanner; 
 
public class Student { 
    protected String usn; 
    protected String name; 
    protected int sem; 
 
    public void inputStudentDetails() { 
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter USN: "); 
        usn = s.nextLine(); 
        System.out.print("Enter Name: "); 
        name = s.nextLine(); 
        System.out.print("Enter Semester: "); 
        sem = s.nextInt(); 
    } 
 
    public void displayStudentDetails() { 
        System.out.println("USN: " + usn); 
        System.out.println("Name: " + name); 
        System.out.println("Semester: " + sem); 
    } 
} 
 
//CIE/Internals.java 
package CIE; 
import java.util.Scanner; 
 
public class Internals extends Student { 
    protected int[] internalMarks = new int[5]; 
 
    public void inputCIEmarks() { 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter Internal Marks for 5 subjects:"); 
        for (int i = 0; i < 5; i++) { 
            System.out.print("Subject " + (i + 1) + ": "); 
            internalMarks[i] = s.nextInt(); 
        } 
    } 
} 
 
//SEE/Externals.java 
package SEE; 
import CIE.Internals; 
import java.util.Scanner; 
 
public class Externals extends Internals { 
    private int[] seeMarks = new int[5]; 
    private int[] finalMarks = new int[5]; 
 
    public void inputSEEmarks() { 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter SEE Marks for 5 subjects:"); 
        for (int i = 0; i < 5; i++) { 
            System.out.print("Subject " + (i + 1) + ": "); 
            seeMarks[i] = s.nextInt(); 
        } 
    } 
 
    public void calculateFinalMarks() { 
        for (int i = 0; i < 5; i++) { 
            finalMarks[i] = internalMarks[i] + seeMarks[i]; 
        } 
    } 
 
    public void displayFinalMarks() { 
        displayStudentDetails(); 
        System.out.println("Final Marks for 5 subjects:"); 
        for (int i = 0; i < 5; i++) { 
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]); 
        } 
    } 
} 
 
//Main.java 
import SEE.Externals; 
import java.util.Scanner; 
 
class Main { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter number of students: "); 
        int n = s.nextInt(); 
 
        Externals[] students = new Externals[n]; 
 
        for (int i = 0; i < n; i++) { 
            System.out.println("\nEnter details for student " + (i + 1) + ":"); 
            students[i] = new Externals(); 
            students[i].inputStudentDetails(); 
            students[i].inputCIEmarks(); 
            students[i].inputSEEmarks(); 
            students[i].calculateFinalMarks(); 
        } 
 
        System.out.println("\nFinal Marks of Students:"); 
        for (int i = 0; i < n; i++) { 
            System.out.println("\nStudent " + (i + 1) + ":"); 
            students[i].displayFinalMarks(); 
        } 
    } 
} 