import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine().toLowerCase();

        boolean isAnagram = checkAnagram(word1, word2);

        if (isAnagram) {
            System.out.println("Yes, They are anagrams.");
        } else {
            System.out.println("No, They are not anagrams.");
        }

        sc.close();
    }

    static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
