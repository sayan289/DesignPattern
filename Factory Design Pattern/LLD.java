package factoryexample;

public class LLD extends course{
     public void createcourse()
     {
         modules.add(new IntroModule());
         modules.add(new ExerciseModule());
         modules.add(new SummaryModule());
     }
}
