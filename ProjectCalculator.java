import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProjectCalculator implements ActionListener {
    JLabel displayLabel;
    JButton nineButton;
    JButton eightButton;
    JButton sevenButton;
    JButton sixButton;
    JButton fiveButton;
    JButton fourButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton zeroButton;
    JButton dotButton, addButton, subButton, mulButton, divButton, equalButton, clearButton;

    boolean isOperatorClicked = false;
    String oldValue;
    String operator;

    public ProjectCalculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(400, 300);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);

        nineButton = new JButton("9");
        nineButton.setBounds(30, 130, 80, 80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        sevenButton = new JButton("7");
        sevenButton.setBounds(230, 130, 80, 80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.addActionListener(this);
        jf.add(divButton);

        sixButton = new JButton("6");
        sixButton.setBounds(30, 230, 80, 80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        fourButton = new JButton("4");
        fourButton.setBounds(230, 230, 80, 80);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        mulButton = new JButton("X");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        threeButton = new JButton("3");
        threeButton.setBounds(30, 330, 80, 80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        oneButton = new JButton("1");
        oneButton.setBounds(230, 330, 80, 80);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        subButton = new JButton("-");
        subButton.setBounds(330, 330, 80, 80);
        subButton.addActionListener(this);
        jf.add(subButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        addButton = new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        addButton.addActionListener(this);
        jf.add(addButton);

        clearButton = new JButton("CLR");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ProjectCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.getSource();
        String currentText = displayLabel.getText();

        if (source == nineButton) {
            displayLabel.setText(currentText + "9");
        } else if (source == eightButton) {
            displayLabel.setText(currentText + "8");
        } else if (source == sevenButton) {
            displayLabel.setText(currentText + "7");
        } else if (source == sixButton) {
            displayLabel.setText(currentText + "6");
        } else if (source == fiveButton) {
            displayLabel.setText(currentText + "5");
        } else if (source == fourButton) {
            displayLabel.setText(currentText + "4");
        } else if (source == threeButton) {
            displayLabel.setText(currentText + "3");
        } else if (source == twoButton) {
            displayLabel.setText(currentText + "2");
        } else if (source == oneButton) {
            displayLabel.setText(currentText + "1");
        } else if (source == zeroButton) {
            displayLabel.setText(currentText + "0");
        } else if (source == dotButton) {
            displayLabel.setText(currentText + ".");
        } else if (source == addButton || source == subButton || source == mulButton || source == divButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            operator = source.getText();
            displayLabel.setText("");
        } else if (source == equalButton) {
            String newValue = displayLabel.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);
            float result = 0;

            switch (operator) {
                case "+":
                    result = oldValueF + newValueF;
                    break;
                case "-":
                    result = oldValueF - newValueF;
                    break;
                case "X":
                    result = oldValueF * newValueF;
                    break;
                case "/":
                    result = oldValueF / newValueF;
                    break;
            }
            displayLabel.setText(result + "");
        } else if (source == clearButton) {
            displayLabel.setText("");
            oldValue = "";
            operator = "";
            isOperatorClicked = false;
        }
    }
}
