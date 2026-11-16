public class FunctionQue1{
   public static int CalculateAvg(int a, int b, int c){
        int Avg = a+b+c/3;
        return Avg;
   }

    public static void main(String[] args) {
        int a=50, b=10, c=70;
        System.out.println(CalculateAvg(a, b, c));
    }
}