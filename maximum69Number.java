//1323
class Solution {
    public intm maximum69Number(int num) {
        // Convert the number to a char array
        char[] chars = String.valueOf(num).toCharArray();

        // Change the first '6' to '9'
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break; // Only one change allowed
            }
        }

        // Convert back to integer
        return Integer.parseInt(new String(chars));
    }
}
