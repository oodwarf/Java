package TankGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Bomb implements GameObject{
	private int y;
	private int x;
	private int count=0;
	private boolean life=true;
	static Image[] imagesBomb=new Image[43];
	
	public Bomb( int x,int y) {
		super();
		this.x=x;
		this.y=y;
		// TODO 自动生成的构造函数存根
	}
	
	static{
		for(int i=0;i<imagesBomb.length;i++){
			imagesBomb[i]=Toolkit.getDefaultToolkit().getImage(" ");
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(imagesBomb[count], x, y, null);//2,靠自动重绘
		count++;
		if(count>=42){
			this.life=false;
		}
	}
	
	public boolean isLife(){
		return life;
	}
	
	public void setLife(boolean life){
		this.life=life;
	}
}
