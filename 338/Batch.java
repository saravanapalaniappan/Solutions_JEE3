import java.util.Arrays;

public class Batch {
	
	int batchCode;
	String startdate;
	String enddate;
	Trainee tr1,tr2,tr3 = new Trainee();
	Trainee[] trainees = {tr1,tr2,tr3};
		
	public Batch(int batchCode, String startdate, String enddate) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;		
		this.tr1 = new Trainee(this.batchCode + 1, "xxxx", (long)3091234567L, "abcd@gmail.com", 'M', (short)25);		
		this.tr2 = new Trainee(this.batchCode + 2, "yyyy", (long)3097891234L, "sdfk@gmail.com", 'F', (short)102);		
		this.tr3 = new Trainee(this.batchCode + 3, "zzzz", (long)3096641234L, "ikram@gmail.com", 'M', (short)43);
		Trainee [] trainees = {this.tr1,this.tr2,this.tr3};
		this.trainees = trainees;
	}

	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
		boolean found = false;
		Trainee tr = new Trainee();
		for (Trainee tr1:this.trainees) {
			if (tr1.traineeId == traineeId) {
				tr = tr1;
				found = true;
				System.out.println("Trainee Id " + traineeId + " found in Collection");
				break;
			}
		}
			
		if (found == false)
			throw new TraineeNotFoundException("Trainee Not Found");
		
		return tr;
	}
	
	public Trainee[] getTrainees(char gender) {
		return trainees;
	}

	
	@Override
	public String toString() {
		return "Batch []";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else return false;
		}

}
