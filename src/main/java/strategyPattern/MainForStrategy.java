package strategyPattern;

public class MainForStrategy {
    public static void main(String[] args) {
        CameraPlusApp cameraPlusApp = new CameraPlusApp();
        cameraPlusApp.setShareStrategy(new ShareByText());
        cameraPlusApp.share();
    }
}
