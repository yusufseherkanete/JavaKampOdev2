package lecture3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engin@engin.com");
		instructor.setPassword("02468");
		instructor.setBiography("MCT,PMP ve ITIL sertifikalarina sahibim.");

		Student student = new Student();
		student.setId(2);
		student.setFirstName("Yusuf Seherkan");
		student.setLastName("ETE");
		student.setEmail("yusuf@yusuf.com");
		student.setPassword("13579");

		UserManager userManager = new UserManager();
		userManager.login(instructor, instructor.getEmail(), instructor.getPassword());
		System.out.println(instructor.getBiography());
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("Yazilim Geliþtirici Yetiþtirme Kampi (JAVA + REACT)");
		userManager.logout(instructor);

		userManager.login(student, student.getEmail(), student.getPassword());
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse("Yazilim Geliþtirici Yetiþtirme Kampi (JAVA + REACT)");
		student.setMessage("\"Tum odevleri tamamladim!\"");
		studentManager.sendMessage(student, student.getMessage());
		userManager.logout(student);

	}

}
