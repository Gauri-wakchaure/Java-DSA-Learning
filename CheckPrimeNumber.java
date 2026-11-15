public class CheckPrimeNumber{
    public static void main(String[] args) {
        int n = 7;

        if(n == 2){
            System.out.println("n is prime");
        }else{
            boolean isPrime = true;
           for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        
       if(isPrime == true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    } 
  }  
}