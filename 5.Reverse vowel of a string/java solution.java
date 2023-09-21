class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        if(s.length()<=1) return s;
        int i=0,j=s.length()-1;
        while(i<j){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
            ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                while(i<j){
                    char ch1=s.charAt(j);
                    if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||
                      ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
                           char temp = charArray[i];
                           charArray[i] = charArray[j];
                           charArray[j] = temp;
                           j--;
                           break;
                      }else{
                          j--;
                      }
                 }
                 i++;
            }else{
                i++;
            }
        }
        return new String(charArray);
    }
}