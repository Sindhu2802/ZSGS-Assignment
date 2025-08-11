
import java.util.LinkedList;
import java.util.Queue;
/*Day-12 Assignment Questions:
 1. Write a Java program to demonstrate multi-threading by extending the Thread class.--->Create a class MyThread that extends Thread.--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds 
between prints.--->In the main() method, create two objects of MyThread and start them.--->Each thread prints its message independently, showing concurrent execution.
 2. Write a Java program to create a thread using the Runnable interface.--->Create a class TaskRunner that implements Runnable.--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.--->The console should reflect the concurrent execution of both tasks.
 3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. 
Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
 4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. 
Use synchronization to avoid race conditions and display the final value.
 5. Implement a basic producer-consumer problem using wait() and notify().--->Producer thread should add items to a shared buffer.--->Consumer thread should remove items.
 Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM, where you create threads to check the 
PIN, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.*/

 /*1. Write a Java program to demonstrate multi-threading by extending the Thread class.--->Create a class MyThread that extends Thread.--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds 
between prints.--->In the main() method, create two objects of MyThread and start them.--->Each thread prints its message independently, showing concurrent execution.*/

class MyThread extends Thread{
	MyThread(String name)
	{
		super(name);
	}
	public void run(){
		for(int i=1;i<=5;i++)
		{
			System.out.println(getName() + " " + i);
			try{
				Thread.sleep(300);
			}
			catch(Exception e)
			{
			}
		}
	}
}

class MultiThread{
	public static void main(String[] args)
	{
		 new MyThread("sindhu").start();
         new MyThread("veni").start();
    }
}

/*sindhu 1
veni 1
sindhu 2
veni 2
sindhu 3
veni 3
veni 4
sindhu 4
veni 5
sindhu 5*/



/*2. Write a Java program to create a thread using the Runnable interface.--->
Create a class TaskRunner that implements Runnable.--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.--->
The console should reflect the concurrent execution of both tasks.*/

class TaskRunner implements Runnable {
	private String taskName;
	
	public TaskRunner(String taskName) {
        
		this.taskName = taskName;
   
   }
   
   public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + taskName + "  iteration " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

 class RunnableExam {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskRunner("Task 1"), "Thread-1");
        Thread t2 = new Thread(new TaskRunner("Task 2"), "Thread-2");

        t1.start();
        t2.start();
    }
}
/*Thread-2 Task 2  iteration 1
Thread-1 Task 1  iteration 1
Thread-1 Task 1  iteration 2
Thread-2 Task 2  iteration 2
Thread-2 Task 2  iteration 3
Thread-1 Task 1  iteration 3
Thread-1 Task 1  iteration 4
Thread-2 Task 2  iteration 4
Thread-2 Task 2  iteration 5
Thread-1 Task 1  iteration 5
*/


/*3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. 
Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).*/

class Print {
    int number = 1;

    public synchronized void oddPrint() {
        while (number <= 20) {
            if (number % 2 == 0) { // If even, wait
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Odd number: " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void evenPrint() {
        while (number <= 20) {
            if (number % 2 != 0) { // If odd, wait
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Even number: " + number);
                number++;
                notify();
            }
        }
    }
}
class EvenOdd{
    public static void main(String[] args) {
        Print print = new Print();

        Thread t1 = new Thread(() -> print.oddPrint());
        Thread t2 = new Thread(() -> print.evenPrint());

        t1.start();
        t2.start();
    }
}

/*
Odd number: 1
Even number: 2
Odd number: 3
Even number: 4
Odd number: 5
Even number: 6
Odd number: 7
Even number: 8
Odd number: 9
Even number: 10
Odd number: 11
Even number: 12
Odd number: 13
Even number: 14
Odd number: 15
Even number: 16
Odd number: 17
Even number: 18
Odd number: 19
Even number: 20*/


/*4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. 
Use synchronization to avoid race conditions and display the final value.*/

class Counter {
    private int count = 0;

    // synchronized method to avoid race condition
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterTask implements Runnable {
    private Counter counter;

    public CounterTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

 class SharedCounterExam {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterTask(counter));
        Thread t2 = new Thread(new CounterTask(counter));
        Thread t3 = new Thread(new CounterTask(counter));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

//Final Counter Value: 3000


/*5. Implement a basic producer-consumer problem using wait() and notify().--->Producer thread should add items to a shared buffer.--->Consumer thread should remove items.
 Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM, where you create threads to check the 
PIN, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.*/


class Buffer {
    private final LinkedList<Integer> list = new LinkedList<>();
    private final int capacity = 5;
    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) {
            wait(); 
        }
        list.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); 
    }
    public synchronized void consume() throws InterruptedException {
        while (list.isEmpty()) {
            wait(); 
        }
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notifyAll(); 
	}
}
class ProducerConsumerMain{
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread producer = new Thread(() -> {
            int value = 1;
            try {
                for(int i=0; i<10; i++){
                    buffer.produce(value++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                for(int i=0; i<10; i++){
                    buffer.consume();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producer.start();
        consumer.start();
    }
}
/*
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Produced: 4
Consumed: 3
Produced: 5
Consumed: 4
Produced: 6
Produced: 7
Consumed: 5
Produced: 8
Consumed: 6
Produced: 9
Produced: 10
Consumed: 7
Consumed: 8
Consumed: 9
Consumed: 10*/

/* Use Threads to implement the ATM, where you create threads to check the
PIN, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.*/
class ATM {
    private double balance = 7000;
    public void checkPin() {
        System.out.println("Checking PIN...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("PIN Verified!");
    }
    public void withdraw(double amount) {
        System.out.println("Withdrawing amount: " + amount);
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        balance -= amount;
        System.out.println("Amount withdrawn successfully!");
    }
    public void checkBalance() {
        System.out.println("Checking balance...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Remaining Balance: " + balance);
    }
    public void printReceipt() {
        System.out.println("Printing receipt...");
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("Receipt Printed. Thank you!");
    }
}
class ATMThreadMain{
    public static void main(String[] args) throws InterruptedException {
        ATM atm = new ATM();
        Thread pinThread = new Thread(() -> atm.checkPin());
        Thread withdrawThread = new Thread(() -> atm.withdraw(1500));
        Thread balanceThread = new Thread(() -> atm.checkBalance());
        Thread receiptThread = new Thread(() -> atm.printReceipt());
        pinThread.start();
        pinThread.join();  
        withdrawThread.start();
        withdrawThread.join(); 
        balanceThread.start();
        balanceThread.join(); 
        receiptThread.start();
        receiptThread.join(); 
    }
}

/*
Checking PIN...
PIN Verified!
Withdrawing amount: 1500.0
Amount withdrawn successfully!
Checking balance...
Remaining Balance: 5500.0
Printing receipt...
Receipt Printed. Thank you!*/
