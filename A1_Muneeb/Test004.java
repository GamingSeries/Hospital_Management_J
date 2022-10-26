import java.util.ArrayList;
import java.util.Collection; 

public class Test004 {
    public static void main(String[] args) {
        ArrayList <Appointment> arr_list = new ArrayList<Appointment>();
        Appointment app_list = new Appointment();

        Date date_1;
        date_1 = new Date(16, 4,2022);
        Date date_2;
        date_2 = new Date(5,10,2019);
        Date date_3;
        date_3 = new Date(9, 10, 2022);

        Time time_1;
        time_1 = new Time(12, 30); 
        Time time_2;
        time_2 = new Time(13, 00);
        Time time_3;
        time_3 = new Time(13, 30);

        Consultation_Room room_1;
        room_1 = new Consultation_Room('A', 4, 405);
        Consultation_Room room_2;
        room_2 = new Consultation_Room('A', 2, 202);
        Consultation_Room room_3;
        room_3 = new Consultation_Room('B', 2, 205);

        app_list.setAppointment("A001", "P001", "FLU", "Asthma", date_1, time_1, room_1);
        app_list.setAppointment("A002", "P002", "Allergy", "heart disease", date_2, time_2, room_2);
        app_list.setAppointment("A003", "P003", "Fever", "brain tumor", date_3, time_3, room_3);

        Date date1_1;
        date1_1 = new Date(17, 1,2021);
        Date date1_2;
        date1_2 = new Date(9,15,2020);
        Date date1_3;
        date1_3 = new Date(12, 12, 2020);

        Time time1_1;
        time1_1 = new Time(15, 30); 
        Time time1_2;
        time1_2 = new Time(16, 00);
        Time time1_3;
        time1_3 = new Time(16, 30);

        Consultation_Room room1_1;
        room1_1 = new Consultation_Room('B', 4, 405);
        Consultation_Room room1_2;
        room1_2 = new Consultation_Room('A', 2, 202);
        Consultation_Room room1_3;
        room1_3 = new Consultation_Room('B', 2, 205);

        app_list.setAppointment("P004", "D007", "Cancer", null, date1_1, time1_1, room1_1);
        app_list.setAppointment("P005", "d008", "FLU", null, date1_2, time1_2, room1_2);
        app_list.setAppointment("P006", "D009", "Cough", null, date1_3, time1_3, room1_3);

        
    }
}
