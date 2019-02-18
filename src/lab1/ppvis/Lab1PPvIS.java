/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.ppvis;
import static java.awt.SystemColor.text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 *
 * @author Asus
 */
public class Lab1PPvIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Display display = new Display();
        Shell shell = new Shell(display);
 
        RowLayout rowLayout = new RowLayout();
        rowLayout.marginLeft = 30;
        rowLayout.marginTop = 30;
        shell.setLayout(rowLayout);
        
        
        //task 1
        Text text = new Text(shell, SWT.BORDER);
        RowData layoutData = new RowData();
        layoutData.width= 150;
        text.setLayoutData(layoutData);
        text.setText("");
        //Lebel
        final Label label = new Label(shell, SWT.NONE);
        label.setText("");
       
        // Button 1
final Button button = new Button(shell, SWT.NONE);
button.setText("Add this to combobox");

       
        MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           mb.setText("Error");
           mb.setMessage("Already exists");
           
           
        Combo combo = new Combo (shell, SWT.DROP_DOWN);
        

  button.addSelectionListener(new SelectionAdapter() {
 
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                boolean exist =false;
                String[] items = combo.getItems();
                String s = text.getText();
                 if (s == null || s.length()==0){
                     return;
                 }
               for (String item : items){
         if (item.equals(text.getText())){
         MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           mb.setText("Error");
           mb.setMessage("Already exists");
         mb.open();
         exist =true;
         break;
         }
        }
              if (exist==false) 
                   combo.add(s);
                 }
        });
  
 /* shell.addShellListener(new ShellAdapter() {
        public void shellClosed(ShellEvent e) {
            MessageBox mb = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
            mb.setText("Confirm Exit");
            mb.setMessage("Are you sure you want to exit?");
            int rc = mb.open();
            e.doit = rc == SWT.OK;
        }
});*/
 //task 2
 final Button button1 = new Button(shell, SWT.NONE);
button1.setText("push to set text to button2");
 final Button button2 = new Button(shell, SWT.NONE);
 button2.setText("button2");
  RowData button2size = new RowData();
 button2size.width= 50;
 button2.setLayoutData(layoutData);
 
 
  
        button1.addSelectionListener(new SelectionAdapter() {
             @Override
            public void widgetSelected(SelectionEvent arg0) {
            button2.setText(text.getText());
            }
        });
        
        button2.addSelectionListener(new SelectionAdapter() {
             @Override
            public void widgetSelected(SelectionEvent arg0) {
            String buffer = button1.getText();
            button1.setText(button2.getText());
            button2.setText(buffer);
            }
        });
 
        shell.setSize(400, 200);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
        
        
    }
