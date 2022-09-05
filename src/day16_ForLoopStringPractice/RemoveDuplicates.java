package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "aabbaacc";
        String result = "";
        for(int i = 0; i < str.length() ; i++){ // i: represents the all the index numbers of str (start from 0)

               String ch= ""+str.charAt(i); // represents each Character of str

            if(!result.contains(ch)){ // if the character is not contained in the result
                result += ch;
            }

        }
        System.out.println(result);
    }
}
