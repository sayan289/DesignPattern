package factoryexample;

public class HLD extends course{
    public void createcourse()
    {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}
