import java.util.Scanner;

public class Roman_numerals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        if (!checkstr(str)){
            System.out.println("输入错误");
            System.exit(-1);
        }

    }
    public static boolean checkstr(String str){
        if (str.length()>9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char tmp=str.charAt(i);
            if(tmp<'0'||tmp>'9'){
                return false;
            }
        }
        return true;
    }

}
