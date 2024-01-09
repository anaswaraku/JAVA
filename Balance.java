package Mypack;
public class Balance {
    String name;
    double bal;
    public Balance(String n,double b){
        name=n;
        bal=b;
    }
    public void show(){
        System.out.println("--->");
        System.out.println(name+":$"+bal);
    }
public static void main(String args[]){
    Balance current[]=new Balance[3];
    current[0]=new Balance("abc", 123.23);
    current[1]=new Balance("xyz", 157.02);
    current[2]=new Balance("uvw",-12.33);
    for(int i=0;i<3;i++){
        current[i].show();
    }
}
}