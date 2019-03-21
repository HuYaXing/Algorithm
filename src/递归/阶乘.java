package 递归;

/**
 * @author:胡亚星
 * @createTime 2019-03-15 20:27
 * @description:
 **/
public class 阶乘 {

    public static void main(String[] args) {
        System.out.println(f1(4));
    }

    static int f(int N) {
        int res = 1;
        for (int i = 1; i <= N; i++) {
            res *= i;
        }
        return res;
    }

    static int f1(int N) {

        if(N == 1){
            return 1;
        }

        return N * f1(N - 1);
    }

}
