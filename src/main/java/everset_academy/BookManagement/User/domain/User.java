package everset_academy.BookManagement.User.domain;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private Long groupId;

    public User() {
    }

    public User(String firstName, String lastName, String birthDate, String email, Long groupId) {
        this(null, firstName, lastName, birthDate, email, groupId);
    }

    public User(Long id, String firstName, String lastName, String birthDate, String email,
                Long groupId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.groupId = groupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", birthDate='" + birthDate + '\'' +
               ", email='" + email + '\'' +
               ", groupId='" + groupId + '\'' +
               '}';
    }
}