package Testing_junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Baseclass {     
	
	public static String getdata(int rowno,int cellno) throws IOException {
		File f= new File("C:\\Selinium\\JunitTest1\\Test.xlsx");
	    FileInputStream st=new FileInputStream(f);
	    Workbook w= new XSSFWorkbook(st);
	    Sheet s=w.getSheet("Sheet1");
	    Row r=s.getRow(rowno);
	    Cell c=r.getCell(cellno);
	    System.out.println(c);
		
	    int type = c.getCellType();
	    System.out.println(type);
	    String name=null;
	  
	    if(type==1) {
	    	name= c.getStringCellValue();
	    }
	    else if(type==0)
	    {
	    	if(DateUtil.isCellDateFormatted(c)) {
	    		Date date=c.getDateCellValue();
	    	SimpleDateFormat sd= new SimpleDateFormat("dd-MMM-YYYY");
	    	name=sd.format(date);
	    	}
	    }
	     else {
	    	double d=c.getNumericCellValue();
	    	long l=(long)d;
	    	name=String.valueOf(l);
	    }
	    
		return name;
	}	

	public static void main(String[] args) throws IOException {
		getdata(0,0);
		
	}

}
