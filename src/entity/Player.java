package entity;

import java.awt.Graphics2D;

import config.configs;
import render.Resource;

public class Player extends Entity implements Movable{

	public Player(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getZ() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		int startX=this.x*configs.singleWidth+configs.mapOffsetX;
		int startY=this.y*configs.singleHeight+configs.mapOffsetY;
		g2d.drawImage(Resource.player_img, startX,startY,configs.singleWidth,configs.singleHeight,null);
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}

}
