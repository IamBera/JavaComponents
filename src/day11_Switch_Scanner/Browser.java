package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browser = "chrome";
        String result="";
        boolean validBrowser = browser == "chrome" || browser == "firefox" || browser=="opera"|| browser=="safari"||browser=="edge";
        if(validBrowser){
            if(browser=="chrome"){
                result="Chrome Browser is selected.";
            } else if (browser=="firefox") {
                result="firefox Browser is selected.";
            }else if (browser=="opera") {
                result="opera Browser is selected.";
            }else if (browser=="safari") {
                result="safari Browser is selected.";
            }else{
                result="edge Browser is selected.";
            }
        }else{
            result = "Invalid Browser Name";
        }
        System.out.println(result);

    }
}
