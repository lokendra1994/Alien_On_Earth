import java.io.*;
import java.util.*;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.List;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
class ExportPdf extends Export{
	public void ExportAlien(ArrayList<Alien> alienList){
		int count = 0;
		try {
			File file = new File("AlienOnEarth.pdf");
			if(!file.exists()){
				file.createNewFile();
			}
			FileOutputStream pdfFileout = new FileOutputStream(file);
			Document doc = new Document();
			PdfWriter.getInstance(doc, pdfFileout);
			doc.open();
			Paragraph para1 = new Paragraph();
			for(Alien a : alienList){
				count++;
				para1.add("\n"+"\n"+count+"."+"\t");
				para1.add("Code Name : "+a.getCodeName()+"\t");
				para1.add("Blood Color : "+a.getBloodColor()+"\t");
				para1.add("Home Planet : "+a.getHomePlanet()+"\t");
				para1.add("No of Antenna : "+a.getNoOfAntennas()+"\t");
				para1.add("No of Legs : "+a.getNoOfLegs()+"\t");
				doc.add(para1);
			}
			doc.close();
			pdfFileout.close();
			System.out.println("Your data has been exported in your document directory...");
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some Error occurred .... Please Try Later");
		}	
	}
}