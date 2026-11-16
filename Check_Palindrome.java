public class Check_Palindrome{
    public static void main(String[] args) {
        int Original_No = 1221;
        int Copy = Original_No;
        int reverse = 0;

        while(Original_No != 0){
        int last_digit = Original_No % 10;
        reverse = reverse * 10 + last_digit;
        Original_No = Original_No / 10;
        }

        if(reverse == Copy){
            System.err.println("Palidrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }       
    }
}