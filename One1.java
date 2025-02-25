class One1{
static{
System.out.println("static block called");
System.out.println("Thread.currentThread().getName():" +Thread.currentThread().getName());

System.out.println("Thread.currentThread().getPriority():"+Thread.currentThread().getPriority());

}
public static void main(String[] args){

System.out.println("One1.main called");

System.out.println("Thread.currentThread().getName():" +Thread.currentThrea--d().getName());

System.out.println(Thread.currentThread().getPriority());

}
}