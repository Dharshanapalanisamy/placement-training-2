public class ReverseString {
    public static void main(String[] args) {
        String word = "Hello World";
        char[] chars = word.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) 
        {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        String reversed = new String(chars);
        System.out.println( reversed);
    }
}
