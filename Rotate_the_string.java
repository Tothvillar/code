import java.util.Scanner;
public class Rotate_the_string {
    public static void main(String[] args) {
        System.out.println("请输入你要旋转的字符串:");
        Scanner SC=new Scanner(System.in);
        String A= SC.next();
        System.out.println("请输入你要旋转的次数:");
        Scanner sc=new Scanner(System.in);
        int frequency= sc.nextInt();
        String B=rotateString(A,frequency);
        System.out.println(B);
    }
    public static String rotateString(String str,int frequency)//旋转字符串
    {
        int newFrequency=frequency%str.length();
        int left=newFrequency-1;
        int right=str.length()-1;
        return revolve(revolve(str,0,left)+revolve(str,left+1,right),0,right);
    }
    public static String revolve(String str, int left, int right) {
        char[] charArray = str.toCharArray();
        int tmp1=left;
        int tmp2=right;
        while (left < right) {
            char tmp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = tmp;
            left++;
            right--;
        }
        return new String(charArray).substring(tmp1,tmp2+1);
    }
}