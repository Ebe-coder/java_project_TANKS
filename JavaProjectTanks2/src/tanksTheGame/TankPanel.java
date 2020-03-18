package tanksTheGame;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import tanksTheGame.Tank;

@SuppressWarnings("serial")
public class TankPanel extends JPanel {
	ArrayList<Tank> tanks;
	Terrain terrain;

	public TankPanel() {
		terrain = new Terrain();
		tanks = new ArrayList<Tank>();
		for (int i = 0; i < 2; i++) {
			Tank A = new Tank();
			tanks.add(A);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		terrain.draw(g);
		for (Tank b : tanks) {
			b.draw(g);
		}

	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1200, 750);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Tanks The Game");
		f.setLocation(50, 50); // standaard in de hoek van het scherm
		JPanel hoofdpaneel = new TankPanel();
		f.add(hoofdpaneel);
		f.setVisible(true);
	}
}
