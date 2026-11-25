import java.util.Arrays;

public class InBuiltSorting{
    public static void printArr(int array[]){
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();
   }
    public static void main(String[] args) {

    int array[] = {5, 4, 1, 3, 2};
    Arrays.sort(array);   
    printArr(array);    

    }
}