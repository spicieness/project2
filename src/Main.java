import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String title = "";
        String description = "";
        int priority = 0;


        ArrayList<Task> myTasks = new ArrayList<>();



        String taskSelect = "";

        String menuNum = "";

        while (!(menuNum.equals("0"))){
            int taskIndex = 0;

            System.out.println("What would you like to do? (Type the number of the action you wish to take)");
            System.out.println("(1) Add a task");
            System.out.println("(2) Remove a task");
            System.out.println("(3) Update a task");
            System.out.println("(4) View all tasks");
            System.out.println("(5) List tasks by priority");
            System.out.println("(0) Quit program");
            menuNum = input.nextLine();

            switch (menuNum) {
                case "1":
                    System.out.println("What task would you like to add? (Type a task)");
                    taskSelect = input.nextLine();
                    addTask(myTasks);
                    System.out.println(myTasks);
                    break;
                case "2":
                    System.out.println("What task would you like to remove? (Choose the number of the task)");
                    taskIndex = Integer.parseInt(input.nextLine()) - 1;
                    removeTask(myTasks, taskIndex);
                    System.out.println(myTasks);
                    break;
                case "3":
                    System.out.println("What task would you like to update? (Choose the number of the task)");
                    taskIndex = Integer.parseInt(input.nextLine()) - 1;
                    System.out.println("What do you want to change the task to? (Type your replacement task)");
                    taskSelect = input.nextLine();
                    updateTask(myTasks, taskIndex, taskSelect);
                    System.out.println(myTasks);
                    break;
                case "4":
                    System.out.println("Here are your tasks:");
                    System.out.println();
                    System.out.println(myTasks);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Choose the priority of the tasks you want to display");
                    int taskPriority = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i<myTasks.size(); i++){
                        if (){
                            
                        }
                    }


            }
        }

        System.out.println();
        System.out.println("Here are your final tasks:");
        System.out.println(myTasks);



    }

    //static ArrayList<String> addTask(ArrayList a, String b){
     //   a.add(b);
    //    return a;
   // }

    static ArrayList<String> removeTask(ArrayList a, int b){
        a.remove(b);
        return a;
    }

    static ArrayList<String> updateTask(ArrayList a, int b, String c){
        a.set(b, c);
        return a;
    }

    static void addTask(ArrayList a){
        Scanner input = new Scanner(System.in);
        System.out.println("Name");
        String title = input.nextLine();

        System.out.println("Desc");
        String description = input.nextLine();

        System.out.println("Pri");
        int priority = input.nextInt();
        input.nextLine();

        Task newTask = new Task(title, description, priority);

        a.add(newTask);

    }








}

