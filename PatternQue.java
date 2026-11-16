public class PatternQue{
     //FLOYD'S Triangle Pattern of Numbers
    public static void main(String[] args) {
        int n = 5;
        int num1 = 1;

        for(int i = 1; i <= n; i++){
            for(int num = 1; num <= i; num++){
                System.out.print(num1+" ");
                num1++;
            }
            System.out.println();
        }
    }
}