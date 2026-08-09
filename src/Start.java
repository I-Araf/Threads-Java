class Start extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String args[]){
        Start t1=new Start();
        t1.start();
    }
}