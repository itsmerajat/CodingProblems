package Array;


public class ContainerWaterFilling {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea = 0;
        while(i<j){
            maxArea = Integer.max(maxArea,Integer.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i+=1;
            }
            else{
                j-=1;
            }
        }
        return maxArea;
    }

}