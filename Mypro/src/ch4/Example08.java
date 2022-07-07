package ch4;

public class Example08 {

	public static void main(String[] args) {
		int [] arr={9,8,3,5,2};
		System.out.print("冒泡排序前：");
		printArray(arr);//打印数组元素
		bubbleSort(arr);//调用排序方法
		System.out.print("冒泡排序后");
		printArray(arr);//打印数组元素
	}
	
	//定义打印数组元素的方法
	public static void printArray(int [] arr){
		for(int i=0;i<arr.length;i++){//数组下标从0开始，arr[4]=2  arr.length=5
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}

	//定义对数组排序的方法
	public static void bubbleSort(int [] arr){
		for(int i=0;i<arr.length-1;i++){//定义外层循环
			for(int j=0;j<arr.length-1;j++){//定义内层循环
				if(arr[j]>arr[j+1]){//比较相邻元素
					//交换元素
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.print("第"+(i+1)+"轮排序后：");
			printArray(arr);

		}
	}
}
