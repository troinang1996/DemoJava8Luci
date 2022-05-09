package DemoStream;

public class Person {
    String firstName;
    String lastName;
    Integer electionYear;

    public Person(String firstName, String lastName, Integer electionYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.electionYear = electionYear;
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

    public Integer getElectionYear() {
        return electionYear;
    }

    public void setElectionYear(Integer electionYear) {
        this.electionYear = electionYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", electionYear=" + electionYear +
                '}';
    }

}
