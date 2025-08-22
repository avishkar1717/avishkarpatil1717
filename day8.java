public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); 
            }
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "the sky is blue";
        String output = reverseWords(input);
        System.out.println(output);  
    }
}
