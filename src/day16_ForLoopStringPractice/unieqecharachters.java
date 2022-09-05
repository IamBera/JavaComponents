package day16_ForLoopStringPractice;

public class unieqecharachters {
    public static void main(String[] args) {
        String str ="aaabccc";
        String result="";


        for( int i=0; i < str.length() ; i++){
            char ch= str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){// if the first and last index numbers of the charachter same, then is unieqe
                result += ch;
            }

        }
        System.out.println(result);
    }
}
