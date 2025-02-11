public class TestThreads {
    public static void main(String[] args) {

        // Lambda Expression
        Thread t1 = new Thread(() -> System.out.println("T1"));
        Thread t2 = new Thread(() -> System.out.println("T2"));
        Thread t3 = new Thread(() -> System.out.println("T3"));

        try {

            t1.start();
            t2.start();
            t3.start();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
