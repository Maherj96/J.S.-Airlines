package Service;

import javafx.scene.control.TextField;

public class User {
private String email;
private String password;
private String firstName;
private String lastName;

public User(String email, String password, String firstName, String lastName)
{
this.email = email;
this.password=password;
this.firstName=firstName;
this.lastName=lastName;

}
public String getEmail() {
	return  email;
}
public String getFirstName(){
	return firstName;
}
public String getPassword() {
	return password;
}
public String getLastName() {
	return lastName;
}
}
