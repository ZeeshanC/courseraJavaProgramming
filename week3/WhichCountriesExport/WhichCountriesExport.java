
/**
 * Write a description of WhichCountriesExport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {
    
    
    public void tester(){
        
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        //System.out.println(countryInfo(parser,"Germany"));
        listExportersTwoProducts(parser, "gold", "diamonds");
        
    }
    
    
    public String countryInfo(CSVParser parser, String country){
        
        for (CSVRecord record : parser){
            
            if(record.get("Country").equals(country)){
                //System.out.println("FOUND");
                return country + ": " + record.get("Exports") + ": " + record.get("Value (dollars)") ;
            }
            
            System.out.println(country + " ");
            System.out.println(record.get("Country") + " ");
			//System.out.print(record.get("Name") + " ");
			//System.out.print(record.get("Favorite Color") + " ");
			//System.out.println(record.get("Favorite Food"));
		}
		
		return "NOT FOUND!";
    }
    
    
    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2){
        
        for (CSVRecord record : parser){
        
          if(record.get("Exports").contains(exportItem1)  &&  record.get("Exports").contains(exportItem2) ){
              
              System.out.println(record.get("Country"));
              
          }
        
        
       }
    }
    
    

}
