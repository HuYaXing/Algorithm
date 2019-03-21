package 蓝桥杯基础练习;

/**
 * @author:胡亚星
 * @createTime 2019-03-13 19:51
 * @description:
 **/
public class 动态规划求minPath {

    public static int minPath(int[][] martix) {
        if (martix == null || martix.length == 0 || martix[0] == null || martix[0].length == 0) {
            return 0;
        }
        int row = martix.length;//行
        int col = martix[0].length;//列
        int[][] dp = new int[row][col];
        //赋初值
        dp[0][0] = martix[0][0];
        //先写出第一行和第一列
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + martix[i][0];
        }
        for (int j = 1; j < col; j++) {
            dp[0][j] = dp[0][j - 1] + martix[0][j];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + martix[i][j];
            }
        }
        return dp[row - 1][col - 1];
    }

    public static void main(String[] args) {
        int[][] m = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
        System.out.println(minPath(m));
    }

}
