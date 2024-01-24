package factoryexample;

public class Demo {
    public static void main(String ars[])
    {
        course hldcourse=coursefactory.getcourse("HLD");
        course lldcourse=coursefactory.getcourse("LLD");
        assert hldcourse!=null;
        System.out.println("HLD Modules :");
        System.out.println(hldcourse.modules);
        assert lldcourse!=null;
        System.out.println("LLD Module");
        System.out.println(lldcourse.modules);
    }
}
