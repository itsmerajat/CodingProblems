package Array;

import java.util.Arrays;

public class MaximumPointsFromCard {
    public static int maxScore(int[] cardPoints, int k) {
        int sum = Arrays.stream(cardPoints).sum();
        if (k == cardPoints.length) {
            return sum;
        }

        int subArrayLength = cardPoints.length - k;
        int minSum = sum;
        int subArraySum = Arrays.stream(Arrays.copyOfRange(cardPoints,0,subArrayLength)).sum();
        int pointer = 0;
        while(pointer<k){
            minSum = Integer.min(minSum,subArraySum);
            subArraySum-=cardPoints[pointer];
            subArraySum+=cardPoints[pointer+subArrayLength];
            pointer+=1;
        }
        minSum = Integer.min(minSum,subArraySum);
        return sum-minSum;


    }

    // Good Apprach but will few test cases will not get passed. [11,49,100,20,86,29,72]
    // public static int maxScore(int[] cardPoints, int k) {
    //     if (k == cardPoints.length) {
    //         return Arrays.stream(cardPoints).sum();
    //     }
    //     int sum = 0;
    //     int left = 0;
    //     int right = cardPoints.length - 1;
    //     boolean chooseRight = true;
    //     while (left < right && k>0) {
    //         if (cardPoints[left] > cardPoints[right])
    //             chooseRight = false;
    //         else if (cardPoints[left] < cardPoints[right])
    //             chooseRight = true;
    //         else {
    //             int templeft = left;
    //             int tempright = right;
    //             while (templeft < tempright && cardPoints[templeft] == cardPoints[tempright]) {
    //                 templeft += 1;
    //                 tempright -= 1;
    //             }
    //             if (templeft<tempright && cardPoints[templeft] > cardPoints[tempright])
    //                 chooseRight = false;
    //             else
    //                 chooseRight = true;
    //         }
    //         if(chooseRight){
    //             sum+=cardPoints[right];
    //             right-=1;
    //         }
    //         else{
    //             sum+=cardPoints[left];
    //             left-=1;
    //         }
    //         k-=1;
    //     }
    //     return sum;

    // }
    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{11,49,100,20,86,29,72},4));
    }
}