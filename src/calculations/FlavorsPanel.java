package calculations;

import javax.swing.*;
import java.awt.*;

public class FlavorsPanel  extends JPanel {
        public  FlavorsPanel(){
            JComboBox<String> jComboBox = new JComboBox<String>();
            jComboBox.addItem("Lagger");
            jComboBox.addItem("Direchle");
            add(jComboBox);
        }
    }

