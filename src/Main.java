class CurrentThreadDemo {
    public static void main(String args[]) {

        // ---- Step 1: obtain a reference to the currently executing thread ----
        // Since this is called inside main(), it returns the main thread.
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);

        // The default toString() of Thread prints: Thread[name,priority,group]
        // So initially we expect: Thread[main,5,main]
        System.out.println("  Name       : " + t.getName());
        System.out.println("  Priority   : " + t.getPriority());
        System.out.println("  ThreadGroup: " + t.getThreadGroup().getName());
        System.out.println("  Is alive?  : " + t.isAlive());   // true, we're running right now
        System.out.println();

        // ---- Step 2: rename the thread ----
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        System.out.println();

        // ---- Step 3: use sleep() inside a try/catch ----
        // sleep() is a checked-exception-throwing method, so InterruptedException
        // MUST be handled (caught or declared). This is a very common source of
        // compile errors for students, so it's worth pointing out explicitly.
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000); // pause the main thread for 1000 ms = 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println();
        System.out.println("Main thread finishing. isAlive() will become false");
        System.out.println("once main() returns and the JVM exits (if no other");
        System.out.println("non-daemon threads are still running).");
    }
}
