public class Person {
    
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int deathYear;
    private int deathMonth;
    private int deathDay;

    private Person mother;
    private Person father;
    private Person spouse;

    private Marriage[] marriages;

    private Person[] children;


    /**
     * @param fName Person's first name
     * @param lName Person's last name
     */
    public Person(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }
}
