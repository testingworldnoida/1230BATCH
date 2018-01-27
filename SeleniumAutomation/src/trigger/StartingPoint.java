package trigger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class StartingPoint {

	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\FrameWork.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		XSSFSheet sh = wk.getSheet("Sheet1");
		int tc= sh.getPhysicalNumberOfRows();
		
		XmlSuite s1 =  new XmlSuite();
		s1.setName("Suite1");
		
		XmlTest t1= new XmlTest(s1);
		t1.setName("Test1");
		
		
		ArrayList Ac = new ArrayList();
		for(int i=1;i<tc;i++)
		{
			XSSFRow r1= sh.getRow(i);	
			XSSFCell c1 = r1.getCell(4);
			if(c1.getStringCellValue().equalsIgnoreCase("Y"))
			{
				XSSFCell cp = r1.getCell(2);
				XSSFCell cc = r1.getCell(3);
				XmlClass cn = new XmlClass(cp.getStringCellValue()+"."+cc.getStringCellValue());
				Ac.add(cn);
			}
		}
		
		t1.setXmlClasses(Ac);
		
		ArrayList At = new ArrayList();
		At.add(t1);
		
		s1.setTests(At);
		
		ArrayList As = new ArrayList();
		As.add(s1);
		
		TestNG tng = new TestNG();
		tng.setXmlSuites(As);
		tng.run();
		
	}
	
}
