package 递归;

/**
 * @author:胡亚星
 * @createTime 2019-02-19 22:42
 * @description:
 **/
public class 汉诺塔 {

    public static void main(String[] args) {
        printHanoiTower(6,"A","B","C");
    }

    static void printHanoiTower(int N,String from,String to,String help){

        if(N == 1){
            System.out.println("move"+N+"from"+from+"to"+to);
            return;
        }

        printHanoiTower(N-1,from,help,to);//把前N-1个盘子放到辅助空间上
        System.out.println("move"+N+"from"+from+"to"+to);//N可以到达目标
        printHanoiTower(N-1,help,to,from);//将N-1放到目标
    }

}
