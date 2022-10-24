import java.util.Scanner;

import javax.sound.sampled.Mixer;



public class min_max {
     public static void main(String [] args){
        System.out.println("Enter length of an array");
        Scanner sc= new Scanner(System.in);
        int inp=sc.nextInt();
        int []arry=new int [inp];
        int max=0;
        int min=0;
        System.out.println("Enter an array");

        for (int i=0;i<inp;i++){
            arry[i]=sc.nextInt();
            if (max<arry[i]){
                max=arry[i];
            }
            }
        System.out.println("an array is ");
            for (int i=0;i<inp;i++){
                if (min>arry[i] ){
                    min=arry[i];
                }
            
            System.out.print(arry[i]+" ");
           
            }
            System.out.println();
            System.out.println("max value" +" "+ max);
            System.out.println("min value" +" "+ min);
        
     }
    
}
