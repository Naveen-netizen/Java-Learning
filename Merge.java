public class Merge {
    public static void main(String[] args) {
        int[] arr1={1,2};
        int[] arr2={3,4};
        double ans=findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);
    }
   
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mix = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        double ans;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] >= nums2[j]) {
                mix[k] = nums2[j];
                j++;
            } else {
                mix[k] = nums1[i];
                i++;
            }
            k++;
        }
        while (i < nums1.length) {
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mix[k] = nums2[j];
            j++;
            k++;
        }
        int mid = mix.length / 2;
        if (mix.length % 2 == 0) {
            ans=(mix[mid] + mix[mid - 1]);
            return ans/2;
        } else {
            ans= mix[mid];
            return ans;
        }
    }
}
