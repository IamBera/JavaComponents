package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";
        String digits = "";//12345
        String letters = "";// CydeoWoodenSpoon
        String specialChars = "";//!@#$%

        for(int i = 0 ; i < str.length(); i++){
           char ch=str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                digits += ch;
            }else if(ch >= 65 && ch <= 90 ){
                letters +=ch;
            }else if(ch >= 97 && ch <= 122){
                letters +=ch;
            }else{
                specialChars +=ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("speacialChars = " + specialChars);
    }
}
