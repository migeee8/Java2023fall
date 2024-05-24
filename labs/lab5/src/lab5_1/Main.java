package lab5_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main extends JFrame implements ActionListener {

    private JTextField filePathField, appendStringField;
    private JTextArea textArea;
    private JButton writeToFileButton;

    public Main() {
        setTitle("Main Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        JLabel path = new JLabel("�������ļ�·�������ƣ�");
        filePathField = new JTextField();

        JLabel append = new JLabel("��������Ҫ׷�ӵ����ݣ�");
        appendStringField = new JTextField();
        appendStringField.addActionListener(this);

        writeToFileButton = new JButton("���ı���������д���ļ�");
        writeToFileButton.addActionListener(this);

        inputPanel.add(path);
        inputPanel.add(filePathField);
        inputPanel.add(append);
        inputPanel.add(appendStringField);
        inputPanel.add(writeToFileButton);

        add(inputPanel, BorderLayout.NORTH);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setSize(400,300);
        setLocationRelativeTo(null); // ������������Ļ����
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == appendStringField) {
            String text = appendStringField.getText();
            textArea.append(text + "\n");
            appendStringField.setText("");
        } else if (e.getSource() == writeToFileButton) {
            String filePath = filePathField.getText();
            String content = textArea.getText();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(content);
                JOptionPane.showMessageDialog(this, "������д���ļ���");
            } catch (IOException exception) {
                JOptionPane.showMessageDialog(this, "д���ļ�ʱ����" + exception.getMessage(),
                        "����", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
