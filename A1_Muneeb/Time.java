public class Time implements Cloneable
{
    private int hour;   //hours of the day(0-23)
    private int minute; //minutes within the hour (0-59)

    //No Parameterized Constructor:
    Time(){}

    //Parameterized Constructor:
    Time(int hour,int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    //Copy Constructor:
    Time(Time c_Time)
    {
        hour = c_Time.hour;
        minute = c_Time.minute;
    }
    //Setter Method:
    public void setTime(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    //Getter Method:
    public int hour()
    {
        return hour;
    }
    public int minute()
    {
        return minute;
    }

    public String getTime()
    {
        return this.hour + ":" + this.minute;
    }

    //Converting to String:
    public String toString()
    {
        return hour + ":" + minute;
    }

    @Override
    public int compareTo(Time a)
    {
        return this.getTime().compareTo(a.getTime());
    }

    //Cloning Object
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}