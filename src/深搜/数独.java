package 深搜;

import java.util.Scanner;

/**
 * @author:胡亚星
 * @createTime 2019-03-16 15:21
 * @description:
 **/
public class 数独 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] table = new char[9][];
        for (int i = 0; i < 9; i++) {
            table[i] = scanner.nextLine().toCharArray();
        }
        dfs(table, 0, 0);
    }

    private static void dfs(char[][] table, int x, int y) {

        if (x == 9) {
            print(table);
            System.exit(0);
        }

        if (table[x][y] == '0') {//虚位以待
            for (int k = 1; k < 10; k++) {
                if (check(table, x, y, k)) {
                    table[x][y] = (char) ('0' + k);
                    //处理下一个状态
                    dfs(table, x + (y + 1) / 9, (y + 1) % 9);
                }
            }
            table[x][y] = '0';//回溯(说明有错解)
        } else {
            dfs(table, x + (y + 1) / 9, (y + 1) % 9);
        }
    }

    static void print(char[][] a) {
        for (int i = 0; i < a.length; i++) {//第一个for循环控制着外面{}元素的个数即a.length
            for (int j = 0; j < a[i].length; j++) {//第二个for循环控制着二维数组里面{}每个元素的个数，即a[i].length
                System.out.print(a[i][j] + " ");
            }
            System.out.println();//输出换行，能表示出二维数组有几行
        }

    }

    private static boolean check(char[][] table, int i, int j, int k) {
        //检查同行和同列
        for (int l = 0; l < 9; l++) {
            if (table[i][l] == (char) ('0' + k)) return false;
            if (table[l][j] == (char) ('0' + k)) return false;
        }
        //检查小九宫格
        for (int l = (i / 3) * 3; l < (i / 3 + 1) * 3; l++) {
            for (int m = (j / 3) * 3; m < (j / 3 + 1) * 3; m++) {
                if (table[l][m] == (char) ('0' + k)) return false;
            }
        }
        return true;
    }

}
