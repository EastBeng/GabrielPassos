import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class tela extends JFrame {

	private JPanel contentPane;
//	private PaintComponent paintComponent;
	int x = 30;
	int y = 200;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
	

	public tela() {
		setTitle("Xavier Games");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		
		
		
		JLabel milleniumFalcon = new JLabel("");
		milleniumFalcon.setIcon(new ImageIcon(tela.class.getResource("/img/sticker.png")));
		milleniumFalcon.setBounds(35, 248, 144, 200);
		contentPane.add(milleniumFalcon);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\asteroide.png"));
		label_1.setBounds(113, 11, 259, 143);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("F:\\asteroide.png"));
		label_2.setBounds(374, 114, 236, 138);
		contentPane.add(label_2);
		
		JLabel label = new JLabel("Galaxy");
		label.setIcon(new ImageIcon("D:\\Gabriel Passos\\galaxia.jpg"));
		label.setBounds(0, 0, 866, 505);
		contentPane.add(label);

		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();

//				Exemplo 01
//				if (e.isShiftDown()){
//				      System.out.println("shift down");
//				    }
//				
//			    if (keyCode == KeyEvent.VK_LEFT)
//			      System.out.println("KeyEvent.VK_LEFT");
//			    else if (keyCode == KeyEvent.VK_RIGHT)
//			      System.out.println("KeyEvent.VK_RIGHT");
//			    else if (keyCode == KeyEvent.VK_UP)
//			      System.out.println("KeyEvent.VK_UP");
//			    else if (keyCode == KeyEvent.VK_DOWN)
//			      System.out.println("KeyEvent.VK_DOWN");
//				    

//				Exemplo 02
//			switch  (keyCode) {
//				case KeyEvent.VK_RIGHT: System.out.println("Direita");  break;
//				case KeyEvent.VK_LEFT:  System.out.println("Esquerda"); break;  							
//				case KeyEvent.VK_UP:    System.out.println("Acima");    break;
//				case KeyEvent.VK_DOWN:  System.out.println("Abaixo");   break;											
//				case KeyEvent.VK_SPACE: System.out.println("Espaço");   break;
//			}

				
			switch  (keyCode) {
				case KeyEvent.VK_RIGHT: 
					    x+=10; 
						milleniumFalcon.setBounds(x, y, 143, 200); 
					    break;
				case KeyEvent.VK_LEFT:  
					x-=10;
					milleniumFalcon.setBounds(x, y, 143, 200); 
					break;  							
				case KeyEvent.VK_UP:    
					y-=10;
					milleniumFalcon.setBounds(x,y, 143, 200); ;  break;
				case KeyEvent.VK_DOWN:  
					y+=10;
					milleniumFalcon.setBounds(x, ++y, 143, 200); ;  break;	
				case KeyEvent.VK_SPACE: 
				
					Graphics g = getGraphics();
					
					//Desenha uma linha vermelha
					paint(g,x+79, y+50 , x+79, 0, Color.GREEN);
					
					try { //Pausa de 100 ms
						Thread.sleep(100);
					} catch (InterruptedException e1) {	}
					
					//Desenha uma linha da mesma cor do fundo
					//paint(g,x+79, y+50 , x+79, 0, contentPane.getBackground() );
					label.setIcon(new ImageIcon("D:\\Gabriel Passos\\galaxia.jpg"));
						if(x >= 90 && x<= 250){
					label_1.setIcon(new ImageIcon("D:\\Gabriel Passos\\Explosion.gif"));
					}
//					if(x >= 351 && x <= 245 )
					label_2.setIcon(new ImageIcon("D:\\Gabriel Passos\\Explosion.gif"));
					
					
					break;
			}
				
				    
			}
		});

		
	}
	
	//Método para desenhar linhas
	public void paint(Graphics g,int x0,int y0,int x1,int y1, Color color ){
		g.setColor(color);
		g.drawLine(x0, y0, x1, y1);
	}
}