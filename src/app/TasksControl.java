package app;
import utilities.DataReader;
import data.GreenTicket;
import data.Tasks;

public class TasksControl {
    //variable to control program
    private static final int exit = 0;
    private static final int task1 = 1;
    private static final int task2 = 2;
    private static final int task3 =3;

    private DataReader dr;

    public TasksControl () {
        this.dr = new DataReader();
    }


    public void controlLoop() {
        int option;
        this.printOptions();

        while((option = this.dr.getInt()) != exit )
        {
            switch (option) {

                case task1:
                    this.firstTask();
                    break;

                case task2:
                    this.secondTask();
                    break;

                case task3:
                    this.thirdTask();
                    break;

                default:
                    System.out.println("Wrong option");
                    break;

            }
            this.printOptions();
        }
     this.dr.close();

    }

    public void firstTask () {
        Tasks myTask = new Tasks(this.dr.readAndCreateTasksList());
        myTask.showWordsWithSpecificLength(this.dr.ReadLenOfWord());
    }

    public void secondTask() {
        Tasks myTask = new Tasks(this.dr.readAndCreateTasksList());
        myTask.showNewTable(this.dr.ReadIndexOfWords());
    }

    public void thirdTask() {
        GreenTicket myTicket = this.dr.readAndCreateGreenTicket();
        myTicket.showResult();
    }

    public void printOptions() {
        System.out.println("Choose a task");
        System.out.println(" 1 - Given an array of strings, return the count of the number of strings with the given length.");
        System.out.println(" 2 - Given an array of strings, return a new array containing the first N strings.");
        System.out.println(" 3 - Green lottery");
    }


}
