package ru.geekbrains.lesson.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

public class HWlesson3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.busina.ru/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//p/a[@href='/feedback/']]")).click();

        String postTitle = "Title" + new Random().nextInt(100);

        driver.findElement(By.id("id_topic")).sendKeys(postTitle);
        driver.findElement(By.id("id_name")).sendKeys("Micluha");
        driver.findElement(By.id("id_email")).sendKeys("email");
        driver.findElement(By.id("id_text")).sendKeys("Отличный магазин");
        driver.findElement(By.xpath("//input[@value='Отправить']")).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
