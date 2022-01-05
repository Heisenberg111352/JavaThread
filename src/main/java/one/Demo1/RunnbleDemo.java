package one.Demo1;

/**
 * @author zwh
 * @version V1.0
 * @Package one.Demo1
 * @date 2022/1/5 10:34
 * 1.3.2
 */
public class RunnbleDemo {
    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
        for ( int i1=0;i1<2*i;i1++){
            CountingTask task1 = new CountingTask();
            Thread task = new Thread(task1);
            task.start();
        }

    }

  static class Counter {
       private  int count=0;

       public void increment(){
           count++;
       }

       public int value(){
           return count;
       }
   }


   static  class  CountingTask implements Runnable{

       public void run() {
           for (int i=0;i<100;i++){
               Counter counter = new Counter();
               counter.increment();
           }
       }
   }

}
