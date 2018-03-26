
public class Trainee {
	
	int traineeId; 
	String traineeName;
	long contactNo;
	String email;
	char gender;
	short age;

	public Trainee() {
		super();
		this.traineeId = 0;
		this.traineeName = "";
		this.contactNo = 0L;
		this.email = "";
		this.gender = ' ';
		this.age = 0;
	}
	
	public Trainee(int traineeId, String traineeName, long contactNo, String email, char gender, short age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Trainee [Age= " + getAge() + ", ContactNo= "
				+ getContactNo() + ", Email= " + getEmail()
				+ ", Gender= " + getGender() + ", TraineeId= "
				+ getTraineeId() + ", TraineeName= " + getTraineeName()
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else return false;
		}
	
	

}
