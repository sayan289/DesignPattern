package factoryexample;
import java.util.*;
public abstract class course {
    protected List<Module>modules=new ArrayList<>();
    public course(){this.createcourse();}
    public List<Module> getModules(){
        return modules;
    }
    public abstract void createcourse();
}
