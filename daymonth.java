import java.util.*;
public class daymonth {
    public static void main(String args[]){
        int i,m;
        System.out.println("Choose your option\nEnter 1-To get number of days in a month\n2-List of month with 30days\n3-List of month with 31 days ");
        Scanner sc = new Scanner (System.in);
        int d[]={31,28,31,30,31,30,31,31,30,30,30,31};
        String mon[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int n=sc.nextInt();
        switch(n){
            case 1:System.out.println("Enter the month(number) to get number of days");
                    m=sc.nextInt();
                    System.out.println(mon[m-1]+" has "+d[m-1]+" days");
                    break;
            case 2:System.out.println("Months with 30 days");
                    for(i=0;i<12;i++){
                        if(d[i]==30)
                             System.out.println(mon[i]);}
                    break;
            case 3:System.out.println("Months with 31 days");
                    for(i=0;i<12;i++){
                        if(d[i]==30)
                             System.out.println(mon[i]);}
                    break;
            default:System.out.println("INVALID INPUT");
        }
        
    }
    
}
