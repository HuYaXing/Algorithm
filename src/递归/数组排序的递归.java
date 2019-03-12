package 递归;

import java.util.Arrays;

/**
 * @author:胡亚星
 * @createTime 2019-02-17 10:57
 * @description: //插入排序
 **/
public class 数组排序的递归 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 12, 5, 1, 56, 2, 41};
//        insertSort(arr, 6);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }

    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition2(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    //单向扫描法（结果肯定是主元左边比右边都小）
    public static int partition(int[] A, int p, int r) {
        int pivot = A[p];//数据源
        int sp = p + 1;//搜索指针
        int bigger = r;//右侧指针
        while (sp <= bigger) {
            if (A[sp] <= pivot) {
                sp++;
            } else {
                if (p != bigger && bigger >= 0) {
                    //交换
                    A[sp] ^= A[bigger];
                    A[bigger] ^= A[sp];
                    A[sp] ^= A[bigger];
                }
                bigger--;
            }
        }
        //数据源和bigger交换位置
        if (p != bigger && bigger >= 0) {
            A[p] ^= A[bigger];
            A[bigger] ^= A[p];
            A[p] ^= A[bigger];
        }
        return bigger;
    }

    /**
     * 双向扫描法（结果肯定是主元左边比右边都小）
     *
     * @param A
     * @param p
     * @param r
     * @return
     */
    public static int partition2(int[] A, int p, int r) {
        int pivot = A[p];//数据源
        int left = p + 1;//扫描指针
        int right = r;//右侧指针
        while (left <= right) {
            while (left <= right && A[left] <= pivot) left++;
            while (left <= right && A[right] > pivot) right--;
            if(left < right){
                A[left] ^= A[right];
                A[right] ^= A[left];
                A[left] ^= A[right];
            }
        }
        A[p] ^= A[right];
        A[right] ^= A[p];
        A[p] ^= A[right];
        return right;
    }

    /**
     * 插入排序
     *
     * @param arr
     * @param k
     */
    static void insertSort(int[] arr, int k) {
        if (k == 0) {
            return;
        }
        //对前k-1个元素排序
        insertSort(arr, k - 1);
        //将第K个元素插入到前面
        int x = arr[k];
        int index = k - 1;

        while (index > -1 && x < arr[index]) {
            arr[index + 1] = arr[index];
            index--;
        }
        arr[index + 1] = x;
    }
}
