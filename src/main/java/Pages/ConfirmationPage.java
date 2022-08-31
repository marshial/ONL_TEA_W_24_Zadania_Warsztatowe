package Pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ConfirmationPage {
    private WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void screenShot() throws IOException {
        Screenshot orderScreenShot = new AShot().takeScreenshot(driver);
        ImageIO.write(orderScreenShot.getImage(), "PNG", new File("C:\\Users\\48660\\PageScreenshot.png"));
    }

    public void fullScreenShot() throws IOException {
        Screenshot orderScreenShotFull = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(orderScreenShotFull.getImage(), "PNG", new File("C:\\Users\\48660\\FullPageScreenshot.png"));
    }
}
