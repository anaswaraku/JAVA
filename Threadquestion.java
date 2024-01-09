class Threadquestion extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String args[]){
        Threadquestion t1=new Threadquestion();
        System.out.println(("Name of Thread 't1' : "+t1.getName()));
        Threadquestion t2=new Threadquestion();
        System.out.println("Name at Thread 't2' : "+t2.getName());
        t1.setName("First Thread");
        t2.setName("Second Thread ");
        t1.start();
        t2.start();
        System.out.println("New name of thread 'T1' : "+t1.getName());
        System.out.println("New name of Thread 'T2' : "+t2.getName());
    }
    
}