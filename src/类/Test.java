package 类;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author:胡亚星
 * @createTime 2019-03-03 15:21
 * @description:
 **/
public class Test {

    /**
     * 判断年份是闰年还是平年
     * Calendar c = Calendar.getInstance();
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year,2,1);//当年的3.1日
        c.add(Calendar.DAY_OF_MONTH,-1);//向前推一天
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        if(c.get(Calendar.DAY_OF_MONTH) == 29){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }
    }


}
