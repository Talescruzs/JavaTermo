package CreatedFunc;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class GetWord {

    public static String getWord(int gameType) throws IOException {
        String rightWord;
        List<String> list = new ArrayList<String>();
        String file = "words.txt";
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        while(scanner.hasNextLine()){
            list.add(scanner.next().toLowerCase());
        }
        scanner.close();

        do{
            rightWord = list.get(position(list));
            System.out.println(rightWord.length());
        }while(gameType==1 && rightWord.length()!=5);

        return rightWord;
    }

    private static int position(List list) {
        Random rand = new Random();
        int upperbound = list.size();
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}
