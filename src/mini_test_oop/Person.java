package mini_test_oop;

public class Person {
    private String name;
    private long phoneNumber;
    private String address;
    private String email;
    private String group;
    private String sex;

    public Person() {
    }

    public Person(String name, long phoneNumber, String address, String email, String group, String sex) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.group = group;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
