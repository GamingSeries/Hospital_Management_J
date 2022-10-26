public class Date 
{
    private int day;    //day of the month(1-31)
    private int month;  //month of the year(1-12)
    private int year;   //year

    //No Parameterized Constructor:
    Date()
    {
        day = 15;
        month = 9;
        year = 2007;

    }

    //Parameterized Constructor:
    Date( int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;

    }
    Date(Date c_Date)
    {
        day = c_Date.day;
        month = c_Date.month;
        year = c_Date.year;

    }

    //Setter method:
    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month =  month;
        this.year = year;
    }

    //Getter method:
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int year()
    {
        return year;
    }

    public String getDate()
    {
        return this.day + " " + this.month + " " + this.year;
    }

    //Converting to String:
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    //CompareTo Method:
    @Override
    public int CompareTo(Date a)
    {
        return this.getDate().compareTo(a.getDate());
    }

    //Cloning Object
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}
