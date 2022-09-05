package day17_While_DoWhile;

public class JavaFromTheSentence {
    public static void main(String[] args) {
        String sentence= "Cat Dog Cat Dog";
        int frequency= 0;
        for (int i = 0; i <= sentence.length()-3; i++) {
            String eachSub = sentence.substring(i,i+3);
            if(eachSub.equals("Cat")){
                frequency++;
            }


        }
        System.out.print(frequency);
    }

}
