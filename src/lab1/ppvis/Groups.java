/** *****************************************************************************
 * Copyright (C) 2019 BSUIR
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
 *
 ****************************************************************************** */
package lab1.ppvis;

import java.util.logging.Level;
import java.util.logging.Logger;
import static lab1.ppvis.WindowForm.combo;
import static lab1.ppvis.WindowForm.display;
import static lab1.ppvis.WindowForm.shell;
import static lab1.ppvis.WindowForm.text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

/**
 *
 * @author Artsiom Suruntovich
 */
public class Groups {

    public static volatile boolean TaskNotDone = true;
    public static Button button = new Button(shell, SWT.NONE);
    public static Button button1 = new Button(shell, SWT.NONE);
    public static Button button2 = new Button(shell, SWT.NONE);
    public static Composite radioGroup = new Composite(shell, SWT.NONE);
    public static Label radiolabel = new Label(radioGroup, SWT.NONE);
    public static Button Rbutton1 = new Button(radioGroup, SWT.RADIO);
    public static Button Rbutton2 = new Button(radioGroup, SWT.RADIO);
    public static Button button3 = new Button(shell, SWT.NONE);
    public static Composite checkBox = new Composite(shell, SWT.NONE);
    public static Label checkboxLabel = new Label(checkBox, SWT.NONE);
    public static Button Rbutton3 = new Button(radioGroup, SWT.RADIO);
    public static Button check1 = new Button(checkBox, SWT.CHECK);
    public static Button check2 = new Button(checkBox, SWT.CHECK);
    public static Button check3 = new Button(checkBox, SWT.CHECK);
    public static Button checkBoxbutton = new Button(shell, SWT.NONE);
    public static Button button4 = new Button(shell, SWT.NONE);
    public static Table table = new Table(shell, SWT.BORDER | SWT.VIRTUAL);
    public static Button button5 = new Button(shell, SWT.NONE);
    public static Button button6 = new Button(shell, SWT.NONE);
    public static Button button7 = new Button(shell, SWT.NONE);
    public static Button StartButton = new Button(shell, SWT.NONE);
    public static Button StopButton = new Button(shell, SWT.NONE);

    public static Thread createThread2(Display display) {
        return new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                while (TaskNotDone == true) {
                    try {
                        display.syncExec(() -> {
                            WindowForm.SwapButtonsWithText(button7, text);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtonsWithCombo(button6, combo);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtons(button, button5);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtonsWithTable(button1, table);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtons(button2, button4);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtons(button2, button4);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtonsWithComposite(checkBoxbutton, radioGroup);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtons(button2, button4);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        display.syncExec(() -> {
                            WindowForm.SwapButtonsWithComposite(button3, checkBox);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Groups.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        if (TaskNotDone != true) {
                            break;
                        }
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static void LoadUI() {

        text.setBounds(0, 0, 110, 23);
        combo.setBounds(110, 0, 110, 30);

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
                    if (item.contains(text.getText()) == true) {
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

        button1.setText("push to set text to switch btn ");
        button1.setBounds(0, 30, 210, 40);

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
        radioGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
        radioGroup.setBounds(0, 80, 210, 35);
        radiolabel.setText("Select radio button: ");
        radiolabel.setBounds(0, 0, 110, 50);
        Rbutton1.setText("1");
        Rbutton1.setBounds(120, 0, 30, 30);

        Rbutton2.setText("2");
        Rbutton2.setBounds(150, 0, 30, 30);

        Rbutton3.setText("3");
        Rbutton3.setBounds(180, 0, 30, 30);

        button3.setText("Choose RadioButton");
        button3.setBounds(220, 75, 150, 30);
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

        checkBox.setLayout(new RowLayout(SWT.HORIZONTAL));
        checkBox.setBounds(0, 110, 210, 35);

        checkboxLabel.setText("Select check button:");
        checkboxLabel.setBounds(0, 0, 110, 50);

        check1.setText("1");
        check1.setBounds(120, 0, 30, 30);
        check2.setText("2");
        check2.setBounds(150, 0, 30, 30);

        check3.setText("3");
        check3.setBounds(180, 0, 30, 30);

        checkBoxbutton.setText("Choose check");
        checkBoxbutton.setBounds(220, 105, 100, 30);
        checkBoxbutton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent arg0) {
                String choice = text.getText();
                if (choice.equals("1")) {
                    if (check1.getSelection() == true) {
                        check1.setSelection(false);
                    } else {
                        check1.setSelection(true);
                    }
                } else {
                    if (choice.equals("2")) {
                        if (check2.getSelection() == true) {
                            check2.setSelection(false);
                        } else {
                            check2.setSelection(true);
                        }
                    } else {
                        if (choice.equals("3")) {
                            if (check3.getSelection() == true) {
                                check3.setSelection(false);
                            } else {
                                check3.setSelection(true);
                            }
                        } else {
                            WindowForm.Error("Error 002", "No such element found.");
                        }
                    }
                }
            }
        });
        //Group 5

        button4.setText("Choose from combobox");
        button4.setBounds(0, 145, 140, 30);
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

        table.setItemCount(3);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        table.setSize(100, 100);
        table.setBounds(100, 180, 150, 150);

        TableColumn column = new TableColumn(table, SWT.BORDER);
        column.setWidth(60);

        TableColumn column1 = new TableColumn(table, SWT.BORDER);
        column1.setWidth(60);

        button5.setText("Input to table");
        button5.setBounds(0, 350, 110, 30);

        button6.setText("Drop to 2-d column");
        button6.setBounds(110, 350, 110, 30);

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

        StartButton.setText("Start");
        StartButton.setBounds(30, 390, 130, 30);

        StopButton.setText("Stop");
        StopButton.setBounds(165, 390, 130, 30);
        StartButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                TaskNotDone = true;
                Thread thread1 = createThread2(display);
                thread1.setDaemon(true);
                thread1.start();
            }
        });
        StopButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent arg0) {
                TaskNotDone = false;

            }

        });
    }

}
