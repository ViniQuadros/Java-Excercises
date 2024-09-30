//In an array of Strings, find the common chars among all of the strings and don't repeat
import java.util.List;
import java.util.ArrayList;

public class SameLetter {
    public static List<String> commonChars(String[] words) {
        List<String> chars = new ArrayList<String>();

        for (int i = 0; i < words[0].length(); i++) {
            Character currentChar = words[0].charAt(i);
            String charString = currentChar.toString().toLowerCase();
            boolean isCommon = true;

            for (int j = 1; j < words.length; j++) {
                if (words[j].toLowerCase().indexOf(charString) == -1) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon && !chars.contains(charString)) {
                chars.add(charString);
            }
        }

        return chars;
    }

    public static void main(String[] args) {
        String words[] = { "Cars", "Scene", "Days" };
        List<String> myChar = commonChars(words);

        for (int i = 0; i < myChar.size(); i++) {
            System.out.print(myChar.get(i) + " ");
        }
    }
}
