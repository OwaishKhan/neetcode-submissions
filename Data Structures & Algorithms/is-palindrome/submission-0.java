class Solution {
    public boolean isAlphanumericCharacter(char c){
        return (c >= 'a' && c <= 'z') ||
            (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9');
    }
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if(!isAlphanumericCharacter(c1)){
                i++;
                continue;
            }

            if(!isAlphanumericCharacter(c2)){
                j--;
                continue;
            }

            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)){
                return false ; // if both character do not match return false
            }

            i++;
            j--;
        }
        return true;
    }
}