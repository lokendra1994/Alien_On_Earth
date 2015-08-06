import java.util.*;
import java.io.*;

public class AlienOnEarth{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Alien> alienList = startRegistration(scan);
		exporting(scan,alienList);
	}
	
	public static void exporting(Scanner scan, ArrayList<Alien> alienList){
		String formatName;
		int countFormat = 0;
		ArrayList<String> array = new ArrayList<String>();
		File curDir = new File(".");
		File[] filesList = curDir.listFiles();
		
		System.out.println("In which format do you want to export? ");
		
		for(File f : filesList){
			if(f.isFile() && f.getName().startsWith("Export") && f.getName().endsWith(".java")){
				formatName = f.getName().substring(6,f.getName().length()-5);
				if(!formatName.equals("")){
					System.out.println(countFormat+ " for " +formatName);
					countFormat++;
					array.add(formatName);
				}
			}
		}
		
		int userChoice = scan.nextInt();
		formatName = array.get(userChoice);
		String className = "Export"+formatName;
		
		try{
		Export export = (Export)Class.forName(className).newInstance();
		export.ExportAlien(alienList);
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Something went wrong....");
		}
		
	}
	
	public static ArrayList<Alien> startRegistration(Scanner scan){
		int choice;
		Alien alien;
		ArrayList<Alien> alienList = new ArrayList<Alien>();
		
		do{
			alien = new Alien();
			System.out.print("Enter The Code Name : ");
			alien.setCodeName(scan.nextLine());
			System.out.print("Enter The Blood Color : ");
			alien.setBloodColor(scan.nextLine());
			System.out.print("Enter The Name of Home Planet : ");
			alien.setHomePlanet(scan.nextLine());
			System.out.print("Enter The No of Antennas : ");
			alien.setNoOfAntennas(scan.nextInt());
			System.out.print("Enter The No of Legs : ");
			alien.setNoOfLegs(scan.nextInt());
			alienList.add(alien);
			System.out.print("Do You Want add new alien(1 for yes / 0 for no)");
			choice = scan.nextInt();
		}while(choice == 1);
		
		return alienList;
	}
}
		