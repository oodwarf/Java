package TankGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/*
 * 坦克类
 * @author lanmin*/
public abstract class Tank implements GameObject {
	
	//得到坦克的碰撞矩形
	public Rectangle getRectangle(){
		return new Rectangle(x,y,w,h);
	}
	//判断坦克之间是否碰撞
	public boolean collideTank(Tank[] tanks){
		for(int i=0;i<tanks.length;i++){
			if(tanks[i]!=null&&this!=tanks[i]&&this.getRectangle().intersects(tanks[i].getRectangle())){
				return true;
			}
		}
		return false;
	}
	
	protected boolean life=true;
	//坦克的属性(带默认值)
	//坦克的位置
	protected int x=100;
	protected int y=100;
	//坦克的大小(高宽)
	private int w=50;
	private int h=50;
	//坦克的速度
	protected int speed=10;
	//坦克的外形图片
	private Image image=Toolkit.getDefaultToolkit().getImage("");
	//坦克的方法
	//构造方法重载(初始化时修改坦克的属性)
	public Tank(int x,int y,int w,int h,int speed,Image image){
		super();
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.speed=speed;
		this.image=image;
	}
	//构造方法重载(初始化时修改坦克的位置)
	public Tank(int x,int y){
		this.x=x;
		this.y=y;
	}
	////构造方法重载(不带参数，初始化时不修改属性默认值)
	public Tank(){	}
	//坦克的移动方法
	public void Move(){}
	//将坦克在窗体上画出来
	/*public void paint(Graphics g){
		g.drawImage(image, x, y, null);
	}*/
	public abstract void move(KeyEvent e);
	
	public abstract void paint(Graphics g);
	//坦克开火
	public abstract void fire();
	
}
