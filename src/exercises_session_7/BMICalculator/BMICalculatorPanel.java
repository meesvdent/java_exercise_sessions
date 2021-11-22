package exercises_session_7.BMICalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.EventListener;

public class BMICalculatorPanel {

    private BMICalculator bmic;
    double weight, height;
    JFrame frame;
    JPanel panelOne, panelTwo, panelThree;
    JTextField weightInput, heightInput;
    JLabel heightLabel, weightLabel, meterLabel, kgLabel, outputLabel, kgm2Label, output;
    JButton calculateButton;

    public BMICalculatorPanel(){
        panelOne = new JPanel();
        panelOne.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        panelOne.setLayout(new GridLayout(2,3));
        panelTwo = new JPanel();
        panelTwo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10 ,0));
        panelThree = new JPanel();
        panelThree.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        panelThree.setLayout(new GridLayout(1, 3));

        // init all static labels
        heightLabel = new JLabel("Your height: ", JLabel.RIGHT);
        weightLabel = new JLabel("Your weight: ", JLabel.RIGHT);
        outputLabel = new JLabel("BMI: ", JLabel.RIGHT);
        meterLabel = new JLabel(" m");
        kgLabel = new JLabel(" kg");
        kgm2Label = new JLabel(" kg/m^2");
        output = new JLabel("");

        // init textFields
        weightInput = new JTextField("");
        heightInput = new JTextField("");

        // init buttons
        calculateButton = new JButton("Calculate BMI");
        calculateButton.addActionListener(new ButtonEventListener());

        // add components to panels
        // panel one weight
        panelOne.add(weightLabel);
        panelOne.add(weightInput);
        panelOne.add(kgLabel);
        // panel one height
        panelOne.add(heightLabel);
        panelOne.add(heightInput);
        panelOne.add(meterLabel);
        // panel two
        panelTwo.add(calculateButton);
        // panel three
        panelThree.add(outputLabel);
        panelThree.add(output);
        panelThree.add(kgm2Label);

        frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));
        frame.add(panelOne);
        frame.add(panelTwo);
        frame.add(panelThree);
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private class ButtonEventListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                weight = Double.parseDouble(weightInput.getText());
                System.out.println(weight);
                height = Double.parseDouble(heightInput.getText());
                System.out.println(height);
                bmic = new BMICalculator(weight, height);
                bmic.calculateBmi();
                DecimalFormat df = new DecimalFormat ("0.##");
                output.setText(String.valueOf(df.format(bmic.getBMI())));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                System.out.println("except");
                outputLabel.setText("Invalid weight or height, please enter numbers seperated by point.");
            }
        }
    }

    public static void main(String[] args) {
        BMICalculatorPanel curPanel = new BMICalculatorPanel();
    }
}
