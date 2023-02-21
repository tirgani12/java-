package Group_Project;

public interface WebDrive {
    void open();
    void close();
    String getTitle();

    }
     interface RemoveWebDrive{
    void navigate();
    }
    interface TakesScreenShot{
    void getScreenShot();
    }
    class ChromeDrive implements WebDrive,RemoveWebDrive,TakesScreenShot{

        @Override
        public void navigate() {
            System.out.println("navigate to Google home page");

        }

        @Override
        public void getScreenShot() {
            System.out.println("get Google home page screen shot");

        }

        @Override
        public void open() {
            System.out.println("open Google search page");

        }

        @Override
        public void close() {
            System.out.println("close Google search page");

        }

        @Override
        public String getTitle() {
            System.out.println("get the HTML page");
            return null;
        }
    }
class FireFoxDrive implements WebDrive,RemoveWebDrive,TakesScreenShot{
    @Override
    public void navigate() {
        System.out.println("navigate to FireFox home page");

    }

    @Override
    public void getScreenShot() {
        System.out.println("get FireFox home page screen shot");

    }

    @Override
    public void open() {
        System.out.println("open FireFox search page");

    }

    @Override
    public void close() {
        System.out.println("close FireFox search page");

    }

    @Override
    public String getTitle() {
        System.out.println("get the HTML page");

        return null;
    }
}
class SafariDrive implements WebDrive,RemoveWebDrive,TakesScreenShot{
    @Override
    public void navigate() {
        System.out.println("navigate to Safari home page Safari");

    }

    @Override
    public void getScreenShot() {
        System.out.println("get Safari home page screen shot");

    }

    @Override
    public void open() {
        System.out.println("open Safari search page");

    }

    @Override
    public void close() {
        System.out.println("close Safari search page");

    }

    @Override
    public String getTitle() {
        System.out.println("get the HTML page");

        return null;
    }
}
class Test4{
    public static void main(String[] args) {
        WebDrive[] webDrives = {new ChromeDrive(), new FireFoxDrive(), new SafariDrive()};
        for (WebDrive webDrive : webDrives) {
            webDrive.open();
            webDrive.close();
            webDrive.getTitle();
        }

        RemoveWebDrive[] removeWebDrives = {new ChromeDrive(), new FireFoxDrive(), new SafariDrive()};
        for (RemoveWebDrive removeWebDrive:removeWebDrives){
            removeWebDrive.navigate();
        }
        TakesScreenShot [] takesScreenShots={new ChromeDrive(),new FireFoxDrive(),new SafariDrive()};
        for (TakesScreenShot takesScreenShot:takesScreenShots){
            takesScreenShot.getScreenShot();
        }
    }

    }






