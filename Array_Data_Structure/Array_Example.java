import java.util.*;

public class Array_Example{
    public static void main(String args[]){
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("English : " + marks[0]);
        System.out.println("Marathi : " + marks[1]);
        System.out.println("Hindi: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");
    }
}