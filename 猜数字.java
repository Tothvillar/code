
import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        Random r=new Random();
        int num= r.nextInt(100);
      num+=1;
        System.out.println("请输入数字");
      while(true){
          Scanner sc=new Scanner(System.in);
          int gress= sc.nextInt();
          if(gress<num)
          {
              System.out.println("小了");
          }else if(gress>num)
          {
              System.out.println("大了");
          } else if (gress==num) {
              System.out.println("猜对了");
              break;
          }

      }
    }
}
