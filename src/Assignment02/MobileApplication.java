package Assignment02;

import java.util.Scanner;

public class MobileApplication {

	public static void main(String[] args) {
	
		Chat theChat = new Chat();
		WhatsApp theWhatsApp = new WhatsApp();
		Mobile theMobile = new Mobile();
		
		String chatContent;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What do you want to say ?");
		chatContent = sc.nextLine();
		
		theChat.setChatContent(chatContent);
		theWhatsApp.setTheChat(theChat);
		theMobile.setTheWhatsApp(theWhatsApp);
		
		System.out.println("You said: " + theMobile.getTheWhatsApp().getTheChat().getChatContent());
	}

}
