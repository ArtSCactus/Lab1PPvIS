/*
 * Copyright (C) 2019 Asus
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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 *
 * @author Asus
 */
public class WindowForm {

    public static Display display = new Display();
    public static Shell shell = new Shell(display, SWT.SHELL_TRIM);
    public static RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
    public static Text text = new Text(shell, SWT.BORDER);
    public static Combo combo = new Combo(shell, SWT.DROP_DOWN);

    public void WindowConfig() {
        // Display display = new Display();

        rowLayout.marginLeft = 10;
        rowLayout.marginTop = 15;
        rowLayout.marginRight = 15;
        rowLayout.marginBottom = 25;
        rowLayout.spacing = 5;
        shell.setText("LB #1");
        shell.setLayout(rowLayout);
    }

    public void WindowOpen() {
        int ShellWidth = 350;
        int ShellHeight = 350;
        shell.setSize(ShellWidth, ShellHeight);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }

    public static void Error(String ErrorNumber, String ErrorMessage) {
        MessageBox mb = new MessageBox(shell, SWT.ERROR | SWT.OK);
        mb.setText(ErrorNumber);
        mb.setMessage(ErrorMessage);
        mb.open();
    }
}
