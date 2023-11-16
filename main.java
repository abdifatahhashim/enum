package Enums;

import java.util.logging.Level;

enum Enumtutorial {
     SUNDAY,
     MONDAY,
     TUESDAY,
     WEDNESDAY,
     THURSDAY,
     FRIDAY,
    SATURDAY,
 }


    public class main {
        public static void main (String[] args) {
            Enumtutorial myVar = Enumtutorial.THURSDAY;
            switch (myVar) {
                case SUNDAY:
                    System.out.println("Weekend");
                    break;
                case MONDAY:
                    System.out.println(" Public Holiday");
                    break;
                case TUESDAY:
                    System.out.println("Going work");
                    break;

                case WEDNESDAY:
                    System.out.println("Going work");
                    break;
                case THURSDAY:
                    System.out.println("Attending public meeting");
                    break;
                case FRIDAY:
                    System.out.println("Going work");
                    break;
                case SATURDAY:
                    System.out.println("WEEKEND");
                    break;

            }

            for (Enumtutorial x : Enumtutorial.values()){
                System.out.println(x);
            }
        }
    }







