package exercise;

import java.util.ArrayList;
import java.util.Scanner;

// BEGIN
public class App{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String letterSet = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine().toLowerCase();
        System.out.println(scrabble(letterSet, word));
        }
    public static boolean scrabble(String letterSet, String word) {
        ArrayList<Character> letterList = new ArrayList<>();
        for (char letter : letterSet.toCharArray()) {
        letterList.add(letter);
        }
        for (char letter : word.toCharArray()) {
            if (!letterList.remove(Character.valueOf(letter))) {
            return false;
            }
        }
        return true;
    }

}
//END
