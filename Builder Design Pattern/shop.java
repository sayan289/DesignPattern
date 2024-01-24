package builder;

public class shop {
    public static void main(String ars[])
    {
        phone p=new phonebuilder().setos("Android").setram(4).getphone();
        System.out.println(p);

    }
}
