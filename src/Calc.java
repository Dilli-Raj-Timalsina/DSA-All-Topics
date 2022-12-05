import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calc  extends JFrame  {

    private Double toBeCalculated;
    private String sign;
    private boolean isDecimal=false;
    private JPanel contentPane;
    private JTextField textField;
    private JLabel label;

    /**
     * Launch the application.
     */
    private void toBeCalculatedValueStore(String sign)
    {
        String s1=textField.getText();
        toBeCalculated=Double.parseDouble(textField.getText());
        label.setText(s1+" "+sign);
        textField.setText("");

    }

    public void add(double a,double b)
    {
        setMethod(a+b);
    }


    public void minus(double a,double b)
    {
        setMethod(a-b);
    }


    public void div(double a,double b)
    {
        setMethod(a/b);
    }


    public void multiply(double a,double b)
    {
        setMethod(a+b);
    }


    public void setMethod(double c)
    {
        textField.setText(Double.toString(c));
        label.setText("");
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calc frame = new Calc();
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
    public Calc() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 318, 463);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton v1 = new JButton("%");
        v1.setFocusTraversalPolicyProvider(true);
        v1.setFocusPainted(false);
        v1.setToolTipText("");
        v1.setBounds(10, 114, 63, 39);
        v1.setHorizontalAlignment(SwingConstants.TRAILING);
        v1.setForeground(Color.BLACK);
        v1.setBackground(new Color(255, 255, 255));
        v1.setFont(new Font("Tahoma", Font.BOLD, 22));
        contentPane.add(v1);

        JButton x_sq = new JButton("x\u00B2");
        x_sq.setFocusPainted(false);
        x_sq.setBounds(83, 114, 63, 39);
        x_sq.setFont(new Font("Tahoma", Font.BOLD, 25));
        x_sq.setBackground(Color.WHITE);
        x_sq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        contentPane.add(x_sq);

        JButton onebyX = new JButton("1/x");
        onebyX.setFocusPainted(false);
        onebyX.setBounds(156, 114, 63, 39);
        onebyX.setHorizontalAlignment(SwingConstants.LEFT);
        onebyX.setBackground(Color.WHITE);
        onebyX.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(onebyX);

        JButton root = new JButton("\u221A");
        root.setFocusPainted(false);
        root.setBounds(229, 114, 63, 39);
        root.setFont(new Font("Tahoma", Font.BOLD, 25));
        root.setBackground(Color.WHITE);
        contentPane.add(root);

        JButton ce = new JButton("CE");
        ce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        ce.setFocusPainted(false);
        ce.setBounds(10, 164, 63, 39);
        ce.setFont(new Font("Tahoma", Font.BOLD, 17));
        ce.setBackground(Color.WHITE);
        contentPane.add(ce);

        JButton c = new JButton("C");
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("      ");
                label.setText("");

            }
        });
        c.setFocusPainted(false);
        c.setBounds(83, 164, 63, 39);
        c.setBackground(Color.WHITE);
        c.setFont(new Font("Tahoma", Font.BOLD, 20));
        contentPane.add(c);

        JButton dou_minus = new JButton("<--");
        dou_minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1=textField.getText();
                int a=s1.length();
                if(a>0)
                {
                    StringBuilder sb1=new StringBuilder(s1);
                    sb1.deleteCharAt(a-1);
                    textField.setText(sb1.toString());
                }
            }
        });
        dou_minus.setFocusPainted(false);
        dou_minus.setBounds(156, 164, 63, 39);
        dou_minus.setFont(new Font("Tahoma", Font.BOLD, 17));
        dou_minus.setBackground(Color.WHITE);
        contentPane.add(dou_minus);

        JButton div = new JButton("\\");
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sign="/";
                if(textField.getText().length()>0)
                {
                    toBeCalculatedValueStore("/");
                }

            }
        });
        div.setFocusPainted(false);
        div.setBounds(229, 164, 63, 39);
        div.setFont(new Font("Tahoma", Font.BOLD, 25));
        div.setBackground(Color.WHITE);
        contentPane.add(div);

        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"7");
            }
        });
        seven.setFocusPainted(false);
        seven.setBounds(10, 214, 63, 39);
        seven.setFont(new Font("Tahoma", Font.BOLD, 25));
        seven.setBackground(Color.WHITE);
        contentPane.add(seven);

        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"8");
            }
        });
        eight.setFocusPainted(false);
        eight.setBounds(83, 214, 63, 39);
        eight.setFont(new Font("Tahoma", Font.BOLD, 25));
        eight.setBackground(Color.WHITE);
        contentPane.add(eight);

        JButton nine = new JButton("9");
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"9");
            }
        });
        nine.setFocusPainted(false);
        nine.setBounds(156, 214, 63, 39);
        nine.setFont(new Font("Tahoma", Font.BOLD, 25));
        nine.setBackground(Color.WHITE);
        contentPane.add(nine);

        JButton mul = new JButton("*");
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sign="*";
                if(textField.getText().length()>0)
                {
                    toBeCalculatedValueStore("*");
                }
            }
        });
        mul.setFocusPainted(false);
        mul.setBounds(229, 214, 63, 39);
        mul.setFont(new Font("Tahoma", Font.BOLD, 28));
        mul.setBackground(Color.WHITE);
        contentPane.add(mul);

        JButton four = new JButton("4");
        four.setFocusPainted(false);
        four.setBounds(10, 264, 63, 39);
        four.setFont(new Font("Tahoma", Font.BOLD, 25));
        four.setBackground(Color.WHITE);
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"4");
            }
        });
        contentPane.add(four);

        JButton five = new JButton("5");
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"5");
            }
        });
        five.setFocusPainted(false);
        five.setBounds(83, 264, 63, 39);
        five.setFont(new Font("Tahoma", Font.BOLD, 25));
        five.setBackground(Color.WHITE);
        contentPane.add(five);

        JButton six = new JButton("6");
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"6");
            }
        });
        six.setFocusPainted(false);
        six.setBounds(156, 264, 63, 39);
        six.setFont(new Font("Dialog", Font.BOLD, 25));
        six.setBackground(Color.WHITE);
        contentPane.add(six);

        JButton minus = new JButton("-");
        minus.setFocusPainted(false);
        minus.setBounds(229, 264, 63, 39);
        minus.setFont(new Font("Tahoma", Font.BOLD, 25));
        minus.setBackground(Color.WHITE);
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sign="-";
                if(textField.getText().length()>0)
                {
                    toBeCalculatedValueStore("-");
                }
            }
        });
        contentPane.add(minus);

        JButton one = new JButton("1");
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"1");
            }
        });
        one.setFocusPainted(false);
        one.setBounds(10, 314, 63, 39);
        one.setFont(new Font("Tahoma", Font.BOLD, 25));
        one.setBackground(Color.WHITE);
        contentPane.add(one);

        JButton two = new JButton("2");
        two.setFocusPainted(false);
        two.setBounds(83, 314, 63, 39);
        two.setFont(new Font("Tahoma", Font.BOLD, 25));
        two.setBackground(Color.WHITE);
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"2");

            }
        });
        contentPane.add(two);

        JButton three = new JButton("3");
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"3");
            }
        });
        three.setFocusPainted(false);
        three.setBounds(156, 314, 63, 39);
        three.setBackground(Color.WHITE);
        three.setFont(new Font("Tahoma", Font.BOLD, 25));
        contentPane.add(three);

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sign="+";
                if(textField.getText().length()>0)
                {
                    toBeCalculatedValueStore("+");
                }
            }
        });
        plus.setFocusPainted(false);
        plus.setBounds(229, 314, 63, 39);
        plus.setFont(new Font("Tahoma", Font.BOLD, 25));
        plus.setBackground(Color.WHITE);
        contentPane.add(plus);

        JButton plusMinus = new JButton("+-");
        plusMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1=textField.getText();
                if(!s1.contains("-"))
                {
                    textField.setText("-"+textField.getText());
                }
                else
                {
                    try
                    {
                        textField.setText(s1.split("-")[1]);
                    }
                    catch(IndexOutOfBoundsException a)
                    {
                        textField.setText("");
                    }
                }
            }
        });
        plusMinus.setFocusPainted(false);
        plusMinus.setBounds(10, 364, 63, 39);
        plusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        plusMinus.setBackground(Color.WHITE);
        contentPane.add(plusMinus);

        JButton zero = new JButton("0");
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+"0");
            }
        });
        zero.setFocusPainted(false);
        zero.setBounds(83, 364, 63, 39);
        zero.setFont(new Font("Tahoma", Font.BOLD, 25));
        zero.setBackground(Color.WHITE);
        contentPane.add(zero);

        JButton point = new JButton(".");
        point.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!isDecimal)
                {
                    textField.setText(textField.getText()+".");
                    isDecimal=true;
                }

            }
        });
        point.setFocusPainted(false);
        point.setBounds(156, 364, 63, 39);
        point.setFont(new Font("Tahoma", Font.BOLD, 25));
        point.setBackground(Color.WHITE);
        contentPane.add(point);

        JButton equal = new JButton("=");
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double b= Double.parseDouble(textField.getText());
                if(textField.getText().length()>0)
                {
                    switch(sign)
                    {
                        case "+" :
                            add(toBeCalculated,b);
                            break;
                        case "-" :
                            minus(toBeCalculated,b);
                            break;
                        case "*" :
                            multiply(toBeCalculated,b);
                            break;
                        case "/" :
                            div(toBeCalculated,b);
                            break;




                    }
                }
            }
        });
        equal.setFocusPainted(false);
        equal.setBounds(229, 364, 63, 39);
        equal.setFont(new Font("Tahoma", Font.BOLD, 25));
        equal.setBackground(Color.WHITE);
        contentPane.add(equal);

        textField = new JTextField();

        textField.setBounds(10, 11, 282, 50);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(Color.WHITE);
        textField.setFont(new Font("Tahoma", Font.BOLD, 25));
        contentPane.add(textField);
        textField.setColumns(10);

        label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Tahoma", Font.BOLD, 14));
        label.setBounds(10, 73, 292, 30);
        contentPane.add(label);
    }
}
