package 递归;

/**
 * @author:胡亚星
 * @createTime 2019-02-21 11:00
 * @description:
 **/
public class 二分法查找 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

    }

    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = low + ((high - low) >> 1);//(low+high)>>>1;防止溢出位移也更高效
        int midVal = arr[mid];
        if (midVal < key)
            return binarySearch(arr, mid + 1, high, key);
        else if (midVal > key)
            return binarySearch(arr, mid, high - 1, key);
        else
            return mid;//key found
    }
}
