package ch3;

public class Example21 {
//输出九九乘法表
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){//每一次的循环j的值都是从1开始，直到j大于i时，跳出循环；i自增，再次进入j的循环
				System.out.print(i+"*"+j+"="+(j*i)+"\t");//j在前还是i在前，只会觉得九九乘法表的排列顺序
			}
			System.out.println();
		}
	}

}

