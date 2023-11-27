import java.util.Scanner;

public class car_test {
    public static void main(String[] args) {
        car []arr=new car[3];
        for (int i=0;i<3;i++){
            car one=new car();
            System.out.println("请输入它的品牌:");
            Scanner sc=new Scanner(System.in);
            one.setBrand(sc.next());
            System.out.println("请输入它的价格:");
            Scanner Sc=new Scanner(System.in);
            one.setPrice(Sc.nextInt());
            System.out.println("请输入它的颜色:");
            Scanner SC=new Scanner(System.in);
            one.setColor(SC.next());
            arr[i]=one;
            System.out.println("---------------------------");
            System.out.println("请输入下一辆车");
        }
    }
}
