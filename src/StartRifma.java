import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Blago on 14.08.2017.
 */
public class StartRifma extends JFrame implements ActionListener {
    final String TITLE_OF_PROGRAM = "Рифмаплет";
    final int START_LOCATION = 200;
    final int WINDOW_WIGHT = 640;
    final int WINDOW_HEIGHT = 480;
    final String NAME_TO_CHAT = "стих:  ";

    JTextArea dialogue;
    JTextField message;
    BotRifma botRifma;
    static Random random;

    public static void main(String[] args) {
        new StartRifma();
    }

    StartRifma() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIGHT, WINDOW_HEIGHT);

        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        JScrollPane scrollBar = new JScrollPane(dialogue);
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        message = new JTextField();
        //message.addActionListener(this);
        JButton enter = new JButton("ГЕНЕРАТОР СТИХОТВОРЕНИЯ");
        enter.setMargin(new Insets(25, 240, 25, 240));
        enter.setHorizontalAlignment(SwingConstants.CENTER);
        enter.setHorizontalTextPosition(SwingConstants.CENTER);
        enter.addActionListener(this);

        bp.add(enter);

        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
        botRifma = new BotRifma();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (message.getText().trim().length() >= 0) {
            dialogue.append(NAME_TO_CHAT.substring(0, 7) + botRifma.sayReturn(message.getText()) + "\n" + "\n");
        }
        message.setText("");
        message.requestFocusInWindow();
    }
}

