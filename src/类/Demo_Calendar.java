package 类;

import java.util.Calendar;

/**
 * @author:胡亚星
 * @createTime 2019-03-03 14:30
 * @description:
 **/
public class Demo_Calendar {

    public static void main(String[] args) {
//        Demo1();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2000);
        c.set(2000,6,8);//月份从0开始

    }

    public static void Demo1() {
        Calendar c = Calendar.getInstance(); //父类引用指向子类对象
//        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));//年
        System.out.println(c.get(Calendar.MONTH));//月份0为起始编号的
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//月中的第几天
        System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK)));//周日为第一天，周六是最后一天
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//当前月的星期序号字段数目
    }


    /**
     * 将星期存储表中查表
     * 1.返回值类型String
     * 2.参数列表 int week
     */

    public static String getWeek(int week) {
        String[] arr = {"星期一", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        return arr[week];
    }

    /**
     * 如果是个数数字，前面补0
     * 1.返回String
     * 2.int num
     */
    public static String getNum(int num) {
        return num > 9 ? "" + num : "0" + num;
    }

}
