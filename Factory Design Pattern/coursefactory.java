package factoryexample;

public class coursefactory {
    public static course getcourse(String courseType)
    {
        switch(courseType){
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:{
                return null;
            }
        }
    }
}
