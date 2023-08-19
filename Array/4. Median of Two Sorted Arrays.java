import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<nums1.length;i++)
        {
            merged[j]=nums1[i];
            j++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            merged[j]=nums2[i];
            j++;
        }
        Arrays.sort(merged);
        if(merged.length%2==0)
        {
            return (double)(merged[(merged.length/2)-1]+merged[merged.length/2])/2;
        }
        else
        {
            return (double)merged[merged.length/2];
        }
    }
}