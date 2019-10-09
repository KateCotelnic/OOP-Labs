import com.sun.jdi.Value;

import java.util.*;


public class Text {
    public static int CountWords(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        if (str.charAt(0) != ' ') {
            return count + 1;
        }
        return count;
    }

    public static int CountSentences(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (((str.charAt(i) == '.') && (str.charAt(i - 1) != '.'))
                    || (str.charAt(i) == '!') || (str.charAt(i) == '?')) {
                count++;
            }
        }
        return count;
    }

    public static int[] CountLetters(String str) {
        int LettersCount = 0;
        int VowelsCount = 0;
        int ConsonantsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((((int) str.charAt(i) > 64) && ((int) str.charAt(i) < 91))
                    || (((int) str.charAt(i) > 96) && ((int) str.charAt(i) < 123))) {
                LettersCount++;
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                    VowelsCount++;
                } else ConsonantsCount++;
            }
        }
        return new int[]{LettersCount, VowelsCount, ConsonantsCount};
    }
//
//    public static int CountVowels (String str){
//        int LettersCount = 0;
//        int VowelsCount = 0;
//        int ConsonantsCount = 0;
//
//        for(int i=0; i< str.length(); i++){
//            if((((int)str.charAt(i)>64) && ((int)str.charAt(i)<91))
//                    || (((int)str.charAt(i)>96) && ((int)str.charAt(i)<123))){
//                LettersCount++;
//                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
//                        || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='y'){
//                    VowelsCount++;
//                }
//                else ConsonantsCount++;
//            }
//        }
//        return new int[] {LettersCount, VowelsCount, ConsonantsCount};
//    }
//
//    public  static

    public static String ReturnLongestWord(String str) {
        String[] word = str.split("\\W+");
        String longWord = word[0];
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > longWord.length())
                longWord = word[i];
        }
        return longWord;
    }

    public static void printTop5OftenWordsRightful(String str) {
        String[] word = str.split("\\W+");
        HashMap<String, Integer> meetWord = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (meetWord.containsKey(word[i])) {
                int current = meetWord.get(word[i]);
                meetWord.put(word[i], current + 1);
            } else {
                meetWord.put(word[i], 1);
            }
        }
        // System.out.println(Arrays.asList(meetWord));
        for (int k = 0; k < 5; k++) {
            System.out.println(k + 1 + " place:");
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (Integer m : meetWord.values()) {
                al.add(m);
            }
            int max = 0;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i) > max) {
                    max = al.get(i);
                }
            }
            //   System.out.println("max = " + max);
            Iterator iterator = meetWord.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry map = (Map.Entry) iterator.next();
                if (map.getValue().equals(max)) {
                    //          System.out.println("yes");
                    System.out.println(map.getKey() + " " + map.getValue());
                    iterator.remove();
                }
            }
        }
    }

    public static void printTop5OftenWords(String str) {
        String[] word = str.split("\\W+");
        HashMap<String, Integer> meetWord = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (meetWord.containsKey(word[i])) {
                int current = meetWord.get(word[i]);
                meetWord.put(word[i], current + 1);
            } else {
                meetWord.put(word[i], 1);
            }
        }
        int count = 0;
        // System.out.println(Arrays.asList(meetWord));
        for (int k = 0; k < 5; k++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (Integer m : meetWord.values()) {
                al.add(m);
            }
            int max = 0;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i) > max) {
                    max = al.get(i);
                }
            }
            //   System.out.println("max = " + max);
            Iterator iterator = meetWord.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry map = (Map.Entry) iterator.next();
                if (map.getValue().equals(max)) {
                    //          System.out.println("yes");
                    System.out.println(map.getKey() + " (" + map.getValue() + " times)");
                    count++;
                    iterator.remove();
                    if (count == 5)
                        break;
                }
            }
            if (count == 5)
                break;
        }
    }
}
