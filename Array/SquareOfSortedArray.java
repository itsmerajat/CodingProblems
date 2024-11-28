package Array;
public class SquareOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int pos=0;
        while(nums[pos]<0)
            pos+=1;
        int neg = pos-1;
        int i = 0;
        while(neg>=0 && pos<nums.length){
            if(Math.abs(nums[neg])>Math.abs(nums[pos])){
                arr[i] = nums[pos]*nums[pos];
                pos+=1;
            }
            else{
                arr[i] = nums[neg]*nums[neg];
                neg-=1;
            }
            i+=1;
        }
        while(neg>=0){
            arr[i] = nums[neg]*nums[neg];
            neg-=1;
            i+=1;
        }
        while(pos<nums.length){
            arr[i] = nums[pos]*nums[pos];
            pos+=1;
            i+=1;
        }
        return arr;
    }

public static void main(String[] args){
    SquareOfSortedArray sol = new SquareOfSortedArray();
    sol.sortedSquares(new int[]{-30,10});
}
}