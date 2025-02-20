package duke.tasks;

public class Todo extends Task {

    //When todo is created, it takes in the value of String description and stores it in the protected String description.
    public Todo(String description, boolean isDone) {
        super(description, isDone);
    }

    //The following method returns the description.
    @Override
    public String getDescription() {
        return "[T]" + super.getDescription();
    }
}