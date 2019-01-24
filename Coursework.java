//Here I have imported all of the tools I believe I will need.
import java.util.Scanner;

public class Coursework {

	public static void main(String[] args) {
		
		//Here I have imported the scanner that I am going to need for the user to enter their own data	.
		final Scanner console = new Scanner(System.in);
		
		//Here I have created the MAIN MENU for the program.  
		System.out.println("-- MAIN MENU --");
		System.out.println("1 : Display Journeys");
		System.out.println("2 : Identify Suitable Journeys");
		System.out.println("Q : Quit");
		System.out.print("Pick : "); 
		
		//Here is where the user will enter their data and it will be interpreted as a String. 
		String choice = console.next();
		
		//Here is where I will be designing the what happens depending on what choice the user makes. 
		switch (choice) {
		
			//This is case one ( or where the user is placed should they press "1" into the console).
			case "1":
				
				//This is the menu that will be printed should the user select 1. 
				System.out.println("\nYork \n1 \n60 \n60");
				System.out.println("\nAlnwick \n0 \n130");
				System.out.println("\nAlnwick \n2 \n30 \n20 \n20");
				
				//Here I have placed a system exit so that the program finishes printing this statement and nothing more. 
				System.exit(0);
				
			case "2": {
				
				//This is the statement that will ask the user for their destination. 
				System.out.print("Specify Destination : ");
				String destination = console.next();

				switch(destination) {
				
				//This is the case for York
				case "York":{
				
				System.out.print("Specify Max Time (HH:MM) : ");
				String givenTime = console.next();
				int colon = givenTime.indexOf(':');
				int givenHours = Integer.parseInt(givenTime.substring(0, colon));
				int givenMins = Integer.parseInt(givenTime.substring(colon + 1, givenTime.length()));
				int mins = (givenHours * 60) + givenMins;
					
				//This is if mins are more than 1
					if(mins >= 1){
						
					System.out.print("Specify Max Change : ");
					int maxChange = console.nextInt();
						
						//York only has one stop so this the only one which will do.
						if(maxChange == 1){
						//final statement
						System.out.println("York, Time : " + givenTime +", Change : 1 = Suitable !");
						//shutting down the console so nothing else is read
						console.close();
						System.exit(0);
							
						}else{
						//This is the statement if they enter the wrong information
						System.out.println("York, Time : " + givenTime + ", Change : " + maxChange + " = UnSuitable !");
						//shutting down the console so nothing else is read
						console.close();
						System.exit(0);
						
						}
					
					}
					
				}	
				//Tis si the case for if Alnwick is written down
				case "Alnwick":{
					
				System.out.print("Specify Max Time (HH:MM) : ");
				String givenTime = console.next();
				int colon = givenTime.indexOf(':');
				int givenHours = Integer.parseInt(givenTime.substring(0, colon));
				int givenMins = Integer.parseInt(givenTime.substring(colon + 1, givenTime.length()));
				int mins = (givenHours * 60) + givenMins;
					//Tis is for the first station which does no stops and is less than 130 misn
					if(mins <=130){
					System.out.print("Specify Max Change : ");
					int maxChange = console.nextInt();
						//This is the amount of stops and is the final correct statement
						if(maxChange == 0){
						System.out.println("Alnwick, Time : " + givenTime +", Change : 0 = Suitable !");
						//shutting down the console so nothing else is read
						console.close();
						System.exit(0);
						//this is read down if they get the stops wrong
						}else{
						System.out.println("Alnwick, Time : " + givenTime + ", Change : " + maxChange + " = UnSuitable !");
						//shutting down the console so nothing else is read
						console.close();
						System.exit(0);
						}
					
					
					
					}
					if(mins>=131){
					System.out.print("Specify Max Change : ");
					int maxChange = console.nextInt();
					//This is the amount of stops and is the final correct statement
						if(maxChange == 2){
						//shutting down the console so nothing else is read
						System.out.println("Alnwick, Time : " + givenTime +", Change : 2 = Suitable !");
						//shutting down the console so nothing else is read
						console.close();
						System.exit(0);
						//this is read down if they get the stops wrong
						}else{
						System.out.println("Alnwick, Time : " + givenTime + ", Change : " + maxChange + " = UnSuitable !");
						//shutting down the console so nothing else is read
						console.close();
						System.exit(0);
						}
					}
				}
				
			}
			//shutting down the console so nothing else is read
			console.close();
			System.exit(0);	
			
		}
				
			case "Q":
				// I have placed this so that the scanner closes once this option is selected.
				console.close();
				
				//A final goodbye message before the system itself shuts down. 
				System.out.println("Exiting System...");
				
				//Here I have placed a system exit so that the program finishes printing this statement and nothing more. 
				System.exit(0);
			
		}
		
	}

}
