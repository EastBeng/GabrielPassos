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
						textAreaPresente.setText("1� Conjuga��o \n" +
								"Presente do Indicativo. \n"+
								"Eu  "+radical+"o  \n"+
								"Tu  "+radical+"as \n"+
								"Ele "+radical+"a \n"+
								"N�s "+radical+"amos \n"+
								"V�s "+radical+"ais \n"+
								"Eles " + radical+"am");
						
						textAreaPassado.setText("1� Conjuga��o \n" +
								"Pret�rito imperfeito do Indicativo. \n"+
								"Eu  "+radical+"ava \n"+
								"Tu  "+radical+"avas \n"+
								"Ele "+radical+"ava \n"+
								"N�s "+radical+"�vamos\n"+
								"V�s "+radical+"�veis\n"+
								"Eles " + radical+"avam");
						
						textAreaPassadop.setText("1� Conjuga��o \n" +
								"Pret�rito perfeito do Indicativo. \n"+
								"Eu  "+radical+"ei \n"+
								"Tu  "+radical+"aste \n"+
								"Ele "+radical+"ou \n"+
								"N�s "+radical+"amos \n"+
								"V�s "+radical+"astes \n"+
								"Eles " + radical+"aram"); 
						
						textAreaPassadom.setText("1� Conjuga��o \n" +
								"Pret�rito mais-que-perfeito do Indicativo. \n"+
								"Eu  "+radical+"ara \n"+
								"Tu  "+radical+"aras \n"+
								"Ele "+radical+"ara \n"+
								"N�s "+radical+"�ramos \n"+
								"V�s "+radical+"�reis \n"+
								"Eles " + radical+"aram"); 
						
						textAreaFuturoi.setText("1� Conjuga��o \n" +
								"Futuro do presente do Indicativo. \n"+
								"Eu  "+radical+"arei \n"+
								"Tu  "+radical+"ar�s \n"+
								"Ele "+radical+"ara \n"+
								"N�s "+radical+"aremos \n"+
								"V�s "+radical+"areis \n"+
								"Eles " + radical+"ar�o"); 
						
						textAreaFuturop.setText("1� Conjuga��o \n" +
								"Futuro pret�rito do Indicativo. \n"+
								"Eu  "+radical+"aria \n"+
								"Tu  "+radical+"arias \n"+
								"Ele "+radical+"aria \n"+
								"N�s "+radical+"ar�amos\n"+
								"V�s "+radical+"ar�eis \n"+
								"Eles " + radical+"ariam"); 
						
					}break;
	
					case "er":{
						
						textAreaPresente.setText("2� Conjuga��o \n" +
								"Presente do indicativo \n"+
								"Eu  "+radical+"o \n"+
								"Tu  "+radical+"es \n"+
								"Ele "+radical+"e \n"+
								"N�s "+radical+"emos \n"+
								"V�s "+radical+"eis \n"+
								"Eles " + radical+"em");
						
						textAreaPassado.setText("2� Conjuga��o \n" +
								"Pret�rito imperfeito do Indicativo. \n"+
								"Eu  "+radical+"ia \n"+
								"Tu  "+radical+"ias \n"+
								"Ele "+radical+"ia \n"+
								"N�s "+radical+"�amos\n"+
								"V�s "+radical+"�eis\n"+
								"Eles " + radical+"iam");
						
						textAreaPassadop.setText("2� Conjuga��o \n" +
								"Pret�rito perfeito do Indicativo. \n"+
								"Eu  "+radical+"i \n"+
								"Tu  "+radical+"este \n"+
								"Ele "+radical+"eu \n"+
								"N�s "+radical+"emos \n"+
								"V�s "+radical+"estes \n"+
								"Eles " + radical+"eram"); 
						
						textAreaPassadom.setText("2� Conjuga��o \n" +
								"Pret�rito mais-que-perfeito do Indicativo. \n"+
								"Eu  "+radical+"era \n"+
								"Tu  "+radical+"eras \n"+
								"Ele "+radical+"era \n"+
								"N�s "+radical+"�ramos \n"+
								"V�s "+radical+"�reis \n"+
								"Eles " + radical+"eram");
						
						textAreaFuturoi.setText("2� Conjuga��o \n" +
								"Futuro do presente do Indicativo. \n"+
								"Eu  "+radical+"erei \n"+
								"Tu  "+radical+"er�s \n"+
								"Ele "+radical+"er� \n"+
								"N�s "+radical+"eremos \n"+
								"V�s "+radical+"ereis \n"+
								"Eles " + radical+"er�o"); 
						
						textAreaFuturop.setText("2� Conjuga��o \n" +
								"Futuro pret�rito do Indicativo. \n"+
								"Eu  "+radical+"eria \n"+
								"Tu  "+radical+"erias \n"+
								"Ele "+radical+"eria \n"+
								"N�s "+radical+"er�amos\n"+
								"V�s "+radical+"er�eis \n"+
								"Eles " + radical+"eriam"); 
						
						
						
						
					}break;
	
					case "ir":{
						
						textAreaPresente.setText("3� Conjuga��o \n" +
								"Presente do indicativo \n"+
								"Eu  "+radical+"o \n"+
								"Tu  "+radical+"es \n"+
								"Ele "+radical+"e \n"+
								"N�s "+radical+"imos \n"+
								"V�s "+radical+"is \n"+
								"Eles " + radical+"em");
						
						textAreaPassado.setText("3� Conjuga��o \n" +
								"Pret�rito imperfeito do Indicativo. \n"+
								"Eu  "+radical+"ia \n"+
								"Tu  "+radical+"ias \n"+
								"Ele "+radical+"ia \n"+
								"N�s "+radical+"�amos \n"+
								"V�s "+radical+"�eis \n"+
								"Eles " + radical+"iam");
						
						textAreaPassadop.setText("3� Conjuga��o \n" +
								"Pret�rito perfeito do Indicativo. \n"+
								"Eu  "+radical+"i \n"+
								"Tu  "+radical+"iste \n"+
								"Ele "+radical+"iu \n"+
								"N�s "+radical+"iamos \n"+
								"V�s "+radical+"istes \n"+
								"Eles " + radical+"iram"); 
						
						textAreaPassadom.setText("3� Conjuga��o \n" +
								"Pret�rito mais-que-perfeito do Indicativo. \n"+
								"Eu  "+radical+"ira \n"+
								"Tu  "+radical+"iras \n"+
								"Ele "+radical+"ira \n"+
								"N�s "+radical+"�ramos \n"+
								"V�s "+radical+"�reis \n"+
								"Eles " + radical+"iram");
						
						textAreaFuturoi.setText("3� Conjuga��o \n" +
								"Futuro do presente do Indicativo. \n"+
								"Eu  "+radical+"irei \n"+
								"Tu  "+radical+"ir�s \n"+
								"Ele "+radical+"ir� \n"+
								"N�s "+radical+"iremos \n"+
								"V�s "+radical+"ireis \n"+
								"Eles " + radical+"ir�o"); 
						
						textAreaFuturop.setText("3� Conjuga��o \n" +
								"Futuro pret�rito do Indicativo. \n"+
								"Eu  "+radical+"iria \n"+
								"Tu  "+radical+"irias \n"+
								"Ele "+radical+"iria \n"+
								"N�s "+radical+"ir�amos \n"+
								"V�s "+radical+"ir�eis \n"+
								"Eles " + radical+"iriam"); 
						
						
						
						
						
					}break;
				}
			
				//==================== MODO SUBJUNTIVO ====================//
				
				switch (terminadoEm) {
				case "ar":{
					textAreaPresentes.setText("1� Conjuga��o \n" +
							"Presente do Subjuntivo. \n"+
							"Que Eu  "+radical+"e  \n"+
							"Que Tu  "+radical+"es \n"+
							"Que Ele "+radical+"e \n"+
							"Que N�s "+radical+"emos \n"+
							"Que V�s "+radical+"eis \n"+
							"Que Eles " + radical+"em");
					
					textAreaPreterito.setText("1� Conjuga��o \n" +
							"Pret�rito imperfeito do Subjuntivo. \n"+
							"Se Eu  "+radical+"asse  \n"+
							"Se Tu  "+radical+"asses \n"+
							"Se Ele "+radical+"asse \n"+
							"Se N�s "+radical+"�ssemos \n"+
							"Se V�s "+radical+"�sseis \n"+
							"Se Eles " + radical+"assem");
					
					textAreaFuturos.setText("1� Conjuga��o \n" +
							"Futuro do Subjuntivo. \n"+
							"Quando Eu  "+radical+"ar  \n"+
							"Quando Tu  "+radical+"ares \n"+
							"Quando Ele "+radical+"ar \n"+
							"Quando N�s "+radical+"armos \n"+
							"Quando V�s "+radical+"ardes \n"+
							"Quando Eles " + radical+"arem");
					
				}break;

				case "er":{
				
					textAreaPresentes.setText("2� Conjuga��o \n" +
							"Presente do Subjuntivo. \n"+
							"Que Eu  "+radical+"a  \n"+
							"Que Tu  "+radical+"as \n"+
							"Que Ele "+radical+"a \n"+
							"Que N�s "+radical+"amos \n"+
							"Que V�s "+radical+"ais \n"+
							"Que Eles " + radical+"am");
					
					textAreaPreterito.setText("2� Conjuga��o \n" +
							"Pret�rito imperfeito do Subjuntivo. \n"+
							"Se Eu  "+radical+"esse  \n"+
							"Se Tu  "+radical+"esses \n"+
							"Se Ele "+radical+"esse \n"+
							"Se N�s "+radical+"�ssemos \n"+
							"Se V�s "+radical+"�sseis \n"+
							"Se Eles " + radical+"essem");
					
					textAreaFuturos.setText("2� Conjuga��o \n" +
							"Futuro do Subjuntivo. \n"+
							"Quando Eu  "+radical+"ar  \n"+
							"Quando Tu  "+radical+"ares \n"+
							"Quando Ele "+radical+"ar \n"+
							"Quando N�s "+radical+"armos \n"+
							"Quando V�s "+radical+"ardes \n"+
							"Quando Eles " + radical+"arem");
					
					
					}break;

				case "ir":{
					
					textAreaPresentes.setText("3� Conjuga��o \n" +
							"Presente do Subjuntivo. \n"+
							"Que Eu  "+radical+"a  \n"+
							"Que Tu  "+radical+"as \n"+
							"Que Ele "+radical+"a \n"+
							"Que N�s "+radical+"amos \n"+
							"Que V�s "+radical+"ais \n"+
							"Que Eles " + radical+"am");
					
					textAreaPreterito.setText("3� Conjuga��o \n" +
							"Pret�rito imperfeito do Subjuntivo. \n"+
							"Se Eu  "+radical+"isse  \n"+
							"Se Tu  "+radical+"isses \n"+
							"Se Ele "+radical+"isse \n"+
							"Se N�s "+radical+"�ssemos \n"+
							"Se V�s "+radical+"�sseis \n"+
							"Se Eles " + radical+"issem");
					
					textAreaFuturos.setText("3� Conjuga��o \n" +
							"Futuro do Subjuntivo. \n"+
							"Quando Eu  "+radical+"ir  \n"+
							"Quando Tu  "+radical+"ires \n"+
							"Quando Ele "+radical+"ir \n"+
							"Quando N�s "+radical+"irmos \n"+
							"Quando V�s "+radical+"irdes \n"+
							"Quando Eles " + radical+"irem");
					
					
					
					
					
				}break;
			}
			
				
				//==================== MODO IMPERATIVO ====================//
				
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					
					textAreaImperativoa.setText("1� Conjuga��o \n" +
							"Imperativo Afirmativo \n"+
							"----- \n"+
							" Tu  "+radical+"a \n"+
							"Que Ele "+radical+"e \n"+
							"Que N�s "+radical+"emos \n"+
							"Que V�s "+radical+"ai \n"+
							"Que Eles " + radical+"em");
					
					textAreaImperativon.setText("1� Conjuga��o \n" +
							"Imperativo Negativo \n"+
							"----- \n"+
							" Tu  "+radical+"es \n"+
							"Que Ele "+radical+"e \n"+
							"Que N�s "+radical+"emos \n"+
							"Que V�s "+radical+"eis \n"+
							"Que Eles " + radical+"em");
				
					
					
				}break;

				case "er":{
					
					textAreaImperativoa.setText("2� Conjuga��o \n" +
							"Imperativo Afirmativo \n"+
							"----- \n"+
							" Tu  "+radical+"e \n"+
							"Que Ele "+radical+"a \n"+
							"Que N�s "+radical+"amos \n"+
							"Que V�s "+radical+"ei \n"+
							"Que Eles " + radical+"am");
					
					textAreaImperativon.setText("2� Conjuga��o \n" +
							"Imperativo Negativo \n"+
							"----- \n"+
							" Tu  "+radical+"es \n"+
							"Que Ele "+radical+"e \n"+
							"Que N�s "+radical+"emos \n"+
							"Que V�s "+radical+"eis \n"+
							"Que Eles " + radical+"em");
					
					
					
				}break;

				case "ir":{
					textAreaImperativoa.setText("3� Conjuga��o \n" +
							"Imperativo Afirmativo \n"+
							"----- \n"+
							" Tu  "+radical+"as\n"+
							"Que Ele "+radical+"a \n"+
							"Que N�s "+radical+"amos \n"+
							"Que V�s "+radical+"ais \n"+
							"Que Eles " + radical+"am");
					
					textAreaImperativon.setText("3� Conjuga��o \n" +
							"Imperativo Negativo \n"+
							"----- \n"+
							" Tu  "+radical+"as \n"+
							"Que Ele "+radical+"a \n"+
							"Que N�s "+radical+"amos \n"+
							"Que V�s "+radical+"ais \n"+
							"Que Eles " + radical+"am");
				
					
					
					
					
				}break;
			}
			
				
				//==================== FORMAS NORMAIS ====================//
				
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1� Conjuga��o");
					System.out.println("Infinitivo Pessoal");
					System.out.println("Eu  "+radical+"ar");
					System.out.println("Tu  "+radical+"ares");
					System.out.println("Ele "+radical+"ar");
					System.out.println("N�s "+radical+"armos");
					System.out.println("V�s "+radical+"ardes");
					System.out.println("Eles " + radical+"arem");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2� Conjuga��o");						
					System.out.println("Infinitivo Pessoal");
					System.out.println("Eu  "+radical+"er");
					System.out.println("Tu  "+radical+"eres");
					System.out.println("Ele "+radical+"es");
					System.out.println("N�s "+radical+"ermos");
					System.out.println("V�s "+radical+"erdes");
					System.out.println("Eles " + radical+"erem");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3� Conjuga��o");
					System.out.println("Infinitivo Pessoal");
					System.out.println("Eu  "+radical+"ir");
					System.out.println("Tu  "+radical+"ires");
					System.out.println("Ele "+radical+"ir");
					System.out.println("N�s "+radical+"irmos");
					System.out.println("V�s "+radical+"irdes");
					System.out.println("Eles " + radical+"irem");

					
				}break;
			}
			//===========================================================================================================================
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1� Conjuga��o");
					System.out.println("Infinitivo impessoal");
					System.out.println("Eu  "+radical+"ar");
					System.out.println("Tu  "+radical+"ar");
					System.out.println("Ele "+radical+"ar");
					System.out.println("N�s "+radical+"ar");
					System.out.println("V�s "+radical+"ar");
					System.out.println("Eles " + radical+"ar");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2� Conjuga��o");						
					System.out.println("Infinitivo impessoal");
					System.out.println("Eu  "+radical+"er");
					System.out.println("Tu  "+radical+"er");
					System.out.println("Ele "+radical+"er");
					System.out.println("N�s "+radical+"er");
					System.out.println("V�s "+radical+"er");
					System.out.println("Eles " + radical+"er");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3� Conjuga��o");
					System.out.println("Infinitivo impessoal");
					System.out.println("Eu  "+radical+"ir");
					System.out.println("Tu  "+radical+"ir");
					System.out.println("Ele "+radical+"ir");
					System.out.println("N�s "+radical+"ir");
					System.out.println("V�s "+radical+"ir");
					System.out.println("Eles " + radical+"ir");

					
				}break;
			}
			//===========================================================================================================================
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1� Conjuga��o");
					System.out.println("Partic�pio");
					System.out.println("Eu  "+radical+"ado");
					System.out.println("Tu  "+radical+"ado");
					System.out.println("Ele "+radical+"ado");
					System.out.println("N�s "+radical+"ado");
					System.out.println("V�s "+radical+"ado");
					System.out.println("Eles " + radical+"ado");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2� Conjuga��o");						
					System.out.println("Partic�pio");
					System.out.println("Eu  "+radical+"ido");
					System.out.println("Tu  "+radical+"ido");
					System.out.println("Ele "+radical+"ido");
					System.out.println("N�s "+radical+"ido");
					System.out.println("V�s "+radical+"ido");
					System.out.println("Eles " + radical+"ido");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3� Conjuga��o");
					System.out.println("Partic�pio");
					System.out.println("Eu  "+radical+"ido");
					System.out.println("Tu  "+radical+"ido");
					System.out.println("Ele "+radical+"ido");
					System.out.println("N�s "+radical+"ido");
					System.out.println("V�s "+radical+"ido");
					System.out.println("Eles " + radical+"ido");

					
				}break;
			}
			//===========================================================================================================================
				switch (terminadoEm) {
				case "ar":{
					//Estudar
					System.out.println("1� Conjuga��o");
					System.out.println("Ger�ndio");
					System.out.println("Eu  "+radical+"ando");
					System.out.println("Tu  "+radical+"ando");
					System.out.println("Ele "+radical+"ando");
					System.out.println("N�s "+radical+"ando");
					System.out.println("V�s "+radical+"ando");
					System.out.println("Eles " + radical+"ando");
					
				}break;

				case "er":{
					//Escrever
					System.out.println("2� Conjuga��o");						
					System.out.println("Ger�ndio");
					System.out.println("Eu  "+radical+"endo");
					System.out.println("Tu  "+radical+"endo");
					System.out.println("Ele "+radical+"endo");
					System.out.println("N�s "+radical+"endo");
					System.out.println("V�s "+radical+"endo");
					System.out.println("Eles " + radical+"endo");
					
				}break;

				case "ir":{
					//Dividir
					System.out.println("3� Conjuga��o");
					System.out.println("Ger�ndio");
					System.out.println("Eu  "+radical+"indo");
					System.out.println("Tu  "+radical+"indo");
					System.out.println("Ele "+radical+"indo");
					System.out.println("N�s "+radical+"indo");
					System.out.println("V�s "+radical+"indo");
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
