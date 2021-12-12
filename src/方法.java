public class 方法 {
    public static void main(String[] args) {
        //定义一个方法，用来判断两个数字是否相同
        boolean re = compare(10, 10);
        System.out.println(re);
        //求出1-100之间的和
        System.out.println(sum());


        //方法重载
        System.out.println(sumDouble(10, 12, 12, 89));

        /*
        重载练习
        定义一个方法
         */
    }
    public static boolean compare(double a, double b){
        return a == b;
    }
    private static int sum(){
        int num = 0;
        for(int i = 1; i < 101; i++){
            num += i;
        }
        return num;
    }

    public static int sumDouble(int a, int b){
        return a + b;
    }
    public static int sumDouble(int a, int b, int c){
        return a + b + c;
    }
    public static int sumDouble(int a, int b, int c, int d){
        return a + b + c + d;
    }

}
