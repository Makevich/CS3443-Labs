import java.util.*;
/**
 * @author Dusan Makevic
 */
public class Lab2{
	/**
	 * The main method uses data from the class (not from the file data.txt as it supposed to
	 * because I couldn't get it to work on that way)
	 * and shows student's information.
	 * @param args
	 */
public static void main (String[] args){

int[] grades1 = new int[] {87, 99, 96, 99, 86, 96, 77, 95, 70, 88};
int[] grades2 = new int[] {73, 78, 76, 80, 99, 96, 73, 96, 76, 78, 78, 92, 93, 75, 93};
int[] grades3 = new int[] {99, 94, 85, 99, 99, 93, 81, 95, 76, 80, 77, 79, 98, 72, 98, 97, 92};
int[] grades4 = new int[] {76, 97, 72, 92, 86, 86, 89, 85, 81, 87, 76, 80, 89};
Grades student1 = new Grades ("Alice", grades1);
Grades student2 = new Grades ("Bob", grades2);
Grades student3 = new Grades ("Camila", grades3);
Grades student4 = new Grades ("Diego", grades4);

ArrayList<Grades> students = new ArrayList<Grades>();

students.add(student1);
students.add(student2);
students.add(student3);
students.add(student4);

for (Grades s : students) {
        testGrades(s);
     }
}
/**
 * Test method with a purpose to show students information, print its name, show how many
 * grades the student has, average of his grades, maximum and minimum grade.
 * @param grades
 */
public static void testGrades(Grades grades) {
    System.out.println(grades.toString()); 
    System.out.printf("\tName:    %s\n", grades.getName());
    System.out.printf("\tLength:  %d\n", grades.length());
    System.out.printf("\tAverage: %.2f\n", grades.average());
    //System.out.printf("\tMedian:  %.1f\n", grades.median());
    System.out.printf("\tMaximum: %d\n", grades.maximum());
    System.out.printf("\tMininum: %d\n", grades.minimum());
}
}