package class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("opening a url");

    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("starting the google chrome");    }

    @Override
    public void openURL() {

        System.out.println("opening a url");
    }

    @Override
    public void testLoginPage() {

        System.out.println("checking if login page in google");
    }

    @Override
    public void closeBrowser()
    {
        System.out.println("closing the google chrome");
    }
}
class Safari extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("starting the safari");
    }


    @Override
    public void openURL() {
        System.out.println("opening a url");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page in safari");

    }

    public void closeBrowser() {
    }
}
class FireFox extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("starting the firefox");
    }


    @Override
    public void openURL() {
        System.out.println("opening a url");

    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page in firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the firefox");
    }
}