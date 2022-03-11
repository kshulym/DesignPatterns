package strategyPattern;

public abstract class PhoneCameraApp {

    ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void share() {
        shareStrategy.share();
    }

    public void take() {
    }

    public abstract void edit();

    public void save() {
    }
}
