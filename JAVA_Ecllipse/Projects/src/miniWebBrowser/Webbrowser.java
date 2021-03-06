package miniWebBrowser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class Webbrowser {
	
	
	private JFrame frame;
	private JPanel paneltop;
	private JEditorPane editor;
	private JScrollPane scroll;
	private JTextField field;
	private JButton button;
	private URL url;
	
	public Webbrowser (String title) {
		initComponents();
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.add(BorderLayout.NORTH,paneltop);
		
		paneltop.add(field);
		frame.add(BorderLayout.CENTER,scroll);
		frame.setVisible(true);}
		
		private void initComponents() {
			frame = new JFrame();
			paneltop = new JPanel();
			
			try {
				url = new URL ("https://www.google.com");
			} catch (MalformedURLException mue) {
				JOptionPane.showMessageDialog(null, mue);
			}
			
			try {
				editor = new JEditorPane(url);
				editor.setEditable(false);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e);
			}
			
			scroll = new JScrollPane(editor, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			field = new JTextField();
			SwingUtilities.invokeLater(new Runnable () {
				public void run () {
					field.setText(url.toString());
				}
			});
			
			button = new JButton("GO url");
			button.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					try {
						editor.setPage(field.getText());
					}
					catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
				}
			});
		  
		
	}
		
		public static void main (String a[]) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run () {
					new Webbrowser("Mini Webbrowser");
				}
			});
		
		}
	
}
