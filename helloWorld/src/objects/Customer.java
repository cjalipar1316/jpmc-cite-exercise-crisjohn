package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Customer extends Person{

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String introduceYourself(){
        return "Hi I'm "+getFirstName()+" "+getLastName()+" "+"and I live in "+address;
    }

    public String introduceYourself(String product){
        return "Hi I'm "+getFirstName()+" "+getLastName()+" and I want to buy "+product;
    }

    public int noOfProducts(int noOfProducts){
        return noOfProducts;
    }


    private String address;
    private int telephoneNumber;
    private int customerId;
}
