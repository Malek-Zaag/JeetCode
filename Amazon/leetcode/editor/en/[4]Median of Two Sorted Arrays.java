import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,  m =nums2.length;
        if ( n ==0 && m==0) return 0;
        int[] result = Arrays.copyOf(nums1, n + m);
        System.arraycopy(nums2, 0, result, n, m);
        Arrays.sort(result);
        int total= n+m;
        int middle=(n+m) /2;
        if (total == 1 ) return result[0];
        if (total % 2 == 0 ) {
            return (double) (result[middle] + result[middle - 1]) /2  ;
        }
        else return  result[middle];
    }
}
