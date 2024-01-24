class A
{
    static A ob=new A();
    private A()
    {

    }
    public static A getInstance()
    {
        return ob;
    }
}
public class Main {
    public static void main(String[] args) {
        //A ob=new A();//it will give an error as the constructore is private
        A ob=A.getInstance();
        A ob1=A.getInstance();//here both ob and ob1 give the same object because we call the method and object of that class is already created.
    }
}