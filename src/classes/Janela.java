package classes;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.IconView;

public class Janela extends JFrame implements ActionListener{

	private JLabel lbpeso, lbaltura, lbKg, lbMt, lbResultado, lbSituacao;
	private JTextField txtpeso, txtaltura;
	private JRadioButton rdMasc, rdFem;
	private JButton btCalcular, btLimpar;
	private ButtonGroup gruSex;
	
	private GridLayout layout;
	
	//construtor
	public Janela(){
	    super("Calculadora IMC");	

        layout= new GridLayout(9, 3);
		setLayout(layout);
		setIconImage(new ImageIcon(getClass().getResource("/IMG/imicon.png")).getImage());
		
		
		//Labels
		lbpeso= new JLabel("Peso: ");
		lbaltura= new JLabel("Altura: ");
		lbKg= new JLabel("Kg");
		lbMt= new JLabel("Mt");
		lbResultado= new JLabel("Resultado:");
		lbSituacao= new JLabel("Situação:");
		
		
		//TexteFields
		txtpeso= new JTextField("");
		txtaltura= new JTextField("");
		
		
		//Butões
		btCalcular = new JButton("Calcular");
		btLimpar= new JButton("Limpar");
		
		
		//RadioButtons
		rdMasc= new JRadioButton("Masculino");
		rdFem= new JRadioButton("Feminino");
		
		
		gruSex = new ButtonGroup();
		gruSex.add(rdMasc);
		gruSex.add(rdFem);
		
		
		//adicionar elementos
		
		
		
		
		
		
		
		
	}//FIM construtor

	
	//implementação dos botões
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		
	}//fim action


	
	
	
	
	
	
	
	
}//Fim class
