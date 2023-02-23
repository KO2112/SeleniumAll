package com.cydeo.tests;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {
    String path = "Kemal.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    @Before
    public void setup(){
        Driver.getDriver().get("https://www.google.com/");
    }
    @After
    public void teardown(){
        Driver.closeDriver();
    }

    @Test
    public void test1() throws IOException {
        Driver.getDriver().findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        WebElement element= Driver.getDriver().findElement(By.name("q"));
        element.click();
        FileInputStream inputStream = new FileInputStream(path);
        workbook = new XSSFWorkbook(inputStream);
        sheet = workbook.getSheet("Sheet1");

        for (int rows = 1; rows<= sheet.getLastRowNum(); rows++){
            String searchText = sheet.getRow(rows).getCell(0).toString();
            element.sendKeys(searchText);
            element.sendKeys(Keys.RETURN);
            Driver.getDriver().navigate().back();

        }
    }
}
