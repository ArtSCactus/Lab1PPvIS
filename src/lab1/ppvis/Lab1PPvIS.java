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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
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
        // Button 1
final Button button = new Button(shell, SWT.NONE);
button.setText("Add to combobox");
//task 2
 final Button button1 = new Button(shell, SWT.NONE);
button1.setText("push to set text to button2");
 final Button button2 = new Button(shell, SWT.NONE);
 button2.setText("button2");
 
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
        
        //Task 4
        final Button button4 = new Button(shell, SWT.NONE);
button4.setText("Choose from combobox");

//Task 5
Table table = new Table(shell,SWT.BORDER|SWT.VIRTUAL); 
table.setItemCount(2); 
table.setHeaderVisible(true); 
table.setLinesVisible(true);
table.setSize(100, 100);
TableColumn column = new TableColumn(table,SWT.BORDER); 
column.setWidth(50);
TableColumn column1 = new TableColumn(table,SWT.BORDER);
column1.setWidth(50);
final Button button5 = new Button(shell, SWT.NONE);
button5.setText("Input to table");
final Button button6 = new Button(shell, SWT.NONE);
button6.setText("Drop to 2-d column");
final Button button7 = new Button(shell, SWT.NONE);
button7.setText("Back to 1-t column");

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
           mb.setText("Error 001");
           mb.setMessage("Such element already exists.");
        mb.open();
         exist =true;
         break;
         }
        }
              if (exist==false) 
                   combo.add(s);
                 }
        });
  
 
 
 
  
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
                        else  {
    MessageBox ErrorMs = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           ErrorMs.setText("Error 002");
           ErrorMs.setMessage("No such element found.");
            ErrorMs.open();
                        }
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
        
        
 button4.addSelectionListener(new SelectionAdapter() {
 
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String[] items = combo.getItems();
                String s = text.getText();
                 if (s == null || s.length()==0){
                     return;
                 }
                 int count=0;
                 boolean exist =false;
               for (String item : items){
         if (item.equals(text.getText())){
             exist =true;
             break;
         }
         else count++;
        }
              if (exist==false) {
    MessageBox ErrorMs = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           ErrorMs.setText("Error 002");
           ErrorMs.setMessage("No such element found.");
            ErrorMs.open();
              }
              else combo.select(count);
                 }
        });
 

button5.addSelectionListener(new SelectionAdapter() {
 
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                column.setText(text.getText());
            }
        });
button6.addSelectionListener(new SelectionAdapter() {
 
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                column1.setText(column.getText());
                
            }
        });
button7.addSelectionListener(new SelectionAdapter() {
 
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                column.setText(column1.getText());
            }
        });
         int ShellWidth =350;
int ShellHeight = 300;
        shell.setSize(ShellWidth, ShellHeight);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
     
      
       
       

  



    }
     /*  public void open(){
           Display display =Display.getDefault();
          Content();
          shell.open();
          shell.layout();
          
       }  */
   /* public static void Error001(){//Elemet  exist
        Display display = new Display();
        Shell shell = new Shell(display);
     MessageBox mb = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           mb.setText("Error 001");
           mb.setMessage("Such element already exists.");
        mb.open();
}*/
   /* public static void Error002(){//Element not exist
        Display display = new Display();
        Shell shell = new Shell(display);
    MessageBox ErrorMs = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
           ErrorMs.setText("Error 002");
           ErrorMs.setMessage("No such element found.");
            ErrorMs.open();
    }*/
    
    public static void Content(){
        
    }
        
    }
