
package averagingquizgrades_5568546;
import java.util.Scanner;

/**
 *
 * @author 5568546
 * Title: Programming Challenge 1: Averaging Quiz Grades
 * Semester: COP2250 - Spring 2019
 * Lecturer's Name:  Cristy Charters
 * Description: This is a program that asks the user to enter 5 quiz grades. Those values are then stored as doubles in variables.
 * These values are then used to calculate the sum of all the grades as well as the average.
 * Finally, two sentences display all the grades to the user on one line, and another displays the average.
 * 
 */
public class AveragingQuizGrades_5568546 {
    
    /*This is a method that prompts the user to enter 5 quiz grades, stores those values as doubles in variables,
    *calculates the sum of all 5 grades, calculates their average, and finally displays each individual quiz grade
    *on one line, and on a seperate line it displays their average.

    */
    public static void calcGrades(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter quiz grade #1: ");
        double grade1 = keyboard.nextDouble();
        
        System.out.println("Enter quiz grade #2: ");
        double grade2 = keyboard.nextDouble();
        
        System.out.println("Enter quiz grade #3: ");
        double grade3 = keyboard.nextDouble();
        
        System.out.println("Enter quiz grade #4: ");
        double grade4 = keyboard.nextDouble();
        
        System.out.println("Enter quiz grade #5: ");
        double grade5 = keyboard.nextDouble();
        
        //Here the sum is calculated by adding all 5 quiz grades
        //then the average is calculated by dividing the sum by 5
        
        double quizTotals = grade1 + grade2 + grade3 + grade4 + grade5;
        double quizAverage = quizTotals / 5;
        
        //Here I am using String Interpolation to display a senteces that contains all quiz grades on one line
        String output = String.format("\nThe following quiz grades were entered: %s %s %s %s %s", grade1, grade2, grade3, grade4, grade5);
        
        System.out.println(output);
        
        //Here I am using String Interpolation to display a senteces that shows the average of the grades
        String output2 = String.format("The average of all quiz grades is: %s", quizAverage);
        
        System.out.println(output2);
        
        
        
    }

    //Here I am calling the calcGrades() method in main in order to run the program
    public static void main(String[] args) {
        
        calcGrades();
    }
    
}
