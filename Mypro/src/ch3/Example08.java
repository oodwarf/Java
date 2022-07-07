package ch3;

public class Example08 {
//我国2010年国内生产总值40万亿元，若每年以12%的速度增长，问多少年后，我国国内生产总值会翻一番？
	public static void main(String[] args) {
		double g=40;
		double r=0.12;
		int n=0;
		while(g<80)
		{
			g=g*(1+r);
		}
		//有点问题，答不解意
	}

}