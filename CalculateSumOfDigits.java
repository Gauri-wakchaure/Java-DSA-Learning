public class CalculateSumOfDigits{

    public static int Sum(int Digit){
     int Sum = 0;
      while(Digit != 0){
            int last_Digit = Digit % 10;
            Sum = Sum + last_Digit;
            Digit = Digit / 10;
        }
         return Sum;
    }
    public static void main(String[] args) {
    
    System.out.println(Sum(1234));
    System.out.println(Sum(34278));

    }
}