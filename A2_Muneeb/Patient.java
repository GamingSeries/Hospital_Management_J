package A2_Muneeb;

public class Patient
{
    private String patient_ID;
    private Date date;
    private String problem;
    private int priority;

    Patient()
    {
        patient_ID = "P001";
        date = new Date();
        problem = "Asthma";
        priority = 5;
    }

    public String toString()
    {
        return "Patient ID: " + patient_ID + "\nDate: " + date + "\n Problem: "  + problem + "\n Priority: " + priority;
    }
}