package Day07;

class Language{
	void showLanguage(){
		System.out.println("Language ==> showLanguage.");
	}
}

class English extends Language {
	void showLanguage(){
		System.out.println("English ==> showLanguage.");
	}
	
	void access(){
		showLanguage();		// local override method (this.)
		super.showLanguage(); 	// parent class method
	}
}

public class Ex03 {

	public static void main(String[] args) {
		new English().access();
	}

}
