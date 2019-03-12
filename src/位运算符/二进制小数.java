package 位运算符;

/**
 * @author:胡亚星
 * @createTime 2019-02-14 19:57
 * @description:
 **/
public class 二进制小数 {

    public static void main(String[] args) {
        double num= 0.625;
        StringBuilder sb = new StringBuilder("0.");
        while(num > 0){
            //乘2
            double r = num * 2;
            //判断整数部分
            if(r >= 1){
                sb.append("1");
                //消去整数部分
                num = r - 1;
            }else{

                sb.append("0");
                num = r;
            }

            if(sb.length() > 34){
                System.out.println("ERROR");
                return;
            }

        }

        System.out.println(sb.toString());
    }

}
