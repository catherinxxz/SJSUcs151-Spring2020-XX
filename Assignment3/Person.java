package Assignment3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;


    Person(String firstName, String lastName, int age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public Person() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
