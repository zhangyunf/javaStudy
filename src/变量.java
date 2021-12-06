public class 变量 {

    public static void main(String[] args) {
        //定义
        definition();
        //数据类型转换
        to();
    }
    //定义
    public static void definition() {
        //创建一个变量--第一种方法
        int num1;
        num1 = 1;
        System.out.println(num1);
        //第二种方法
        int num2 = 10;
        System.out.println(num2);
        //改变变量当中本来的数字、变成新的数字
        num1 = 11;
        num2 = 12;
        System.out.println(num1);
        System.out.println(num2);

        //byte
        byte b = 12;
        System.out.println(b);
        //long
        long l = 1245L;
        System.out.println(l);
        //short
        short s = 89;
        System.out.println(s);

        //float
        float f = 1.23F;
        System.out.println(f);
        //double
        double d = 1234.98765;
        System.out.println(d);

        //char
        char c = 'a';
        System.out.println(c);

        //boolear
        boolean b1 = true;
        System.out.println(b1);

    }
    public static void to(){
        System.out.println(1024);//整数，默认int
        System.out.println(3.14);//浮点数,默认浮点数double

        long num1 = 100L;
        System.out.println(num1);

        //自动类型转换int -->long符合小到大，发生自动类型转换
        long num2 = 100;
        System.out.println(num2);


        //强制类型转换
        int num3 = (int)100L;

        System.out.println(num3);
        int num4 = (int) 6000000000L;//数据溢出
        System.out.println(num4);
        int num5 = (int) 3.14;//精度丢失
        System.out.println(num5);
    }

}
