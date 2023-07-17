public class Phone extends Product{

    String phoneNumber;
    
    public Phone(int id, String name, int price, String phoneNumber) {
        super(id, name, price);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
