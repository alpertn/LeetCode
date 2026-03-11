
// 10.03.26 20.33

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        String s = String.valueOf(x);
        String reverse = new StringBuilder(s).reverse().toString();

        return Integer.valueOf(s) == Integer.valueOf(reverse);
    }
}