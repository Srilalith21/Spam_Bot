package automate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Bot{
	public static void main(String[] args) throws InterruptedException, AWTException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Message :- ");
		String msg = sc.nextLine();
		System.out.println("Enter How Many Times to Send :- ");
		int size = sc.nextInt();
		
		StringSelection stringselection = new StringSelection(msg);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringselection, null);
		
		Thread.sleep(4000);
		
		Robot robot = new Robot();
		for(int i=1; i<=size; i++){
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
		}
		System.out.println("Process completed...!");
	}
}