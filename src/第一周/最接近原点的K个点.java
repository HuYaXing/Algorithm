package 第一周;

import java.util.Arrays;

/**
 * @author:胡亚星
 * @createTime 2019-02-16 14:56
 * @description:
 **/
public class 最接近原点的K个点 {

    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        System.out.println(kClosest(points,2));
    }

    static int[][] kClosest(int[][] points, int K) {
        int[][] result = new int[K][];//放最后的结果
        int[] arr = new int[points.length];//各个点的距离

        for(int i = 0;i < points.length;i++){
            arr[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }

        int[] count = new int[K];
//        for(int i = 0;i < arr.length){
//
//        }

        for(int i = 0;i < K;i++){
            result[i] = points[0];
        }
        return result;
    }


    /**
     * 解决方案
     */
    static int[][] kClosest2(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        //算出每个点的距离
        for (int i = 0; i < N; ++i)
            dists[i] = dist(points[i]);

        //排序
        Arrays.sort(dists);
        int distK = dists[K-1];//第K大的数

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < N; ++i)
            if (dist(points[i]) <= distK)//找到第K大到第1大的数字
                ans[t++] = points[i];
        return ans;
    }

    static int dist(int[] point) {//距离
        return point[0] * point[0] + point[1] * point[1];
    }

}
