#Approach:1
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length(),n2=str2.length();
        if(n1>n2){      //checking and passing first String as larger one
           return helper(str1,str2); 
        }else{
            return helper(str2,str1);
        }
    }
    public String helper(String str1,String str2){
        String res="";
        int n1=str1.length(),n2=str2.length();
        int idx=str2.length();
        while(idx>0){
            if(n1%idx!=0||n2%idx!=0) idx--; 
            else{
              int i=0;
              while(i<n1){  //Comparing first String with updated substring
                  if(!str1.substring(i,i+idx).equals(str2.substring(0,idx))){
                      break;
                  }
                  i=i+idx;
              }
              int j=0;
              while(j<n2){   //Comparing second String with updated substring
                  if(!str2.substring(j,j+idx).equals(str2.substring(0,idx))){
                      break;
                  }
                  j=j+idx;
              }
              //Checking whether we have reached at the end of both the String if, true then return the updated substring
              if(i==n1&&j==n2) return str2.substring(0,idx);
              idx--;
            }
        }
        return res;
    }
}
#Approach:2
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
