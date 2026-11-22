import java.util.Scanner;
public class Strings{
    public static void main(String args[]){
        // Char Datatype is used to store single character
        char arr[] = {'a', 'b', 'c', 'd'};

        // String Class is used to store Name, Sentence or Word
        // Strings are Immutable
        // next() function to take only single word as an input from user
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        // nextLine() function to take sentence as an input from user
        Scanner sc1 = new Scanner(System.in);
        String line = sc1.nextLine();
        System.out.println(line);
    }
}