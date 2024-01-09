class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        try{
            Thread.sleep(500);}
            catch
            (InterruptedException e){
                System.out.println(e);
            }
        }
}
class RunnableExample{
    public static void main(String args[]){
        Runnable myrun1=new MyRunnable();
        Runnable myrun2=new MyRunnable();

        Thread t1=new Thread(myrun1 ,"First Thread");
        Thread t2=new Thread(myrun2 ,"Second Thread");

        t1.start();
        t2.start();
    }
}