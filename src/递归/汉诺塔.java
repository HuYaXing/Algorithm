package 递归;

/**
 * @author:胡亚星
 * @createTime 2019-02-19 22:42
 * @description:
 **/
public class 汉诺塔 {

    public static void main(String[] args) {
        printHanoiTower(3, "A", "B", "C");
    }

    static void printHanoiTower(int N, String from, String to, String help) {

        if(N == 1){
            System.out.println(N + "from" + from + "to" + to);
            return;
        }

        //1.将N-1盘子由A放到C
        printHanoiTower(N - 1, from, help, to);
        //2.将第N个盘子由A到B
        System.out.println(N + "from" + from + "to" + to);
        //3.将前N-1个盘子从C到B
        printHanoiTower(N - 1, help, to, from);
    }

}
