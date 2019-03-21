package 递归迭代;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:胡亚星
 * @createTime 2019-03-14 8:42
 * @description:
 **/
public class 全排列回溯 {

    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c'};
        getPermutationCore(arr,0);
        System.out.println(res);
    }

    static List<String> res = new ArrayList<>();

    private static void getPermutationCore(char[] arr, int k) {
        if (k == arr.length) {
            res.add(new String(arr));
            System.out.println("res"+res);
        }
        //从k位开始的每个字符，都尝试放在新排列的k这个位置
        for (int i = k ; i < arr.length; i++) {
            swap(arr, k, i);//把后面的每个字符换到k位
            getPermutationCore(arr, k + 1);//for循环中嵌套递归
            swap(arr, k, i);//回溯
        }
    }

    //交换位置
    static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
