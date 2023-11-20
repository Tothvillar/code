public class 复制数组 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        int[] new_arr=copyOfRange(arr,3,5);
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i]+",");
        }
    }
    public static int[] copyOfRange(int[] arr,int form,int to)
    {
        int []new_arr=new int[to-form+1];
        int j=0;
        for(int i=form;i<=to;i++)
        {
            new_arr[j]=arr[i];
            j=j+1;
        }
        return new_arr;
    }
}
