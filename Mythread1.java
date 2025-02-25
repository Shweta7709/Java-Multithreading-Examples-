class Mythread1 extends Thread{
public void run(){
try{
for(int i=0;i<=10;i++){
System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName()+" i is :"+i);
Thread.sleep(2000);
}
}
catch(InterruptedException e){
System.out.println("Sleeping Thread is interrupted"+e);
}
}
public static void main(String[]args){
Mythread1 t1=new Mythread1();
t1.setName("First Thread");
t1.setPriority(10);
t1.start();
Mythread1 t2=new Mythread1();
t2.setName("Second Thread");
t2.start();
}

}