package library.management.system.auther;

public class Author {

    private String name;


    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "library.management.system.auther.Auther{" +
                "name='" + name + '\'' +
                '}';
    }
}
