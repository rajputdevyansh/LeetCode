class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length+1;i++)
        {
            if(flowerbed[i-1]==1 && flowerbed[i+1]==1)
            {
                count=0;
            }
            else{
                count+=1;
            }
        }
        if(count==n)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{ 1,0,0,0,1 };
        int n=1;
        canPlaceFlowers(arr,n);
    }
}