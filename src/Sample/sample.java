package Sample;
import java.util.Scanner;
public class sample {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] num = new int[3][3];
        System.out.print("Enter a number: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                num[i][j]=s.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();


    }
    s.close();
    }
}
