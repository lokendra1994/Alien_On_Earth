import java.io.*;
import java.util.*;
class ExportPlainText extends Export{
	public void ExportAlien(ArrayList<Alien> alienList){
		int count=0;
		try{
			File file = new File("AlienOnEarth.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(Alien a : alienList){
				count++;
				bw.write("\n"+"\n"+count+"."+"\t");
				bw.write("Code Name : "+a.getCodeName()+"\t");
				bw.write("Blood Color : "+a.getBloodColor()+"\t");
				bw.write("Home Planet : "+a.getHomePlanet()+"\t");
				bw.write("No of Antenna : "+a.getNoOfAntennas()+"\t");
				bw.write("No of Legs : "+a.getNoOfLegs()+"\t");
			}
			bw.close();	
			System.out.println("Your data has been exported in your document directory...");
		}
		catch(IOException ex){
			ex.printStackTrace();
			System.out.println("Some Error occurred .... Please Try Later");
		}
	}
}