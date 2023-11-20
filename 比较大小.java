import java.util.Scanner;

public class 比较大小 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        Scanner r=new Scanner(System.in);
        int num1= r.nextInt();
        System.out.println("请输入第二个整数：");
        Scanner R=new Scanner(System.in);
        int num2= R.nextInt();
         compare(num1,num2);
    }
    public static void compare(byte a,byte b) {
        System.out.println(a>b);
    }  public static void compare(int a,int b) {
        System.out.println(a>b);
    }  public static void compare(short a,short b) {
        System.out.println(a>b);
    }  public static void compare(long a,long b) {
        System.out.println(a>b);
    }

}
