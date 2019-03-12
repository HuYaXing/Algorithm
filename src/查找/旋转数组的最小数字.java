package 查找;

/**
 * @author:胡亚星
 * @createTime 2019-02-27 14:45
 * @description:
 **/
public class 旋转数组的最小数字 {

    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 5, 6};
        int res = min(arr);
        System.out.println(res);
    }

    static int min(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        //考虑没有旋转这种特殊旋转
        if (arr[begin] < arr[end]) return arr[begin];
        //begin 和 end 指向相邻元素退出
        while (begin + 1 < end) {
            int mid = begin + ((end - begin) / 2);
            System.out.println("begin = " + begin);
            System.out.println("end = " + end);
            System.out.println("mid = " + mid);
            //要么左侧有序要么右侧有序
            if (arr[mid] >= arr[begin]) {//左侧有序
                begin = mid;
            } else {
                end = mid;
            }
        }
        return arr[end];
    }

    static int indexOf(String[] arr, String p) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int indexOfMid = begin + ((end - begin) >> 1);
            while (arr[indexOfMid].equals(""))
                indexOfMid++;
            if (arr[indexOfMid].compareTo(p) > 0) {
                end = indexOfMid - 1;
            } else if (arr[indexOfMid].compareTo(p) < 0) {
                begin = indexOfMid + 1;
            } else {
                return indexOfMid;
            }
        }
        return -1;
    }


}
