package tanksTheGame;

import java.awt.Color;
import java.awt.Graphics;

public class Tank {
	// rupsbanden: in afgeronde rechthoek (r1)
	int lr1, br1;
	int xr1, yr1; // de y-coordinaat is dezelfde voor de rechthoek en de twee cirkels
	int alr1, abr1;
	Color darkGrey;
	// middenstuk van de tank: rechthoek (r2)
	int lr2, br2;
	int xr2, yr2;
	Color oliveGreen;
	// bovenstuk van de tank: halve cikel (c1)
	int xc1, yc1;
	int R1, R2;
	Color black;

	public Tank() {
		this.black = new Color(0, 0, 0);
		// specifieke waarden voor afgeronde rechthoek r1
		this.lr1 = 100;
		this.br1 = 30;
		this.xr1 = 40;
		this.yr1 = 600;
		this.alr1 = 30;
		this.abr1 = 30;
		this.darkGrey = new Color(105, 105, 105);
		// specifieke waarden voor rechthoek r2
		this.lr2 = lr1 - 30;
		this.br2 = br1 - 12;
		this.xr2 = xr1 + (lr1 - lr2) / 2;
		this.yr2 = (yr1 - br2);
		this.oliveGreen = new Color(85, 107, 47);
		// specifieke waarden voor halve cirkel c3
		this.R1 = (3 * lr2 / 4);
		this.R2 = (lr2 / 2);
		this.xc1 = xr2 + ((lr2 - R1) / 2);
		this.yc1 = (yr2) - ((R2) / 2);

	}

	// hier tekenen we de tanks
	public void draw(Graphics g) {
		g.setColor(darkGrey);
		g.fillRoundRect(xr1, yr1, lr1, br1, abr1, alr1);
		g.setColor(black);
		g.drawRoundRect(xr1, yr1, lr1, br1, abr1, alr1);
		g.setColor(oliveGreen);
		g.fillRect(xr2, yr2, lr2, br2);
		g.setColor(black);
		g.drawRect(xr2, yr2, lr2, br2);
		g.setColor(oliveGreen);
		g.fillOval(xc1, yc1, R1, R2);
		g.setColor(black);
		g.drawArc(xc1, yc1, R1, R2, 0, 180);
	}

}
