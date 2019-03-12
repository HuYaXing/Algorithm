package 位运算符;

import java.util.Arrays;
import java.util.Random;

/**
 * @author:胡亚星
 * @createTime 2019-02-13 17:36
 * @description:
 **/
public class 唯一成对的数 {
    public static void main(String[] args) {
        int N = 1001;
        int[] arr = new int[N];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i + 1;
        }
        //最后一个数是随机数
        arr[arr.length - 1] = new Random().nextInt(N-1)+1;
        System.out.println(Arrays.toString(arr));

        int x1 = 0;
        for(int i = 1;i <= N - 1;i++){
            x1 = (x1 ^ i);
        }

        for(int i = 0;i < N;i++){
            x1 = x1 ^ arr[i];
        }
        System.out.println(x1);
    }
}
