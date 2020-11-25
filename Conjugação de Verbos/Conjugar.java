import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.TextArea;
import javax.swing.SwingConstants;
import java.awt.Label;

public class Conjugar {

	private JFrame frame;
	private JTextField txtVerbo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conjugar window = new Conjugar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conjugar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1023, 933);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPresente = new JLabel("Presente");
		lblPresente.setBounds(10, 105, 55, 16);
		frame.getContentPane().add(lblPresente);
		
		txtVerbo = new JTextField();
		txtVerbo.setText("Estudar");
		txtVerbo.setBounds(10, 35, 114, 20);
		frame.getContentPane().add(txtVerbo);
		txtVerbo.setColumns(10);
		
		TextArea textAreaPresente = new TextArea();
		textAreaPresente.setBounds(10, 127, 156, 214);
		frame.getContentPane().add(textAreaPresente);
		
		TextArea textAreaPassado = new TextArea();
		textAreaPassado.setBounds(172, 127, 156, 214);
		frame.getContentPane().add(textAreaPassado);
		
		TextArea textAreaPassadop = new TextArea();
		textAreaPassadop.setBounds(335, 127, 156, 214);
		frame.getContentPane().add(textAreaPassadop);
		
		TextArea textAreaPassadom = new TextArea();
		textAreaPassadom.setBounds(494, 127, 156, 214);
		frame.getContentPane().add(textAreaPassadom);
		
		TextArea textAreaFuturoi = new TextArea();
		textAreaFuturoi.setBounds(656, 127, 156, 214);
		frame.getContentPane().add(textAreaFuturoi);
		
		TextArea textAreaFuturop = new TextArea();
		textAreaFuturop.setBounds(816, 127, 156, 214);
		frame.getContentPane().add(textAreaFuturop);
		
		TextArea textAreaPresentes = new TextArea();
		textAreaPresentes.setBounds(10, 418, 156, 214);
		frame.getContentPane().add(textAreaPresentes);
		
		TextArea textAreaPreterito = new TextArea();
		textAreaPreterito.setBounds(172, 418, 156, 214);
		frame.getContentPane().add(textAreaPreterito);
		
		TextArea textAreaFuturos = new TextArea();
		textAreaFuturos.setBounds(335, 418, 156, 214);
		frame.getContentPane().add(textAreaFuturos);
		
		TextArea textAreaImperativoa = new TextArea();
		textAreaImperativoa.setBounds(548, 418, 156, 214);
		frame.getContentPane().add(textAreaImperativoa);
		
		TextArea textAreaImperativon = new TextArea();
		textAreaImperativon.setBounds(710, 418, 156, 214);
		frame.getContentPane().add(textAreaImperativon);
		
		
		JButton btnConjugar = new JButton("Conjugar");
		
		btnConjugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tamanho = txtVerbo.getText().length();
				String terminadoEm = txtVerbo.getText().substring(tamanho-2, tamanho);
				String radical = txtVerbo.getText().substring(0, tamanho-2);
				
				//==================== MODO INDICATIVO ====================//
				switch (terminadoEm) {
					case "ar":{
						//Estudar
						textAreaPresente.setText("1º Conjugação \n" +
								"Presente do Indicativo. \n"+
								"Eu  "+radical+"o  \n"+
								"Tu  "+radical+"as \n"+
								"Ele "+radical+"a \n"+
								"Nós "+radical+"amos \n"+
								"Vós "+radical+"ais \n"+
								"Eles " + radical+"am");
						
						textAreaPassado.setText("1º Conjugação \n" +
								"Pretérito imperfeito do Indicativo. \n"+
								"Eu  "+radical+"ava \n"+
								"Tu  "+radical+"avas \n"+
								"Ele "+radical+"ava \n"+
								"Nós "+radical+"ávamos\n"+
								"Vós "+radical+"áveis\n"+
								"Eles " + radical+"avam");
						
						textAreaPassadop.setText("1º Conjugação \n" +
								"Pretérito perfeito do Indicativo. \n"+
								"Eu  "+radical+"ei \n"+
								"Tu  "+radical+"aste \n"+
								"Ele "+radical+"ou \n"+
								"Nós "+radical+"amos \n"+
								"Vós "+radical+"astes \n"+
								"Eles " + radical+"aram"); 
						
						textAreaPassadom.setText("1º Conjugação \n" +
								"Pretérito mais-que-perfeito do Indicativo. \n"+
								"Eu  "+radical+"ara \n"+
								"Tu  "+radical+"aras \n"+
								"Ele "+radical+"ara \n"+
								"Nós "+radical+"áramos \n"+
								"Vós "+radical+"áreis \n"+
								"Eles " + radical+"aram"); 
						
						textAreaFuturoi.setText("1º Conjugação \n" +
								"Futuro do presente do Indicativo. \n"+
								"Eu  "+radical+"arei \n"+
								"Tu  "+radical+"arás \n"+
								"Ele "+radical+"ara \n"+
								"Nós "+radical+"aremos \n"+
								"Vós "+radical+"areis \n"+
								"Eles " + radical+"arão"); 
						
						textAreaFuturop.setText("1º Conjugação \n" +
								"Futuro pretérito do Indicativo. \n"+
								"Eu  "+radical+"aria \n"+
								"Tu  "+radical+"arias \n"+
								"Ele "+radical+"aria \n"+
								"Nós "+radical+"aríamos\n"+
								"Vós "+radical+"aríeis \n"+
								"Eles " + radical+"ariam"); 
						
					}break;
	
					case "er":{
						
						textAreaPresente.setText("2º Conjugação \n" +
								"Presente do indicativo \n"+
								"Eu  "+radical+"o \n"+
								"Tu  "+radical+"es \n"+
								"Ele "+radical+"e \n"+
								"Nós "+radical+"emos \n"+
								"Vós "+radical+"eis \n"+
								"Eles " + radical+"em");
						
						textAreaPassado.setText("2º Conjugação \n" +
								"Pretérito imperfeito do Indicativo. \n"+
								"Eu  "+radical+"ia \n"+
								"Tu  "+radical+"ias \n"+
								"Ele "+radical+"ia \n"+
								"Nós "+radical+"íamos\n"+
								"Vós "+radical+"íeis\n"+
								"Eles " + radical+"iam");
						
						textAreaPassadop.setText("2º Conjugação \n" +
								"Pretérito perfeito do Indicativo. \n"+
								"Eu  "+radical+"i \n"+
								"Tu  "+radical+"este \n"+
								"Ele "+radical+"eu \n"+
								"Nós "+radical+"emos \n"+
								"Vós "+radical+"estes \n"+
								"Eles " + radical+"eram"); 
						
						textAreaPassadom.setText("2º Conjugação \n" +
								"Pretérito mais-que-perfeito do Indicativo. \n"+
								"Eu  "+radical+"era \n"+
								"Tu  "+radical+"eras \n"+
								"Ele "+radical+"era \n"+
								"Nós "+radical+"êramos \n"+
								"Vós "+radical+"êreis \n"+
								"Eles " + radical+"eram");
						
						textAreaFuturoi.setText("2º Conjugação \n" +
								"Futuro do presente do Indicativo. \n"+
								"Eu  "+radical+"erei \n"+
								"Tu  "+radical+"erás \n"+
								"Ele "+radical+"erá \n"+
								"Nós "+radical+"eremos \n"+
								"Vós "+radical+"ereis \n"+
								"Eles " + radical+"erão"); 
						
						textAreaFuturop.setText("2º Conjugação \n" +
								"Futuro pretérito do Indicativo. \n"+
								"Eu  "+radical+"eria \n"+
								"Tu  "+radical+"erias \n"+
								"Ele "+radical+"eria \n"+
								"Nós "+radical+"eríamos\n"+
								"Vós "+radical+"eríeis \n"+
								"Eles " + radical+"eriam"); 
						
						
						
						
					}break;
	
					case "ir":{
						
						textAreaPresente.setText("3º Conjugação \n" +
								"Presente do indicativo \n"+
								"Eu  "+radical+"o \n"+
								"Tu  "+radical+"es \n"+
								"Ele "+radical+"e \n"+
								"Nós "+radical+"imos \n"+
								"Vós "+radical+"is \n"+
								"Eles " + radical+"em");
						
						textAreaPassado.setText("3º Conjugação \n" +
								"Pretérito imperfeito do Indicativo. \n"+
								"Eu  "+radical+"ia \n"+
								"Tu  "+radical+"ias \n"+
								"Ele "+radical+"ia \n"+
								"Nós "+radical+"íamos \n"+
								"Vós "+radical+"íeis \n"+
								"Eles " + radical+"iam");
						
						textAreaPassadop.setText("3º Conjugação \n" +
								"Pretérito perfeito do Indicativo. \n"+
								"Eu  "+radical+"i \n"+
								"Tu  "+radical+"iste \n"+
								"Ele "+radical+"iu \n"+
								"Nós "+radical+"iamos \n"+
								"Vós "+radical+"istes \n"+
								"Eles " + radical+"iram"); 
						
						textAreaPassadom.setText("3º Conjugação \n" +
								"Pretérito mais-que-perfeito do Indicativo. \n"+
								"Eu  "+radical+"ira \n"+
								"Tu  "+radical+"iras \n"+
								"Ele "+radical+"ira \n"+
								"Nós "+radical+"íramos \n"+
								"Vós "+radical+"íreis \n"+
								"Eles " + radical+"iram");
						
						textAreaFuturoi.setText("3º Conjugação \n" +
								"Futuro do presente do Indicativo. \n"+
								"Eu  "+radical+"irei \n"+
								"Tu  "+radical+"irás \n"+
								"Ele "+radical+"irá \n"+
								"Nós "+radical+"iremos \n"+
								"Vós "+radical+"ireis \n"+
								"Eles " + radical+"irão"); 
						
						textAreaFuturop.setText("3º Conjugação \n" +
								"Futuro pretérito do Indicativo. \n"+
								"Eu  "+radical+"iria \n"+
								"Tu  "+radical+"irias \n"+
								"Ele "+radical+"iria \n"+
								"Nós "+radical+"iríamos \n"+
								"Vós "+radical+"iríeis \n"+
								"Eles " + radical+"iriam"); 
						
						
						
						
						
					}break;
				}
			
				//==================== MODO SUBJUNTIVO ====================//
				
				switch (terminadoEm) {
				case "ar":{
					textAreaPresentes.setText("1º Conjugação \n" +
							"Presente do Subjuntivo. \n"+
							"Que Eu  "+radical+"e  \n"+
							"Que Tu  "+radical+"es \n"+
							"Que Ele "+radical+"e \n"+
							"Que Nós "+radical+"emos \n"+
							"Que Vós "+radical+"eis \n"+
							"Que Eles " + radical+"em");
					
					textAreaPreterito.setText("1º Conjugação \n" +
							"Pretérito imperfeito do Subjuntivo. \n"+
							"Se Eu  "+radical+"asse  \n"+
							"Se Tu  "+radical+"asses \n"+
							"Se Ele "+radical+"asse \n"+
							"Se Nós "+radical+"ássemos \n"+
							"Se Vós "+radical+"ásseis \n"+
							"Se Eles " + radical+"assem");
					
					textAreaFuturos.setText("1º Conjugação \n" +
							"Futuro do Subjuntivo. \n"+
							"Quando Eu  "+radical+"ar  \n"+
							"Quando Tu  "+radical+"ares \n"+
							"Quando Ele "+radical+"ar \n"+
							"Quando Nós "+radical+"armos \n"+
							"Quando Vós "+radical+"ardes \n"+
							"Quando Eles " + radical+"arem");
					
				}break;

				case "er":{
				
					textAreaPresentes.setText("2º Conjugação \n" +
							"Presente do Subjuntivo. \n"+
							"Que Eu  "+radical+"a  \n"+
							"Que Tu  "+radical+"as \n"+
							"Que Ele "+radical+"a \n"+
							"Que Nós "+radical+"amos \n"+
							"Que Vós "+radical+"ais \n"+
							"Que Eles " + radical+"am");
					
					textAreaPreterito.setText("2º Conjugação \n" +
							"Pretérito imperfeito do Subjuntivo. \n"+
							"Se Eu  "+radical+"esse  \n"+
							"Se Tu  "+radical+"esses \n"+
							"Se Ele "+radical+"esse \n"+
							"Se Nós "+radical+"éssemos \n"+
							"Se Vós "+radical+"êsseis \n"+
							"Se Eles " + radical+"essem");
					
					textAreaFuturos.setText("2º Conjugação \n" +
							"Futuro do Subjuntivo. \n"+
							"Quando Eu  "+radical+"ar  \n"+
							"Quando Tu  "+radical+"ares \n"+
							"Quando Ele "+radical+"ar \n"+
							"Quando Nós "+radical+"armos \n"+
							"Quando Vós "+radical+"ardes \n"+
							"Quando Eles " + radical+"arem");
					
					
					}break;

				case "ir":{
					
					textAreaPresentes.setText("3º Conjugação \n" +
							"Presente do Subjuntivo. \n"+
							"Que Eu  "+radical+"a  \n"+
							"Que Tu  "+radical+"as \n"+
							"Que Ele "+radical+"a \n"+
							"Que Nós "+radical+"amos \n"+
							"Que Vós "+radical+"ais \n"+
							"Que Eles " + radical+"am");
					
					textAreaPreterito.setText("3º Conjugação \n" +
							"Pretérito imperfeito do Subjuntivo. \n"+
							"Se Eu  "+radical+"isse  \n"+
							"Se Tu  "+radical+"isses \n"+
							"Se Ele "+radical+"isse \n"+
							"Se Nós "+radical+"íssemos \n"+
							"Se Vós "+radical+"ísseis \n"+
							"Se Eles " + radical+"issem");
					
					textAreaFuturos.setText("3º Conjugação \n" +
							"Futuro do Subjuntivo. \n"+
							"Quando Eu  "+radical+"ir  \n"+
							"Quando Tu  "+radical+"ires \n"+
							"Quando Ele "+radical+"ir \n"+
							"Quando Nós "+radical+"irmos \n"+
							"Quando Vós "+radical+"irdes \n"+
							"Quando Eles " + radical+"irem");
					
					
					
					
					
				}break;
			}
			
				
				//==================== MODO IMPERATIVO ====================//
				
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					
					textAreaImperativoa.setText("1º Conjugação \n" +
							"Imperativo Afirmativo \n"+
							"----- \n"+
							" Tu  "+radical+"a \n"+
							"Que Ele "+radical+"e \n"+
							"Que Nós "+radical+"emos \n"+
							"Que Vós "+radical+"ai \n"+
							"Que Eles " + radical+"em");
					
					textAreaImperativon.setText("1º Conjugação \n" +
							"Imperativo Negativo \n"+
							"----- \n"+
							" Tu  "+radical+"es \n"+
							"Que Ele "+radical+"e \n"+
							"Que Nós "+radical+"emos \n"+
							"Que Vós "+radical+"eis \n"+
							"Que Eles " + radical+"em");
				
					
					
				}break;

				case "er":{
					
					textAreaImperativoa.setText("2º Conjugação \n" +
							"Imperativo Afirmativo \n"+
							"----- \n"+
							" Tu  "+radical+"e \n"+
							"Que Ele "+radical+"a \n"+
							"Que Nós "+radical+"amos \n"+
							"Que Vós "+radical+"ei \n"+
							"Que Eles " + radical+"am");
					
					textAreaImperativon.setText("2º Conjugação \n" +
							"Imperativo Negativo \n"+
							"----- \n"+
							" Tu  "+radical+"es \n"+
							"Que Ele "+radical+"e \n"+
							"Que Nós "+radical+"emos \n"+
							"Que Vós "+radical+"eis \n"+
							"Que Eles " + radical+"em");
					
					
					
				}break;

				case "ir":{
					textAreaImperativoa.setText("3º Conjugação \n" +
							"Imperativo Afirmativo \n"+
							"----- \n"+
							" Tu  "+radical+"as\n"+
							"Que Ele "+radical+"a \n"+
							"Que Nós "+radical+"amos \n"+
							"Que Vós "+radical+"ais \n"+
							"Que Eles " + radical+"am");
					
					textAreaImperativon.setText("3º Conjugação \n" +
							"Imperativo Negativo \n"+
							"----- \n"+
							" Tu  "+radical+"as \n"+
							"Que Ele "+radical+"a \n"+
							"Que Nós "+radical+"amos \n"+
							"Que Vós "+radical+"ais \n"+
							"Que Eles " + radical+"am");
				
					
					
					
					
				}break;
			}
			
				
				//==================== FORMAS NORMAIS ====================//
				
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1º Conjugação");
					System.out.println("Infinitivo Pessoal");
					System.out.println("Eu  "+radical+"ar");
					System.out.println("Tu  "+radical+"ares");
					System.out.println("Ele "+radical+"ar");
					System.out.println("Nós "+radical+"armos");
					System.out.println("Vós "+radical+"ardes");
					System.out.println("Eles " + radical+"arem");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2º Conjugação");						
					System.out.println("Infinitivo Pessoal");
					System.out.println("Eu  "+radical+"er");
					System.out.println("Tu  "+radical+"eres");
					System.out.println("Ele "+radical+"es");
					System.out.println("Nós "+radical+"ermos");
					System.out.println("Vós "+radical+"erdes");
					System.out.println("Eles " + radical+"erem");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3º Conjugação");
					System.out.println("Infinitivo Pessoal");
					System.out.println("Eu  "+radical+"ir");
					System.out.println("Tu  "+radical+"ires");
					System.out.println("Ele "+radical+"ir");
					System.out.println("Nós "+radical+"irmos");
					System.out.println("Vós "+radical+"irdes");
					System.out.println("Eles " + radical+"irem");

					
				}break;
			}
			//===========================================================================================================================
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1º Conjugação");
					System.out.println("Infinitivo impessoal");
					System.out.println("Eu  "+radical+"ar");
					System.out.println("Tu  "+radical+"ar");
					System.out.println("Ele "+radical+"ar");
					System.out.println("Nós "+radical+"ar");
					System.out.println("Vós "+radical+"ar");
					System.out.println("Eles " + radical+"ar");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2º Conjugação");						
					System.out.println("Infinitivo impessoal");
					System.out.println("Eu  "+radical+"er");
					System.out.println("Tu  "+radical+"er");
					System.out.println("Ele "+radical+"er");
					System.out.println("Nós "+radical+"er");
					System.out.println("Vós "+radical+"er");
					System.out.println("Eles " + radical+"er");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3º Conjugação");
					System.out.println("Infinitivo impessoal");
					System.out.println("Eu  "+radical+"ir");
					System.out.println("Tu  "+radical+"ir");
					System.out.println("Ele "+radical+"ir");
					System.out.println("Nós "+radical+"ir");
					System.out.println("Vós "+radical+"ir");
					System.out.println("Eles " + radical+"ir");

					
				}break;
			}
			//===========================================================================================================================
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1º Conjugação");
					System.out.println("Particípio");
					System.out.println("Eu  "+radical+"ado");
					System.out.println("Tu  "+radical+"ado");
					System.out.println("Ele "+radical+"ado");
					System.out.println("Nós "+radical+"ado");
					System.out.println("Vós "+radical+"ado");
					System.out.println("Eles " + radical+"ado");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2º Conjugação");						
					System.out.println("Particípio");
					System.out.println("Eu  "+radical+"ido");
					System.out.println("Tu  "+radical+"ido");
					System.out.println("Ele "+radical+"ido");
					System.out.println("Nós "+radical+"ido");
					System.out.println("Vós "+radical+"ido");
					System.out.println("Eles " + radical+"ido");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3º Conjugação");
					System.out.println("Particípio");
					System.out.println("Eu  "+radical+"ido");
					System.out.println("Tu  "+radical+"ido");
					System.out.println("Ele "+radical+"ido");
					System.out.println("Nós "+radical+"ido");
					System.out.println("Vós "+radical+"ido");
					System.out.println("Eles " + radical+"ido");

					
				}break;
			}
			//===========================================================================================================================
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1º Conjugação");
					System.out.println("Gerúndio");
					System.out.println("Eu  "+radical+"ando");
					System.out.println("Tu  "+radical+"ando");
					System.out.println("Ele "+radical+"ando");
					System.out.println("Nós "+radical+"ando");
					System.out.println("Vós "+radical+"ando");
					System.out.println("Eles " + radical+"ando");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2º Conjugação");						
					System.out.println("Gerúndio");
					System.out.println("Eu  "+radical+"endo");
					System.out.println("Tu  "+radical+"endo");
					System.out.println("Ele "+radical+"endo");
					System.out.println("Nós "+radical+"endo");
					System.out.println("Vós "+radical+"endo");
					System.out.println("Eles " + radical+"endo");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3º Conjugação");
					System.out.println("Gerúndio");
					System.out.println("Eu  "+radical+"indo");
					System.out.println("Tu  "+radical+"indo");
					System.out.println("Ele "+radical+"indo");
					System.out.println("Nós "+radical+"indo");
					System.out.println("Vós "+radical+"indo");
					System.out.println("Eles " + radical+"indo");

					
				}break;
			}
			//===========================================================================================================================
			}
		});
		btnConjugar.setBounds(127, 32, 98, 26);
		frame.getContentPane().add(btnConjugar);
		
		JLabel lblVerboRegular = new JLabel("Verbo Regular");
		lblVerboRegular.setBounds(10, 11, 114, 16);
		frame.getContentPane().add(lblVerboRegular);
		
		JLabel lblNewLabel = new JLabel("Pret\u00E9rito imperfeito");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(172, 105, 114, 16);
		frame.getContentPane().add(lblNewLabel);		
		
		JLabel lblPretrioPerfeito = new JLabel("Pret\u00E9rio perfeito");
		lblPretrioPerfeito.setBounds(336, 105, 98, 16);
		frame.getContentPane().add(lblPretrioPerfeito);
		
		JLabel lblIndicativo = new JLabel("Indicativo");
		lblIndicativo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblIndicativo.setBounds(10, 77, 77, 16);
		frame.getContentPane().add(lblIndicativo);		
		
		JLabel lblPretritoMaisqueperfeito = new JLabel("Pret\u00E9rito mais-que-perfeito");
		lblPretritoMaisqueperfeito.setBounds(494, 105, 156, 16);
		frame.getContentPane().add(lblPretritoMaisqueperfeito);		
		
		JLabel lblFuturoDoPresente = new JLabel("Futuro do presente");
		lblFuturoDoPresente.setBounds(662, 105, 122, 16);
		frame.getContentPane().add(lblFuturoDoPresente);
		
		
		
		JLabel lblFuturoPretrito = new JLabel("Futuro do pret\u00E9rito");
		lblFuturoPretrito.setBounds(816, 105, 114, 16);
		frame.getContentPane().add(lblFuturoPretrito);
		
		JLabel lblSubjuntivo = new JLabel("Subjuntivo");
		lblSubjuntivo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSubjuntivo.setBounds(10, 367, 77, 16);
		frame.getContentPane().add(lblSubjuntivo);
		
		JLabel lblPresente_1 = new JLabel("Presente");
		lblPresente_1.setBounds(10, 395, 55, 16);
		frame.getContentPane().add(lblPresente_1);
		
		
		
		JLabel label = new JLabel("Pret\u00E9rito imperfeito");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(172, 396, 114, 16);
		frame.getContentPane().add(label);
		
		
		
		JLabel lblFuturo = new JLabel("Futuro ");
		lblFuturo.setBounds(335, 395, 122, 16);
		frame.getContentPane().add(lblFuturo);
		
		JLabel lblImperativo = new JLabel("Imperativo");
		lblImperativo.setFont(new Font("Dialog", Font.BOLD, 15));
		lblImperativo.setBounds(548, 367, 77, 16);
		frame.getContentPane().add(lblImperativo);
		
		
		
		JLabel lblImperativoAfirmativo = new JLabel("Imperativo afirmativo");
		lblImperativoAfirmativo.setBounds(548, 395, 122, 16);
		frame.getContentPane().add(lblImperativoAfirmativo);
		
		
		
		JLabel lblImperativoNegativo = new JLabel("Imperativo negativo");
		lblImperativoNegativo.setBounds(710, 395, 122, 16);
		frame.getContentPane().add(lblImperativoNegativo);
		
		
		
	}
}
