public class Marriage {
    private Person person1;
    private Person person2;

    private int weddingYear;
    private int weddingMonth;
    private int weddingDay;

    private int endYear;
    private int endMonth;
    private int endDay;

    private String reason;

    public Marriage(Person person1, Person person2, int year, int month, int day){
        this.person1 = person1;
        this.person2 = person2;
        
        this.weddingYear = year;
        this.weddingMonth = month;
        this.weddingDay = day;
    }
}
