package tanksTheGame;

import java.awt.Color;
import java.awt.Graphics;

public class Terrain extends Tank {
	// terein: voorlopig rechthoek (rt)
	int lrt, brt;
	int xrt, yrt;
	Color green;

	public Terrain() {
		this.lrt = 1200;
		this.brt = 750 - (yr1 + br1);
		this.xrt = 0;
		this.yrt = yr1 + br1;
		this.green = new Color(102, 204, 0);
	}

	public void draw(Graphics g) {
		g.setColor(green);
		g.fillRect(xrt, yrt, lrt, brt);
	}

}
