package library.management.system.user;

public class UserMember {

    private String userId;
    private String name;

    public UserMember(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserMember{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
