package excelutilitiessaucedemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils
{
	public static String getCellValue(String xl,String sheet,int row,int coloumn)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook workbook=new XSSFWorkbook(fi);
			XSSFCell cell=workbook.getSheet(sheet).getRow(row).getCell(coloumn);
			
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch (Exception e) 
		{
			return "";
		}
	}
	
	public static int getrowcount(String xl,String sheet)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook workbook=new XSSFWorkbook(fi);
			
			return workbook.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
	}
 

}
