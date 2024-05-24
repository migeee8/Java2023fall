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
    	setTitle("猜数字小游戏");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);//组件与容器边界之间的空白区域

        // 创建一个面板用于放置随机数和猜测的组件
        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
        randomLabel = new JLabel("获取1-10的随机整数:");
        getIntBt = new JButton("得到一个随机数");
        getIntBt.addActionListener(this);
        guessLabel = new JLabel("输入您的猜测:");
        guessTextField = new JTextField();

        panel.add(randomLabel);
        panel.add(getIntBt);
        panel.add(guessLabel);
        panel.add(guessTextField);

        // 将面板添加到窗口中，并让其在垂直和水平方向拉伸并水平居中
        gbc.weightx = 1.0; // 让组件在水平方向上拉伸
        gbc.weighty = 1.0; // 让组件在垂直方向上拉伸
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER; // 设置水平居中
        add(panel, gbc);

        // 创建一个水平盒子，放置确定按钮和提示信息
        Box box = Box.createHorizontalBox();
        confirmLabel = new JLabel("单击确定按钮:");
        box.add(confirmLabel);
        box.add(Box.createHorizontalStrut(10));
        guessBt = new JButton("确定");
        guessBt.addActionListener(this);
        box.add(guessBt);

        // 在 Box 内部添加 Glue 组件来实现水平居中
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(Box.createHorizontalGlue());
        horizontalBox.add(box);
        horizontalBox.add(Box.createHorizontalGlue());

        // 将水平盒子添加到窗口中
        gbc.gridy = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER; // 设置水平居中
        add(horizontalBox, gbc);

        // 创建一个标签用于显示反馈信息
        feedbackLabel = new JLabel("无反馈信息");
        feedbackLabel.setForeground(Color.BLUE);

        // 将标签添加到窗口中，并让其水平居中
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        add(feedbackLabel, gbc);

        // 设置窗口大小和显示位置
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getIntBt) {
            randomNumber = (int) (Math.random() * 10) + 1;
            feedbackLabel.setText("无反馈信息"); // 重置反馈信息
        } else if (e.getSource() == guessBt) {
            try {
                if (randomNumber == 0) {
                    feedbackLabel.setText("请先点击按钮获取随机数");
                    return;
                }

                int guessedNumber = Integer.parseInt(guessTextField.getText());

                if (guessedNumber > randomNumber) {
                    feedbackLabel.setText("猜大了");
                } else if (guessedNumber < randomNumber) {
                    feedbackLabel.setText("猜小了");
                } else {
                    feedbackLabel.setText("猜对了");
                    randomNumber = 0; // 重新设置随机数为0，等待下一轮游戏
                }
            } catch (NumberFormatException ex) {
                feedbackLabel.setText("请输入有效整数！");
            }
        }
    }

    public static void main(String[] args) {
        new GuessNumberFrame();
    }
}
