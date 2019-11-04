package hw3;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to cinema";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to park";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Go to the mall";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Go to the shopping";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "Learn something new";

        Scanner scanner = new Scanner(System.in);


       loop : while (true){
                System.out.println("Please, input the day of the week:");
                String day = scanner.nextLine();
                switch (day) {
                    case "Sunday":
                        System.out.println(schedule[0][1]);
                        break;
                    case "Monday":
                        System.out.println(schedule[1][1]);
                        break;
                    case "Tuesday":
                        System.out.println(schedule[2][1]);
                        break;
                    case "Wednesday":
                        System.out.println(schedule[3][1]);
                        break;
                    case "Thursday":
                        System.out.println(schedule[4][1]);
                        break;
                    case "Friday":
                        System.out.println(schedule[5][1]);
                        break;
                    case "Satruday":
                        System.out.println(schedule[6][1]);
                        break;
                    case "exit": break loop;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                }

            }
        }
    }
