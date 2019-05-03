public class Student {

    //Fields
    public String firstName;
    public String lastName;
    private String cardNumber;
    public int age;

    //Constructor
    public Student()
    {

    }
    public Student(String firstName, String lastName, int age, String cartNumbeer)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cardNumber = cartNumbeer;
    }
    public Student(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Methods
    public final String print()
    {
        return firstName;
    }

    public String getCardNumber() {

        return cardNumber;
    }
    public String getCardNumber(String cardType) {

        return cardType + " : " + cardNumber;
    }

}
