package 类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:胡亚星
 * @createTime 2019-03-03 11:18
 * @description:
 **/
public class Demo_SimpleDateFormat {

    public static void main(String[] args) throws ParseException {
//        Demo1();
//        Demo2();
        String str = "1999年06月21日 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//日期格式化
        Date d = sdf.parse(str);
        System.out.println(d);
    }

    public static void Demo2() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//日期格式化
        System.out.println(sdf.format(d));
    }

    public static void Demo1() {
        //        DateFormat df = new DateFormat(); //抽象类不允许实例化
        //父类引用指向子类对象，右边的方法返回一个子类
//        DateFormat df = new SimpleDateFormat();
        DateFormat df = DateFormat.getDateInstance();
    }

}
