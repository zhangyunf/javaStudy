public class 循环 {
    public static void main(String[] args) {
        xunHuan();
        //死循环
//        sXunHuan();
        //循环嵌套
        qianTao();

    }
    public static void xunHuan(){
        //求出1-100之间的偶数和

        //for循环
        int num = 0;
        for(int i = 1; i < 51; i++){
            num = num + i * 2;
        }
        System.out.println(num);

        //while循环
        int sN = 0;
        int a = 0;
        while (a <= 50){
            sN = sN + a * 2;
            a++;
        }
        System.out.println(sN);

        //do...while
        int dN = 0;
        int b = 1;
        do{
            dN = dN + b * 2;
            b++;
        }while (b <= 50);
    }
    public static void sXunHuan(){
        for(int i = 0; i < 10; ){
            System.out.println("死循环");
        }
        while (true){
            System.out.println("死循环");
        }
    }
    public static void qianTao(){
        //打印时分
        for(int h = 0; h < 24; h++){
            for(int m = 0; m <= 60; m ++){
                System.out.println(h + "点" + m + "分");
            }
        }
    }
}
