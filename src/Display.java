import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Display {


	public void invalidPin(){
        System.out.println("PIN Invalid");
        System.out.println("[0] Try again");
        System.out.println("[1] Exit");
    }
	


	public void welcome() {
		ArrayList<String> welcomeSign = readText("src\\welcome.txt");
        for( int x = 0; x < welcomeSign.size(); x++){
            System.out.println(welcomeSign.get(x));
        }
        System.out.println("");
		
	}
	
	private static ArrayList<String> readText(String fileName) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Scanner fileRead = new Scanner(new File(fileName));
            while (fileRead.hasNextLine()) {
                String temp = fileRead.nextLine();
                list.add(temp);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getStackTrace());
        }
        return list;
    }
	

}
