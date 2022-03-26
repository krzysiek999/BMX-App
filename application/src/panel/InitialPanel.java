/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import frame.MainFrame;
import javax.swing.JFrame;
import classes.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sluja
 */
public class InitialPanel extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form InitialPanel
     */
    JFrame frame;
    JButton nextB = new JButton("GO!");
    
    JPanel eastPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    
    BorderLayout layout = new BorderLayout();
    LanguageComboBox languageBox = new LanguageComboBox();
    
    private String[][] countryList  = {{"Polish", "src/images/pl.png"},
                                       {"English", "src/images/gb.png"},
                                       {"German", "src/images/de.png"}
    }; 
    public InitialPanel(JFrame frame) {
        
        this.setPreferredSize(new Dimension(500,500));
        this.setLayout(layout);
        this.frame = frame; 
        initialProperties();
    }

    private void initialProperties()
    {
        
        eastPanel.setLayout(new FlowLayout());
        languageBox.setPreferredSize(new Dimension(120, 30));
        languageBox.setEditable(true);
        languageBox.addItems(countryList);
         
        eastPanel.add(languageBox);
        
        centerPanel.add(nextB);
        
        nextB.addActionListener(this);
        
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(eastPanel, BorderLayout.EAST);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        MainFrame mainFrame = new MainFrame();
        
        for(int i=0;i<3;i++)
        {
            if(languageBox.getSelectedItem().toString().equals(countryList[1][i])) 
            {
                mainFrame.setLanguage(languageBox.getSelectedItem().toString());
                break;
            }
            else 
            {
                mainFrame.setLanguage("Polish");
                break;
            }
        }
        
        mainFrame.setMainFeature();
        mainFrame.setVisible(true);
        
    }
}
