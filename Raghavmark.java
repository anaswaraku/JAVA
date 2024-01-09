import java.util.*;
public class Raghavmark {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        double mark_avg;
        int result,i,s;
        System.out.println("Enter the number of students");
        s =input.nextInt();
        int[] arr=new int[s];
        for ( i=0 ; i<s;i++) {
            arr[i]=input.nextInt();
        }
        result=arr[0];
        for(i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
        //for loop to find max value in array
        for(i=0;i<s;i++){
            if(result<arr[i+1]){
                result=arr[i+1];
            }
        }
        for(i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(result);
    }
}

