import java.util.Scanner;

public class 判断是否是质数 {
    public static void main(String[] args) {
           System.out.println("请输入一个数");
    int sqrt=0;
    Scanner sc=new Scanner(System.in);
    int num= sc.nextInt();
        for(int i=0;true;i++){
        if((i*i)>num)
        {
            sqrt=i;
            break;
        }
    }
  for(int j=2;j<=sqrt;j++){
        if(num%j==0)
        {
            System.out.println("这个数是合数");
            break;
        }
        System.out.println("这个数是质数");

    }

}
}
