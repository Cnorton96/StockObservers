import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Main extends JFrame{

    private JPanel contentPane;
    private JTextField teslaField;
    private JTextField appleField;
    private JTextField microsftField;


    public Main() {
            setTitle("Stock Application Demo");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 336);
            contentPane = new JPanel();
            contentPane.setBackground(new Color(0, 0, 128));
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel tes = new JLabel("Stock Application");
            tes.setHorizontalAlignment(SwingConstants.CENTER);
            tes.setFont(new Font("Menlo", Font.PLAIN, 15));
            tes.setForeground(Color.YELLOW);
            tes.setBackground(Color.WHITE);
            tes.setBounds(0, 0, 450, 44);
            contentPane.add(tes);

            JLabel teslaLabel = new JLabel("Tesla");
            teslaLabel.setForeground(Color.WHITE);
            teslaLabel.setBounds(10, 43, 94, 16);
            contentPane.add(teslaLabel);

            teslaField = new JTextField();
            teslaField.setBounds(133, 38, 267, 26);
            contentPane.add(teslaField);
            teslaField.setColumns(10);

            JLabel appleLabel = new JLabel("Apple");
            appleLabel.setForeground(Color.WHITE);
            appleLabel.setBounds(10, 101, 61, 16);
            contentPane.add(appleLabel);

            appleField = new JTextField();
            appleField.setBounds(133, 96, 267, 26);
            contentPane.add(appleField);
            appleField.setColumns(10);

            JLabel microsoftLabel = new JLabel("Microsoft");
            microsoftLabel.setForeground(Color.WHITE);
            microsoftLabel.setBounds(10, 170, 61, 16);
            contentPane.add(microsoftLabel);

            microsftField = new JTextField();
            microsftField.setBounds(133, 165, 267, 26);
            contentPane.add(microsftField);
            microsftField.setColumns(10);

            JButton searchButton = new JButton("Search");
            searchButton.setBounds(152, 242, 117, 29);
            contentPane.add(searchButton);
        }

        public static void main (String[]args) throws IOException {

            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Main frame = new Main();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });


            StockPrices stockPrices = new StockPrices();
            System.out.println("Tesla: " + stockPrices.getTesla());
            System.out.println("Apple: " + stockPrices.getApple());
            System.out.println("Microsoft: " + stockPrices.getMicrosoft());


        }
}
