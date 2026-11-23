public class CountVowels{

    public static int countVowels(String name){
        int count = 0;

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String name = "Gauri";
        System.out.println("Count of lowercase vowels in String is : " + (countVowels(name)));

    }
}