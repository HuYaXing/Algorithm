package 深搜;

import java.util.Scanner;

/**
 * @author: 胡亚星
 * @createTime 2019-03-17 11:26
 * @description:
 **/
public class 部分和 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        dfs(a, k, 0);
    }

    private static void dfs(int[] a, int k, int cur) {
        if(k == 0){
            System.out.println("Yes");
            System.exit(0);
        }
        if(k < 0 || cur == a.length){
            return;
        }

        //不要cur这个参数
        dfs(a, k, cur + 1);
        dfs(a, k - a[cur], cur + 1);
    }
}
