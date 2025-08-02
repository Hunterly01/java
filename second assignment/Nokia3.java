import java.util.Scanner;
public class Nokia3 {
public static void main (String[] args){
Scanner input = new Scanner(System.in);
 int menuFunctions = 0;
 while(menuFunctions != 14){
 String prompt1 = """
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
                     14.Exit
                  """;

             System.out.println(prompt1);
             System.out.println("Enter an option:");
               menuFunctions = input.nextInt();
             
switch(menuFunctions) {
                  case 1: int phonebookOption = 0;
while (phonebookOption != 11){
System.out.println("1.Phonebook"); 
           

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
                                   11.Back
                                   """;
                              System.out.println( PhonebookMenu);
                              System.out.println("Enter a phonebook option:");
                                phonebookOption = input.nextInt();
        switch(phonebookOption) {
                  case 1: System.out.println("1.Search");
                  phonebookOption = input.nextInt();

 break;
                  case 2: System.out.println("2.Service Nos");
                  phonebookOption = input.nextInt();

 break;
                  case 3: System.out.println("3.Add name");
                  phonebookOption = input.nextInt();

 break;
                  case 4: System.out.println("4.Erase");
                  phonebookOption = input.nextInt();

 break;
                  case 5: System.out.println("5.Edit"); 
                  phonebookOption = input.nextInt();

break;
                  case 6: System.out.println("6.Assignment");
                  phonebookOption = input.nextInt();

 break;
                  case 7: System.out.println("7.Send b'card"); 
                  phonebookOption = input.nextInt();

break;
                  case 8: int optionOption = 0;
           while(optionOption != 3){
          System.out.println("8.Option"); 

                  String optionMenu = """
                               1.Type of view
                               2.Memmory status
                               3.Back 
                                       """;
                           System.out.println( optionMenu);
                              System.out.println("Enter a option option:");
                                optionOption = input.nextInt();
        switch(optionOption) {
                   case 1: System.out.println("1.Type of view");
                   optionOption = input.nextInt();
 break;

                   case 2: System.out.println("2.Memmory status"); 
                   optionOption = input.nextInt();
break;
                   case 3: System.out.println("");
                  
 break;
                   default: System.out.println("Invalid option."); break;
                        }
}
                    break;
                    
                  case 9: System.out.println("9.Speed dial"); break;
                  case 10: System.out.println("10.voice tags"); break;
                 case 11: System.out.println(""); break;
                   
                  default: System.out.println("Invalid option."); break;
                           }
}
                     break;

                   
                  case 2: int messageOption = 0;
 while (messageOption != 11){
 System.out.println("2.Messages");
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
                                    11.Back
                                  """;
                        System.out.println( messageMenu);
                              System.out.println("Enter a message option:");
                               messageOption = input.nextInt();  
         switch(messageOption) { 
                   case 1: System.out.println("1.Write messages"); 
                   messageOption = input.nextInt(); 
break;
                   case 2: System.out.println("2.Inbox"); 
                   messageOption = input.nextInt(); 
break;
                   case 3: System.out.println("3.Outbox");
                   messageOption = input.nextInt(); 
 break;
                   case 4: System.out.println("4.Picture messsages");
                   messageOption = input.nextInt(); 
 break;
                   case 5: System.out.println("5.Template");
                   messageOption = input.nextInt(); 
 break;
                   case 6: System.out.println("6.Smileys");
                   messageOption = input.nextInt(); 
 break;
                   case 7:System.out.println("7.Message setting");
                        String messageSettingMenu = """
                                    1.Set
                                    2.Common
                                  """;
                              System.out.println(messageSettingMenu);
                              System.out.println("Enter a message Setting option:");
                              int messageSettingOption = input.nextInt(); 
           switch(messageSettingOption) {
                   case 1: System.out.println("1.Set");

                        String setMenu = """
                               1.Message centre number
                               2.Message sent as
                               3.Message validity
                          """;
                              System.out.println(setMenu);
                              System.out.println("Enter a Set option:");
                              int setOption = input.nextInt();
           switch(setOption) {
                      case 1: System.out.println("1.Message centre number"); break;
                      case 2: System.out.println("2.Message sent as"); break;
                      case 3: System.out.println("3.Message validity"); break;
                  
                      default: System.out.println("Invalid option."); break;
                    }
                   
               break;

                   case 2: System.out.println("2.Common");

                         String commonMenu = """
                               1.Delivery reports
                               2.Reply via same centre
                               3.Character support
                          """;                    
                              System.out.println(commonMenu);
                              System.out.println("Enter a common option:");
                              int commonOption = input.nextInt();
             switch(commonOption) {
                      case 1: System.out.println("1.Delivery reports"); break;
                      case 2: System.out.println("2.Reply via same centre"); break;
                      case 3: System.out.println("3.Character support"); break;
                      default: System.out.println("Invalid option."); break;
                    }
               break;
                   default: System.out.println("Invalid option."); break;
                   }
               break;
                      case 8: System.out.println("8.Info service");
                      messageOption = input.nextInt(); 
 break;
                      case 9: System.out.println("9.Voice mailbox number");
                      messageOption = input.nextInt(); 
 break;
                      case 10: System.out.println("10.Service command editor");
                      messageOption = input.nextInt(); 
 break; 
                      case 11: System.out.println("");
                      messageOption = input.nextInt(); 
 break;

                   default: System.out.println("Invalid option."); break;
                  }
                     }         
                break;

                  case 3: System.out.println("3.Chat"); 
                    menuFunctions = input.nextInt();
         
break;
                  case 4: int registerOption = 0;
while (registerOption != 9){
System.out.println("4.Call register");

                  String registerMenu = """
                               1.Missed calls
                               2.Received calls
                               3.Dialled numbers
                               4.Erase recent call list
                               5.Show call duration
                               6.Show call costs
                               7.Call cost settings
                               8.Prepaid credit
                               9.back
                          """;                    
                              System.out.println(registerMenu);
                              System.out.println("Enter a register option:");
                              registerOption = input.nextInt();
                switch(registerOption) {
                      case 1: System.out.println("1.Missed calls"); 
                      registerOption = input.nextInt();

break;
                      case 2: System.out.println("2.Received calls"); 
                      registerOption = input.nextInt();

break;
                      case 3: System.out.println("3.Dialled numbers"); 
                      registerOption = input.nextInt();

break;
                      case 4: System.out.println("4.Erase recent call list");
                      registerOption = input.nextInt();
break;
                      case 5: int showCallDurationOption = 0;
while (showCallDurationOption != 6){

 System.out.println("5.Show call duration");

                      String showCallDurationMenu = """
                               1.Last call duration
                               2.All calls duration
                               3.Received calls duration
                               4.Dialled calls duration
                               5.Clear timers
                               6.back
                          """;                    
                              System.out.println(showCallDurationMenu);
                              System.out.println("Enter a show Call Duration option:");
                              showCallDurationOption = input.nextInt();
               switch(showCallDurationOption) {
                      case 1: System.out.println("1.Last call duration"); 
                      showCallDurationOption = input.nextInt();

break;
                      case 2: System.out.println("2.All calls duration");
                      showCallDurationOption = input.nextInt();

 break;
                      case 3: System.out.println("3.Received calls duration");
                      showCallDurationOption = input.nextInt();

 break;
                      case 4: System.out.println("4.Dialled calls duration"); 
                      showCallDurationOption = input.nextInt();

break;
                      case 5: System.out.println(" 5.Clear timers");
                      showCallDurationOption = input.nextInt();

 break;
                      case 6: System.out.println(""); break;
                      
                      default: System.out.println("Invalid option."); break;
                    } 
} 
               break;
                      case 6:int showCallCostOption = 0;
while (showCallCostOption != 4){
 System.out.println("6.Show call costs");
                       String showCallCostMenu = """
                               1.Last call cost
                               2.All calls cost
                               3.Clear counters
                               4.back 
                           """;
                              System.out.println(showCallCostMenu);
                              System.out.println("Enter a show Call Cost option:");
                              showCallCostOption = input.nextInt();
               switch(showCallCostOption) {
                      case 1: System.out.println("1.Last call cost");
                      showCallCostOption = input.nextInt();
 break;
                      case 2: System.out.println("2.All calls cost");
                      showCallCostOption = input.nextInt();
 break;
                      case 3: System.out.println("3.Clear counters"); 
                      showCallCostOption = input.nextInt();
break;
                      case 4: System.out.println(""); break;
                      default: System.out.println("Invalid option."); break;
                    }
}   
               break;

                      case 7:int showCallSettingsOption = 0;
while (showCallSettingsOption != 3){
 System.out.println("7.Call cost settings");
                     String showCallSettingsMenu = """
                               1.call cost limit
                               2.Show costs in
                               3.back
                           """;
                              System.out.println(showCallSettingsMenu);
                              System.out.println("Enter a show Call settings option:");
                              showCallSettingsOption= input.nextInt();
               switch(showCallSettingsOption) {
                      case 1: System.out.println("1.call cost limit"); 
                      showCallSettingsOption= input.nextInt();

break;
                      case 2: System.out.println("2.Show costs in"); 
                      showCallSettingsOption= input.nextInt();

break;
                      case 3: System.out.println(""); break;
                      default: System.out.println("Invalid option."); break;
                    }
                    }
               break;
                      case 8: System.out.println("8.Prepaid credit");
                      registerOption = input.nextInt();
 break;
                      case 9: System.out.println(""); break;
                      default: System.out.println("Invalid option."); break;
                    }
}  
                break;

                  case 5:int toneOption = 0;
while (toneOption != 10){
 System.out.println("5.Tones");
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
                     10.back
                   """;         
             System.out.println(toneMenu);
             System.out.println("Enter an tone option:");
             toneOption = input.nextInt();
      switch(toneOption) {
                  case 1: System.out.println("1.Ringing tone"); 
                  toneOption = input.nextInt();

break;
                  case 2: System.out.println("2.Ringing volume");
                  toneOption = input.nextInt();

 break;
                  case 3: System.out.println("3.Incoming call alert");
                  toneOption = input.nextInt();

 break;
                  case 4: System.out.println("4.Composer"); 
                  toneOption = input.nextInt();

break;
                  case 5: System.out.println("5.Message alert time");
                  toneOption = input.nextInt();
 break;
                  case 6: System.out.println("6.Keypad tones");
                  toneOption = input.nextInt();

 break;
                  case 7: System.out.println("7.Warning and game tones");
                  toneOption = input.nextInt();

 break;
                  case 8: System.out.println("8.Vibrating alert");
                  toneOption = input.nextInt();

 break;
                  case 9: System.out.println("9.Screen saver"); 
                  toneOption = input.nextInt();

break;
                  case 10: System.out.println(""); break;
                  
                  default: System.out.println("Invalid option."); break;
 }
}
                 break;
                  case 6:int settingsOption = 0;
while ( settingsOption != 5){
 System.out.println("6.Settings");
            String settingsMenu = """
                     1.Call settings
                     2.Phone settings
                     3.Security settings
                     4.Restore factory settings
                     5.back
                   """;         
             System.out.println(settingsMenu);
             System.out.println("Enter a setting option:");
              settingsOption = input.nextInt();
           switch(settingsOption) {
                  case 1:int callSettingsOption = 0;
while ( callSettingsOption != 7){
 System.out.println("1.Call settings");
                String callSettingsMenu = """
                     1.Automatic redial
                     2.Speed dialing
                     3.Call waiting options
                     4.Own number sending
                     5.Phone line user
                     6.Automatic answer
                     7.back
                   """;      
             System.out.println(callSettingsMenu);
             System.out.println("Enter a call settings option:");
             callSettingsOption = input.nextInt();
     switch(callSettingsOption) {  
                      case 1: System.out.println("1.Automatic redial");
                      callSettingsOption = input.nextInt();
 break;
                      case 2: System.out.println("2.Speed dialing"); 
                      callSettingsOption = input.nextInt();
break;
                      case 3: System.out.println("3.Call waiting options");
                      callSettingsOption = input.nextInt();
 break;
                      case 4: System.out.println("4.Own number sending"); 
                      callSettingsOption = input.nextInt();
break;
                      case 5: System.out.println("5.Phone line user");
                      callSettingsOption = input.nextInt();
 break;
                      case 6: System.out.println("6.Automatic answer");
                      callSettingsOption = input.nextInt();
 break;
                      case 7: System.out.println(""); break;
                      default: System.out.println("Invalid option."); break;
                    }
} 
       break; 
                  case 2:int  phoneSettingsOption = 0;
while ( phoneSettingsOption != 7){
 System.out.println("2.Phone settings");
         String phoneSettingsMenu = """
                     1.Language
                     2.Cell info display
                     3.Welcome note
                     4.Network selection
                     5.Lights
                     6.Confirm SIM service action 
                     7.back
                  """;         
             System.out.println(phoneSettingsMenu);
             System.out.println("Enter an phone settings option:");
               phoneSettingsOption = input.nextInt();
      switch(phoneSettingsOption) {
                      case 1: System.out.println("1.Language");
                      phoneSettingsOption = input.nextInt();
 break;
                      case 2: System.out.println("2.Cell info display"); 
                      phoneSettingsOption = input.nextInt();
break;
                      case 3: System.out.println("3.Welcome note"); 
                      phoneSettingsOption = input.nextInt();
break;
                      case 4: System.out.println("4.Network selection");
                      phoneSettingsOption = input.nextInt();
 break;
                      case 5: System.out.println(" 5.Lights"); 
                      phoneSettingsOption = input.nextInt();
break;
                      case 6: System.out.println("6.Confirm SIM service action");
                      phoneSettingsOption = input.nextInt();
 break;
                      case 7: System.out.println(" "); break;
                      default: System.out.println("Invalid option."); break;
                    } 
              }
        break;
                  case 3:int  securitySettingsOption = 0;
while (securitySettingsOption != 7){
 System.out.println("3.Security settings");
          String securitySettingsMenu = """
                     1.PIN code request
                     2.Call barring service
                     3.Fixed dialing
                     4.Closed user group
                     5.Phone security
                     6.Change acess codes 
                     7.back 
                  """;        
       System.out.println(securitySettingsMenu);
             System.out.println("Enter an security settings option:");
             securitySettingsOption = input.nextInt();
      switch(securitySettingsOption) {
                      case 1: System.out.println("1.PIN code request");
                      securitySettingsOption = input.nextInt();

 break;
                      case 2: System.out.println("2.Call barring service");
                      securitySettingsOption = input.nextInt();

 break;
                      case 3: System.out.println("3.Fixed dialing");
                      securitySettingsOption = input.nextInt();

 break;
                      case 4: System.out.println("4.Closed user group");
                      securitySettingsOption = input.nextInt();

 break;
                      case 5: System.out.println("5.Phone security");
                      securitySettingsOption = input.nextInt();

 break;
                      case 6: System.out.println("6.Change acess codes");
                      securitySettingsOption = input.nextInt();

 break;
                      case 7: System.out.println(""); break;
                      default: System.out.println("Invalid option."); break;
                    } 
}
 break;
                  case 4: System.out.println("4.Restore factory settings");
                  settingsOption = input.nextInt();
 break;
                  case 5: System.out.println(""); break;
                  default: System.out.println("Invalid option."); break; 
 }
}
        break;
                  case 7: System.out.println("7.Call divert");
                  menuFunctions = input.nextInt();

 break;
                  case 8: System.out.println("8.Games"); 
                  menuFunctions = input.nextInt();

 break;
                  case 9: System.out.println("9.Calculator"); 
                  menuFunctions = input.nextInt();

 break;
                  case 10: System.out.println("10.Reminders");
                  menuFunctions = input.nextInt();

 break;
                  case 11:int clockOption  = 0;
while (clockOption  != 7){
 System.out.println("11.Clock");

            String clockMenu = """
                     1.Alarm clock
                     2.Clock settings
                     3.Date settings
                     4.Stopwatch
                     5.Countdown timer
                     6.Auto update of date and time
                     7.back
                  """;     
         System.out.println(clockMenu);
             System.out.println("Enter a clock option:");
              clockOption = input.nextInt();
      switch(clockOption) {
                      case 1: System.out.println("1.Alarm clock");
                      clockOption = input.nextInt();
 break;
                      case 2: System.out.println("2.Clock settings"); 
                      clockOption = input.nextInt();
 break;
                      case 3: System.out.println("3.Date settings");
                      clockOption = input.nextInt();
 break;
                      case 4: System.out.println("4.Stopwatch");
                      clockOption = input.nextInt();
 break;
                      case 5: System.out.println("5.Countdown timer"); 
                      clockOption = input.nextInt();
 break;
                      case 6: System.out.println("6.Auto update of date and time");
                      clockOption = input.nextInt();
 break;
                      case 7: System.out.println(""); break;
                      default: System.out.println("Invalid option."); break;
                    } 
                    }
 break;
                  case 12: System.out.println("12.Profiles");
                  menuFunctions = input.nextInt();

 break;
                  case 13: System.out.println("13.SIM services"); 
                  menuFunctions = input.nextInt();

break;
                  case 14: System.out.println("Goodbye"); break;
                  default: System.out.println("Invalid option."); break;

} 
}
}
}
              