class ExceptionExample{
    public void arithmeticExceptionExample(){
        try{
            int num=10;
            System.out.println(num/0);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException: / by zero");
        }
    }

    public void arrayIndexOutOfBoundsExceptionExample(){
        try{
            int [] num={1,2,3,4,5};
            System.out.println(num[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds");
        }
    }

    public static void main(String args[]){
        ExceptionExample obj=new ExceptionExample();
        obj.arithmeticExceptionExample();
        obj.arrayIndexOutOfBoundsExceptionExample();
    }
}