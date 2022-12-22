package words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("text.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append(" ");
        }
        String text = stringBuilder.toString().replaceAll("\\p{Punct}", "");
        String[] textSplit = text.split(" ");
        int count = 0;
        for (String s : textSplit) {
            if (s.equals(args[0])) {
                count++;
            }
        }
        System.out.println("Количество вхождений слова " + "\"" + args[0] + "\"" + ": " + count);
    }
}
