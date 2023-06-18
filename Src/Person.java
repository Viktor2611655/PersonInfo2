public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String phoneNumber;

    public Person(String firstName, String lastName, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }
    public String personInfo(){
        return "Зателефонувати громадянину " + firstName + " " + lastName + " можно з міста " +
                city + " можно за номером " + phoneNumber;
    }
}







