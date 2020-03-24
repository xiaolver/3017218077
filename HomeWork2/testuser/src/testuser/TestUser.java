package testuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestUser {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "src/res/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		FileInputStream open=new FileInputStream("src/res/Selenium+Lab2020.xlsx");
		XSSFWorkbook xssfWorkbook=new XSSFWorkbook(open);
		open.close();
		System.out.println(xssfWorkbook);
		driver.get("http://103.120.226.190/selenium-demo/git-repo");
		XSSFSheet xssfSheet=xssfWorkbook.getSheetAt(0);
		for(int row=0;row<20;row++)
		{
//			Row row0=xssfSheet.getRow(0);
//			Cell cell0=row0.getCell(1);
//			System.out.println(row0);
//			System.out.println(cell0);
//
//			String user0=cell0.getStringCellValue();
			String username=xssfSheet.getRow(row).getCell(1).getStringCellValue();
			String password=xssfSheet.getRow(row).getCell(2).getStringCellValue();
			System.out.println(username);
			System.out.println(password);
			WebElement user=driver.findElement(By.name("user_number"));
			user.sendKeys(username);
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys(password);
			WebElement btn=driver.findElement(By.cssSelector(".btn"));
			btn.click();
			WebElement text=driver.findElements(By.className("mb-2")).get(1);
			if(text.getText().equals(password))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("wrong");
			}
		}
	}

}
