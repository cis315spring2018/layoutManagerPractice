/**
 *   file: JF_Grid.java
 */
package layoutManagerPractice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;

/**
 * @author   atmanning - atmanning@dbq.edu
 *
 */
public class JF_Grid extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Grid frame = new JF_Grid();
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
	public JF_Grid() {
		setTitle("GridBagLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JTextArea txtrTextarea = new JTextArea();
		txtrTextarea.setText("TextArea");
		GridBagConstraints gbc_txtrTextarea = new GridBagConstraints();
		gbc_txtrTextarea.insets = new Insets(0, 0, 5, 5);
		gbc_txtrTextarea.fill = GridBagConstraints.BOTH;
		gbc_txtrTextarea.gridx = 3;
		gbc_txtrTextarea.gridy = 2;
		contentPane.add(txtrTextarea, gbc_txtrTextarea);
		
		JTextArea txtrJtextarea = new JTextArea();
		txtrJtextarea.setText("JTextArea");
		GridBagConstraints gbc_txtrJtextarea = new GridBagConstraints();
		gbc_txtrJtextarea.anchor = GridBagConstraints.WEST;
		gbc_txtrJtextarea.insets = new Insets(0, 0, 5, 5);
		gbc_txtrJtextarea.gridx = 5;
		gbc_txtrJtextarea.gridy = 2;
		contentPane.add(txtrJtextarea, gbc_txtrJtextarea);
		
		JButton btnNewButton_1 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 11;
		gbc_btnNewButton_1.gridy = 7;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
	}

}
