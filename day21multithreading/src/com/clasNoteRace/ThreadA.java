package com.clasNoteRace;

class ThreadA extends Thread{
   Common c;
   String name;
  public ThreadA(Common c,String name) {
	 this.c=c;
	this.name=name;
}
  int count = 0;
	@Override
	public void run() {
	c.fun1(name);
    count++;
 }
}


