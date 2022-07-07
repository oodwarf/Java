package TankGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Bullet implements GameObject {

	private Image img = Toolkit.getDefaultToolkit().getImage(" ");
	// 子弹的位置、速度、运动方向和大小
	private int x;
	private int y;
	private int speed;
	private int w = 7;
	private int h = 7;
	private int direction;
	private boolean isEnemy;
	private boolean life = true;

	public Bullet(int x, int y, int speed, int direction, boolean isEnemy) {
		super();
		this.x = x;
		this.y = y;
		this.speed = speed;
		// this.w = w;
		// this.h = h;
		this.direction = direction;
		this.isEnemy = isEnemy;
	}

	// 子弹的绘制
	public void paint(Graphics g) {
		g.drawImage(img, x + 23, y + 23, null);
		move();
	}

	public void move() {
		switch (this.direction) {
		case 0:
			y -= speed;
			break;
		case 1:
			y += speed;
			break;
		case 2:
			x -= speed;
			break;
		case 3:
			x += speed;
			break;
		default:
		}
		hitTanks(GameWindow.tanks);
	}

	// 得到子弹的碰撞矩形
	public Rectangle getRectangle() {
		return new Rectangle(x + 23, y + 23, w, h);
	}

	// 判断子弹是否打中敌人
	public boolean hitTanks(Tank[] tanks) {
		for (int i = 0; i < tanks.length; i++) {
			if (this.isEnemy) {
				if (tanks[i] instanceof MyTank
						&& this.getRectangle().intersects(
								tanks[i].getRectangle())) {
					System.out.println("被打中了！");
					// 添加爆炸效果
					GameWindow.addBomb(new Bomb(x, y));
					// 坦克和子弹的生命都结束
					tanks[i].life = false;
					this.life = false;
					return true;
				}
			} else {
				if (tanks[i] instanceof EnemyTank
						&& this.getRectangle().intersects(
								tanks[i].getRectangle())) {
					System.out.println("打中了！");
					// 添加爆炸效果
					GameWindow.addBomb(new Bomb(x, y));
					// 坦克和子弹的生命都结束
					tanks[i].life = false;
					this.life = false;
					return true;
				}
			}
		}
		return false;
	}

	public boolean isLife() {
		return life;
	}
	
	public void setLife(boolean life){
		this.life=life;
	}
}
