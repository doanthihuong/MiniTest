package mini_test2.lamLai;

public class PhoneDirector {
    private String name,address,email,facebook,sex,group,birdth;
    private int phoneNumber;

    public PhoneDirector() {
    }

    public PhoneDirector(String name, String address, String email, String sex, String group, String birdth, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
//        this.facebook = facebook;
        this.sex = sex;
        this.group = group;
        this.birdth = birdth;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBirdth() {
        return birdth;
    }

    public void setBirdth(String birdth) {
        this.birdth = birdth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneDirector{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
//                ", facebook='" + facebook + '\'' +
                ", sex='" + sex + '\'' +
                ", group='" + group + '\'' +
                ", birdth='" + birdth + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
