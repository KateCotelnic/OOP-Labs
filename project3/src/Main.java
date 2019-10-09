public class Main {
    public static void main(String[] args) {
        String string = "Hello! This is a generator for text fonts of the 'cool' variety..." +
                " I noticed people were trying to find a generator like fancy letters, but were " +
                "ending up on actual font sites rather than generators of copy-paste text like this" +
                " one. So currently this is basically a duplicate of the above, but I think I'll try" +
                " to collect a few more 'cool' text fonts, like the old enlgish one, and specialise " +
                "this a bit.";
        System.out.println(Text.CountWords(string) + " words.");
        System.out.println(Text.CountSentences(string) + " sentences.");
        int CountLetters[] = Text.CountLetters(string);
        System.out.println(CountLetters[0] + " letters: "
                + CountLetters[1] + " vowels and " + CountLetters[2] + " consonants.");
        System.out.println("The longest word is: " + Text.ReturnLongestWord(string));
        System.out.println("Top 5 often words:");
        Text.printTop5OftenWords(string);
    }
}
