import javax.swing.*;
import java.awt.*;


/*
 The Composite Design Pattern in Swing
 
 Complex layouts often need nested layouts
 The subclass relationship in Swing is: JButton/JLabel/JPaneletc is-a JComponent is-a Container is-a Component (yes there is a J and a non-J Component, it is a historical oddity)
 Components are what can be added to the JFrames Container
 Since JComponent is a Container, it is possible to add components to any component -- the component structure of a window can be nested.
 this is a clever design that is useful because you can put a whole window-in-a-window (like frames in html), making complex UI designs easier.
 This is an instance of a design pattern, the Composite pattern
 
 => http://pl.cs.jhu.edu/oose/lectures/swing.shtml
 */


public class CompositePatternInSwing  {

    Stylo stylo;
    Commande commande;
    Lot lot;
    Ramette ramette;

    public static void main (String[] args) {
       CompositePatternInSwing gui = new CompositePatternInSwing();
       gui.go();
    }

    public void go() {
       frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
       label1 = new JLabel("I'm a label!");  
       label2 = new JLabel("Me too!");  

       labelPanel = new JPanel();
       labelPanel.add(label1);
       labelPanel.add(label2);

       button1 = new JButton("I'm just a button");
       button2 = new JButton("Ditto");
       
       buttonPanel = new JPanel();
       buttonPanel.add(button1);
       buttonPanel.add(button2);
       
       fullPanel = new JPanel();
       fullPanel.setLayout(new BoxLayout(fullPanel, BoxLayout.Y_AXIS));
       fullPanel.add(labelPanel);
       fullPanel.add(buttonPanel);
 
       frame.getContentPane().add(BorderLayout.CENTER,fullPanel);
       frame.setSize(400,200);
       frame.setVisible(true);
    }


}

   

       
      

       