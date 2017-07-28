package Day07;

class Team{
	
	// This is called Design Pattern (Singleton)
	// Allow user to create object only one time.
	// for database, we can only create one object
	
	static Team refTeam = null;
	
	// private constructor means we can't create object of this class outside
	private Team(){
		System.out.println("Hello..");
	}
	
	public static Team getCaptain(){
//		System.out.println("you are in getCaptain.");
		if (refTeam == null) {
//			System.out.println("you are in if.");
			refTeam = new Team();
		}
//		System.out.println("you just finish if.");
		return refTeam;
	}

}

public class Ex06 {

	public static void main(String[] args) {
		
		Team.getCaptain();
		System.out.println("================");
//		System.out.println(Team.refTeam.);
//		Team.getCaptain();
//		Team.getCaptain();

	}

}
