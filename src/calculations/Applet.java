package calculations;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;


public class Applet extends  JApplet{


public  void init(){
    try{
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                makeGUI();
            }
        });
    } catch (InterruptedException e) {
        e.printStackTrace();
    } catch (InvocationTargetException e) {
        e.printStackTrace();
    }
}

    private void makeGUI() {
    JTabbedPane jtp=new JTabbedPane();
    jtp.add("Function", new FunctionPanel());
    jtp.add("Colors", new ColorsPanel());
    jtp.add("Library", new LibraryPanel());
    add(jtp);
    }
}

class FunctionPanel extends  JPanel{
    public FunctionPanel(){
        JButton button=new JButton("Add argument");
        add(button);
        JButton buttonRemove=new JButton("Remove argument");
        add(buttonRemove);
    }
}

class  LibraryPanel extends  JPanel{
    public LibraryPanel(){
        JCheckBox checkBox1= new JCheckBox("Lagger");
        add(checkBox1);
    }
}
    class  ColorsPanel extends  JPanel{
    public ColorsPanel(){
        JComboBox<String> jComboBox = new JComboBox<String>();
        jComboBox.addItem("Read file");
        jComboBox.addItem("Delete file");
        add(jComboBox);

    }
    }