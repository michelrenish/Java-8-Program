package BasicFunInterFace;

public class Teleivision {
	
	public static void main(String[] args) {
		Display d1 =()->{System.out.println("hi");};
		d1.led();
	}

}
