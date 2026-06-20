package bankaccount2;
	
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class bankaccount22 {

    public static void main(String[] args) {

    	bankaccount2 acct = new bankaccount2("Zach", "Smith", 12345, 100.00);

        JFrame frame = new JFrame("Bank Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel balanceLabel = new JLabel("Balance: $" + acct.getBalance());
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");

        depositBtn.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter deposit amount:");
            if (input != null) {
                double amount = Double.parseDouble(input);
                acct.deposit(amount);
                balanceLabel.setText("Balance: $" + acct.getBalance());
            }
        });

        withdrawBtn.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("Enter withdrawal amount:");
            if (input != null) {
                double amount = Double.parseDouble(input);
                if (acct.withdraw(amount)) {
                    balanceLabel.setText("Balance: $" + acct.getBalance());
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient funds");
                }
            }
        });

        panel.add(balanceLabel);
        panel.add(depositBtn);
        panel.add(withdrawBtn);

        frame.add(panel);
        frame.setVisible(true);
    }
}

