//1528
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] t=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            t[indices[i]]=s.charAt(i);
        }
       StringBuilder sb=new StringBuilder();
       for(char a:t){
            sb.append(a);
       }
       return sb.toString();
    }
}
