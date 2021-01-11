public class Demo03Operator {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;
        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a%b);
        String name = "zhangsan";
        String age = "18";
        System.out.println(name + age + (80 + 90));
        System.out.println(add());
    }
    public static int add(){
        int num = 0;
        for (int i = 0; i<=100; ++i){
            num += i;
        }
        return num;

    }
}
