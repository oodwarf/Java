package TankGame;

import java.util.Scanner;

import ch8.InputException;

public class TankGame {

	public static void main(String[] args) {

		//游戏参数的表示//游戏窗体的大小（单位像素）
		final int WINDOW_WIDTH=800;
		final int WINDOW_HEIGHT=800;
		final float PI=3.1415926F;
		//坦克的存储
		//10辆坦克的速度
	//	int[] speed=new int[]{10,10,10,20,20,10,10,10,20,20};
		//10辆坦克的生命
	//	boolean[] isLive=new boolean[10];//默认都是false
		//坦克的方向
	//	float[] direction=new float[10];//默认都是0.0F
		//坦克的位置
		int [][] location=new int[10][2];
		for(int i=0;i<location.length;i++){
			//location[i][0]=i 60;//坦克位置x的坐标
			//location[i][1]=i 50;//坦克位置y的坐标
		}
		
		//坦克的位置
		int x=0;
		int y=0;
		//坦克的大小（高宽）
		int w=50;
		int h=50;
		//坦克的速度（一帧的前进距离）
		int speed=10;
		//坦克的生命（是否活着）
		boolean isLive=true;
		//坦克的方向
		float direction=PI/4;
		//参数计算
		//子弹速度是坦克的两倍
		int booleanSpeed=speed*2;
		//坦克位置的计算
		System.out.println("坦克当前的位置:x=" + x + "y="+ y);
		//坦克向右横向运动一帧时的位置变化
		System.out.println("坦克向右横向运动一帧");
		x=x+speed;
		System.out.println("坦克当前位置:x1="+x+"y1="+y);
		//坦克向下纵向运动一帧时的位置变化
		System.out.println("坦克向下纵向运动一帧");
		y+=speed;
		System.out.println("坦克当前位置:x2="+x+"y2"+y);
		//坦克斜向45度运动一帧时的位置变化
		System.out.println("坦克斜向45度运动一帧");
		x+=speed;Math.cos(direction);///待定，没有“；”，语法报错，晚点查错a
		//+=会自动转型（float转为int）y+=speed Math.sin(directiion);
		//自动、强制转换
		System.out.println("坦克当前的位置:x3="+x+"y3="+y);
	//	start();
	}
	
	//程序开始
	public static void start() throws InputException{
		boolean exit=false;
		showHeader();
		showMenu();
		showFooter();
		Scanner scanner=new Scanner(System.in);
		while(!exit){
			int choice=scanner.nextInt();
			switch(choice){
			case 1:
				startGame();
				//启动图形界面
				System.out.println("启动图形界面......");
				//......
				GameWindow myWindow=new GameWindow();
				myWindow.startFrame();
				break;
			case 2:
				choosePass();
				showMenu();//重新进入菜单
				break;
			case 3:
				choosePlayer();
				showMenu();
				break;
			case 4:
				try {
					endGame();
					exit=true;
				} catch (InputException e) {
					// TODO: handle exception
					e.printStackTrace();
				//	e.toString();
				}
				showMenu();
				break;
			}
		}
	}
	public static void showMenu(){
		System.out.println("\t1.开始游戏");
		System.out.println("\t2.关卡选择");
		System.out.println("\t3.玩家选择");
		System.out.println("\t4.退出游戏");
		System.out.println("\t请选择(1-4)");
	}
//
	public static void showHeader(){
		System.out.println("欢迎进入坦克大战游戏");
		System.out.println("*******************************************");
	}
//
	public static void showFooter(){
		System.out.println("                                            ");
		System.out.println("长沙职业技术学院版权所有©2015-2020");
	}
	public static void startGame(){
		System.out.println("游戏开始！");
	}
	public static void choosePass(){
		System.out.println("请选择关卡：");
		Scanner scanner=new Scanner(System.in);
		System.out.println("\t1.第一关");
		System.out.println("\t2.第二关");
		System.out.println("\t3.第三关");
		int pass=scanner.nextInt();
	}
	
	public static void choosePlayer(){
		System.out.println("请选择玩家：");
		Scanner scanner=new Scanner(System.in);
		System.out.println("\t1.1P");
		System.out.println("\t2.2P");
		int player=scanner.nextInt();
	}
	
	public static void endGame() throws InputException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("游戏结束！");
		System.out.println("请输入玩家名称");
		String name=scanner.nextLine();
		System.out.println("请输入玩家年龄");
		int age=0;
		try {
			age=scanner.nextInt();
		} catch (Exception e) {
			System.out.println("请输入正确的年龄");
			e.printStackTrace();
		}
		
		if(age<=0||age>100){
			throw new InputException(name,age);
		}
		
		//打印坦克的信息
		for(int i=0;i<10;i++){
			System.out.println("第"+i+"坦克的速度："+"speed[i]");
			System.out.println("第"+i+"坦克的生命："+"(isLive[i]?'活':'死')");
			System.out.println("第"+i+"坦克的方向："+"direction[i]");
			System.out.println("第"+i+"坦克的x："+"location[i][0]");
			System.out.println("第"+i+"坦克的y："+"location[i][1]");
		}
	}
}
