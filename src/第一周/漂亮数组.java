package 第一周;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:胡亚星
 * @createTime 2019-02-16 15:24
 * @description:
 **/
public class 漂亮数组 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(beautifulArray2(4)));
    }


    static Map<Integer, int[]> memo;
    static int[] beautifulArray2(int N) {
        memo = new HashMap();
        return f(N);
    }

    static int[] f(int N) {
        if (memo.containsKey(N))
            return memo.get(N);

        int[] ans = new int[N];
        if (N == 1) {
            ans[0] = 1;
        } else {
            int t = 0;
            for (int x: f((N+1)/2))  // 奇数
                ans[t++] = 2*x - 1;

            for (int x: f(N/2))  // 偶数
                ans[t++] = 2*x;
        }
        memo.put(N, ans);
        return ans;
    }










//    static int[] beautifulArray(int N) {
//        int[] arr = new int[N];
//        //赋值
//        for (int i = 1; i <= N; i++) {
//            arr[i - 1] = i;
//        }
//        //对中间的每一个数判断
//        for (int k = 1; k < N - 1; k++) {
//            for (int i = 0; i < k; i++) {
//                for (int j = k + 1; j < N; j++) {
//                    if (2 * arr[k] == arr[i] + arr[j]) {//不满足条件
//                        //交换i和k对应的值
//                        int a = arr[k];
//                        arr[k] = arr[i];
//                        arr[i] = a;
//                    }
//                }
//            }
//        }
//        return arr;
//    }
}
