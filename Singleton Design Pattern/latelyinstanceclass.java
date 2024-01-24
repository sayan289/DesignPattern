class A1
{
    public static A1 ob;
    //If we create the static object of  then memory is created when this class is loaded on memory.
    //So it become global variable and even if we do not used this object it will take memory to avoid this we used lazy instance
    private A1()
    {

    }
    public static A1 getinstance()
    {
        if(ob==null)
        {
            ob=new A1();//here object is created after this method is called
        }
        return ob;
    }
}
public class latelyinstanceclass {
    public static void main(String ars[])
    {
         A ob=A.getInstance();
         A ob1=A.getInstance();
         System.out.println(ob1);
         System.out.println(ob);
    }
}
