import java.util.Scanner;

public class Mobile_phone_number_masking {
    public static void main(String[] args) {
        System.out.println("请输入一个手机号码：");
        Scanner sc=new Scanner(System.in);
        String phone_number=sc.next();
        String tem_phone_number1=phone_number.substring(0,3);
        String tem_phone_number2=phone_number.substring(7);
        String Mobile_phone_number_masking=tem_phone_number1+"****"+tem_phone_number2;
        System.out.println(Mobile_phone_number_masking);


    }
}
