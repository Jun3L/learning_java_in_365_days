//Name: Cuesta, Junel I.            //Subject: Object-Oriented Programming
//BSIT 2D1                          //Date: 06/06/2024    

package Practice;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      int pass = 0;
      int fail = 0;
      int highest = 0;
      int lowest = 0;
      int sum = 0;
      double average = 0;
    System.out.print("HOw many grades do you want to enter? ");
    int gradeSize = s.nextInt();

    int[] grades = new int[gradeSize];

    for(int i = 0; i < gradeSize; i++){
        System.out.print("Enter Grade " + (i + 1) + " : ");
        grades[i] = s.nextInt();

       if(i == 0){
           highest = grades[i];
           lowest = grades[i];
       }
       if(grades[i] > highest){
           highest = grades[i];
       }
       if(grades[i] < lowest){
           lowest = grades[i];
       }
       sum += grades[i];

       if(grades[i] >= 75){
           pass++;
       } else {
           fail++;
       }
    }
     double averageGrade = (double) sum / gradeSize;
    System.out.println("Highest Grade: " + highest);
    System.out.println("Lowest Grade: " + lowest);
    System.out.println("Average of Grades: " + averageGrade);
    System.out.println("Passing Grades: " + pass);
    System.out.println("Failing Grades: " + fail);

    s.close();
  }
}
