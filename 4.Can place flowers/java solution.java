class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
            if(flowerbed[0]==0&&n<=1) return true;
            else if(flowerbed[0]==1&&n==0) return true;
            else return false;
        }
        int count=0;
        if(flowerbed[0]==0&&flowerbed[1]==0){
            flowerbed[0]=1; count++;
        }
        for(int i=2;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
                count++;
                flowerbed[i]=1;
            }
        }
        if(flowerbed[flowerbed.length-2]==0&&flowerbed[flowerbed.length-1]==0) count++;
        return count>=n;
        
    }
}