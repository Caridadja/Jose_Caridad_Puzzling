import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzle {
    public static ArrayList<Integer> PrintSum() {
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        int sum = 0;
        int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                newarr.add(arr[i]);
            }
            sum += arr[i];
        }
        System.out.println(sum);
        return newarr;
    }

    public static ArrayList<String> printNames() {
        String[] arr2 = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        ArrayList<String> newarr = new ArrayList<String>();
        Collections.shuffle(Arrays.asList(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].length() > 5) {
                newarr.add(arr2[i]);
            }
            System.out.println(arr2[i]);
        }
        return newarr;
    }

    public static void printAlphabet() {
        String[] arr3 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        Collections.shuffle(Arrays.asList(arr3));
        System.out.println("The first letter is: " + arr3[0]);
        System.out.println("The last letter is: " + arr3[arr3.length - 1]);
        if (arr3[0] == "a" || arr3[0] == "e" || arr3[0] == "i" || arr3[0] == "o" || arr3[0] == "u") {
            System.out.println("The first letter is a vowel!");
        }
    }

    public static int[] random55to100() {
        int[] arr = new int[10];
        Random randomizer = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = randomizer.nextInt(46) + 55;
        }
        return arr;
    }

    public static int[] random55to100Sorted() {
        int[] arr = random55to100();
        Arrays.sort(arr);
        System.out.println("This is the minimum value: " + arr[0]);
        System.out.println("This is the maximum value: " + arr[arr.length - 1]);
        return arr;
    }

    public static String randomString() {
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        Random randomizer = new Random();
        String str = "";
        for (int i = 0; i < 5; i++) {
            int random = randomizer.nextInt(26);
            str += alphabet[random];
        }
        return str;
    }

    public static String[] randomStringArray() {
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String[] strarr = new String[10];
        Random randomizer = new Random();
        String str = "";
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++){
                int random = randomizer.nextInt(26);
                str += alphabet[random];
                int x = str.length();
                if( x == 5){
                    strarr[i] = str;
                    str = "";
                }

            }
        }
            return strarr;
    }

    public static void main(String[] args) {
        System.out.println(PrintSum());
        System.out.println(printNames());
        printAlphabet();
        System.out.println(Arrays.toString(random55to100()));
        System.out.println(Arrays.toString(random55to100Sorted()));
        System.out.println(randomString());
        System.out.println(Arrays.toString(randomStringArray()));
    }
}
