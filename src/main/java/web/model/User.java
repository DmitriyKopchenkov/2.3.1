package web.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;


    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }

    public User() {

    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getLastName() {

        return lastName;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        return id +
                ", " + name +
                ", " + lastName +
                ", " + age;
    }
}
