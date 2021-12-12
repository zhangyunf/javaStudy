import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

public class 运算 {
    public static void main(String[] args) {
        //四则运算
        siZeYunSuan();
        //加法
        plus();
        //自增自减
        perator();
        //赋值运算符
        perator1();
        //三元运算符
        san();
    }
    public static void siZeYunSuan(){
        int a = 10;
        int b = 20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//除
        System.out.println(3%5);//取余数
    }
    public static void plus(){
        //字符串
        String a = "abc";
        String b = "def";
        System.out.println(a + b);//连接字符串
        System.out.println(a + 10 + 20);//输出字符串
    }
    public static void perator(){
        //单独使用
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        //混合使用
        int b = 20;
        System.out.println(++b);
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b);

        //和赋值操作混合
        int c = 30;
        int r1 = --c;
        System.out.println(c);
    }
    public static void perator1(){
        int a = 10;
        System.out.println(a-=1);
        System.out.println(a+=1);
        System.out.println(a/=2);
        System.out.println(a %= 3);
    }
    public static void san(){
        int a = 9;
        int b = 19;
        System.out.println(a>b ? a - b: b - a);
    }
}
