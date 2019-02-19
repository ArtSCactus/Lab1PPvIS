/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.ppvis;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
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
        RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
    rowLayout.marginLeft = 10;
       rowLayout.marginTop = 15;
       rowLayout.marginRight = 15;
       rowLayout.marginBottom = 25;
       rowLayout.spacing = 5;
      
       shell.setLayout(rowLayout);
        
        Combo combo = new Combo (shell, SWT.DROP_DOWN);
        //task 1
        Text text = new Text(shell, SWT.BORDER);
        text.setText("");
        //Lebel
        final Label label = new Label(shell, SWT.NONE);
        label.setText("");
     
      // Button 1
final Button button = new Button(shell, SWT.NONE);
button.setText("Add to combobox");
       
        MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           mb.setText("Error");
           mb.setMessage("Already exists");
        

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
  
 //task 2
 final Button button1 = new Button(shell, SWT.NONE);
button1.setText("push to set text to button2");
 final Button button2 = new Button(shell, SWT.NONE);
 button2.setText("button2");
 
 
  
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
        
        //task3
        // Group
        Composite radioGroup = new Composite (shell, SWT.NONE);
        radioGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
 
        Label radiolabel = new Label(radioGroup, SWT.NONE);
        radiolabel.setText("Select button: ");
 
        // Radio - 1
        Button Rbutton1 = new Button(radioGroup, SWT.RADIO);
        Rbutton1.setText("1");
 
        // Radio - 2
        Button Rbutton2 = new Button(radioGroup, SWT.RADIO);
        Rbutton2.setText("2");
        
        // Radio - 3
        Button Rbutton3 = new Button(radioGroup, SWT.RADIO);
        Rbutton3.setText("3");
        
        final Button button3 = new Button (shell, SWT.NONE);
        button3.setText("Choose RadioButton");
        
        Rbutton1.addSelectionListener(new SelectionAdapter()  {
 
            @Override
            public void widgetSelected(SelectionEvent e) {
                Button source=  (Button) e.getSource();
                 
                if(source.getSelection())  {
                    
                }
            }
             
        });
        button3.addSelectionListener(new SelectionAdapter() {
             @Override
            public void widgetSelected(SelectionEvent arg0) {
                String choice = text.getText();
                MessageBox ErrorMs = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           ErrorMs.setText("Error");
           ErrorMs.setMessage("No such element!");
         
                if (choice.equals("1")) {
            Rbutton1.setSelection(true);
            Rbutton2.setSelection(false);
            Rbutton3.setSelection(false);
                }
                else {
                    if (choice.equals("2"))
                    {
                    Rbutton1.setSelection(false);
                    Rbutton2.setSelection(true);
                    Rbutton3.setSelection(false);
                    }
                    else{
                        if (choice.equals("3")){
                    Rbutton1.setSelection(false);
                    Rbutton2.setSelection(false);
                    Rbutton3.setSelection(true);
                        }
                        else ErrorMs.open();
                    }
                }
            }
        });
         
        Rbutton2.addSelectionListener(new SelectionAdapter()  {
 
            @Override
            public void widgetSelected(SelectionEvent e) {
                Button source=  (Button) e.getSource();
                 
                if(source.getSelection())  {
                   
                }
            }
             
        });
 
        shell.setSize(350, 200);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
        
        
    }
