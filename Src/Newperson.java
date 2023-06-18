public class Newperson {
    public static void main(String[] args){
        Person person = new Person("Will","Smith","New York", "2936729462846");
        Person person1 = new Person("Jackie",  "Chan","Shanghai","12312412412");
        Person person2 = new Person("Sherlock","Holmes","London","37742123513");

        System.out.println(person.personInfo());
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
    }
}


