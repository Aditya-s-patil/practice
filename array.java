import java.util.*;

public class array{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int i=sc.nextInt();
        int[] marks =new int[i];
       for (int a =0; a<i;a++){
        marks[a]=sc.nextInt();
       }
       for (int a=0; a<i;a++){
        System.out.println(marks[a]);
       }
    }
}