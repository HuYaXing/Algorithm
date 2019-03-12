package 查找;

import java.util.Scanner;

/**
 * @author:胡亚星
 * @createTime 2019-02-26 9:14
 * @description:
 **/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 1, 9, 8, 2, 4, 7};
        //先打印输出原始数组数据
        System.out.println("原始数组数据如下：");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        //首先对数组进行排序，这里用冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //遍历输出排序好的数组
        System.out.println("经过冒泡排序后的数组：");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();//换行
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查找的数：");
        int num = input.nextInt();
        long now = System.currentTimeMillis();
        int result = binarySearch(arr, num);
        System.out.println(System.currentTimeMillis() - now + "ms");
        long now1 = System.currentTimeMillis();
        int result1 = binarySearch(arr, num);
        System.out.println(System.currentTimeMillis() - now1 + "ms");

        if (result == -1) {
            System.out.println("你要查找的数不存在……");
        } else {
            System.out.println("你要查找的数存在，在数组中的位置是：" + (result + 1));
        }
    }

    //二分查找算法
    public static int binarySearch(int[] arr, int num) {

        int low = 0;
        int upper = arr.length - 1;
        while (low <= upper) {
            int mid = (low + upper) / 2;
            if (arr[mid] < num) {
                low = mid + 1;
            } else if (arr[mid] > num) {
                upper = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    //順序查找
    public static int search(int[] a, int num) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == num){//如果数据存在
                return i;//返回数据所在的下标，也就是位置
            }
        }
        return -1;//不存在的话返回-1
    }

}
