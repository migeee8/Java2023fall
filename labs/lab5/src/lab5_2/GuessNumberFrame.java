package lab5_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberFrame extends JFrame implements ActionListener {

    private JButton getIntBt, guessBt;
    private JLabel randomLabel, guessLabel, confirmLabel, feedbackLabel;
    private JTextField guessTextField;
    private int randomNumber = 0;

    public GuessNumberFrame() {
    	setTitle("������С��Ϸ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);//����������߽�֮��Ŀհ�����

        // ����һ��������ڷ���������Ͳ²�����
        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
        randomLabel = new JLabel("��ȡ1-10���������:");
        getIntBt = new JButton("�õ�һ�������");
        getIntBt.addActionListener(this);
        guessLabel = new JLabel("�������Ĳ²�:");
        guessTextField = new JTextField();

        panel.add(randomLabel);
        panel.add(getIntBt);
        panel.add(guessLabel);
        panel.add(guessTextField);

        // �������ӵ������У��������ڴ�ֱ��ˮƽ�������첢ˮƽ����
        gbc.weightx = 1.0; // �������ˮƽ����������
        gbc.weighty = 1.0; // ������ڴ�ֱ����������
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER; // ����ˮƽ����
        add(panel, gbc);

        // ����һ��ˮƽ���ӣ�����ȷ����ť����ʾ��Ϣ
        Box box = Box.createHorizontalBox();
        confirmLabel = new JLabel("����ȷ����ť:");
        box.add(confirmLabel);
        box.add(Box.createHorizontalStrut(10));
        guessBt = new JButton("ȷ��");
        guessBt.addActionListener(this);
        box.add(guessBt);

        // �� Box �ڲ���� Glue �����ʵ��ˮƽ����
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(Box.createHorizontalGlue());
        horizontalBox.add(box);
        horizontalBox.add(Box.createHorizontalGlue());

        // ��ˮƽ������ӵ�������
        gbc.gridy = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER; // ����ˮƽ����
        add(horizontalBox, gbc);

        // ����һ����ǩ������ʾ������Ϣ
        feedbackLabel = new JLabel("�޷�����Ϣ");
        feedbackLabel.setForeground(Color.BLUE);

        // ����ǩ��ӵ������У�������ˮƽ����
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        add(feedbackLabel, gbc);

        // ���ô��ڴ�С����ʾλ��
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getIntBt) {
            randomNumber = (int) (Math.random() * 10) + 1;
            feedbackLabel.setText("�޷�����Ϣ"); // ���÷�����Ϣ
        } else if (e.getSource() == guessBt) {
            try {
                if (randomNumber == 0) {
                    feedbackLabel.setText("���ȵ����ť��ȡ�����");
                    return;
                }

                int guessedNumber = Integer.parseInt(guessTextField.getText());

                if (guessedNumber > randomNumber) {
                    feedbackLabel.setText("�´���");
                } else if (guessedNumber < randomNumber) {
                    feedbackLabel.setText("��С��");
                } else {
                    feedbackLabel.setText("�¶���");
                    randomNumber = 0; // �������������Ϊ0���ȴ���һ����Ϸ
                }
            } catch (NumberFormatException ex) {
                feedbackLabel.setText("��������Ч������");
            }
        }
    }

    public static void main(String[] args) {
        new GuessNumberFrame();
    }
}
