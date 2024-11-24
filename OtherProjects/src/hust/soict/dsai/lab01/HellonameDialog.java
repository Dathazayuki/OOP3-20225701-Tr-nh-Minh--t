//Example 3: HellonameDialog.java
package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class HellonameDialog {
   public static void main(String[] args) {
	String Result;
	Result = JOptionPane.showInputDialog("Please enter your name:");
	JOptionPane.showMessageDialog(null, "Hi "+ Result +"!");
	System.exit(0);
}
}
