
public class StudentResult {

	String Bahubali;
	String Don;
	String Katappa;

	int Mark1;
	int Mark2;
	int Mark3;

	int Sub1;
	int Sub2;
	int Sub3;

	public StudentResult(int Mark1, int Mark2, int Mark3) {

		Sub1 = Mark1;
		Sub2 = Mark2;
		Sub3 = Mark3;
	}

	public static void main(String[] args) {

		StudentResult Bahubali = new StudentResult(100, 95, 99);
		StudentResult Don = new StudentResult(95, 85, 100);
		StudentResult Katappa = new StudentResult(95, 85, 75);

		int BahSub1 = Bahubali.Sub1 + Bahubali.Sub1 + Bahubali.Sub3;
		int DonSub1 = Don.Sub1 + Don.Sub2 + Don.Sub3;
		int KatSub1 = Katappa.Sub1 + Katappa.Sub2 + Katappa.Sub3;

		int Average1 = BahSub1 / 3;
		int Average2 = DonSub1 / 3;
		int Average3 = KatSub1 / 3;

		if (Average1 > 50) {
			System.out.println("Bahubali has passed the exam by scoring an Average of " + Average1);
		} else {
			System.out.println("Bahubali had failed");
		}

		if (Average2 > 50) {
			System.out.println("Don has passed the exam by scoring an Average of  " + Average2);
		} else {
			System.out.println("Don had failed");
		}

		if (Average3 > 50) {
			System.out.println("Katappa has passed the exam by scoring an Average of " + Average3);
		} else {
			System.out.println("Katappa had failed");
		}

	}
}
