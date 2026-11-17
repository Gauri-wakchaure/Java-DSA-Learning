public class FindLargestElement{

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
         return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1, 33, 56, 677, 12, 90, 45};
        System.out.println("Largest Numbers is : "+getLargest(numbers));
    }
}