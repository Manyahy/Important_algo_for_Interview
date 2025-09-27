//1592
class Solution {
    public String reorderSpaces(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
                count++;
            }
        }

        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        // If only one word, append all spaces at the end
        if (words.length == 1) {
            sb.append(words[0]);
            for (int i = 0; i < count; i++) {
                sb.append(" ");
            }
            return sb.toString();
        }

        int spacesBetween = count / (words.length - 1);
        int extraSpaces = count % (words.length - 1);

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) {
                for (int j = 0; j < spacesBetween; j++) {
                    sb.append(" ");
                }
            }
        }

        for (int i = 0; i < extraSpaces; i++) {
            sb.append(" ");
        }

        return sb.toString();
    }
}
