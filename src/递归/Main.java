package 递归;

import java.util.Scanner;

/**
 * @author:胡亚星
 * @createTime 2019-02-27 11:22
 * @description:
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(f(m,n));
    }

    /**
     *
     * @param m 还鞋
     * @param n 租鞋
     * @return
     */
    static int f(int m, int n) {
        if (n > m) return 0;
        if (n == 0) return 1;
        return f(m - 1, n) + f(m, n - 1);
    }
}
