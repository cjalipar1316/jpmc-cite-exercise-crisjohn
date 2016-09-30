package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public abstract class Person {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String introduceYourSelf(){
        return "Hi I'm"+" "+firstName+" "+lastName+"\nMy email address is : "+email+"\nMy username is : "+userName+"\n";
    }

    public void setFirstName(String firstName){
        /* TODO check if string is from a-z */

        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public Person(){

    }

    public Person(String firstName, String lastName, String email, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = username;

    }

    private String userName;
    private String email;
    private String firstName;
    private String lastName;


}
