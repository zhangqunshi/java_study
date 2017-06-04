package com.nastation.c16;

class CloneMe  implements Cloneable{
	int i;

	public CloneMe(Integer ii) {
		i = ii;
	}

	public void increment() {
		i++;
	}

	public String toString() {
		return Integer.toString(i);
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class CloneTest {

	public static void change(CloneMe me) throws CloneNotSupportedException {
		CloneMe m = (CloneMe)me.clone();
		m.increment();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMe one = new CloneMe(2);
		change(one);
		System.out.println("one=" + one);

	}

}
