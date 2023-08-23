class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        if(len1==0) return word2;
        else if(len2==0) return word1;
        int pos=0;
        StringBuffer str=new StringBuffer("");
        while(pos<=len1-1||pos<=len2-1){
            if(pos<len1){
            str.append(word1.charAt(pos));
            }
            if(pos<len2){
            str.append(word2.charAt(pos));
            }
            pos++;
        }   
        return str.toString();   
    }
}