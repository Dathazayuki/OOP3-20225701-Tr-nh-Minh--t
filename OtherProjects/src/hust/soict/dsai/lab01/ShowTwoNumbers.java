//Example 5 :ShowTwoNumbers.java
package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
  public static void main(String[] args) {
	String strNum1 , strNum2;
	String strNortification ="You 're just entered ";
	
	strNum1= JOptionPane.showInputDialog(null,"Please input the First Number:","Input the First Number:",JOptionPane.INFORMATION_MESSAGE);
	strNortification += strNum1 +" and ";	
	
	strNum2 = JOptionPane.showInputDialog(null,"Please input the Second Number:","Input the Second Number:",JOptionPane.INFORMATION_MESSAGE);
	strNortification += strNum2;	
	
	JOptionPane.showMessageDialog(null,strNortification,"Showtwonumbers",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}
