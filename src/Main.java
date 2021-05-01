public class Main {

    public static void main(String[] args){
        Instructor instructor = new Instructor();
        instructor.setFirstName("Jake");
        instructor.setLastName("Hermansson");
        instructor.setTitle("Ultimate teacher");

        Student studentNo1 = new Student();
        studentNo1.setSchoolId("123");
        studentNo1.setFirstName("Ilker");
        studentNo1.setFirstName("Kurt");

        Student studentNo2 = new Student();
        studentNo2.setSchoolId("152");
        studentNo2.setFirstName("Aasdasd");
        studentNo2.setLastName("bnvbnvbnvb");

        UserManager userManager = new UserManager();

        User[] users = {instructor, studentNo1, studentNo2};

        userManager.addMultiple(users);

        StudentManager studentManager = new StudentManager();
        studentManager.add(studentNo1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
    }
}
