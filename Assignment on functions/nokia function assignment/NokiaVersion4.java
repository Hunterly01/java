import java.util.Scanner;
public class NokiaVersion4 {
public static void main (String[] args){
Scanner input = new Scanner(System.in);

 String prompt = """
                  FUNCTIONS MENU 
                     1.Phonebook
                     2.Messages
                     3.Chat
                     4.Call register
                     5.Tones
                     6.Settings
                     7.Call divert
                     8.Games
                     9.Calculator
                     10.Reminders
                     11.Clock
                     12.Profiles
                     13.SIM services
                  """;

             System.out.println(prompt);
System.out.println("Enter an option");
int mainMenuInput = input.nextInt(); 
switch(mainMenuInput){
	case 1: NokiaFunction.GoToPhonebookMenu(mainMenuInput); break;
	case 2: NokiaFunction.GoToMessageMenu(mainMenuInput); break;
	case 3: NokiaFunction.GoToChatMenu(mainMenuInput); break;
	case 4: NokiaFunction.GoToCallRegisterMenu(mainMenuInput); break;
	case 5: NokiaFunction.GoToTonesMenu(mainMenuInput); break;
	case 6: NokiaFunction.GoToSettingsMenu(mainMenuInput); break;
	case 7: NokiaFunction.GoToCallDivertMenu(mainMenuInput); break;
	case 8: NokiaFunction.GoToGamesMenu(mainMenuInput); break;
	case 9: NokiaFunction.GoToCalculatorMenu(mainMenuInput); break;
	case 10: NokiaFunction.GoToReminderMenu(mainMenuInput); break;
	case 11: NokiaFunction.GoToClockMenu(mainMenuInput); break;
	case 12: NokiaFunction.GoToProfileMenu(mainMenuInput); break;
	case 13: NokiaFunction.GoToSIMServicesMenu(mainMenuInput); break;

	


}
}
}