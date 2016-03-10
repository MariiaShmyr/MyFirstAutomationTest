/**
 * Created by Masha on 03.03.2016.
 */
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import  org.testng.annotations.Test;


public class AutoTest {

        @Test
        public void navigateToitsquiz (){

            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();

            driver.get("http://itsquiz.com/activations");


                WebElement element = null;
                try {
                    element = driver.findElement(By.className("QuizCard__content"));
                } catch (Exception e) {
                }
                if (element != null) {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("Tests ALL are  here! You can choose any of them!");
                } else {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("There is NO tests in here!");
                }


            driver.get("http://itsquiz.com/activations?category=VACANCY");

                WebElement element2 = null;
                try {
                    element2 = driver.findElement(By.className("QuizCard__content"));
                } catch (Exception e) {
                }
                if (element2 != null) {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("Tests VACANCIES are  here! You can choose any of them!");
                } else {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("There is NO tests in here!");
                }


            driver.get("http://itsquiz.com/activations?category=EDUCATION");

                WebElement element3 = null;
                try {
                    element3 = driver.findElement(By.className("QuizCard__content"));
                } catch (Exception e) {
                }
                if (element3 != null) {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("Tests EDUCATION are  here! You can choose any of them!");
                } else {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("There is NO tests in here!");
                }

            driver.get("http://itsquiz.com/activations?category=ENTERTAINMENT");

                WebElement element4 = null;
                try {
                    element4 = driver.findElement(By.className("QuizCard__content"));
                } catch (Exception e) {
                }
                if (element4 != null) {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("Tests ENTERTAINMENT are  here! You can choose any of them!");
                } else {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("There is NO tests in here!");
                }


            driver.get("http://itsquiz.com/activations?category=SPECIAL");

                WebElement element5 = null;
                try {
                    element5 = driver.findElement(By.className("QuizCard__content"));
                } catch (Exception e) {
                }
                if (element5 != null) {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("Tests SPECIAL are  here! You can choose any of them!");
                } else {
                    driver.findElement(By.className("SearchBox__input")).sendKeys("There is NO tests in here!");
                }

            /*driver.get("http://itsquiz.com/activations");
            driver.findElement(By.className("QuizCard__content"));
            driver.findElement(By.className("SearchBox__input")).sendKeys("Tests ALL are  here! You can choose any of them!");


            driver.get("http://itsquiz.com/activations?category=VACANCY");
            driver.findElement(By.className("QuizCard__content"));
            driver.findElement(By.className("SearchBox__input")).clear();
            driver.findElement(By.className("SearchBox__input")).sendKeys("Tests VACANCIES are  here! You can choose any of them!");

            driver.get("http://itsquiz.com/activations?category=EDUCATION");
            driver.findElement(By.className("QuizCard__content"));
            driver.findElement(By.className("SearchBox__input")).clear();
            driver.findElement(By.className("SearchBox__input")).sendKeys("Tests EDUCATION are  here! You can choose any of them!");

            driver.get("http://itsquiz.com/activations?category=ENTERTAINMENT");
            driver.findElement(By.className("QuizCard__content"));
            driver.findElement(By.className("SearchBox__input")).clear();
            driver.findElement(By.className("SearchBox__input")).sendKeys("Tests ENTERTAINMENT are  here! You can choose any of them!");

            driver.get("http://itsquiz.com/activations?category=SPECIAL");
            driver.findElement(By.className("QuizCard__content"));
            driver.findElement(By.className("SearchBox__input")).clear();
            driver.findElement(By.className("SearchBox__input")).sendKeys("Tests SPECIAL are  here! You can choose any of them!");*/

        }

}
