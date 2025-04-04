package classAssignments;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Map;

public class Phonebook {
	public static void main(String[ ] args) {
		//Create phone book hashtable
		Hashtable<String, String> phonebook = new Hashtable<String, String>(811);
	
		//put values and keys in the hashtable
		phonebook.put("John", "845-555-2341");
		phonebook.put("Dave", "845-642-9013");
		phonebook.put("Earl", "845-123-4567");
		
		//Get user input for either a name or a phonenumber
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a name or phone number to retrieve the other: ");
		String info = userInput.nextLine();
		
		//This is null if the user enters a phone number, but is a phone number if the user enters a name in the table
		String otherInfo = phonebook.get(info);
		
		//checks if the user entered a phone number
		if(otherInfo == null) {
			//searches the table for the object with the entered phone number
			 for (Map.Entry<String, String> e : phonebook.entrySet()) {
				 if(e.getValue().equals(info)) {
					 //prints the name associated with the phone number when found
					 System.out.println(e.getKey());
				 }
			 }
		}
		else {
			//prints the name of the person if a name was entered by the user
			System.out.println("Other info: " + otherInfo);
		}
	}
}
