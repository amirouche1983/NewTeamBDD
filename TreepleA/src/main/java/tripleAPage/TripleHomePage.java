package tripleAPage;

import common.WebAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class TripleHomePage extends WebAPI {
   public static String currentUrl = "";
    public static  TripleHomePage tripleAHomePage ;
    public static  TripleAWebElemment tripleAWebElemment ;
    public  void inIt(){
        getLocalDriver("OS X","firefox").get("https://northeast.aaa.com/");
        tripleAHomePage = PageFactory.initElements(driver,TripleHomePage.class);
        tripleAWebElemment = PageFactory.initElements(driver,TripleAWebElemment.class);
    }
    public static void  HPuser_enter_url() {

        //driver.get("https://northeast.aaa.com/");
    }

    public static void HPuser_land_on_AAAHomePage() {
        currentUrl = driver.getCurrentUrl();
    }

    public static void HPuser_should_see() {
        Assert.assertEquals("https://northeast.aaa.com/",currentUrl);
    }
}
