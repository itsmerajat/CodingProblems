package Array;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = nums1.length - 1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i-=1;
            }
            else{
                nums1[k] = nums2[j];
                j-=1;
            }
            k-=1;
        }
        while(i>=0){
            nums1[k] = nums1[i];
            i-=1;
            k-=1;
        }
        while(j>=0){
            nums1[k] = nums1[j];
            j-=1;
            k-=1;
        }
    }
    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}