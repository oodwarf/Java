package TankGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Random;

public class EnemyTank extends Tank{

	private int direction;
	private Image[] images=new Image[]{
			Toolkit.getDefaultToolkit().getImage(" "),
			Toolkit.getDefaultToolkit().getImage(" "),
			Toolkit.getDefaultToolkit().getImage(" "),
			Toolkit.getDefaultToolkit().getImage(" "),
	};
	//使用一个随机对象，随机地改变方向
	private Random random=new Random();
	//记录上一个位置(p碰到墙就返回到前一个未碰墙的位置)
	private int oldx;
	private int oldy;
	
    public EnemyTank(int x, int y) {
		super(x, y);
	}
	
	//方法重写(方法名、参数、返回类型均和父类相同)
	public void paint(Graphics g){
		g.drawImage(images[direction], x, y, null);
		move(null);
	}
	
	public void move(KeyEvent e) {
		oldx=x;
		oldy=y;//随机生成一个0~1的小数
		double d=random.nextDouble();
		//5%的情况下会改变方向
		if(d>0.95){
			direction=random.nextInt(4);
		}
		switch(direction){
		case 0:
			y-=speed;
			break;
		case 1:
			y+=speed;
			break;
		case 2:
			x-=speed;
			break;
		case 3:
			x+=speed;
			break;
			default:
		}
		//前进后如果碰到边界
		if(x<=0||x>800-50||y<30||y>600-50){
			//碰到边界将位置退回到前一个记录的位置（相当于碰到墙就弹回）
			x=oldx;
			y=oldy;
		}
		//如果坦克之间发生了碰撞，则返回前一个被记录的位置
		if(collideTank(GameWindow.tanks)){
			x=oldx;
			y=oldy;
		}
	}

	@Override
	public void fire() {
		GameWindow.addBullet(new Bullet(x, y, speed*2, direction, true));
	}
	
}
