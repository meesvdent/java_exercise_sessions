package exercises_session_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingleButton {

    public static void main(String[] args) {
        // Setup frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Frame title");
        // Setup panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setLayout(new FlowLayout());

        // Single button
        JButton singleButton = new JButton("A button");
        singleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        // Label
        JLabel buttonLabel = new JLabel("This is my label");

        frame.getContentPane().add(panel);
        panel.add(buttonLabel);
        panel.add(singleButton);

        frame.pack();
        frame.setVisible(true);
    }
}
