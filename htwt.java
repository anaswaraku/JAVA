import java.util.*;
public class htwt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,count=0;
        int ht[]=new int[10];
        int wt[]=new int[10];
        System.out.println("Enter the height of 10 students in cm");
        for(i=0;i<10;i++){
            System.out.print("Student"+(i+1)+"-");
            ht[i]=sc.nextInt();
        }
        System.out.println("Enter the weight of 10 students in kg");
        for(i=0;i<10;i++){
            System.out.print("Student"+(i+1)+"-");
            wt[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            if((ht[i]>160)&&(wt[i]>50)){
                count++;
        }}
        System.out.println("Number of students with height greater than 150cm and weight greater than 50kg"+count);

    }
    
}
