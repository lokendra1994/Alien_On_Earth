import java.util.*;
import java.io.*;

public class AlienOnEarth{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Alien> alienList = startRegistration(scan);
		Exporting(scan,alienList);
	}
	
	public static void Exporting(Scanner scan, ArrayList<Alien> alienList){
		Export export;
		System.out.print("In which format do you want to export (1 for PDF / 2 for plain text)? : ");
		int choice = scan.nextInt();
		if(choice == 1){
			export = new ExportPdf();
			export.ExportAlien(alienList);
		}
		else if(choice == 2){
			export = new ExportPlainText();
			export.ExportAlien(alienList);
		}//Add new else if code here when you want to add a new plug in for Export
		else{
			System.out.println("You have entered wrong choice");
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
		