public class Time 
{
    private int hour;   //hours of the day(0-23)
    private int minute; //minutes within the hour (0-59)

    //No Parameterized Constructor:
    Time()
    {
        hour = 13;
        minute = 40;
    }

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

    //Converting to String:
    public String toString()
    {
        return hour + ":" + minute;
    }
}