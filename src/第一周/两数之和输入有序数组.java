package 第一周;

import java.util.Arrays;

/**
 * @author:胡亚星
 * @createTime 2019-02-16 14:34
 * @description:
 **/
public class 两数之和输入有序数组 {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    //法一
    static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return null;
    }

    //法二（快）
    //逼近算法
    public int[] twoSum2(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;

        while(low < high) {
            if(numbers[low] + numbers[high] == target) {
                return new int[] {low+1, high+1};
            } else if(numbers[low] + numbers[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return null;
    }

}
