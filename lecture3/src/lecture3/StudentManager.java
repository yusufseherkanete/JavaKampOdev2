package lecture3;

public class StudentManager {
	public void joinCourse(String courseName) {
		System.out.println(courseName + " kursuna katildin");
	}

	public void sendMessage(User user, String message) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + message + " mesajini gonderdi");
	}
}
