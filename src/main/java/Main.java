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
        StockPrices stockPrices = new StockPrices();

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
        teslaLabel.setBounds(10, 43, 42, 16);
        contentPane.add(teslaLabel);

        JLabel appleLabel = new JLabel("Apple");
        appleLabel.setForeground(Color.WHITE);
        appleLabel.setBounds(133, 43, 61, 16);
        contentPane.add(appleLabel);

        JLabel microsoftLabel = new JLabel("Microsoft");
        microsoftLabel.setForeground(Color.WHITE);
        microsoftLabel.setBounds(274, 43, 61, 16);
        contentPane.add(microsoftLabel);

        JLabel teslaPriceLabel = new JLabel("0.00");
        teslaPriceLabel.setForeground(Color.YELLOW);
        teslaPriceLabel.setBounds(55, 43, 84, 16);
        contentPane.add(teslaPriceLabel);

        JLabel applePriceLabel = new JLabel("0.00");
        applePriceLabel.setForeground(Color.YELLOW);
        applePriceLabel.setBounds(189, 43, 61, 16);
        contentPane.add(applePriceLabel);

        JLabel microsoftPriceLabel = new JLabel("0.00");
        microsoftPriceLabel.setForeground(Color.YELLOW);
        microsoftPriceLabel.setBounds(347, 43, 61, 16);
        contentPane.add(microsoftPriceLabel);

        JLabel googleLabel = new JLabel("Google");
        googleLabel.setForeground(Color.WHITE);
        googleLabel.setBounds(6, 92, 51, 16);
        contentPane.add(googleLabel);

        JLabel googlePriceLabel = new JLabel("0.00");
        googlePriceLabel.setForeground(Color.YELLOW);
        googlePriceLabel.setBounds(55, 92, 61, 16);
        contentPane.add(googlePriceLabel);

        JLabel amazonLabel = new JLabel("Amazon");
        amazonLabel.setForeground(Color.WHITE);
        amazonLabel.setBounds(133, 92, 51, 16);
        contentPane.add(amazonLabel);

        JLabel amazonPriceLabel = new JLabel("0.00");
        amazonPriceLabel.setForeground(Color.YELLOW);
        amazonPriceLabel.setBounds(189, 92, 61, 16);
        contentPane.add(amazonPriceLabel);

        JLabel facebookLabel = new JLabel("Facebook");
        facebookLabel.setForeground(Color.WHITE);
        facebookLabel.setBounds(274, 92, 61, 16);
        contentPane.add(facebookLabel);

        JLabel facebookPriceLabel = new JLabel("0.00");
        facebookPriceLabel.setForeground(Color.YELLOW);
        facebookPriceLabel.setBounds(347, 92, 61, 16);
        contentPane.add(facebookPriceLabel);

        JButton searchButton = new JButton("Update");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    //Needed to convert the float values into string values
                    String teslaVal = String.valueOf(stockPrices.getTesla());
                    String appleVal = String.valueOf(stockPrices.getApple());
                    String microsoftVal = String.valueOf(stockPrices.getMicrosoft());
                    String googleVal = String.valueOf(stockPrices.getGoogle());
                    String amazonVal = String.valueOf(stockPrices.getAmazon());
                    String facebookVal = String.valueOf(stockPrices.getFacebook());

                    //setting the text of each label with the text of the above strings.
                    teslaPriceLabel.setText(teslaVal);
                    applePriceLabel.setText(appleVal);
                    microsoftPriceLabel.setText(microsoftVal);
                    googlePriceLabel.setText(googleVal);
                    amazonPriceLabel.setText(amazonVal);
                    facebookPriceLabel.setText(facebookVal);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
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
