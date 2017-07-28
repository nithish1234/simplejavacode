package com.MultiThreading;

public class ClassAndImplements extends multiThread  implements Runnable{
public void run() {
	try {
int a=0;
while (a<10) {
	a++;
	System.out.println("Other class function " +a);
	Thread.sleep(1000);
}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
	System.err.println("over flow");
	}
}
public static void main(String[] args) {
	ClassAndImplements next=new ClassAndImplements();
	multiThread next1=new multiThread();
	Thread t2=new Thread(next1, "multithreading");
	Thread t3=new Thread(next,"sasasa");
	t2.start();
	t3.start();
}
}

