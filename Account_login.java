import java.util.Scanner;

public class Account_login {
    public static void main(String[] args) {
        String account="tothvillar";
        String password="qssss12345";
        for (int i=0;i<3;i++) {
            System.out.println("请输入你的账号：");
            Scanner sc1=new Scanner(System.in);
            String input_account=sc1.next();
            System.out.println("请输入你的密码：");
            Scanner sc2=new Scanner(System.in);
            String input_password=sc1.next();
            if(account.equals(input_account)&&password.equals(input_password))
            {
                System.out.println("密码正确");
            } else {
                System.out.println("账号或密码错误，还有"+(2-i)+"次输入密码机会");
            }
        }
    }
}
