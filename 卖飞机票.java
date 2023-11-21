import java.util.Scanner;

public class 卖飞机票 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticker= sc.nextInt();
        System.out.println("请输入月份：");
        int month =sc.nextInt();
        System.out.println("请输入(0)头等舱，(1)还是经济舱：");
        int seat = sc.nextInt();
        if (month>=5&&month<=10)
        {
            if (seat==0)
            {
                System.out.println(ticker*0.9);
            }else if (seat==1){
                System.out.println(ticker*0.85);
            }else {
                System.out.println("没有这个舱位");
            }
        } else if((month>0&&month<5)||(month>=11&&month<=12)){
            if (seat==0)
            {
                System.out.println(ticker*0.7);
            }else if (seat==1){
                System.out.println(ticker*0.65);
            }else {
                System.out.println("没有这个舱位");
            }
        }else
        {
            System.out.println("无此月信息");
        }
    }
}
