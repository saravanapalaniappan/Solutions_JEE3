
public class Main_Trainee {
	public static void main(String args[]) {

		Trainee [] trainees= {};
		Trainee trmain = new Trainee();
		Batch bt = new Batch(1110,"03/25/2018","05/01/2018");
		
		//GET TRAINEE BY TRAINEE ID
		try {
			trmain = bt.getTrainee(1111);	
		} catch (TraineeNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println(trmain.toString());
		
		try {
			trmain = bt.getTrainee(1114);	
		} catch (TraineeNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		//GET ALL MALE TRAINEES
		trainees = bt.getTrainees('M');
		for (Trainee tr:trainees) {
			if (tr == null) {
				
			}
			else {
				System.out.println(tr.toString());	
			}
			
		}
		//GET ALL FEMALE TRAINEES
		trainees = bt.getTrainees('F');
		for (Trainee tr:trainees) {
			if (tr == null) {
				
			}
			else {
				System.out.println(tr.toString());	
			}
			
		}
		
	}
}
