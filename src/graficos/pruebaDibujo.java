package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class pruebaDibujo {
	
	public static void main(String[] args) {
		MarcoConColor miMarco=new MarcoConColor();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}

/*class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		setTitle("prueba de Dibujo");
		setSize(400,400);
		LaminaColor miLamina=new LaminaColor();
		add(miLamina);
	}
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double centroX = rectangulo.getCenterX();
		double centroY =rectangulo.getCenterY();
		double radio = 126.5;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX,centroY,centroX+radio,centroY+radio);
		g2.draw(circulo);
		
		
		//g.drawArc(50, 100, 100, 200, 120, 150);
	}
}
*/

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		setTitle("Prueba con colores");
		setSize(400,400);
		LaminaConColor miLamina=new LaminaConColor();
		add(miLamina);
		
		miLamina.setBackground(SystemColor.window);
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		//Dibujo rectangulo
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse= new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(109,172,59).darker().brighter());
		
		g2.fill(elipse);
	}
}