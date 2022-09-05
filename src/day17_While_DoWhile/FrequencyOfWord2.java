package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str= "Cat Cat Dog Dog cAt CAT caT";
        String asd= str.toLowerCase();
        int countCat= 0;
        while(asd.contains("cat")){
            asd= asd.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);
        System.out.println("-----------------------------------");
        String s = "java java java python python python";
        int countJava=0;
        int countPython=0;
        while(s.contains("java") || s.contains("python")){
            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;

            }
            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPyhton = " + countPython);
    }
}
