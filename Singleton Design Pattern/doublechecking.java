class A3
{
    public static A3 ob;
    private A3()
    {
        System.out.println("Instance created");
    }
    public static A3 getInstance()
    {
        if(ob==null)
        {
            synchronized (A3.class)
            {
                ob=new A3();
            }
        }
        return ob;
    }
}
public class doublechecking {
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
