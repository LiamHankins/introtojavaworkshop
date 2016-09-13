import javax.swing.JOptionPane;

public class Nonbirthday {
	public static void main(String[] args) {
		String gh = "9/13";
		String meme = JOptionPane.showInputDialog("What is your birthday?");
		if (meme.equals (gh)){
			JOptionPane.showMessageDialog(null, "Have a happy birthday, and a blobfishy day");}
			else {  
			JOptionPane.showMessageDialog(null, "Have a horrible and gloomy day"); }
	}
	}
