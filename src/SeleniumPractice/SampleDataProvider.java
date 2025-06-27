package SeleniumPractice;

import java.io.FileInputStream;

public class SampleDataProvider {
	
	@DataProvider(name="ExcelData")
	
	public Object[][] getExcelData(){
		
		FileInputStream  file = new FileInputStream("testData.xlsx");
		
		XSSFWorkbook worbook = new XSSFWorkbook(file);
		XSSFSheet sheet =sheet.getSheet("loginData");
		
		int rowCount = sheet.getlasRowCount();
		int las columns = sheet.getRow(0).GetlastCellNum();
		
		Object[][]data = new Object[rowCount][colCount];
		
		for(int i =1;i<= rowCount;i++) {
			
			for(int j=0;j<colCiount;j++) {
				
				data[i-1][j] =sheet.getRtow(i).getCell(j).getStringCell Value
			}
		}
		
		
	}
}