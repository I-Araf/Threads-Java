class NewStart implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String args[]){
        NewStart t1=new NewStart();
        Thread t= new Thread(t1);
        t.start();
    }
}