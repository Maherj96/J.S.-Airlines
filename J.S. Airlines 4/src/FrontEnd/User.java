package FrontEnd;


	public class User {
		private String idUser;
		private String email;
		private String Password;
		private String firstName;
		private String lastName;

		public  User() {
			
		}
		public  User(String id, String fName, String lName,String pswrd) {
			idUser=id;
			firstName = fName;
			lastName = lName;
			Password = pswrd;
		}

		public String getIdUser() {
				return idUser;
			}
			public void setIdUser() {
				this.idUser = idUser;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPassword() {
				return Password;
			}
			public void setPassword() {
				this.Password = Password;
			}
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			//generate ID//
			
			public int generateID() {
				
			int x = (int) (Math.random()* 10000);
			
			return x;
			}
			
		}


