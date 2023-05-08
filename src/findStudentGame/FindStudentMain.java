package findStudentGame;

public class FindStudentMain {

	public static void main(String[] args) {
		
		FindStudentClass studentGame = new FindStudentClass();
		
		String hiddenName = studentGame.getHiddenStudentName();
		
		System.out.println("Guess the Student");
		System.out.println("******************");
		
		//System.out.println("Student Name: " + hiddenName);
		
		System.out.print("Student Name: ");
		studentGame.getDashes();

		studentGame.getStudentLetter();
	}

}
