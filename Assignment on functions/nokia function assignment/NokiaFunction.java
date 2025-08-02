import java.util.Scanner;
public class NokiaFunction {

public static void mainMenu(){
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



}

public static int GoToPhonebookMenu(int phonebookMenuInput){
Scanner input = new Scanner(System.in);
switch(phonebookMenuInput){
 case 1: System.out.println("1.Phonebook");
  
                        String PhonebookMenu = """
                                    1.Search
                                    2.Service Nos
                                    3.Add name
                                    4.Erase
                                    5.Edit
                                    6.Assignment
                                    7.Send b'card
                                    8.Option
                                    9.Speed dial
                                   10.voice tags
				   11. Go back
                                   """;
                              System.out.println(PhonebookMenu);
System.out.println("Enter an option");
int phoneInput = input.nextInt();
switch (phoneInput) {
		case 1: System.out.println("1.Search"); break;
		case 2: System.out.println("2.Service Nos"); break;
		case 3: System.out.println("3.Add name"); break;
		case 4: System.out.println("4.Erase"); break;
		case 5: System.out.println("5.Edit"); break;
		case 6: System.out.println("6.Assignment"); break;
		case 7: System.out.println("7.Send b'card"); break;
		case 8: System.out.println("8.Option"); break;
		case 9: System.out.println("9.Speed dial"); break;
		case 10: System.out.println(" 10.voice tags"); break;
		case 11: mainMenu(); break;
		default: System.out.println("invalid input");
}

} 
	return phonebookMenuInput;
}

public static int GoToMessageMenu(int MessageMenuInput){
Scanner input = new Scanner(System.in);
switch(MessageMenuInput){
 case 2: System.out.println("2.Message");

			String messageMenu = """
                                    1.Write messages
                                    2.Inbox
                                    3.Outbox
                                    4.Picture messsages
                                    5.Template
                                    6.Smileys
                                    7.Message setting
                                    8.Info service
                                    9.Voice mailbox number
                                    10.Service command editor
				    11. Go back
                                  """;
                        System.out.println(messageMenu);
System.out.println("Enter an option");
int messageInput = input.nextInt();
switch (messageInput) {
		case 1: System.out.println("1.Write messages"); break;
		case 2: System.out.println("2.Inbox"); break;
		case 3: System.out.println("3.Outbox"); break;
		case 4: System.out.println("4.Picture messsages"); break;
		case 5: System.out.println("5.Template"); break;
		case 6: System.out.println("6.Smileys"); break;
		case 7: System.out.println("7.Message setting"); break;
		case 8: System.out.println("8.Info service"); break;
		case 9: System.out.println("9.Voice mailbox number"); break;
		case 10: System.out.println("10.Service command editor"); break;
		case 11: mainMenu(); break;
		default: System.out.println("invalid input");
}

}
	return MessageMenuInput;
}


public static int GoToChatMenu(int ChatMenuInput){
Scanner input = new Scanner(System.in);
switch(ChatMenuInput){
 case 3: System.out.println("3.Chat");
}
	return ChatMenuInput;
}

public static int GoToCallRegisterMenu(int CallRegisterMenuInput){
Scanner input = new Scanner(System.in);
switch(CallRegisterMenuInput){
 case 4: System.out.println("4.Call Register");
	String registerMenu = """
                               1.Missed calls
                               2.Received calls
                               3.Dialled numbers
                               4.Erase recent call list
                               5.Show call duration
                               6.Show call costs
                               7.Call cost settings
                               8.Prepaid credit
			       9.Go back
				""";
			System.out.println(registerMenu);
System.out.println("Enter an option");
int callRegisterInput = input.nextInt();
switch (callRegisterInput) {
		case 1: System.out.println("1.Missed calls"); break;
		case 2: System.out.println("2.Received calls"); break;
		case 3: System.out.println("3.Dialled numbers"); break;
		case 4: System.out.println("4.Erase recent call list"); break;
		case 5: System.out.println("5.Show call duration"); break;
		case 6: System.out.println("6.Show call costs"); break;
		case 7: System.out.println("7.Call cost settings"); break;
		case 8: System.out.println("8.Prepaid credit"); break;
		case 9: mainMenu(); break;
		default: System.out.println("invalid input");
}



}
	return CallRegisterMenuInput;
}


public static int GoToTonesMenu(int TonesMenuInput){
Scanner input = new Scanner(System.in);
switch(TonesMenuInput){
 case 5: System.out.println("5.Tones");
                String toneMenu = """
                     1.Ringing tone
                     2.Ringing volume
                     3.Incoming call alert
                     4.Composer
                     5.Message alert time
                     6.Keypad tones
                     7.Warning and game tones
                     8.Vibrating alert
                     9.Screen saver
		     10.Go back
                   """;         
             System.out.println(toneMenu);
System.out.println("Enter an option");
int tonesInput = input.nextInt();
switch (tonesInput) {
		case 1: System.out.println("1.Ringing tone"); break;
		case 2: System.out.println("2.Ringing volume"); break;
		case 3: System.out.println("3.Incoming call alert"); break;
		case 4: System.out.println("4.Composer"); break;
		case 5: System.out.println("5.Message alert time"); break;
		case 6: System.out.println("6.Keypad tones"); break;
		case 7: System.out.println("7.Warning and game tones"); break;
		case 8: System.out.println("8.Vibrating alert"); break;
		case 9: System.out.println("9.Screen saver"); break;
		case 10: mainMenu(); break;
		default: System.out.println("invalid input");

}
}
	return TonesMenuInput;
}

public static int GoToSettingsMenu(int settingsMenuInput){
Scanner input = new Scanner(System.in);
switch(settingsMenuInput){
 case 6: System.out.println("6.Settings");
	            String settingsMenu = """
                     1.Call settings
                     2.Phone settings
                     3.Security settings
                     4.Restore factory settings
		     5.Go back
                   """;         
             System.out.println(settingsMenu);
System.out.println("Enter an option");
int settingsInput = input.nextInt();
switch (settingsInput) {
		case 1: System.out.println("1.Call settings"); break;
		case 2: System.out.println("2.Phone settings"); break;
		case 3: System.out.println("3.Security settings"); break;
		case 4: System.out.println("4.Restore factory settings"); break;
		case 5: case 10: mainMenu(); break;
		default: System.out.println("invalid input");

}
}
	return settingsMenuInput;
}


public static int GoToCallDivertMenu(int CallDivertMenuInput){
Scanner input = new Scanner(System.in);
switch(CallDivertMenuInput){
 case 7: System.out.println("7.Call divert");
}
	return CallDivertMenuInput;
}
	
public static int GoToGamesMenu(int gamesMenuInput){
Scanner input = new Scanner(System.in);
switch(gamesMenuInput){
 case 8: System.out.println("8.Games");
}
	return gamesMenuInput;
}

public static int GoToCalculatorMenu(int CalculatorMenuInput){
Scanner input = new Scanner(System.in);
switch(CalculatorMenuInput){
 case 9: System.out.println("9.Calculator");
}
  	 return CalculatorMenuInput;
}

public static int GoToReminderMenu(int ReminderMenuInput){
Scanner input = new Scanner(System.in);
switch(ReminderMenuInput){
 case 10: System.out.println("10.Reminder");
}
  	 return ReminderMenuInput;
}

public static int GoToClockMenu(int ClockMenuInput){
Scanner input = new Scanner(System.in);
switch(ClockMenuInput){
 case 11: System.out.println("10.Clock");
	             String clockMenu = """
                     1.Alarm clock
                     2.Clock settings
                     3.Date settings
                     4.Stopwatch
                     5.Countdown timer
                     6.Auto update of date and time 
		     7.Go back
                  """;     
         System.out.println(clockMenu);
System.out.println("Enter an option");
int clockInput = input.nextInt();
switch (clockInput) {
		case 1: System.out.println("1.Alarm clock"); break;
		case 2: System.out.println("2.Clock settings"); break;
		case 3: System.out.println("3.Date settings"); break;
		case 4: System.out.println("4.Stopwatch"); break;
		case 5: System.out.println("5.Countdown timer"); break;
		case 6: System.out.println("6.Auto update of date and time"); break;
		case 7: mainMenu(); break;
		default: System.out.println("invalid input");

		
}
}
	return ClockMenuInput;
}

public static int GoToProfileMenu(int ProfileMenuInput){
Scanner input = new Scanner(System.in);
switch(ProfileMenuInput){
 case 12: System.out.println("12.Profile");
}
  	 return ProfileMenuInput;
}


public static int GoToSIMServicesMenu(int SIMServicesMenuInput){
Scanner input = new Scanner(System.in);
switch(SIMServicesMenuInput){
 case 13: System.out.println("13.SIM Services");
}
  	 return SIMServicesMenuInput;
}























































































}

                    
