package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField s1;
	private JTextField s2;
	private JTextField s3;
	private JTextField s6;
	private JTextField s4;
	private JTextField s5;
	private JTextField s9;
	private JTextField s7;
	private JTextField s8;
	private JTextField xSpace;
	private JTextField oSpace;
	private boolean gamePlayer = true; //true = X | false = O
	private int moveCount = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
					JOptionPane.showMessageDialog(null, "X starts!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Game() {
		setTitle("TicTacToe");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		s1 = new JTextField();
		s1.setHorizontalAlignment(SwingConstants.CENTER);
		s1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s1.setEditable(false);
		s1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s1);

				gameCheck();
			}
		});
		s1.setBounds(10, 10, 70, 70);
		contentPane.add(s1);
		s1.setColumns(10);
		
		s2 = new JTextField();
		s2.setHorizontalAlignment(SwingConstants.CENTER);
		s2.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s2.setEditable(false);
		s2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s2);
				gameCheck();
			}
		});
		s2.setColumns(10);
		s2.setBounds(90, 10, 70, 70);
		contentPane.add(s2);
		
		s3 = new JTextField();
		s3.setHorizontalAlignment(SwingConstants.CENTER);
		s3.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s3.setEditable(false);
		s3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s3);
				gameCheck();
			}
		});
		s3.setColumns(10);
		s3.setBounds(170, 10, 70, 70);
		contentPane.add(s3);
		
		s6 = new JTextField();
		s6.setHorizontalAlignment(SwingConstants.CENTER);
		s6.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s6.setEditable(false);
		s6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s6);
				gameCheck();
			}
		});
		s6.setColumns(10);
		s6.setBounds(170, 90, 70, 70);
		contentPane.add(s6);
		
		s4 = new JTextField();
		s4.setHorizontalAlignment(SwingConstants.CENTER);
		s4.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s4.setEditable(false);
		s4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s4);
				gameCheck();
			}
		});
		s4.setColumns(10);
		s4.setBounds(10, 90, 70, 70);
		contentPane.add(s4);
		
		s5 = new JTextField();
		s5.setHorizontalAlignment(SwingConstants.CENTER);
		s5.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s5.setEditable(false);
		s5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s5);
				gameCheck();
			}
		});
		s5.setColumns(10);
		s5.setBounds(90, 90, 70, 70);
		contentPane.add(s5);
		
		s9 = new JTextField();
		s9.setHorizontalAlignment(SwingConstants.CENTER);
		s9.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s9.setEditable(false);
		s9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s9);
				gameCheck();
			}
		});
		s9.setColumns(10);
		s9.setBounds(170, 170, 70, 70);
		contentPane.add(s9);
		
		s7 = new JTextField();
		s7.setHorizontalAlignment(SwingConstants.CENTER);
		s7.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s7.setEditable(false);
		s7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s7);
				gameCheck();
			}
		});
		s7.setColumns(10);
		s7.setBounds(10, 170, 70, 70);
		contentPane.add(s7);
		
		s8 = new JTextField();
		s8.setHorizontalAlignment(SwingConstants.CENTER);
		s8.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		s8.setEditable(false);
		s8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				play(gamePlayer, s8);
				gameCheck();
			}
		});
		s8.setColumns(10);
		s8.setBounds(90, 170, 70, 70);
		contentPane.add(s8);
		
		xSpace = new JTextField();
		xSpace.setHorizontalAlignment(SwingConstants.CENTER);
		xSpace.setText("0");
		xSpace.setBounds(318, 35, 39, 19);
		contentPane.add(xSpace);
		xSpace.setColumns(10);
		
		oSpace = new JTextField();
		oSpace.setHorizontalAlignment(SwingConstants.CENTER);
		oSpace.setText("0");
		oSpace.setColumns(10);
		oSpace.setBounds(318, 64, 39, 19);
		contentPane.add(oSpace);
		
		JLabel lblNewLabel = new JLabel("X: ");
		lblNewLabel.setBounds(294, 38, 24, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblO = new JLabel("O: ");
		lblO.setBounds(294, 67, 24, 13);
		contentPane.add(lblO);
	}
	
	public void play(boolean gamePlayer, JTextField t) {
		if(t.getText().isEmpty()) {
			if(gamePlayer) {
				t.setText("X");
				this.gamePlayer = false;
			} else {
				t.setText("O");
				this.gamePlayer = true;
			}
			moveCount++;
		}
	}
	public void gameCheck() {
		int xCount = Integer.parseInt(xSpace.getText()) + 1;
		int oCount = Integer.parseInt(oSpace.getText()) + 1;
		
		//first horizontal line
		if(!s1.getText().isEmpty() && !s2.getText().isEmpty() && !s3.getText().isEmpty()) {
			if(s1.getText().equals(s2.getText()) && s2.getText().equals(s3.getText())) {
				JOptionPane.showMessageDialog(null, s1.getText() + " wins!");
				if(s1.getText().equals("X")) {
					xSpace.setText("" + xCount);
				}
				if(s1.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		//second horizontal line
		if(!s4.getText().isEmpty() && !s5.getText().isEmpty() && !s6.getText().isEmpty()) {
			if(s4.getText().equals(s5.getText()) && s5.getText().equals(s6.getText())) {
				JOptionPane.showMessageDialog(null, s4.getText() + " wins!");
				if(s4.getText().equals("X")) {
					xSpace.setText("" + xCount);
				}
				if(s4.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		//third horizontal line
		if(!s7.getText().isEmpty() && !s8.getText().isEmpty() && !s9.getText().isEmpty()) {
			if(s7.getText().equals(s8.getText()) && s8.getText().equals(s9.getText())) {
				JOptionPane.showMessageDialog(null, s7.getText() + " wins!");
				if(s7.getText().equals("x")) {
					xSpace.setText("" + xCount);
				}
				if(s7.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		//first vertical line
		if(!s1.getText().isEmpty() && !s4.getText().isEmpty() && !s7.getText().isEmpty()) {
			if(s1.getText().equals(s4.getText()) && s4.getText().equals(s7.getText())) {
				JOptionPane.showMessageDialog(null, s1.getText() + " wins!");
				if(s1.getText().equals("x")) {
					xSpace.setText("" + xCount);
				}
				if(s1.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		//second horizontal line
		if(!s2.getText().isEmpty() && !s5.getText().isEmpty() && !s8.getText().isEmpty()) {
			if(s2.getText().equals(s5.getText()) && s5.getText().equals(s8.getText())) {
				JOptionPane.showMessageDialog(null, s2.getText() + " wins!");
				if(s2.getText().equals("x")) {
					xSpace.setText("" + xCount);
				}
				if(s2.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		//third horizontal line
		if(!s3.getText().isEmpty() && !s6.getText().isEmpty() && !s9.getText().isEmpty()) {
			if(s3.getText().equals(s6.getText()) && s6.getText().equals(s9.getText())) {
				JOptionPane.showMessageDialog(null, s3.getText() + " wins!");
				if(s3.getText().equals("x")) {
					xSpace.setText("" + xCount);
				}
				if(s3.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		//falling diagonal
		if(!s1.getText().isEmpty() && !s5.getText().isEmpty() && !s9.getText().isEmpty()) {
			if(s1.getText().equals(s5.getText()) && s5.getText().equals(s9.getText())) {
				JOptionPane.showMessageDialog(null, s1.getText() + " wins!");
				if(s1.getText().equals("x")) {
					xSpace.setText("" + xCount);
				}
				if(s1.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		//rising diagonal
		if(!s3.getText().isEmpty() && !s5.getText().isEmpty() && !s7.getText().isEmpty()) {
			if(s3.getText().equals(s5.getText()) && s5.getText().equals(s7.getText())) {
				JOptionPane.showMessageDialog(null, s3.getText() + " wins!");
				if(s3.getText().equals("x")) {
					xSpace.setText("" + xCount);
				}
				if(s3.getText().equals("O")) {
					oSpace.setText("" + oCount);
				}
				clear();
			}
		}
		
		if(moveCount==9) {
			JOptionPane.showMessageDialog(null, "It is a draw!");
			clear();
		}
	}
	
	public void clear() {
		moveCount = 0;
		s1.setText("");
		s2.setText("");
		s3.setText("");
		s4.setText("");
		s5.setText("");
		s6.setText("");
		s7.setText("");
		s8.setText("");
		s9.setText("");
	}
}
