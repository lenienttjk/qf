package multithreading.task3;

/**
 * @author tjk
 * @date 2019/8/10 15:23
 */
public class ThreadDemo2 extends Thread {

    private int tickets=100;
    // 定义一个static 变量，所有线程 共享
//    private static int tickets=100;

    @Override
    public void  run(){
        while (true){
            if (tickets>0){
                System.out.println(Thread.currentThread().getName()+"is selling ticket"+tickets);
                tickets=tickets-1;
            }else {
                break;
            }
        }
    }


    public static void main(String[] args) {

        // 启动4个线程，每个线程都卖100 张门票，实际打印了  400张票，
        // 没有实现 线程 信息 共享的目的
        new ThreadDemo2().start();
        new ThreadDemo2().start();
        new ThreadDemo2().start();
        new ThreadDemo2().start();

    }
}
