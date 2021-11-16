package School.Citytech.newabccounter;

public class ABCService {



    public static boolean isVowel(String input) {

        var status = input.matches("[AEIOUaeiou]");
        return status;
    }

    public static boolean isConsonant(String input) {
        var status = !isVowel(input);
        return status;
    }

    public static void main(String[] args) {
        var status = ABCService.isConsonant("X");
        System.out.println("status = " + status);
    }

    public static boolean isEven(String input) {

        var status = input.matches("^\\d*[02468]$");
        return status;
    }

    public static boolean isOdd(String input) {
        var status = !isEven(input);
        return status;
    }

    public static boolean isSix(String input) {

        var status = input.matches("^6|12|18|24|30|36|62|48|54|60|66|72|78|84|90|96$");
        return status;
    }

    public static boolean isfourNine(String input) {

        var status = input.matches("^\\d*[49]\\d*$");
        return status;


    }


    public static boolean isSixs(String input) {

        var status = input.matches("^0|30|60|90|120|150|180|210|240|270|300|330|360|390|420|450|480$");
        return status;
    }


}



