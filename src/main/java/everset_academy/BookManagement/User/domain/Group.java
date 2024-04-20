package everset_academy.BookManagement.User.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Group {

    private Long id;
    private String name;
    private List<User> users;

    public Group() {
        users = new ArrayList<>();
    }

    public Group(Long id, String name) {
        this.id = id;
        this.name = name;
        users = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Group{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", users=" + users +
               '}';
    }
}