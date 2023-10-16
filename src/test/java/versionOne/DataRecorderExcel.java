package versionOne;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.jayway.jsonpath.JsonPath;

public class DataRecorderExcel {

	
	
	public static void excelGetListOfStoriesWithoutTasks(String response, String path) throws EncryptedDocumentException, IOException {
		
		System.out.println("*******************");
		//creating excel file 
		 String filePath = path;	 
	        Workbook workbook;
	        FileInputStream fis;
	        FileOutputStream fos;
	        fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
            
        //Add column headers
            Row row0 = sheet.createRow(0);	
            row0.createCell(0).setCellValue("TeamName");
            row0.createCell(1).setCellValue("StoryName");
            row0.createCell(2).setCellValue("StoryNumber");
            row0.createCell(3).setCellValue("FeatureNumber");
            row0.createCell(4).setCellValue("FeatureName");
            row0.createCell(5).setCellValue("CapitalizationCategory");
            row0.createCell(6).setCellValue("Status");
            
       //Read Json & paste the data in excel file
            
		ArrayList<String>listOfElements = JsonPath.read(response, "$[0][*].Name");
		
		for (int i = 0; i < listOfElements.size(); i++) {
						
			String teamName = JsonPath.read(response, "$[0]["+i+"].['Team.Name']");
			String storyName = JsonPath.read(response, "$[0]["+i+"].Name");
			String storyNumber = JsonPath.read(response, "$[0]["+i+"].Number");
			String featureNumber = JsonPath.read(response, "$[0]["+i+"].['Super.Number']");
			String featureName = JsonPath.read(response, "$[0]["+i+"].['Super.Name']");
			String CapitalizationCategory= JsonPath.read(response, "$[0]["+i+"].['Custom_CapitalizationCategory.Name']");
			String Status = JsonPath.read(response, "$[0]["+i+"].['Status.Name']");

			
			Row row1 = sheet.createRow(i+1);		   
			row1.createCell(0).setCellValue(teamName);
			row1.createCell(1).setCellValue(storyName);
			row1.createCell(2).setCellValue(storyNumber);
			row1.createCell(3).setCellValue(featureNumber);
			row1.createCell(4).setCellValue(featureName);
			row1.createCell(5).setCellValue(CapitalizationCategory);
			row1.createCell(6).setCellValue(Status);
			
			
			System.out.println(storyName + " | "+ storyNumber + " | "+ featureNumber + " | "+ featureName + " | "+ CapitalizationCategory + " | "+ Status);
			
		}
		
		//Save excel file & close workbook
		fos = new FileOutputStream(filePath);
		workbook.write(fos);
		fos.close();
		
		
	}
	
	
	
	
	
	public static void excelGetListOfStoriesWithoutTestingTasks(String response, String path) throws EncryptedDocumentException, IOException {
		

		System.out.println("*******************");
		//creating excel file 
		 String filePath = path;	 
	        Workbook workbook;
	        FileInputStream fis;
	        FileOutputStream fos;
	        fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
            
        //Add column headers
            Row row0 = sheet.createRow(0);	
            row0.createCell(0).setCellValue("TeamName");
            row0.createCell(1).setCellValue("StoryName");
            row0.createCell(2).setCellValue("StoryNumber");
            row0.createCell(3).setCellValue("FeatureNumber");
            row0.createCell(4).setCellValue("FeatureName");
            row0.createCell(5).setCellValue("CapitalizationCategory");
            row0.createCell(6).setCellValue("Status");
            
       //Read Json & paste the data in excel file
            
		ArrayList<String>listOfElements = JsonPath.read(response, "$[0][*].Name");
		
		for (int i = 0; i < listOfElements.size(); i++) {
						
			String teamName = JsonPath.read(response, "$[0]["+i+"].['Team.Name']");
			String storyName = JsonPath.read(response, "$[0]["+i+"].Name");
			String storyNumber = JsonPath.read(response, "$[0]["+i+"].Number");
			String featureNumber = JsonPath.read(response, "$[0]["+i+"].['Super.Number']");
			String featureName = JsonPath.read(response, "$[0]["+i+"].['Super.Name']");
			String CapitalizationCategory= JsonPath.read(response, "$[0]["+i+"].['Custom_CapitalizationCategory.Name']");
			String Status = JsonPath.read(response, "$[0]["+i+"].['Status.Name']");

			
			Row row1 = sheet.createRow(i+1);		   
			row1.createCell(0).setCellValue(teamName);
			row1.createCell(1).setCellValue(storyName);
			row1.createCell(2).setCellValue(storyNumber);
			row1.createCell(3).setCellValue(featureNumber);
			row1.createCell(4).setCellValue(featureName);
			row1.createCell(5).setCellValue(CapitalizationCategory);
			row1.createCell(6).setCellValue(Status);
			
			
			System.out.println(storyName + " | "+ storyNumber + " | "+ featureNumber + " | "+ featureName + " | "+ CapitalizationCategory + " | "+ Status);
			
		}
		
		//Save excel file & close workbook
		fos = new FileOutputStream(filePath);
		workbook.write(fos);
		fos.close();
		

	}
	
	
	
	
	
	
	
	
	
	//********DISCARDED CODE********
	
	public static void printToExcelFile(String response, Hashtable<String, String> datatable, String filePath) throws EncryptedDocumentException, IOException {
		//creating excel file 
		// String filePath = "C:\\Users\\4984356\\Desktop\\IN PROGRESS\\V1_Tracking\\Playground\\xecutionResults.xlsx";		 
	        Workbook workbook;
	        FileInputStream fis;
	        FileOutputStream fos;
	       fis = new FileInputStream(filePath);
           workbook = WorkbookFactory.create(fis);
           org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
           //Add Headers
           Row row0 = sheet.createRow(0);
           Set<String> setOfExcelColumns = datatable.keySet(); 
           int ik=0;
           for(String key : setOfExcelColumns) {  
        	   row0.createCell(ik).setCellValue(key);
        	   ik++;
           }
           
           //Parse through Json & print values
         
           
   		ArrayList<String>listOfElements = JsonPath.read(response, "$[0][*].Name");
   		
   		for (int i = 0; i < listOfElements.size(); i++) {
   			//System.out.println(listOfElements.get(i));
   			
   			String teamName = JsonPath.read(response, "$[0]["+i+"].['Team.Name']");
   			String storyName = JsonPath.read(response, "$[0]["+i+"].Name");
   			String storyNumber = JsonPath.read(response, "$[0]["+i+"].Number");
   			String featureNumber = JsonPath.read(response, "$[0]["+i+"].['Super.Number']");
   			String featureName = JsonPath.read(response, "$[0]["+i+"].['Super.Name']");
   			String CapitalizationCategory= JsonPath.read(response, "$[0]["+i+"].['Custom_CapitalizationCategory.Name']");
   			String Status = JsonPath.read(response, "$[0]["+i+"].['Status.Name']");

   			
   			Row row1 = sheet.createRow(i+1);		   
   			row1.createCell(0).setCellValue(teamName);
   			row1.createCell(1).setCellValue(storyName);
   			row1.createCell(2).setCellValue(storyNumber);
   			row1.createCell(3).setCellValue(featureNumber);
   			row1.createCell(4).setCellValue(featureName);
   			row1.createCell(5).setCellValue(CapitalizationCategory);
   			row1.createCell(6).setCellValue(Status);
   			
   			
   			System.out.println(storyName + " | "+ storyNumber + " | "+ featureNumber + " | "+ featureName + " | "+ CapitalizationCategory + " | "+ Status);
   			
   		}
   		
   		
           
           
        
		
	}
	
}
