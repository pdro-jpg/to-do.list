public class task {
    private String description;
    private boolean done;

    public task(String description) {
        this.description = description;
        this.done = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return done;
    }

    public void markAsDone() {
        this.done = true;
    }

    @Override
    public String toString() {
        String status = done ? "[X]" : "[ ]";
        return status + " " + description;
    }
}