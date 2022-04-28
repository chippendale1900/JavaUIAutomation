package ru.geekbrains.lesson.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class HWlesson5Test {
    WebDriver driver;
    WebDriverWait webDriverWait;
    private final static String BUSINA_BASE_URL = "https://www.busina.ru";


    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(BUSINA_BASE_URL);
    }

    @Test

    void sendFeedbackTest() {

        driver.findElement(By.xpath("//p/a[@href='/feedback/']]")).click();

        String postTitle = "Title" + new Random().nextInt(100);

        driver.findElement(By.id("id_topic")).sendKeys(postTitle);
        driver.findElement(By.id("id_name")).sendKeys("Micluha");
        driver.findElement(By.id("id_email")).sendKeys("email");
        driver.findElement(By.id("id_text")).sendKeys("Отличный магазин");
        driver.findElement(By.xpath("//input[@value='Отправить']")).click();

    }

    AfterEach
    void tearDown() {
        driver.quot();
    }
}
