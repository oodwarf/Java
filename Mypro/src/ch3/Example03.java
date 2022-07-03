package ch3;

public class Example03 {

	public static void main(String[] args) {
		int year=2008;
		if((year%4==0&&year%100!=0)||year%400==0)//百度对闰年的定义：四年一润，百年不闰，四百年再闰
		{
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}

}