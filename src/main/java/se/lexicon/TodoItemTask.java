package se.lexicon;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    //constructor
    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee){
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;

    }


    //getter & setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
         if (assignee !=null) {
             this.assigned=true;
         }
    }

    public String getTodoItem() {
        return todoItem.getTitle();
    }

    public void setTodoItem(TodoItem todoItem) {
        if(todoItem==null) throw new IllegalArgumentException("Todoitems can not be null");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
public String getSummary(){
        return "assignee:" + assignee.getFirstName()+ " " + assignee.getLastName()+" "+ assignee.getEmail();
}
}
