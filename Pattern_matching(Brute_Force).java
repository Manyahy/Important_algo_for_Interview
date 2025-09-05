class BruteForcePattern {
    public static void main(String[] args) {
        String text = "abedabc";
        String pattern = "abc";

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            // check if first char matches
            if (text.charAt(i) == pattern.charAt(0)) {
                int k = 0;
                int j;
                for (j = i; j < i + pattern.length(); j++) {
                    if (pattern.charAt(k) != text.charAt(j)) {
                        break; // mismatch
                    }
                    k++;
                }

                // if we checked full pattern
                if (k == pattern.length()) {
                    System.out.println("Pattern found at index " + i);
                }
            }
        }
    }
}
