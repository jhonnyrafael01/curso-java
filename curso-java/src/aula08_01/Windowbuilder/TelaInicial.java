package aula08_01.Windowbuilder;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.border.LineBorder;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtVxcv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Primeiro projeto gráfico");
		titulo.setFont(new Font("Noto Sans CJK TC", Font.BOLD, 16));
		titulo.setBounds(36, 12, 242, 24);
		contentPane.add(titulo);
		
		JLabel lblNewLabel = new JLabel("Nome completo");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(36, 44, 123, 31);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(155, 58, 123, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(311, 55, 117, 25);
		contentPane.add(botaoCadastrar);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(36, 87, 70, 15);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(36, 113, 102, 19);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemininp = new JRadioButton("Feminino");
		rdbtnFemininp.setVerticalAlignment(SwingConstants.BOTTOM);
		rdbtnFemininp.setBounds(36, 136, 102, 23);
		contentPane.add(rdbtnFemininp);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimento");
		lblNewLabel_1.setBounds(36, 167, 155, 15);
		contentPane.add(lblNewLabel_1);
		
		txtVxcv = new JTextField();
		txtVxcv.setBackground(Color.WHITE);
		txtVxcv.setToolTipText("dd/mm/aaaa");
		txtVxcv.setBounds(190, 165, 114, 19);
		contentPane.add(txtVxcv);
		txtVxcv.setColumns(10);
	}
}
