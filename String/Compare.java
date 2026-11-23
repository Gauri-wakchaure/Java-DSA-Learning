public class Compare{
    public static void main(String[] args) {
        String str1 = "Gauri";
        String str2 = "Gauri";
        String str3 = new String("Gauri");

        // Compare Using "=="
        if(str1 == str2){
            System.err.println("Strings are Equal");
        }else{
            System.err.println("Strings are not Equal");
        }

        // Compare Using "equals"
        if(str1.equals(str3)){
            System.err.println("Strings are Equal");
        }else{
            System.err.println("Strings are not Equal");
        }

        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}