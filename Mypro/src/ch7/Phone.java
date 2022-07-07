package ch7;

public class Phone implements USB,Bluetooth{

	@Override
	public void wirelessTransmit() {
		System.out.println("手机蓝牙传输数据");
		
	}

	@Override
	public void transmit() {
		System.out.println("手机USB传输数据");
		
	}
	
	public static void main(String[] args){
		Phone phone=new Phone();
		phone.transmit();
		phone.wirelessTransmit();
	}
}
