import java.util.*;
class StringFn
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1,rev="";
        char ch;
        System.out.print("Enter a string : ");
        str=in.nextLine();
        System.out.print("Length of the string:"+str.length());
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("\nReverse of the string:"+rev+"\n");
        System.out.print("Enter string2:");
        str1=in.nextLine();
        if(str.equals(str1))
        System.out.println("Both the strings are same");
        else
        System.out.println("Concatanated String "+str.concat(str1));
    }
}