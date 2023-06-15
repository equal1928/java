package leetcode;

public class Is_palindrom {
    public boolean isPalindrome(String s) {
        int x = 0;
        int y = s.length()-1;
        while (x<y){
            char head = s.charAt(x);
            char tail = s.charAt(y);
            if (!Character.isLetterOrDigit(head)){
                x++;
                continue;
            }
            if (!Character.isLetterOrDigit(tail)){
                y--;
                continue;
            }
            if (Character.toLowerCase(head) != Character.toLowerCase(tail)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
}
