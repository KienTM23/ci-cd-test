package string;

public class StringUtil {
    /*
    Q. Given a string, the task is checked whether given string is palindrome or not
    Example : Given string - "madam"
    Solution : it should return - true

    Example : Given string - "that"
    Solution : it should return - false
     */
    public boolean isPanlindrom(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArray[start]!= charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        if (stringUtil.isPanlindrom("madam")){
            System.out.println("String is a palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
