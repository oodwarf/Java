package ch4;

public class Example05 {
//多维数组的定义
	//数组类型[][] 数组名;
	//数据类型 数组名[][];
	//数据类型[] 数组名[];
	public static void main(String[] args) {
		int arr1[]={0,1,2,3,4,5,6,7,8,9};
		int arr2[]={0,0,0,0,0,0,0,0,0,0};
		System.arraycopy(arr1, 0, arr2, 0, 5);//从数组1的0，复制到数组2的0处，复制的元素个数为5
		System.out.println("arr2:");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr2[i]+"");
		}
	}//数组赋值

}

