package bai796;

class Solution {
    public static boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            String left = s.substring(i) + s.substring(0, i);
            if (left.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
