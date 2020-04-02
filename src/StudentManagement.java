import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student>students = new ArrayList<>();
    private int idChange = -1;
    private int idDelete = -1;
    private int idFind = -1;
    private String nameFind = "";
    public void inputStudent(){
        Student student1 = new Student(1,"Mai","Nữ",8.4,"Mai1234@gmail.com");
        students.add(student1);
        Student student2 = new Student(2,"Nam","Nam",5.6,"Nam1234@gmail.com");
        students.add(student2);
        Student student3 = new Student(3,"Hải","Nam",9.0,"Hai1234@gmail.com");
        students.add(student3);
    }
    public void displayList(){
        System.out.printf("%-5s%-10s%-18s%-3.1s%-25s\n","ID","Name","Sex","Score-Medium","Email");
    }
    public void displayStudent(){
        System.out.println("Danh sách sinh viên: ");
        displayList();
        for (Student student : students){
            student.display();
        }
    }
    public void addNewStuden(){
        students.add(inputNewStudent());
    }
    public Student inputNewStudent(){
        Student newStudent = new Student();
        newStudent.inputNewId();
        newStudent.inputNewName();
        newStudent.inputNewSex();
        newStudent.inputNewScore();
        newStudent.inputNewEmail();
        return newStudent;
    }
    public void IdUserAcc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID sinh viên: ");
        idChange = sc.nextInt() -1;
        idDelete = idChange;
        idFind = idChange;
    }
    public void NameUserAcc(){
        System.out.print("Nhập tên sinh viên: ");
        Scanner sc = new Scanner(System.in);
        nameFind = sc.nextLine();
    }
    public void DeleteStudent(){
        System.out.println("Xóa thông tin sinh viên ? ");
        IdUserAcc();
        students.remove(idDelete);
    }
    public void ChangeStudent(){
        System.out.println("sửa thông tin sinh viên ? ");
        IdUserAcc();
        students.set(idChange,studenChange());
    }
    public Student studenChange(){
        System.out.println("nhập thông tin của sinh viên: ");
        Student studenChange = new Student();
        studenChange.setId(students.get(idChange).getId());
        studenChange.inputNewName();
        studenChange.inputNewSex();
        studenChange.inputNewScore();
        studenChange.inputNewEmail();
        return studenChange;
    }
    public Student findById(){
        Student foundName = null;
        NameUserAcc();
        for (Student student : students){
            if (student.getName().contentEquals(nameFind)){
                foundName = student;
            }
        }
        return foundName;
    }
    public Student findByName() {
        Student foundByName = null;
        NameUserAcc();
        for (Student student : students) {
            if (student.getName().contentEquals(nameFind)) {
                foundByName = student;
            }
        }
        return foundByName;
    }
    public void displayAfterFind(Student student){
        if (isFindStudent(student)){
            System.out.println("Sinh viên: ");
            displayList();
            student.display();
        }else {
            System.out.println("Không có");
        }
    }
    public boolean isFindStudent(Student student){
        boolean findOut = false;
        if (student != null){
            findOut = true;
        }
        return findOut;
    }
    ArrayList<Student> femaleList = new ArrayList<>();
    public boolean isFemale(Student student){
        boolean IsFemale = false;
        if (student.getSex().contentEquals("Nữ")){
            IsFemale = true;
        }
        return IsFemale;
    }
    public void addFemaleList(){
        for (Student student : students){
            if (isFemale(student)){
                femaleList.add(student);
            }
        }
    }
    public void displayFelameList(){
        addFemaleList();
        displayList();
        for (Student student : students){
            student.display();
        }
    }
    ArrayList<Student> ScholarshipList = new ArrayList<>();
    public boolean receiveScholarship(Student student){
        boolean scholarship = false;
        if (student.getScoreMedium() >= 8.0){
            scholarship = true;
        }
        return scholarship;
    }
    public void addScholarshipLish(){
        for (Student student : students){
            if (receiveScholarship(student)){
                ScholarshipList.add(student);
            }
        }
    }
    public void displayScholarshipList(){
        addScholarshipLish();
        displayList();
        for (Student student : students){
            student.display();
        }
    }
}
