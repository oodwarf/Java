package ch8;

 class ExceptionDemo {

	public static void main(String[] args) {
		int [] a={5,0,4,10};
		int m=100;
		for(int i=0;i<a.length;i++){
			try {
				double d=m/a [i];
			} catch (Exception e) {
				System.out.println("处理被零除的异常！");
			}finally{
				System.out.println("处理结束！");
			}
		}
		System.out.println("程序运行结束！");
	}

}
