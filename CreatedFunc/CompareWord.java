package CreatedFunc;

import java.util.ArrayList;
import java.util.List;

public class CompareWord {
    public static void main(String[] args) {
        String w1 = "tales";
        String w2 = "kebler";

        List result = compare(w1, w2);

        System.out.println(result);
        
    }
    public static List compare(String rightWord, String tryedWord) {
        List<String> result = new ArrayList<String>();
        int length = rightWord.length();
        boolean flag = true;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(tryedWord.charAt(i)==rightWord.charAt(j)){
                    flag = false;
                    if(i==j){
                        result.add("Posição certa");
                    }else{
                        result.add("Posição errada");
                    }
                }
            }
            if(flag){
                result.add("letra errada");
            }
            flag=true;
        }

        return result;
    }
}
