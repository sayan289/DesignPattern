class A2
{
    public static A2 ob;
    private A2()
    {
        System.out.println("Instance created");
    }
    public static synchronized A2 getInstance()// If both the thread access the getInstance method parrally then two instance is created. To avoid this we make the method synchronized. So when 1st thread enter
                                                //the object is created then when second thread enter it return the object of that class.
    {
        if(ob==null)
        {
            ob=new A2();
        }
        return ob;
    }
}
public class synchronized1 {
    public static void main(String ars[])
    {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                A2 ob=A2.getInstance();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                A2 ob=A2.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}
