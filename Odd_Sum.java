public class Odd_Sum{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 15, 12, 17, 18};

        int odd_sum = 0;

        for(int j = 0; j<=arr.length; j++){
            if(j % 2 != 0){
               odd_sum = odd_sum + j;
            }
        }
        System.out.println("Sum of Odd Numbers in the Array : "+odd_sum);
    }
}