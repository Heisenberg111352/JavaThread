package three.readwrite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author zwh
 * @version V1.0
 * @Package three.readwrite
 * @date 2022/1/12 14:55
 *读写锁的降级示例
 *
 * 读写锁是个可重入锁 即一个线程持有读写锁的写锁情况下可以继续获得相应的读锁
 */
public class ReadWriteLockDowngrade {
        private final ReadWriteLock rwLock= new ReentrantReadWriteLock();
        private final Lock readLock = rwLock.readLock();
        private final Lock writeLock= rwLock.writeLock();

        public void operationWithLockDowngrade(){
            boolean readLockAcquired=false;
            writeLock.lock();//申请写锁
            try {
                //对共享数据进行更新
                //...

                //当前线程在持有写锁的情况下申请读锁
                readLock.lock();
                readLockAcquired=true;
            }finally {
                writeLock.unlock();
            }
        if (readLockAcquired){
            try {
                //读取共享数据并据此执行其他操作
                //....
            }finally {
                readLock.unlock();
            }
        }else {
            //...
        }


        }
}
