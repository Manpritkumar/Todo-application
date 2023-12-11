package se.lexicon;

import java.time.LocalDate;


public class TodoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private boolean done;
    private Person creator;

    //constructor
    public TodoItem(int id,String title,String taskDescription,LocalDate deadline,boolean done,Person creator){
        this.id=id;
        this.title=title;
        this.taskDescription=taskDescription;
        this.deadline=deadline;
        this.done=done;
        this.creator=creator;


    }



//getter & setter



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title==null) throw new IllegalArgumentException("Title not be null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        if (LocalDate.now().isAfter(deadline)) throw new IllegalArgumentException("Item is overdue");
   if (deadline==null) throw new IllegalArgumentException();

        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public boolean isOverdue(){
        if (LocalDate.now().isAfter(deadline)) {
            return true;
        }
        return false;

    }
    public String getSummary(){
        return "name:" + creator.getFirstName() + " " + creator.getLastName()+ " email:" + creator.getEmail();
    }
}
