package TankGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends Frame{
//使用构造方法创建坦克对象
	static EnemyTank enemyTank1=new EnemyTank(20,20);
	static EnemyTank enemyTank2=new EnemyTank(20,120);
	static EnemyTank enemyTank3=new EnemyTank(40,60);
	
	static EnemyTank enemyTank4=new EnemyTank(40,180);
	static EnemyTank enemyTank5=new EnemyTank(100,120);
	static EnemyTank enemyTank6=new EnemyTank(100,240);
	
	static MyTank myTank=new MyTank(500, 500);
	static Tank[] tanks=new Tank[]{enemyTank1,enemyTank2,enemyTank3,enemyTank4,enemyTank5,enemyTank6,myTank};
	
	static Bullet[] bullets=new Bullet[100];
	static Bomb[] bombs=new Bomb[50];
	static int countBullets=0;
	static int countBombs=0;
	
	//加入score对象
	static Score score=new Score();
	/*Tank tank1=new Tank();
	Tank tank2=new Tank(200,200);
	Tank tank3=new Tank(400,400,50,50,10,
			Toolkit.getDefaultToolkit().getImage(" "));*/
	
	public static void main(String[] args){
		GameWindow myWindow=new GameWindow();
		myWindow.startFrame();
	}

	public void startFrame() {
		this.setSize(800,600);
		this.setVisible(true);
		new PaintThread().start();
		this.addKeyListener(new KeyBoardListener());
	}

	
	//游戏是否结束
	boolean gameover=false;
	@Override
	public void paint(Graphics g) {
		//结束时在游戏界面提示Gameover
		if(gameover){
			g.setColor(Color.black);
			g.setFont(new Font(" 宋体",Font.BOLD,50) );
			g.drawString("GameOver", 250, 300);
		}
		
		//super.paint(g);	
		for(int i=0;i<tanks.length;i++){
			tanks[i].paint(g);//多态的体现
		}
		//画出子弹
		for(int i=0;i<bullets.length;i++){
			if(bullets[i]!=null){
				bullets[i].paint(g);
			}
		}
		for(int i=0;i<bombs.length;i++){
			if(bombs[i]!=null){
				bombs[i].paint(g);
			}
	   }
	}
	
	class PaintThread extends Thread{

		@Override
		public void run() {
			//super.run();
			while (true){
				repaint();
				try {
					Thread.sleep(40);//每隔40毫秒更新（重绘）一次画面
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}	
	}
	
	
	//加入监听事件，程序可以监听键盘事件，即可实现键盘控制我方坦克
	class KeyBoardListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			myTank.move(e);
		}
	}
	//发射子弹时将生成的子弹对象加入子弹数组
	
	public static void addBullet(Bullet b){
		bullets[countBullets]=b;
		countBullets++;
		if(countBullets>=99){
			countBullets=0;
		}
	}
	
	public static void addBomb(Bomb bomb){
		bombs[countBombs]=bomb;
		countBombs++;
		if(countBombs>=49){
			countBombs=0;
		}
	}
}
