package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachchar = str.charAt(i);

            if(ch == eachchar){
                frequency++;
            }
            System.out.println(frequency);

        }
    }
}
