public class Person {
    private String name;
    private String contactInfo;
    private String address;

    public Person(String name, String contactInfo, String address){
        this.name = name;
        this.contactInfo = contactInfo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
