import java.util.*;

public class reverse_array{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int data_len=sc.nextInt();
        System.out.println("enter data");
        int []ary = new int[data_len];
        for(int i=0; i<data_len; i++){
            ary[i]=sc.nextInt();
        }
        System.out.println("entered_array");
        for (int i=0; i<data_len;i++){
            System.out.print(ary[i]+" ");
        }
        System.out.println();
        System.out.println("reverse_array");
        for (int i=ary.length-1;i>=0;i--){
            System.out.print(ary[i]+" ");
        }
    }
}    