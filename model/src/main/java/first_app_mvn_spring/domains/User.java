package first_app_mvn_spring.domains;

/**
 * user model
 */
public class User {
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    @Override
    public String toString() {
        return "id: " + id + "name: "+ name;
    }

}
