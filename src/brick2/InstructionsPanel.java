/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import javax.swing.JPanel;
import javax.swing.*;
/**
 *
 * @author Marchetti
 */
public class InstructionsPanel extends JPanel{
    JLabel instructionLabel;
    JTextArea instructions;
    
    JLabel scoreLabel;
    JTextArea highScores;
    
    public InstructionsPanel()
    {
        instructions = new JTextArea(10, 10);
        highScores = new JTextArea(10, 10);
        
        instructionLabel = new JLabel("Instructions: ");
        scoreLabel = new JLabel("Score: ");
        
        this.setSize(400, 200);
        this.add(instructionLabel);
        this.add(instructions);
        this.add(scoreLabel);
        this.add(highScores);
    }
}
