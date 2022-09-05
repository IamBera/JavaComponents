package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1="  batch  25   ";
        str1=str1.trim();
        System.out.println(str1);
        String str2= "Cydeo School";
        int n1 = str2.indexOf("h"); //indexof("h")= harfin kacinci sirada oldunugunu gösteriyor
        System.out.println("n1 = " + n1);
        int n2= str2.indexOf("ool");
        System.out.println(n2);
        String str3= "Java Programming language";
        int n3= str3.indexOf("amming");
        System.out.println(n3);
        int n4=str3.lastIndexOf("e");//lastindexof methodu en sondan bakmaya basliyor harflere
        System.out.println(n4);
        System.out.println("------------------------");
        String s = "Java Nova Cava Wawa Orange";
        int firstA= s.indexOf("a");
        int lastA= s.lastIndexOf("a");
        System.out.println(firstA);
        System.out.println(lastA);
    }
}
