package day19_LoopPractices;

public class UnieqeCharacters {
    public static void main(String[] args) {
        String str= "aabccdeefff";
        String result= "";

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count = 0 ;//represnts the frequency of the char

            for (int i = 0; i < str.length(); i++) { //compares the character thar outer loop üicked, with each character of the string
                char each= str.charAt(i);
                if (ch == each){
                    count++;
                }
            }

            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }



        }

        System.out.println(result);

    }
}
