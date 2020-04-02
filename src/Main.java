import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.inputStudent();
        studentManagement.displayStudent();
        System.out.println();
        int selection;
        do {
            selection = getSelection(sc);
            if (selection != 0) {
                switch (selection) {
                    case 1: {
                        System.out.println("Thêm");
                        studentManagement.addNewStuden();
                        studentManagement.displayStudent();
                        break;
                    }
                    case 2: {
                        System.out.println("Sửa");
                        studentManagement.ChangeStudent();
                        studentManagement.displayStudent();
                        break;
                    }
                    case 3: {
                        System.out.println("Xóa");
                        studentManagement.DeleteStudent();
                        studentManagement.displayStudent();
                        break;
                    }
                    case 4: {
                        System.out.println("Tìm ID");
                        Student foundStudent = studentManagement.findById();
                        studentManagement.displayAfterFind(foundStudent);
                        break;
                    }
                    case 5: {
                        System.out.println("Tìm bằng tên");
                        Student foundStudent = studentManagement.findByName();
                        studentManagement.displayAfterFind(foundStudent);
                        break;
                    }
                    case 6: {
                        System.out.println("Hiện thị sinh viên nữ");
                        studentManagement.displayFelameList();
                        break;
                    }
                    case 7: {
                        System.out.println("Hiện thị sinh viên được học bổng");
                        studentManagement.displayScholarshipList();
                    }
                }
            }else {
                System.out.println("Exit");
            }
        } while (selection != 0) ;
    }
    private static int getSelection(Scanner sc){
        int selection;
        System.out.println("Nhập số để thao tác: \n"
                + "1. Them 1 Sinh vien moi\n"
                + "2. Sua thong tin Sinh vien\n"
                + "3. Xoa 1 Sinh vien\n"
                + "4. Tim kiem theo ID\n"
                + "5. Tim kiem theo Ten\n"
                + "6. Hien thi sinh vien Nu\n"
                + "7. Hien thi sinh vien Nhan hoc bong\n"
                + "0. Exit");
        System.out.print("Nhập: ");
        selection = sc.nextInt();
        return selection;
    }
}
