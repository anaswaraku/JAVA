import java.util.Scanner;

class OneDarray{
    void Findmin(int Arr[]){
        int min;
        min=Arr[0];
        for(int i=0;i<Arr.length;i++){
            if(min>Arr[i])
            {
                min=Arr[i];
            }
        }
        System.out.println("The minimum element is  : "+ min);
    }
    public static void main(String args[]){
        int arr[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n=sc.nextInt();
        arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        OneDarray oneDarray = new OneDarray();
        oneDarray.Findmin(arr);
    }
    
}