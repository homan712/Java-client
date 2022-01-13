package School.Citytech.abccounter;

import java.util.Arrays;

public class ABCService {

    public static Character[] getABC(){

        Character[] abc = new Character[26];
        for (int i = 65; i < 91; i++) {
            char x = Character.valueOf((char) i );
            abc[i-65] = x;

         }
        return abc;
    }

    public static void main(String[] args) {
        var data = getABC();
        System.out.println(Arrays.toString(data));
    }
}
