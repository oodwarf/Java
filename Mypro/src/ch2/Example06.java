package ch2;

public class Example06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,a=10;
		i=a++;
		System.out.println("i="+i+"\t"+"a="+a);//i=10,a=11
		System.out.println("a="+a);//a=10+1
		i=++a;
		System.out.println("i="+i);//i=

	}

}