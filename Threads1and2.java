class TestOne implements Runnable{
public void run(){

try{
for(int i=1;i<=10;i++){
System.out.println(i);
Thread.sleep(2000);
}

}
catch(InterruptedException e){
System.out.println("TestOne interrupted"+e);
}
}
}


class TestTwo implements Runnable{
public void run(){

try{
for(int i=11;i<=20;i++){
System.out.println(i);
Thread.sleep(2000);
}

}
catch(InterruptedException e1){
System.out.println("TestTwo interrupted"+e1);
}
}
}

class Threads1and2{
public static void main(String[]args){

TestOne t1=new TestOne();
Thread tt1=new Thread(t1);
tt1.start();

try{
tt1.join();
}

catch(Exception e2){
System.out.println(e2);
}
TestTwo t2=new TestTwo();
Thread tt2=new Thread(t2);
tt2.start();

}
}

