/*
 * Copyright (C) 2019 BSUIR
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package lab1.ppvis;

import static lab1.ppvis.WindowForm.shell;
import static lab1.ppvis.WindowForm.text;
import static lab1.ppvis.WindowForm.combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 *
 * @author Artsiom Suruntovich
 */
public class Groups {

     public static void CoordinatesForGlobalElements(){
    text.setBounds(0, 0, 110, 23);
    combo.setBounds(110, 0, 110, 30);
    }
    public static void LoadUI() {

        final Button button = new Button(shell, SWT.NONE);
        button.setText("Add to combobox");
        button.setBounds(225, 0, 110, 30);

        button.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                boolean exist = false;
                String[] items = combo.getItems();
                String s = text.getText();
                if (s == null || s.length() == 0) {
                    return;
                }
                for (String item : items) {
                    if (item.contains(text.getText())==true) {
                        WindowForm.Error("Error 001", "Such element already exists");
                        exist = true;
                        break;
                    }
                }
                if (exist == false) {
                    combo.add(s);
                }
            }
        });
   //Group 2
        final Button button1 = new Button(shell, SWT.NONE);
        button1.setText("push to set text to switch btn ");
        button1.setBounds(0, 30, 210, 40);

        final Button button2 = new Button(shell, SWT.NONE);
        button2.setText("switch text");
        button2.setBounds(215, 30, 110, 40);

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
   
   //Group 3     
        Composite radioGroup = new Composite(shell, SWT.NONE);
        radioGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
 radioGroup.setBounds(0,80, 210, 35);
        Label radiolabel = new Label(radioGroup, SWT.NONE);
        radiolabel.setText("Select radio button: ");
       radiolabel.setBounds(0,0, 110, 50);
        Button Rbutton1 = new Button(radioGroup, SWT.RADIO);
        Rbutton1.setText("1");
        Rbutton1.setBounds(120,0, 30, 30);
        Button Rbutton2 = new Button(radioGroup, SWT.RADIO);
        Rbutton2.setText("2");
        Rbutton2.setBounds(150,0, 30, 30);
        Button Rbutton3 = new Button(radioGroup, SWT.RADIO);
        Rbutton3.setText("3");
        Rbutton3.setBounds(180,0, 30, 30);
        final Button button3 = new Button(shell, SWT.NONE);
        button3.setText("Choose RadioButton");
button3.setBounds(220,75, 150, 30);
        button3.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String choice = text.getText();

                if (choice.equals("1")) {
                    Rbutton1.setSelection(true);
                    Rbutton2.setSelection(false);
                     Rbutton3.setSelection(false);
                } else {
                    if (choice.equals("2")) {
                        Rbutton2.setSelection(true);
                         Rbutton1.setSelection(false);
                            Rbutton3.setSelection(false);
                    } else {
                        if (choice.equals("3")) {
                            Rbutton1.setSelection(false);
                            Rbutton2.setSelection(false);
                            Rbutton3.setSelection(true);
                        } else {
                            WindowForm.Error("Error 002", "No such element found!");
                        }
                    }
                }
            }
        });
   //Group 4
        Composite checkBox = new Composite(shell, SWT.NONE);
        checkBox.setLayout(new RowLayout(SWT.HORIZONTAL));
               checkBox.setBounds(0,110, 210, 35);

        Label checkboxLabel = new Label(checkBox, SWT.NONE);
        checkboxLabel.setText("Select check button:");
       checkboxLabel.setBounds(0,0, 110, 50);
        Button check1 = new Button(checkBox, SWT.CHECK);
        check1.setText("1");
check1.setBounds(120,0, 30, 30);
        Button check2 = new Button(checkBox, SWT.CHECK);
        check2.setText("2");
check2.setBounds(150,0, 30, 30);
        Button check3 = new Button(checkBox, SWT.CHECK);
        check3.setText("3");
check3.setBounds(180,0, 30, 30);
        final Button checkBoxbutton = new Button(shell, SWT.NONE);
        checkBoxbutton.setText("Choose check");
        checkBoxbutton.setBounds(220,105, 100, 30);
        checkBoxbutton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String choice = text.getText();
                if (choice.equals("1")) {
                    if(check1.getSelection()==true) check1.setSelection(false);
                    else check1.setSelection(true);
                 
                } else {
                    if (choice.equals("2")) {
                        if(check2.getSelection()==true) check2.setSelection(false);
                    else check2.setSelection(true);
                    } else {
                        if (choice.equals("3")) {
                             if(check3.getSelection()==true) check3.setSelection(false);
                    else check3.setSelection(true);
                        } else {
                            WindowForm.Error("Error 002", "No such element found.");
                        }
                    }
                }
            }
        });
   //Group 5
        final Button button4 = new Button(shell, SWT.NONE);
        button4.setText("Choose from combobox");
       button4.setBounds(0,145, 140, 30);
        button4.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String[] items = combo.getItems();
                String s = text.getText();
                if (s == null || s.length() == 0) {
                    return;
                }
                int count = 0;
                boolean exist = false;
                for (String item : items) {
                    if (item.equals(text.getText())) {
                        exist = true;
                        break;
                    } else {
                        count++;
                    }
                }
                if (exist == false) {
                    WindowForm.Error("Error 002", "No such element found.");
                } else {
                    combo.select(count);
                }
            }
        });
   //Group 6

        Table table = new Table(shell, SWT.BORDER | SWT.VIRTUAL);
        table.setItemCount(3);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setSize(100, 100);
        table.setBounds(100, 180, 150, 150);
        
        TableColumn column = new TableColumn(table, SWT.BORDER);
        column.setWidth(60);

        TableColumn column1 = new TableColumn(table, SWT.BORDER);
        column1.setWidth(60);

        final Button button5 = new Button(shell, SWT.NONE);
        button5.setText("Input to table");
button5.setBounds(0, 350, 110, 30);
        final Button button6 = new Button(shell, SWT.NONE);
        button6.setText("Drop to 2-d column");
button6.setBounds(110, 350, 110, 30);
        final Button button7 = new Button(shell, SWT.NONE);
        button7.setText("Back to 1-t column");
button7.setBounds(210, 350, 130, 30);
        button5.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                column.setText(text.getText());
            }
        });
        button6.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String empty = "";
                if (column.getText().equals(empty)) {
                    return;
                } else {
                    column1.setText(column.getText());
                    column.setText("");
                }
            }
        });
        button7.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String empty = "";
                if (column1.getText().equals(empty)) {
                    return;
                } else {
                    column.setText(column1.getText());
                    column1.setText("");
                }
            }
            
        });
         final Button StartButton = new Button(shell, SWT.NONE);
        StartButton.setText("Start");
StartButton.setBounds(30, 390, 130, 30);
        StartButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                column.setText(text.getText());
            }
        });
    }
    }