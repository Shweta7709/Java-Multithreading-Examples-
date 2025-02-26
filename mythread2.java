/*
class Thread2 implements Runnable{
public void run(){
System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
}
public static void main(String[] args){
Thread2 t1 = new Thread2();
Thread tt1 = new Thread(t1);
tt1.start();
Thread tt2 = new Thread(t1);
tt2.start();
}
}*/
class Mythread3 extends Thread{
public void run(){
	try {
	for(int i=0;i<=10;i++) {

System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName()+"i is:"+i);
Thread.sleep(2000);
}
}
catch(InterruptedException e) {
	System.out.println("sleeping thread is interrupted"+e);
	}
}
public static void main(String[] ar){
Mythread3 t1=new Mythread3();
t1.setName("first Thread");
t1.setPriority(10);
t1.start();  //eligible to run
try {
	t1.join();
}
catch(InterruptedException e) {
	System.out.println("join failed or interrupted");
}
Mythread3 t2=new Mythread3();
t2.setName("second Thread");
//t2.setPriority(10);
t2.start();
}
}
