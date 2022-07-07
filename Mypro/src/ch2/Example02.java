package ch2;
public class Example02 {	
	public static void main(String[] args) {
		byte mybyte=124;    //8位
		short myshort=32624;   //16位
		int myint=45784624;      //32位
		long mylong=46789451;     //64位
		
		
		System.out.println();                          //二进制-----以0b或者0B开头，只能由数字0和1组成,理论如此,实际操作可能会有报错
		System.out.println(25);    //十进制数---默认
		System.out.println(011);   //八进制数----以0开头，数字最大为7
		System.out.println(0x11);   //十六进制数-----以0x开头(大小写均可)，数字最大为9，字母最大为f
		System.out.println(mybyte);
		System.out.println(myshort);
		System.out.println(myint);
		System.out.println(mylong);
	}
}
