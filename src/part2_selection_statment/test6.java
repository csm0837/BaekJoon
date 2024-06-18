package part2_selection_statment;
import java.io.*;
import java.util.*;

public class test6 {
    public static void main(String[] args) throws IOException {
        {
            Scanner scan = new Scanner(System.in);

            int hour = Integer.parseInt(scan.next());
            int min = Integer.parseInt(scan.next());
            int time = Integer.parseInt(scan.next());

            int LaterMin = min + time;
            int increhour = (min + time) / 60;


            hour = (hour + increhour + 24) % 24;
            min = (min + time + 60) % 60;

            System.out.println(hour + " " + min);
        }
        }

    }
