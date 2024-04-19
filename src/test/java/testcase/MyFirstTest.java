package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Base_test;

public class MyFirstTest extends Base_test {
	@Test
	public static void logintest() throws InterruptedException 
	{
	

    driver.findElement(By.xpath("//button[@class='btn btnproceedlogin-a flip-login']")).click();
    driver.findElement(By.id("username_id")).sendKeys("MANTRISQRBLR@DW");
    driver.findElement(By.id("password_id")).sendKeys("MANTRISQRBLR@DW");
    driver.findElement(By.xpath("//button[@class='btn btnproceedlogin-a']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//a[@id='opentogglemenu']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[@class='btncircle-m first']")).click();
    driver.findElement(By.xpath("//a[@href='/consumer-service/billing/d2RXeWkwKy9McWZVaUdQQ0VRaWZLdz09'][1]")).click();
    WebElement html = driver.findElement(By.tagName("html"));
    html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@type='inputMobileNo']")).sendKeys("9308566983");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@aria-controls='customerServiceAssociate_listbox']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[text() =\"Santhosh-SMSB00102\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='inventbarCode']")).sendKeys("7315030001938", Keys.ENTER);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='btn btn-secondary categoryAccessBtn tender_icon tenderAmt_btn']")).click();
//    System.out.println( driver.findElement(By.cssSelector("toCollect")).getAttribute("id"));

}
}