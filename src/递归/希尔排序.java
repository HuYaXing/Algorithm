package 递归;

/**
 * @author:胡亚星
 * @createTime 2019-02-21 16:28
 * @description:
 **/
public class 希尔排序 {

    public static void main(String[] args) {
        shellSort(new int[]{1});
    }

    static void shellSort(int[] arr) {
        //不断地缩小增量
        for (int interval = arr.length / 2; interval > 0; interval = interval / 2) {
            for (int i = 1; i < arr.length; i++) {
                int target = arr[i];
                int j = i - 1;
                while (j > -1 && target < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }

            }
        }


    }
}
