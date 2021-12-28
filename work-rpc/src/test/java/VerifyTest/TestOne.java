package VerifyTest;

public class TestOne {
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final TestOne test = new TestOne();
        for(int i=0;i<10;i++){
            new Thread(() -> {
                for(int j=0;j<100;j++)
                    test.increase();
            }).start();
        }

        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}

