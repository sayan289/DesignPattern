package builder;

public class phonebuilder {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;
    public phonebuilder setos(String os)
    {
        this.os=os;
        return this;
    }
    public phonebuilder setram(int ram)
    {
        this.ram=ram;
        return this;
    }
    public phonebuilder setprocessor(String processor)
    {
        this.processor=processor;
        return this;
    }
    public phonebuilder screensize(double screensize)
    {
        this.screensize=screensize;
        return this;
    }
    public phonebuilder battery(int battery)
    {
        this.battery=battery;
        return this;
    }
    public phone getphone()
    {
        return new phone(os,ram,processor,screensize,battery);
    }
}
