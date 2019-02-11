// import  SWING of AWT libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * Class GUI creates the appearance of the quiz game
 * @author Prabodh Rai pr245
 * @version version 2 4/1/2016
 */
public class GUI implements ActionListener
{
    // create JFrame
    private JFrame frame;   
    // create global variable button
    private JButton start1;
    // create global variable answer buttons
    private JButton answer1;
    private JButton answer2;
    private JButton answer3;
    private JButton answer4;

    // create global variable JTextField with a limit of 20 characters
    private JTextField txtField= new JTextField(20);
    // create global varible JProgressBar
    private JProgressBar progressBar = new JProgressBar();
    // create Container
    private Container contentPane;
    // call from Quiz Gameclass
    private Quiz game;

    /**
     * Constructor for objects of class GUI
     */
    public GUI(int w, int h)
    {
        game = new Quiz(); 

        frame = new JFrame("Quiz Game Cilent");
        frame.setSize(w,h);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        // main menu
        start1 = new JButton("Begin Quiz");
        //question 1
        answer1 = new JButton();
        answer2 = new JButton();
        answer3 = new JButton();
        answer4 = new JButton();

        makeFrame();
    }

    /**
     * Create main menu frame.
     */
    public void makeFrame()
    {
        contentPane = frame.getContentPane();
        contentPane.removeAll();
        contentPane.setLayout(new BorderLayout());
        JLabel Titlelabel = new JLabel("Java Quiz Game", SwingConstants.CENTER);
        ImageIcon icon = new ImageIcon("logo.jpeg");
        frame.setIconImage(icon.getImage());
        JLabel logo = new JLabel(icon, SwingConstants.CENTER);

        start1.setBackground(Color.GREEN);

        JPanel p = new JPanel(new GridLayout(2,2));
        JPanel s = new JPanel(new GridLayout(2,2));
        JPanel l = new JPanel(new GridLayout(2,2));

        p.add(start1,0);
        s.add(Titlelabel,0);
        l.add(logo,0);

        makeMenuBar(frame);

        start1.addActionListener(this);

        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(l, BorderLayout.CENTER);
        contentPane.add(p, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();

    }

    /**
     * Create question 1 frame.
     */
    public void quiz1()
    {

        makeMenuBar(frame);
        Container contentPane1 = frame.getContentPane();
        contentPane1.removeAll();
        JLabel Titlelabel = new JLabel(game.questions(1), SwingConstants.CENTER);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Quiz Progress");
        progressBar.setBorder(border);

        JPanel p = new JPanel(new GridLayout(2,2));
        JPanel s = new JPanel(new GridLayout(2,2));
        JPanel l = new JPanel(new GridLayout(2,2));

        answer1 = new JButton(game.q1a(1));
        answer2 = new JButton(game.q1a(2));
        answer3 = new JButton(game.q1a(3));
        answer4 = new JButton(game.q1a(4));

        p.add(answer1);
        p.add(answer2);
        p.add(answer3);
        p.add(answer4);
        s.add(Titlelabel,0); 
        l.add(progressBar); 

        answer1.addActionListener(this); 
        answer2.addActionListener(this);
        answer3.addActionListener(this); 
        answer4.addActionListener(this);

        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(p, BorderLayout.SOUTH);
        contentPane.add(l, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();

    }

    /**
     * Create question 2 frame.
     */
    public void quiz2()
    {

        makeMenuBar(frame);
        Container contentPane1 = frame.getContentPane();
        contentPane1.removeAll();
        JLabel Titlelabel = new JLabel(game.questions(2), SwingConstants.CENTER);
        progressBar.setValue(17);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Quiz Progress");
        progressBar.setBorder(border);

        JPanel p = new JPanel(new GridLayout(2,2));
        JPanel s = new JPanel(new GridLayout(2,2));
        JPanel l = new JPanel(new GridLayout(2,2));

        answer1 = new JButton(game.q2a(1));
        answer2 = new JButton(game.q2a(2));
        answer3 = new JButton(game.q2a(3));
        answer4 = new JButton(game.q2a(4));

        p.add(answer1);
        p.add(answer2);
        p.add(answer3);
        p.add(answer4);
        s.add(Titlelabel,0); 
        l.add(progressBar); 

        answer1.addActionListener(this); 
        answer2.addActionListener(this);
        answer3.addActionListener(this); 
        answer4.addActionListener(this);

        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(p, BorderLayout.SOUTH);
        contentPane.add(l, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();

    }

    /**
     * Create question 3 frame.
     */
    public void quiz3()
    {

        makeMenuBar(frame);
        Container contentPane1 = frame.getContentPane();
        contentPane1.removeAll();
        JLabel Titlelabel = new JLabel(game.questions(3), SwingConstants.CENTER);
        ImageIcon icon = new ImageIcon("q4.png");
        frame.setIconImage(icon.getImage());
        JLabel logo = new JLabel(icon, SwingConstants.CENTER);

        progressBar.setValue(33);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Quiz Progress");
        progressBar.setBorder(border);

        JPanel p = new JPanel(new GridLayout(2,2));
        JPanel s = new JPanel(new GridLayout(2,2));
        JPanel l = new JPanel(new GridLayout(2,2));
        JPanel k = new JPanel(new GridLayout(2,2));

        txtField.addActionListener(this);
        s.add(Titlelabel,0); 
        l.add(logo,0); 
        p.add(txtField,BorderLayout.CENTER);
        l.add(progressBar); 
        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(p, BorderLayout.SOUTH);
        contentPane.add(l, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();
    }

    /**
     * Create question 4 frame.
     */
    public void quiz4()
    {

        makeMenuBar(frame);
        Container contentPane1 = frame.getContentPane();
        contentPane1.removeAll();
        JLabel Titlelabel = new JLabel(game.questions(4), SwingConstants.CENTER);

        ImageIcon icon = new ImageIcon("transport.png");
        frame.setIconImage(icon.getImage());
        JLabel logo = new JLabel(icon, SwingConstants.CENTER);

        progressBar.setValue(50);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Quiz Progress");
        progressBar.setBorder(border);

        JPanel p = new JPanel(new GridLayout(2,2));
        JPanel s = new JPanel(new GridLayout(2,2));
        JPanel l = new JPanel(new GridLayout(2,2));
        JPanel z = new JPanel(new GridLayout(2,2));

        Icon a1 = new ImageIcon("bus.png");
        JButton button1 = new JButton(game.q4a(1),a1);
        Icon a2 = new ImageIcon("train.png");
        JButton button2 = new JButton(game.q4a(2),a2);
        Icon a3 = new ImageIcon("car2.png");
        JButton button3 = new JButton(game.q4a(3),a3);
        Icon a4 = new ImageIcon("bird.png");
        JButton button4 = new JButton(game.q4a(4),a4);

        s.add(Titlelabel,0); 
        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);
        l.add(logo,0); 
        z.add(progressBar);

        button1.addActionListener(this); 
        button2.addActionListener(this);
        button3.addActionListener(this); 
        button4.addActionListener(this);

        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(p, BorderLayout.SOUTH);
        contentPane.add(l, BorderLayout.CENTER);
        contentPane.add(z, BorderLayout.EAST);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();
    }

    /**
     * Create question 5 frame.
     */
    public void quiz5()
    {

        makeMenuBar(frame);
        Container contentPane1 = frame.getContentPane();
        contentPane1.removeAll();
        JLabel Titlelabel = new JLabel(game.questions(5), SwingConstants.CENTER);

        progressBar.setValue(67);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Quiz Progress");
        progressBar.setBorder(border);

        JPanel l = new JPanel(new GridLayout(2,2));

        l.add(progressBar); 

        contentPane.add(l, BorderLayout.CENTER);
        JPanel p = new JPanel(new GridLayout(2,2));
        JPanel s = new JPanel(new GridLayout(2,2));

        answer1 = new JButton(game.q5a(1));
        answer2 = new JButton(game.q5a(2));
        answer3 = new JButton(game.q5a(3));
        answer4 = new JButton(game.q5a(4));

        p.add(answer1);
        p.add(answer2);
        p.add(answer3);
        p.add(answer4);
        s.add(Titlelabel,0); 

        answer1.addActionListener(this); 
        answer2.addActionListener(this);
        answer3.addActionListener(this); 
        answer4.addActionListener(this);

        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(p, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();
    }

    /**
     * Create question 6 frame.
     */
    public void quiz6()
    {

        makeMenuBar(frame);
        Container contentPane1 = frame.getContentPane();
        contentPane1.removeAll();
        JLabel Titlelabel = new JLabel(game.questions(6), SwingConstants.CENTER);

        progressBar.setValue(83);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Quiz Progress");
        progressBar.setBorder(border);

        JPanel l = new JPanel(new GridLayout(2,2));

        l.add(progressBar); 

        contentPane.add(l, BorderLayout.CENTER);

        JPanel p = new JPanel(new GridLayout(2,2));
        JPanel s = new JPanel(new GridLayout(2,2));

        answer1 = new JButton(game.q6a(1));
        answer2 = new JButton(game.q6a(2));
        answer3 = new JButton(game.q6a(3));
        answer4 = new JButton(game.q6a(4));

        p.add(answer1);
        p.add(answer2);
        p.add(answer3);
        p.add(answer4);
        s.add(Titlelabel,0); 

        answer1.addActionListener(this); 
        answer2.addActionListener(this);
        answer3.addActionListener(this); 
        answer4.addActionListener(this);

        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(p, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();

    }

    /**
     * Create results frame.
     */
    public void endquiz()
    {
        makeMenuBar(frame);
        ImageIcon icon = new ImageIcon("logo.jpeg");
        frame.setIconImage(icon.getImage());
        Container contentPane1 = frame.getContentPane();
        contentPane1.removeAll();

        progressBar.setValue(100);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Quiz Progress");
        progressBar.setBorder(border);

        JPanel k = new JPanel(new GridLayout(2,2));

        k.add(progressBar); 

        contentPane.add(k, BorderLayout.CENTER);
        JLabel Titlelabel = new JLabel("Quiz Results", SwingConstants.CENTER);
        JLabel resultslabel = new JLabel("Your results. Correct: " + game.getScore() + " incorrect: " + game.getincorrect(), SwingConstants.CENTER);

        JPanel s = new JPanel(new GridLayout(2,2));
        JPanel l = new JPanel(new GridLayout(2,2));

        s.add(Titlelabel,0); 
        l.add(resultslabel,0);

        contentPane.add(s, BorderLayout.NORTH);
        contentPane.add(k, BorderLayout.CENTER);
        contentPane.add(l, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.revalidate();
        frame.repaint();
    }

     /**
     * Create menu bar in game window
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        // create the game menu
        JMenu fileMenu = new JMenu("Game Options");
        menubar.add(fileMenu);
        // create game sub menu
        JMenuItem openItem = new JMenuItem("Restart Quiz");
        openItem.addActionListener(this);
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(this);
        fileMenu.add(quitItem);
       // create the help menu
        JMenu helpMenu = new JMenu("Help");
        menubar.add(helpMenu);
       // create help sub menu
        JMenuItem aboutGameItem = new JMenuItem("About the game");
        aboutGameItem.addActionListener(this);
        helpMenu.add(aboutGameItem);
    }

     /**
     * Action listerner listen for action events in buttons, text fields, menus.
     */
    public void actionPerformed(ActionEvent event) 
    {

        if (event.getActionCommand().equals("Quit")){
            System.exit(0);
        }
        else if(event.getActionCommand().equals("About the game")){
            JDialog aboutGame = new JDialog();
            Container dialog = aboutGame.getContentPane();
            aboutGame.setSize(1200,300);
            dialog.add(new JLabel("Following quiz provides Multiple Choice Questions (MCQs) related to Core Java./n"
                    + "Try your best to answer the questions./n" + 
                    "Results will be shown at the end!"));
            aboutGame.setVisible(true);
        }
        else if (event.getActionCommand().equals("Restart Quiz")){
            game.reset();
            makeFrame();
        }   
        else if (event.getActionCommand().equals("Begin Quiz")){
            contentPane.removeAll();
            quiz1();
            frame.revalidate();

        }
        else if (event.getActionCommand().equals(game.q1a(2))){
            contentPane.removeAll();
            quiz2();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q1a(2) + " is correct. Moving to next question");

        }
        else if (event.getActionCommand().equals(game.q1a(1))){
            contentPane.removeAll();
            quiz2();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q1a(1) + " is incorrect. Moving to next question");

        }
        else if (event.getActionCommand().equals(game.q1a(4))){
            contentPane.removeAll();
            quiz2();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q1a(4) + " is incorrect. Moving to next question");

        }    
        else if (event.getActionCommand().equals(game.q1a(3))){
            contentPane.removeAll();
            quiz2();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q1a(3) + " is incorrect. Moving to next question");

        }
        else if (event.getActionCommand().equals(game.q2a(3))){
            contentPane.removeAll();
            quiz3();
            frame.revalidate();
            JOptionPane.showMessageDialog(frame,
                game.q2a(3) + " is correct. Moving to next question" );

        }

        else if (event.getActionCommand().equals(game.q2a(1))){
            contentPane.removeAll();
            quiz3();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q2a(1) + " is incorrect. Moving to next question");

        }

        else if (event.getActionCommand().equals(game.q2a(2))){
            contentPane.removeAll();
            quiz3();
            frame.revalidate();
            //game.incorrectinc();
            JOptionPane.showMessageDialog(frame,
                game.q2a(2) + " is incorrect. Moving to next question");

        }

        else if (event.getActionCommand().equals(game.q2a(4))){
            contentPane.removeAll();
            quiz3();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q2a(4) + " is incorrect. Moving to next question");

        }

        else if (event.getActionCommand().equals(game.q4a(4))){
            contentPane.removeAll();
            quiz5();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q4a(4)+ " is correct. Moving to next question");

        }

        else if ((event.getActionCommand().equals(game.q4a(1))) || (event.getActionCommand().equals(game.q4a(2))) || (event.getActionCommand().equals(game.q4a(3)))) {
            contentPane.removeAll();
            quiz5();
            frame.revalidate();
            //game.incorrectinc();
            JOptionPane.showMessageDialog(frame,
                game.q4a(1) + game.q4a(2) + game.q4a(3)+ " is incorrect. Moving to next question");

        }

        else if (event.getActionCommand().equals(game.q5a(3))){
            contentPane.removeAll();
            quiz6();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q5a(3) + " is correct. Moving to next question");

        } 

        else if (event.getActionCommand().equals(game.q5a(1))){
            contentPane.removeAll();
            quiz6();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q5a(1) + " is incorrect. Moving to next question");

        }  

        else if (event.getActionCommand().equals(game.q5a(2))){
            contentPane.removeAll();
            quiz6();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q5a(2) + " is incorrect. Moving to next question");

        }         

        else if (event.getActionCommand().equals(game.q5a(4))){
            contentPane.removeAll();
            quiz6();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q5a(4) + " is incorrect. Moving to next question");

        }          

        else if (event.getActionCommand().equals(game.q6a(2))){
            contentPane.removeAll();
            endquiz();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q6a(2) + " is correct. Moving to next question");
        }

        else if (event.getActionCommand().equals(game.q6a(1))){
            contentPane.removeAll();
            endquiz();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q6a(1) + " is incorrect. Moving to next question");

        }   

        else if (event.getActionCommand().equals(game.q6a(3))){
            contentPane.removeAll();
            endquiz();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q6a(3) + " is incorrect. Moving to next question");

        }   

        else if (event.getActionCommand().equals(game.q6a(4)))
        {
            contentPane.removeAll();
            endquiz();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                game.q6a(4) + " is incorrect. Moving to next question");

        }

        else if(event.getActionCommand().equalsIgnoreCase(game.q3a(1)))
        {
            contentPane.removeAll();
            quiz4();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                txtField.getText() + " is correct. Moving to next question");

        }

        else if(!event.getActionCommand().equalsIgnoreCase(game.q3a(1)))
        {
            contentPane.removeAll();
            quiz4();
            frame.revalidate();

            JOptionPane.showMessageDialog(frame,
                txtField.getText() + " is incorrect. Moving to next question");

        }
        
    }
    
    
}
