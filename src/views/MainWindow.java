/*
* File: MainWindow.java
* Author: Nagy József
* Refactor: Szinyei Mikes
* Copyright: 2021, Nagy József
* Date: 2021-09-11
* Refactor Date: 2023-12-01
* Github: https://github.com/mikesszinyei
* Licenc: MIT
* 
*/
package views;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    public JButton startBtn = new JButton("Start");
    public JButton stopBtn = new JButton("Stop");
    public JButton nextBtn = new JButton("Következő");
    public JPanel tablePanel = new JPanel();
    public JButton flop1Btn = new JButton("");
    public JButton flop2Btn = new JButton("");
    public JButton flop3Btn = new JButton("");
    public JPanel handPanel = new JPanel();
    public JButton humanCard1Btn = new JButton();
    public JButton humanCard2Btn = new JButton();
    public JPanel buttonPanel = new JPanel();
    public JButton turnButton = new JButton();
    public JButton riverButton = new JButton();


    public MainWindow() {

        setLayout();
        addComponents();
        addButtonComponents();
        addTableComponenets();
        addHandComponents();
        setButtons();
        initFrame();
    
    }

    private void initFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponents() {
        this.add(buttonPanel);
        this.add(tablePanel);
        this.add(handPanel);
    }

    private void addButtonComponents() {
        this.buttonPanel.add(startBtn);
        this.buttonPanel.add(nextBtn);
        this.buttonPanel.add(stopBtn);
    }

    private void addTableComponenets() {
        this.tablePanel.add(flop1Btn);
        this.tablePanel.add(flop2Btn);
        this.tablePanel.add(flop3Btn);
        this.tablePanel.add(turnButton);
        this.tablePanel.add(riverButton);
    }

    private void setLayout() {
        this.setSize(300, 250);
        this.tablePanel.setSize(100, 100);
        this.tablePanel.setBackground(Color.LIGHT_GRAY);
        
    }

    private void addHandComponents() {
        this.handPanel.add(this.humanCard1Btn);
        this.handPanel.add(this.humanCard2Btn);
    }
    
    private void setButtons() {
        this.flop1Btn.setVisible(false);
        this.flop2Btn.setVisible(false);
        this.flop3Btn.setVisible(false);
        this.turnButton.setVisible(false);
        this.riverButton.setVisible(false);
    }
}
