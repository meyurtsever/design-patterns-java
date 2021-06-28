package org.mmey.memento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InventoryFrame extends JFrame {

	private JPanel contentPane;
	private JTable tableItemList;
	private JTable tableInventory;
	private JLabel labelInventory;
	private JButton btnBuy;
	private JButton btnSell;
	
	int currentInventory = 0;
	
	Originator originator = new Originator();
	CareTaker caretaker = new CareTaker();
	private JButton btnSaveState;
	private JComboBox<String> comboMemento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryFrame frame = new InventoryFrame();
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
	public InventoryFrame() {
		setResizable(false);
		setTitle("Memento Design Pattern");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 473);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableItemList = new JTable();
		tableItemList.setFont(new Font("Arial", Font.PLAIN, 13));
		tableItemList.setModel(new DefaultTableModel(
			new Object[][] {
				{"Long Sword"},
				{"Heavy Armor"},
				{"Health Potion"},
				{"Lucky Stone"},
				{"Emperor Ring"},
			},
			new String[] {
				"Item Name"
			}
		));
		tableItemList.setBounds(20, 36, 269, 339);
		contentPane.add(tableItemList);
		
		tableInventory = new JTable();
		tableInventory.setFont(new Font("Arial", Font.PLAIN, 13));
		tableInventory.setModel(new DefaultTableModel(
			new Object[][] {
				{"Shoes"},
				{"Pumpkin"},
			},
			new String[] {
				"Item Name"
			}
		));
		tableInventory.setBounds(506, 36, 269, 339);
		contentPane.add(tableInventory);
		
		JLabel labelItemList = new JLabel("Item List");
		labelItemList.setFont(new Font("Arial", Font.PLAIN, 17));
		labelItemList.setBounds(20, 11, 150, 25);
		contentPane.add(labelItemList);
		
		labelInventory = new JLabel("Inventory");
		labelInventory.setFont(new Font("Arial", Font.PLAIN, 17));
		labelInventory.setBounds(506, 11, 150, 25);
		contentPane.add(labelInventory);
		
		DefaultTableModel modelItem = (DefaultTableModel) tableItemList.getModel();
		DefaultTableModel modelInventory = (DefaultTableModel) tableInventory.getModel();
		
		btnBuy = new JButton("Add to Inventory >>");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				modelInventory.addRow(new Object[] {
						modelItem.getValueAt(tableItemList.getSelectedRow(), tableItemList.getSelectedColumn()).toString(),
				});			
			}
		});
		
		btnBuy.setFont(new Font("Arial", Font.BOLD, 12));
		btnBuy.setBounds(299, 109, 197, 35);
		contentPane.add(btnBuy);
		
		btnSell = new JButton("<< Remove From Inventory");
		btnSell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				modelItem.addRow(new Object[] {
						modelInventory.getValueAt(tableInventory.getSelectedRow(), tableInventory.getSelectedColumn()).toString(),
				});
					
				modelInventory.removeRow(tableInventory.getSelectedRow());
			}
		});
		
		btnSell.setFont(new Font("Arial", Font.BOLD, 12));
		btnSell.setBounds(299, 167, 197, 35);
		contentPane.add(btnSell);
		
		btnSaveState = new JButton("SAVE STATE");
		btnSaveState.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// save state for inventory
				
				List<String> inventoryList = new ArrayList<String>();
		        for (int count = 0; count < tableInventory.getRowCount(); count++){
		        	inventoryList.add(tableInventory.getValueAt(count, 0).toString());
		        }
				
				// Set the value for the current memento
				originator.setInventory(inventoryList);
				
				// Add new items the ArrayList
				caretaker.addMemento(originator.saveStateToMemento());

				currentInventory++;
				
				comboMemento.addItem("Saved state: #" + currentInventory);
			}
		});
		btnSaveState.setForeground(Color.RED);
		btnSaveState.setFont(new Font("Arial", Font.BOLD, 12));
		btnSaveState.setBounds(299, 231, 197, 35);
		contentPane.add(btnSaveState);
		
		comboMemento = new JComboBox();
		comboMemento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedCombo = (String) comboMemento.getSelectedItem();
				int stateNumber = Integer.parseInt(selectedCombo.replaceAll("[\\D]", ""));
				
				List<String> inventoryList = originator.getStateFromMemento( caretaker.getMemento(--stateNumber) );
				
				modelInventory.setRowCount(0);
				
				for (String item : inventoryList) {
					modelInventory.addRow(new Object[] {
							item,
					});
				}		
			}
		});
		comboMemento.setModel(new DefaultComboBoxModel(new String[] {"Change inventory state"}));
		comboMemento.setFont(new Font("Arial", Font.BOLD, 12));
		comboMemento.setBounds(299, 340, 197, 35);
		contentPane.add(comboMemento);
	}
}
