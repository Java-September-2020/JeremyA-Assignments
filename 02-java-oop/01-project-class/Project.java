public class Project {
    private String name;
    private String description;
    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void elevatorPitch () {
        System.out.println("My name is: " + this.getClass(Project(name)));
        System.out.println("I am :" + this.getClass(Project(description)));
    }
}