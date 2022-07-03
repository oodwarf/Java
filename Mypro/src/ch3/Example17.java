package ch3;

public class Example17 {
//输出1~10之间不能被3整除的数
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i%3==0){//满足条件，遇到continue就继续本次循环，不满足则跳出循环
				continue;
			}
			System.out.println(i);
		}
//如果在某次循环体的执行中，执行了continue语句，那么本次循环结束，即不再执行本次循环中continue语句后面的语句，而进行下一次循环
	}

}
