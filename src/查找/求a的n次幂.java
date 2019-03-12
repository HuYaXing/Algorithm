package 查找;

/**
 * @author:胡亚星
 * @createTime 2019-02-27 15:38
 * @description:
 **/
public class 求a的n次幂 {

    public static void main(String[] args) {
//        int res = pow(2,10);
//        System.out.println(res);
//        System.out.println(Math.pow(2,10));
//        String str = "1 2 3";
//        String[] arr = str.split(" ");
        String str = "/upload/1375520190219.jpg,";
//        str = str.
    }

    static int pow(int a, int n) {
        if (n == 0) return 1;
        int res = a;
        int ex = 1;
        while ((ex << 1) <= n) {
            res = res * res;
            ex <<= 1;//乘以2
        }
        //差n-ex次方没有乘到结果去
        return res * pow(a, n - ex);
    }
}
