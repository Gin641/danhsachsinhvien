public class Person {
    private String name;
    private boolean sex;
    private int birthday;
    private String address;
    public Person(){
    }
    public Person(String name,boolean sex, int birthday, String address){
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public boolean isSex() {
        return sex;
    }
    public int getBirthday() {
        return birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String gender(){
        if (sex){
            return "Man";
        }else {
            return "Women";
        }
    }
    @Override
    public String toString(){
        return "Tên: " + getName()
                + " Giới tính: " + gender()
                + " Ngày sinh " + getBirthday()
                + " Địa chỉ: " + getAddress();
    }
}
