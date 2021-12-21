import java.util.concurrent.locks.ReentrantLock;

public class TestAQS implements Runnable{

    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        lock.lock();


    }
}
