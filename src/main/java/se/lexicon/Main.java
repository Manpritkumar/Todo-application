package se.lexicon;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //person object
        Person personObject = new Person(1, "John", "Nilson", "john@gmail.com");
        System.out.println("Person " + personObject.getSummary());

        //toDo object
        LocalDate deadLine = LocalDate. parse ("2020-09-11");
        TodoItem toDo = new TodoItem(2, "Change tires", "this is my firsttask", deadLine, true, personObject);
        System.out.println("toDo.isOverdue = " + toDo.isOverdue());
        System.out.println("Todo summary = " + toDo.getSummary());

        //todo item object
        TodoItemTask todoTask = new TodoItemTask(2,true,toDo,personObject );
        System.out.println("todoTask summary = " + todoTask.getSummary());
        System.out.println("todoTask item title = " + todoTask.getTodoItem());
    }

}