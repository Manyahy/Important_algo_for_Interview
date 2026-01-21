class Solution {
    public int romanToInt(String s) {
        int i, sum = 0;
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;

        for (i = 0; i < s.length(); i++) {

            // Get the current value of the Roman numeral
            int currentVal = 0;
            if (s.charAt(i) == 'I') currentVal = I;
            else if (s.charAt(i) == 'V') currentVal = V;
            else if (s.charAt(i) == 'X') currentVal = X;
            else if (s.charAt(i) == 'L') currentVal = L;
            else if (s.charAt(i) == 'C') currentVal = C;
            else if (s.charAt(i) == 'D') currentVal = D;
            else if (s.charAt(i) == 'M') currentVal = M;

            // If the next character has a higher value, subtract current value
            if (i + 1 < s.length()) {
                int nextVal = 0;
                if (s.charAt(i + 1) == 'I') nextVal = I;
                else if (s.charAt(i + 1) == 'V') nextVal = V;
                else if (s.charAt(i + 1) == 'X') nextVal = X;
                else if (s.charAt(i + 1) == 'L') nextVal = L;
                else if (s.charAt(i + 1) == 'C') nextVal = C;
                else if (s.charAt(i + 1) == 'D') nextVal = D;
                else if (s.charAt(i + 1) == 'M') nextVal = M;

                if (currentVal < nextVal) {
                    sum -= currentVal;
                } else {
                    sum += currentVal;
                }
            } else {
                // Add the last value
                sum += currentVal;
            }
        }

        return sum;
    }
}
