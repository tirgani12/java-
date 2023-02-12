package class23;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new Chrome();//up casting
        //Firefox firefox=new WebDriver();//down casting
       // WebDriver webDriver=new Safari();
       // WebDriver webDriver=new FireFox();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();
        //an Array of type parent class can hold the objects of all the child classes
        /*
        Chrome chrome=new Chrome();
        Safari safari=new Safari();
        FireFox fireFox=new FireFox();
        WebDriver [] browser={chrome,safari,fireFox}

         */
        WebDriver [] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }

        /*
        Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();

         */
    }


}
