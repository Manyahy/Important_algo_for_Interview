class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String p=sb.toString();
        int i=0,j=p.length()-1;
        while(i<=j){
            if(p.charAt(i)!=p.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
