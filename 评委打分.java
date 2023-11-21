import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        System.out.println("请输入打分(0~100)：");
        Scanner sc=new Scanner(System.in);
        int []arr=new int[6];
        int min=0;
        int max=0;
        for (int i = 0; i < 6; i++) {
                arr[i]= sc.nextInt();
                if(arr[i]>=0&&arr[i]<=100){
                    continue;
                }
            System.out.println("对不起，输入数字有误。");
              System.exit(-1);
        }
        min=arr[0];
        max=arr[0];
        int sum=0;
        for (int i = 0; i < 6; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println("得分为"+(sum-min-max)/4);
    }
}
