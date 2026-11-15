import java.util.Scanner;
public class PracticeExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float Total_Cost = a+b+c;
        
        System.out.println("Pencil Price : "+a);
        System.out.println("Pen Price : "+b);
        System.out.println("Eraser Price : "+c);
        System.out.println("Total Cost of All Items is : "+Total_Cost);
    }
}