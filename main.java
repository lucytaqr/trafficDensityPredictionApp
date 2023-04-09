import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.Action;
import javax.swing.ComboBoxEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;    
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main extends bayes {
    protected JComboBox comboBox;

    public main(){
        JFrame frame = new JFrame();
        frame.setTitle("Traffic Density Prediction");
        frame.setSize(400,210);                                 //mengatur ukuran frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //mengatur fungsi close frame
        frame.setLocationRelativeTo(null);                      //mengatur agar frame di tengah
        frame.setLayout(null);                                  //mengatur layout manual
        frame.setResizable(false);                              //agar frame tidak bisa diubah ukurannya
        

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(255,234,208));

        JLabel label = new JLabel();
        label.setText("Density Prediction");
        label.setFont(new Font(" ", Font.BOLD, 15));
        label.setBounds(130, 20, 150, 20);                      //mengatur posisi label
        frame.add(label);                                       //memasukkan label ke frame

        JLabel label2 = new JLabel();
        label2.setText("Current Weather :");
        label2.setBounds(70, 70, 150, 20);
        frame.add(label2);
        //combobox
        String weather[] = {"scattered clouds", "overcast clouds", "sky is clear", "few clouds", 
        "broken clouds", "light rain", "light intensity drizzle", "mist", "proximity shower rain", 
        "haze", "fog"};

        JComboBox comboBox = new JComboBox<>(weather);
        comboBox.setBounds(180, 70, 140, 20);
        frame.add(comboBox);

        JButton button = new JButton();
        button.setText("Result");
        button.setBounds(150, 120, 80, 20);
        frame.add(button);
        button.addActionListener((e)->{
            super.setweather_desc(comboBox.getSelectedItem().toString());
            super.klasifikasi();

            JFrame frame2 = new JFrame();
            frame2.setTitle("Result");
            frame2.setSize(300,200);                                //mengatur ukuran frame
            frame2.setLocationRelativeTo(null);                      //mengatur agar frame di tengah
            frame2.setLayout(null);                                  //mengatur layout manual
            frame2.setResizable(false);                              //agar frame tidak bisa diubah ukurannya
            frame2.setVisible(true);                                 //menampilkan frame

            
            frame2.setIconImage(image.getImage());
            frame2.getContentPane().setBackground(new Color(255,234,208));
    
            JLabel label3 = new JLabel();
            label3.setText("== PREDICTION RESULT ==");
            label3.setFont(new Font(" ", Font.BOLD, 13));
            label3.setBounds(60, 20, 200, 20);                      //mengatur posisi label
            frame2.add(label3);                                       //memasukkan label ke frame

            JLabel label4 = new JLabel(super.hasill());
            label4.setBounds(120, 50, 150, 20);
            frame2.add(label4);

            JLabel label5 = new JLabel("Large Probability : "+super.getbayeslarge()+"");
            label5.setBounds(20, 80, 300, 20);
            frame2.add(label5);

            JLabel label6 = new JLabel("Medium Probability : "+super.getbayesmed()+"");
            label6.setBounds(20, 100, 300, 20);
            frame2.add(label6);

            JLabel label7 = new JLabel("Small Probability : "+super.getbayessmall()+"");
            label7.setBounds(20, 120, 300, 20);
            frame2.add(label7);
            
        });

        frame.setVisible(true);                                 //menampilkan frame
    }
    public static void main(String[] args) {     
        new main();
    }
}
   

