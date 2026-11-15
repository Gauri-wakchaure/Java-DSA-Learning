public class Even_Sum{
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 15, 12, 17, 18};

        int even_sum = 0;

        for(int i = 0; i<=arr.length; i++){
            if(i % 2 == 0){
               even_sum = even_sum + i;
            }
        }
        System.out.println("Sum of Even Numbers in the Array : "+even_sum);
    }
}