package three.readwrite;

/**
 * @author zwh
 * @version V1.0
 * @Package three.readwrite
 * @date 2022/1/12 14:39
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**读写锁的使用方法
 * 推荐使用场景
 * 只读操作比写操频繁的多
 * 该线程持有的时间比较长
 * */
public class ReadWriteUsage {
        private  final  ReadWriteLock rwLock = new ReentrantReadWriteLock();
        private final Lock readLock =rwLock.readLock();
        private final  Lock writeLock=rwLock.writeLock();

        public void reader(){
            readLock.lock();//申请读锁
            try {
                //在此区域读取共享变量
            }finally {
                readLock.unlock();
            }

        }

        public void writer(){
            writeLock.lock();//申请读锁
            try {
                //在此区域访问（读，写）共享变量
            }finally {
                writeLock.unlock();
            }
        }
}


