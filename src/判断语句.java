import java.util.*;
import java.io.*;

public class 判断语句 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("请输入您的成绩:");
        int a = cin.nextInt();
//        ifGrade(a);
        switchGrade(a);
    }

    public static void  ifGrade(int a){
        if(a >=70){
            if(a >= 70 && a <80){
                System.out.println("您的成绩属于良好!");
            }else if(a >= 80 && a <90){
                System.out.println("您的成绩属于好!");
            }else {
                System.out.println("您的成绩属于优秀!");
            }
        }else{
            if(a >= 60 && a <70){
                System.out.println("您的成绩属于及格!");
            }else {
                System.out.println("您的成绩属于不及格!");
            }
        }
    }
    public static void switchGrade(int a){
        switch (a){
            case 10:
                System.out.println("分数是10");
                break;
            case 20:
                System.out.println("分数20");
                break;
            default:
                System.out.println("分数不是10也不是20");
                break;
        }
    }
}
