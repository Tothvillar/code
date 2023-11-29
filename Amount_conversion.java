import java.util.Scanner;

public class Amount_conversion {
    public static void main(String[] args) {
        String bigNum="零壹贰叁肆伍陆柒捌玖";
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        char []tem_Arr=new char[14];
        tem_Arr[1]='佰';
        tem_Arr[3]='拾';
        tem_Arr[5]='万';
        tem_Arr[7]='仟';
        tem_Arr[9]='佰';
        tem_Arr[11]='拾';
        tem_Arr[13]='元';
        for (int i = 12; i >= 0; i-=2) {
            tem_Arr[i]=bigNum.charAt(num%10);
            num/=10;
        }
        for (int i = 0; i < tem_Arr.length; i++) {
            System.out.print(tem_Arr[i]);
        }

    }
}
