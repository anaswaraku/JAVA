import java.util.Scanner;

public class twodim {
    public static void main(String args[]){
        int i,j,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the dimension of a square matrix "+"\n"+"Number of rows and columns =");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter elements");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            j=i;
            sum+=arr[i][j];
        }
        System.out.println("Sum of diagnol elements"+sum);
    }
}
