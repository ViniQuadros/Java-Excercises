//In an array of Strings, find the common chars among them
import java.util.List;
import java.util.ArrayList;

public class SameLetter {
    public static List<String> commonChars(String[] words) {
        List<String> chars = new ArrayList<String>();
        int size = 0;

        for (int i = 0; i < words[0].length(); i++) {
            for (int j = 0; j < words[size].length(); j++) {
                if (words[0].charAt(i) == words[size].charAt(j)) {
                    String myChar = String.valueOf(words[0].charAt(i));
                    chars.add(myChar);
                }
            }

            if (size == words.length - 1) {
                break;
            } else {
                size++;
            }
        }

        return chars;
    }

    public static void main(String[] args) {
        String words[] = { "Mestre", "Mestre", "Mestre", "Mestre" };

        List<String> myChar = commonChars(words);

        for (int i = 0; i < myChar.size(); i++) {
            System.out.println(myChar.get(i));
        }
    }
}
