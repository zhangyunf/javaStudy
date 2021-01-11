public class Demo02Variable {
    public static void main(String[] args) {
        //创建变量
        //格式：变量类型  变量名称；
        int age;
        //向变量当中存入一个数据
        //格式：变量名称=数据值
        age = 18;
        System.out.println(age);
        //改变变量当中本来的数字
        age = 20;
        System.out.println(age);
        //使用一步到位，定义变量
        int num = 30;
        System.out.println(num);
        byte num1 = 100;
        short num2 = 70;
        long num3 = 800;
        dataType();
        dataType2();
    }
    //数据类型转换
    public static void dataType(){
        //int-->long符合数据范围从小到大的要求(右到左)
        long num = 100;
        System.out.println(num);
        //float-->double
        double num2 = 2.13F;
        System.out.println(num2);

    }
    public static void dataType2(){
        int num = (int)100L;
        System.out.println(num);
        int num2 = (int)6000000000L;
        System.out.println(num2);

    }

}
