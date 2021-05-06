package lecture3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi!");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " silindi!");
	}

	public void login(User user, String email, String password) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme giris saglandý!");
	}

	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sistemden cikis yapti!");
	}
}
