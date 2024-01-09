class Bank{  
    int getROI() 
    {
        return 0;
    }  
}  
//Creating child classes.  
class SBI extends Bank{  
    int getROI()
    {
        return 8;
    }  
}  
  
class ICICI extends Bank{  
    int getROI()
    {
        return 7;
    }  
}  
class AXIS extends Bank{  
    int getROI()
    {
        return 9;
    }  
}  
//Test class to create objects and call the methods  
class test2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("Rate of interest of Banks");
System.out.println("SBI bank : "+s.getROI());  
System.out.println("ICICI bank : "+i.getROI());  
System.out.println("AXIS bank : "+a.getROI());  
}  
}  