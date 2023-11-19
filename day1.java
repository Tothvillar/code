import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class day1 {
/*
    public static void main(String[] args) {
        System.out.println(3+2);
        System.out.println(5-1);
        System.out.println(7*9);
        System.out.println(1.1+1.0);
        System.out.println(1.1-1.0);
        System.out.println(1.1*1.01);
*/
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入一个三位数");
    int number =sc.nextInt();
/*    System.out.println("个位是：");
    System.out.println(number%10);
    System.out.println("十位是：");
    System.out.println(number/10%10);
    System.out.println("百位是：");
    System.out.println(number/100);
    */
    System.out.println("个位是："+number%10);
    System.out.println("十位是："+number/10%10);
    System.out.println("百位是："+number/100);

}
}

