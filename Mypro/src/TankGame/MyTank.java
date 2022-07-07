package TankGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class MyTank extends Tank{
//增加方向属性，0~3分别表示方向：0上1下2左3右
	private int direction;
	private Image[] images=new Image[]{
			Toolkit.getDefaultToolkit().getImage(" "),
			Toolkit.getDefaultToolkit().getImage(" "),
			Toolkit.getDefaultToolkit().getImage(" "),
			Toolkit.getDefaultToolkit().getImage(" "),
	};
	//记录上一个位置(p碰到墙就返回到前一个未碰墙的位置)
		private int oldx;
		private int oldy;
		
		
		public MyTank(int x, int y) {
			super(x, y);
		}

		public void paint(Graphics g){
			g.drawImage(images[direction], x, y, null);
		}
		
		//方法重载
		public void move(KeyEvent e){
			oldx=x;
			oldy=y;
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				direction=0;
				y-=speed;
				break;
			case KeyEvent.VK_DOWN:
				direction=1;
				y+=speed;
				break;
			case KeyEvent.VK_LEFT:
				direction=2;
				x-=speed;
				break;
			case KeyEvent.VK_RIGHT:
				direction=3;
				x+=speed;
				break;
			case KeyEvent.VK_F:
				fire();
				default:
					break;
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
			GameWindow.addBullet(new Bullet(x,y,speed*2,direction,false));		
		}
		
}
