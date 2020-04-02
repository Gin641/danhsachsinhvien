import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String sex;
    private double scoreMedium;
    private String email;
    public Student(){
    }
    public Student(int id,String name,String sex, double scoreMedium, String email){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.scoreMedium = scoreMedium;
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public int getId() {
        return id;
    }
    public double getScoreMedium() {
        return scoreMedium;
    }
    public String getEmail() {
        return email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setScoreMedium(double scoreMedium) {
        this.scoreMedium = scoreMedium;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isScoreMedium(){
        if (scoreMedium > 8){
            return true;
        }
        return false;
    }
    public void display(){
        System.out.printf("%-5d%-10s%-18s%-25s%-3.1f\n",this.id,this.name,this.sex,this.email,this.scoreMedium);
    }
    Scanner sc = new Scanner(System.in);
    public void inputNewId(){
        System.out.print("Nhập Id sinh viên vào: ");
        setId(sc.nextInt());
        sc.nextLine();
    }
    public void inputNewName(){
        System.out.print("Nhập tên sinh viên vào: ");
        setName(sc.nextLine());
    }
    public void inputNewSex(){
        System.out.print("Nhập giới tính vào: ");
        setSex(sc.nextLine());
    }
    public void inputNewEmail(){
        System.out.print("Nhập email vào: ");
        setEmail(sc.nextLine());
    }
    public void inputNewScore(){
        System.out.print("Nhập ĐTB vào: ");
        setScoreMedium(sc.nextFloat());
        sc.nextLine();
    }
}
