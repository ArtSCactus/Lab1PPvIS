/*******************************************************************************
Copyright (C) 21.02.2019 BSUIR
This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

*******************************************************************************/
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
 * @author Artsiom Suruntovich
 */
public class Lab1PPvIS {

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        // TODO code application logic here 
        Display display = new Display();
        Shell shell = new Shell(display, SWT.SHELL_TRIM);// SHELL_TRIM for ability
        MessageBox mb = new MessageBox(shell, SWT.ERROR | SWT.OK);// Creating error window
        // to hide and increasing the window
         RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
       rowLayout.marginLeft = 10;
       rowLayout.marginTop = 15;
       rowLayout.marginRight = 15;
       rowLayout.marginBottom = 25;
       rowLayout.spacing = 5;
        shell.setText("Laboratory work #1");
        shell.setLayout(rowLayout);
        Combo combo = new Combo (shell, SWT.DROP_DOWN);
        
        // Task 1
        // Creating a text window exemplar
        Text text = new Text(shell, SWT.BORDER);
        // Creating a button "Add to combobox"
        final Button button = new Button(shell, SWT.NONE);
        button.setText("Add to combobox");//Give the name to button

        // Task 1 action
        // Action for button
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
// Task 2
// Creatin 2 buttons extmplar 
 final Button button1 = new Button(shell, SWT.NONE);
button1.setText("push to set text to button2");
 final Button button2 = new Button(shell, SWT.NONE);
button2.setText("button2");

// Task 2 action
        button1.addSelectionListener(new SelectionAdapter() {
             @Override
            public void widgetSelected(SelectionEvent arg0) {
            button2.setText(text.getText());// Set name of button as name
            // that was inputed in text line
            }
        });
        
        button2.addSelectionListener(new SelectionAdapter() {
             @Override
            public void widgetSelected(SelectionEvent arg0) {
            String buffer = button1.getText(); //
            button1.setText(button2.getText());// Switch names of button 1 and
            button2.setText(buffer);           //
            }
        });
 
        // Task3
        Composite radioGroup = new Composite (shell, SWT.NONE);
        radioGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
        // "Select button"  text line 
        Label radiolabel = new Label(radioGroup, SWT.NONE);
        radiolabel.setText("Select button: ");
 
        // RadioButton - 1
        Button Rbutton1 = new Button(radioGroup, SWT.RADIO);
        Rbutton1.setText("1");
 
        // RadioButton - 2
        Button Rbutton2 = new Button(radioGroup, SWT.RADIO);
        Rbutton2.setText("2");
        
        // RadioButton - 3
        Button Rbutton3 = new Button(radioGroup, SWT.RADIO);
        Rbutton3.setText("3");
        
        // Creating button3 (named Choose RadioButton)
        final Button button3 = new Button (shell, SWT.NONE);
        button3.setText("Choose RadioButton");
        
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
           //giving new information to error window                 
           mb.setText("Error 002");
           mb.setMessage("No such element found.");
            mb.open();
                        }
                    }
                }
            }
        });
                
                
        // Task 4
        // Creating a button exemplar (Choose from combobox button)
        final Button button4 = new Button(shell, SWT.NONE);
        button4.setText("Choose from combobox");
        // Action for this button
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
    //giving new information to error window  
           mb.setText("Error 002");
           mb.setMessage("No such element found.");
            mb.open();
              }
              else combo.select(count);
                 }
        });
        

// Task 5
// Creating table exemplar
Table table = new Table(shell,SWT.BORDER|SWT.VIRTUAL); 
table.setItemCount(3); 
table.setHeaderVisible(true); 
table.setLinesVisible(true);
table.setSize(100, 100);
// Creating column exemplar
TableColumn column = new TableColumn(table,SWT.BORDER); 
column.setWidth(50);
// Creating column exemplar
TableColumn column1 = new TableColumn(table,SWT.BORDER);
column1.setWidth(50);
// Creating buttons5-7
final Button button5 = new Button(shell, SWT.NONE);
button5.setText("Input to table");
final Button button6 = new Button(shell, SWT.NONE);
button6.setText("Drop to 2-d column");
final Button button7 = new Button(shell, SWT.NONE);
button7.setText("Back to 1-t column");

// Actions for button5-7 
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
                column.setText("");// clearing column
                
            }
        });
button7.addSelectionListener(new SelectionAdapter() {
 
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                column.setText(column1.getText());
                column1.setText("");//clearing column1
            }
        });

// window opening
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
    }
