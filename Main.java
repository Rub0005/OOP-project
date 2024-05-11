import javax.swing.*;
import java.util.ArrayList;

public class Main {
        public static void main (String[]args){
            Company company = new Company("JTravels", new ArrayList<>());
            company.addTrip("boen215", "Moscow", "Novgorod", "14/10/2024 08:00",
                    "15/10/2024 10:00", company);
            company.addTrip("airbus350", "New York", "Los Angeles", "20/10/2024 10:00",
                    "21/10/2024 12:00", company);
            company.addTrip("boen737", "London", "Paris", "25/10/2024 14:00",
                    "26/10/2024 16:00", company);
            company.addTrip("boen4515", "Yerevan", "Los Angeles", "19/10/2024 08:00",
                    "16/10/2024 10:00", company);
            company.addTrip("boen987", "Saint-Petersbourg", "Tver", "29/11/2024 14:00",
                    "29/11/2024 19:00", company);
            company.addTrip("boen785", "Amsterdam", "Dushanbe", "29/11/2024 16:00",
                    "30/11/2024 02:00", company);
            company.addTrip("airbus", "Praha", "Warshaw", "01/12/2024 09:00",
                    "01/12/2024 11:30", company);

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MainGUI mainGUI = new MainGUI(company);
                    mainGUI.setVisible(true);
                }
            });
        }
    }
