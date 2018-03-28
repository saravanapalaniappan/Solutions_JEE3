package trainee.exercise;


 import java.io.Serializable;


	@SuppressWarnings("serial")
	public class Trainee implements Serializable {

		private int traineeId;
		private String traineeName;
		private int contactNo;
		private String email;
		private String gender;
		private int age;


		public Trainee() 
		{
			// TODO Auto-generated constructor stub
			traineeId = 0;
			traineeName = ""; 
			contactNo= 0;
			email  = "";  
			gender  = ""; 
			age  = 0; 

		}

		public Trainee(int traineeId, String traineeName, int contactNo, String email,String gender, int age) 
		{
			// TODO Auto-generated constructor stub

			this.traineeId = traineeId;
			this.traineeName = traineeName;  
			this.contactNo= contactNo;
			this.email  = email;  
			this.gender  = gender; 
			this.age  = age; 
		}

		public int getTraineeId() 
		{
			return traineeId;
		}

		public void setTraineeId(int traineeId) 
		{
			this.traineeId = traineeId;
		}

		public String getTraineeName() 
		{
			return traineeName;
		}

		public void setTraineeName(String traineeName) 
		{
			this.traineeName = traineeName;
		}

		public double getContactNo() 
		{
			return contactNo;
		}

		public void setContactNo(int contactNo)
		{
			this.contactNo = contactNo;
		}

		public String getEmail() 
		{
			return email;
		}

		public void setEmail(String email) 
		{
			this.email = email;
		}

		public String getGender() 
		{
			return gender;
		}

		public void setGender(String gender) 
		{
			this.gender = gender;
		}

		public int getAge() 
		{
			return age;
		}

		public void setAge(int age) 
		{
			this.age = age;
		}



	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo
				+ ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}
	
	}