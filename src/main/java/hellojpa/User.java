package hellojpa;

public class User extends BaseEntity {

    private Long id;
    private String password;
    private String email;
    private String userName;
    private String userInfo;

    public User(Long id, String password, String email, String userName, String userInfo) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.userName = userName;
        this.userInfo = userInfo;
    }
}
