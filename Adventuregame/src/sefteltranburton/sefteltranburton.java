package sefteltranburton;
/**
 * Adventure Game where you must escape the hospital and figure out why it's abandoned
 * 
 * @author Adam Seftel
 * @author2 Alina Tran-Burton
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import hsa_new.Console;
public class sefteltranburton {

	public static void main(String[] args) {
		Console c = new Console(50, 150);
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File ("firstroom.jpg"));
		} catch (IOException e) {
		}
		c.drawImage (image, 0, 0, 852, 480, null);
		c.println("You wake up in a hospital and its abandoned. You look around and notice there is only a door and vent to possibly escape the room, which do you choose? (Door/Vent)");
		String direction;
		direction = c.readString();
		if (direction.equalsIgnoreCase("Door"))
		{ 
			c.clear();
			BufferedImage hallway = null;
			try {
				hallway = ImageIO.read(new File("hallway.jpg"));
			} catch (IOException e){
			}
			c.drawImage (hallway,0, 0, 768, 384, null);
			// Outputs picture of hallway
			c.println("You walk into a hallway and discovery a trolly stacked with care supplies. You walk over and notice there is a note with a number code and a ring of keys. You take the note and keys and proceed to look around. You can go left or right in the hallway, which do you choose? (Left/Right)");
			String response;
			response = c.readString();
			if (response.equalsIgnoreCase("left"))
			{
				c.clear();
				c.println("You walk down the hallway and pass a couple of doors. A door marked Staff Room catches your attention. The room has a key code and you use the note from the trolly to open it.");
				long startTime = System.currentTimeMillis();
				while(false||(System.currentTimeMillis()-startTime)<4000)
				{
				}
				c.clear();
				BufferedImage staffroom = null;
				try {
					staffroom = ImageIO.read(new File("staffroom.jpg"));
				} catch (IOException e){
				}
				c.drawImage(staffroom, 0, 0, 1200, 800, null);
				// Outputs picture of Staff Room
				c.println("You're in the Staff Room and notice there is a dead body on the floor and a desk in the middle of the room. Do you check the body or the desk? (Body/Desk)");
				String check;
				check = c.readString();
				if (check.equalsIgnoreCase("body"))
				{
					do
					{
						c.println("You see the body and become woozy and faint. You wake up later.");
						c.println("You're in the Staff Room and you can choose to either check the body or the desk. Which do you check? (Body/Desk)");
						check = c.readString();

					}
					while (check.equalsIgnoreCase("body"));

				}

				{
					c.println("You walk to the desk and it is unlocked. You open a drawer. In the desk you to find a map of the hospital. You read the map and head towards the nearest exit.");
					c.println("You come to a locked door that requires a key to open. You have two keys you've acquired earlier from the trolly. You feel a presence behind you that rushes you to make a decision. Which key do you try? (One/Two)");
					String keys;
					keys = c.readString();
					if (keys.equalsIgnoreCase("one"))
					{
						c.println("You try the first key. The key breaks and you do not have enough time to try the other. The creature kills you and the game is over.");

					}
					else
					{
						c.println("You try the second key and it works. You continue through the door and come to another wing. In the wing, there's another door and an open office.");
						c.println("Do you go to the wing or the office? (Wing/Office)");
						String way;
						way = c.readString();
						// First loop
						if (way.equalsIgnoreCase("wing"))
							do
							{
								c.println("The wing is locked and a key is needed. You turn around.");
								c.println("Do you go to the wing or the office? (Wing/Office)");
								way = c.readString();

							}
							while (way.equalsIgnoreCase("wing"));
						{
							c.clear();
							BufferedImage office = null;
							try {
								office = ImageIO.read(new File("office.jpg"));
							} catch (IOException e){
							}
							c.drawImage(office, 0, 0, 800, 533, null );
							//Outputs image of office
							c.println("You walk into the office and rummage around. You find a security key card and use it on the wing door. The wing opens.");
							c.println("You open the wing door and see a creature. It is blocking the exit. Do you run or do you observe the creature? You have an 80% chance of escaping if you run. (Observe/Run)");
							String Observe;
							Observe = c.readString();
							if (Observe.equalsIgnoreCase("Observe"))
							{
								c.println("You observe the creature and freeze. You have gone into shock and are unable to move. The creature approaches you and realizes you are human. The creature jumps at you and kills you.");
							}
							else
							{
								//Generate random number
								int escape = (int) (Math.random()*100) + 1;
								if (escape >= 80)
								{
									c.println("You escape the hospital to the street. Would you like to continue playing? (Yes/No)");
									String playing;
									playing = c.readString();
									if (playing.equalsIgnoreCase("yes"))
									{
										c.clear();
										BufferedImage street = null;
										try {
											street = ImageIO.read(new File("street.jpg"));
										} catch (IOException e) {
										}
										c.drawImage(street, 0, 0, 960 , 540, null );
										c.println("You escape into the hospital grounds, becoming overwhelmed with terror. The grounds are completely abandoned and empty.");
										c.println("There are two buildings nearby. One appears to be a research facility and the other seems like a supplies building.");
										c.println("Which building do you go to? (Research/Supplies)");
										String research;
										research = c.readString();
										if (research.equalsIgnoreCase("research"))
										{
											c.clear();
											c.println("You open the door and someone runs at you. It is a young male, who looks to be a reseacher that has lost his mind.");
											c.println("He grabs you by the shoulders and shakes you while mummbling about an experiment gone wrong.");
											c.println("Do you push him away or do you question further? (Push/Question)");
											String push;
											push = c.readString();
											if (push.equalsIgnoreCase("push"))
											{
												c.println("You push him and he stumbles backwards. He runs at you and throws you through a lab window. ");
												c.println("He follows you into the lab and you look around for something to defend yourself with. You find a needle and a fire extinguisher.");
												c.println("Which object do you choose? (Needle/Extinguisher)");
												String extinguisher;
												extinguisher = c.readString();
												// Second Loop
												if (extinguisher.equalsIgnoreCase("extinguisher"))
												{do
												{
													c.println("The extinguisher is empty.");
													c.println("Do you use the extinguisher or the needle? (Extinguisher/Needle)");
													extinguisher = c.readString();

												}
												while (extinguisher.equalsIgnoreCase("extinguisher"));
												{
													c.println("You charge at the man and inject him with a lethal substance, killing him. ");
													c.println("You realize you are bleeding from the back of your head because you were pushed through the lab window, you fall to the ground and bleed out.");
												}
												}

												else
												{
													c.println("You charge at the man and inject him with a lethal substance, killing him. ");
													c.println("You realize you are bleeding from the back of your head because you were pushed through the lab window, you fall to the ground and bleed out.");
												}
											}
											else
											{
												c.println("He tells you the story of Project 4.1, an experiment in which women who were exposed to radioactive fallout gave birth to physically and mentally mutated children.");
												c.println("He then pushes you to the ground and runs while screaming out of the building.");
												c.println("You get up and walk into the nearest research lab. There's a filing cabinet in which you decide to search for files regarding Project 4.1. You locate the file and flip through the documents.");
												c.println("You discover this was where researchers tried to cure the mutations. Reading on, you find out they created an antidote but were too late with distribution.");
												c.println("It's now in your hands to cure the children.");

											}
										}
										else
										{
											c.println("You walk into the supply buliding and open a cabinet and find a bag, a crowbar and a first aid kit. You put the crowbar and first aid kit in the bag and keep looking.");
											c.println("You find a working radio and try to contact anyone. A voice anwsers.");
											c.println("The voice asks who you are. You tell them your name and your location. They tell you they are in a helicopter and can rescue you if you make it to the roof. Do you trust the voice?");
											String trust;
											trust = c.readString();
											if (trust.equalsIgnoreCase("yes"))
											{
												c.println("You look around the building for a way to the roof. You locate an elevator and staircase. Do you take the elevator or stairs?(Elevator/Stiars)");
												String elevator;
												elevator = c.readString();
												if (elevator.equalsIgnoreCase("elevator"))
												{
													c.clear();
													c.println("You enter the elevator and press the highest floor. Midway through the elevator ride you get stuck and the elevator won't move. You try to press all of the buttons, but nothing works.");
													c.println("The power shuts out and it's pitch black. An alarm for the elevator goes off and a flashing emergency light goes on. You smash the alarm with the crowbar and the door of the elevator opens.");
													c.println("A creature is running towards the elevator door. Do you try to fend it off or reset the elevator? (Fight/Reset)");
													String fight;
													fight = c.readString();
													if (fight.equalsIgnoreCase("fight"))
													{
														c.println("You run towards the creature with the crowbar and attack it. The creature falls backwards, you hold down the creature with your foot and then stab the creature.");
														c.println("The creature dies and you run back into the elevator. The power comes back on and the elevator doors close, bringing you up to the top floor.");
														c.println("You exit the elevator and notice a sign leading to the roof.");
														c.println("The helicopter is on the roof and two people are signaling for you to get in. You listen and they tell you they are part of a rescue unit.");
														c.println("They tell you there was an experiment of mutated children occuring in the hospital. This resulted in the evacuation of the hospital, where the children managed to escape captivity.");
													}
													else
													{
														c.println("You reach up between the elevator door and floor door and find a lever to reset the elevator. You pull the lever and step back in. The door closes and the elevator continues up.");
														c.println("You reach the top floor and the elevator door opens. You then step out into a dark hallway. Right away you notice a lit up sign labelled roof and head towards it.");
														long Time = System.currentTimeMillis();
														while(false||(System.currentTimeMillis()-Time)<5000)
														{
														}
														c.clear();
														c.println("The helicopter is on the roof and two people are signaling for you to get in. You listen and they tell you they are part of a rescue unit.");
														c.println("They tell you there was an experiment of mutated children occuring in the hospital. This resulted in the evacuation of the hospital, where the children managed to escape captivity.");

													}
												}
												else
												{
													c.println("You climb the stairs to the roof where a helicopter is waiting for you and two people are signaling for you to get in. You listen and they tell you they are part of a rescue unit.");
													c.println("They tell you there was an experiment of mutated children occuring in the hospital. This resulted in the evacuation of the hospital, where the children managed to escape captivity.");	
												}
											}
											else
											{
												c.println("You make a run for it but the creature catches you and you are killed.");
											}
										}

									}
									else
									{
										c.println("Good job, you escaped the hospital!!! :)");
									}
								}
							}
						}
					}
				}
			}
			else
			{
				c.println("You walk down the hall and the lights shut off.");
				c.println("You run in a panic down the hallway and trip on an object.");
				long startTime = System.currentTimeMillis();
				while(false||(System.currentTimeMillis()-startTime)<3000)
				{
				}
				BufferedImage dead = null;
				try {
					dead = ImageIO.read(new File ("blackscreen.jpg"));
				} catch (IOException e) {
				}
				c.drawImage(dead, 0, 0, 1280, 720, null );
				//Outputs dead image
				c.println("You have broken your neck and died.");
			}
		}
		else
		{
			c.println("You notice the vent in on the ceiling and is unreachable. You must stack objects in the room to reach the vent.");
			c.println("You look around the room to find objects that you would be able to stack. There is a chair in the corner and a stool by cot. You stack them and pull yourself up into the vent.");
			c.clear();
			BufferedImage vent = null;
			try {
				vent = ImageIO.read(new File ("vent.jpg"));
			} catch (IOException e) {
			}
			c.drawImage(vent, 0, 0, 1087, 782, null);
			// halved the x and y
			c.println("In the vent you can go left or right. Which do you choose? (Left/Right)");
			String path;
			path = c.readString();
			if (path.equalsIgnoreCase("right"))
			{
				c.println("You crawl through the vent and discover a broken part of the vent.");
				long startTime = System.currentTimeMillis();
				while(false||(System.currentTimeMillis()-startTime)<4000)
				{
				}
				c.clear();
				BufferedImage hand = null;
				try {
					hand = ImageIO.read(new File ("grabbinghands.jpg"));
				} catch (IOException e) {
				}
				c.drawImage(hand, 0, 0, 1200, 600, null ); 
				c.println("You investigate the hole and a creature grabs you. You get pulled through the hole and get killed");
			}
			else
			{

				c.println("The vent breaks and you fall into a laundry room.");
				long startTime = System.currentTimeMillis();
				while(false||(System.currentTimeMillis()-startTime)<3000)
				{
				}
				c.clear();
				BufferedImage laundryroom = null;
				try {
					laundryroom = ImageIO.read(new File ("laundryroom.jpg"));
				} catch (IOException e) {
				}
				c.drawImage(laundryroom, 0, 0, 1504, 917, null);
				// Outputs laundryroom image
				c.println("In the laundry room you notice stairs and a door on the adjecent wall. There is a noise coming from the door. What do you choose? (Stairs/Door)");
				String stairs;
				stairs = c.readString();
				if (stairs.equalsIgnoreCase("stairs"))
				{
					c.println("You escape down the stairs and out of the hospital.");
					c.println("Would you like to continue playing? (Yes/No) ");
					String playing;
					playing = c.readString();
					if (playing.equalsIgnoreCase("yes"))
					{
						c.clear();
						BufferedImage street = null;
						try {
							street = ImageIO.read(new File("street.jpg"));
						} catch (IOException e) {
						}
						c.drawImage(street, 0, 0, 960 , 540, null );
						c.println("You escape into the hospital grounds, becoming overwhelmed with terror. The grounds are completely abandoned and empty");
						c.println("There are two buildings nearby. One appears to be a research facility and the other seems like a supplies building.");
						c.println("Which building do you go to? (Research/Supplies)");
						String research;
						research = c.readString();
						if (research.equalsIgnoreCase("research"))
						{
							c.clear();
							c.println("You open the door and someone runs at you. It is a young male, who looks to be a reseacher that lost his mind. ");
							c.println("He grabs you by the shoulder and shakes you while mummbling about an experiment gone wrong");
							c.println("Do you push him away or do you question further? (Push/Question)");
							String push;
							push = c.readString();
							if (push.equalsIgnoreCase("push"))
							{
								String res;
								res = c.readString();
								if (res.equalsIgnoreCase("research"))
								{
									c.clear();
									c.println("You open the door and someone runs at you. It is a young male, who looks to be a reseacher that has lost his mind.");
									c.println("He grabs you by the shoulders and shakes you while mummbling about an experiment gone wrong.");
									c.println("Do you push him away or do you question further? (Push/Question)");
									String shove;
									shove = c.readString();
									if (shove.equalsIgnoreCase("push"))
									{
										c.println("You push him and he stumbles backwards. He runs at you and throws you through a lab window. ");
										c.println("He follows you into the lab and you look around for something to defend yourself with. You find a needle and a fire extinguisher.");
										c.println("Which object do you choose? (Needle/Extinguisher)");
										String extinguisher;
										extinguisher = c.readString();
										// Third loop
										if (extinguisher.equalsIgnoreCase("extinguisher"))
											do
											{
												c.println("The extinguisher is empty.");
												c.println("Do you use the extinguisher or the needle? (Extinguisher/Needle)");
												extinguisher = c.readString();

											}
											while (extinguisher.equalsIgnoreCase("extinguisher"));
										{
											c.println("You charge at the man and inject him with a lethal substance, killing him. ");
											c.println("You realize you are bleeding from the back of your head because you were pushed through the lab window, you fall to the ground and bleed out.");
										}
									}
									else
									{
										c.println("You charge at the man and inject him with a lethal substance, killing him. ");
										c.println("You realize you are bleeding from the back of your head because you were pushed through the lab window, you fall to the ground and bleed out.");
									}
								}
							}
							else
							{
								c.println("He tells you the story of Project 4.1, an experiment in which women who were exposed to radioactive fallout gave birth to physical and mentally mutated children.");
								c.println("He then pushes you to the ground and runs while screaming out of the building.");
								c.println("You get up and walk into the nearest research lab. There's a filing cabinet in which you decide to search for files regarding Project 4.1. You locate the file and flip through the documents.");
								c.println("You discover this was where researchers tried to cure the mutations. Reading on, you find out they created an antidote but were too late with distribution.");
								c.println("It's now in your hands to cure the children.");
							}
						}
						else
						{
							c.println("You walk into the supply buliding and open a cabinet and find a bag, a crowbar and a first aid kit. You put the crowbar and first aid kit in the bag and keep looking.");
							c.println("You find a working radio and try to contact anyone. A voice anwsers.");
							c.println("The voice asks who you are. You tell them your name and your location. They tell you they are in a helicopter and can rescue you if you make it to the roof. Do you trust the voice?");
							String trust;
							trust = c.readString();
							if (trust.equalsIgnoreCase("yes"))
							{
								c.println("You look around the building for a way to the roof. You locate an elevator and staircase. Do you take the elevator or stairs?(Elevator/Stiars)");
								String elevator;
								elevator = c.readString();
								if (elevator.equalsIgnoreCase("elevator"))
								{
									c.clear();
									c.println("You enter the elevator and press the highest floor. Midway through the elevator ride you get stuck and the elevator won't move. You try to press all of the buttons, but nothing works.");
									c.println("The power shuts out and it's pitch black. An alarm for the elevator goes off and a flashing emergency light goes on. You smash the alarm with the crowbar and the door of the elevator opens.");
									c.println("A creature is running towards the elevator door. Do you try to fend it off or reset thhe elevator?(Fight/Reset)");
									String fight;
									fight = c.readString();
									if (fight.equalsIgnoreCase("fight"))
									{
										c.println("You run towards the creature with the crowbar and attack it. The creature falls backwards, you hold down the creature with your foot and then stab the creature.");
										c.println("The creature dies and you run back into the elevator. The power comes back on and the elevator doors close, bringing you up to the top floor.");
										c.println("You exit the elevator and notice a sign leading to the roof.");
										c.println("The helicopter is on the roof and two people are signaling for you to get in. You listen and they tell you they are part of a rescue unit.");
										c.println("They tell you there was an experiment of mutated children occuring in the hospital. This resulted in the evacuation of the hospital, where the children managed to escape captivity.");
									}
									else
									{
										c.println("You reach up between the elevator door and floor door and find a lever to reset the elevator. You pull the lever and step back in. The door closes and the elevator continues up.");
										c.println("You reach the top floor and the elevator door opens. You then step out into a dark hallway. Right away you notice a lit up sign labelled roof and head towards it.");
										long Time = System.currentTimeMillis();
										while(false||(System.currentTimeMillis()-Time)<5000)
										{
										}
										c.clear();
										c.println("The helicopter is on the roof and two people are signaling for you to get in. You listen and they tell you they are part of a rescue unit.");
										c.println("They tell you there was an experiment of mutated children occuring in the hospital. This resulted in the evacuation of the hospital, where the children managed to escape captivity.");
									}
								}
								else
								{
									c.println("You climb the stairs to the roof where a helicopter is waiting for you and two people are signaling for you to get in. You listen and they tell you they are part of a rescue unit. ");
									c.println("They tell you there was an experiment of mutated children occuring in the hospital. This resulted in the evacuation of the hospital, where the children managed to escape captivity.");
								}
							}
							else
							{
								c.println("You leave the radio and you are starting to feel weak due to malnutrition. You check the first aid kit and find an unlabelled needle. Do you inject it?(Y/N)");
								String needle;
								needle = c.readString();
								if (needle.equalsIgnoreCase("yes"))
								{
									c.println("You take it and feel relaxed. You read the needle and realize you have just injected yourself with valium. ");
									long Time = System.currentTimeMillis();
									while(false||(System.currentTimeMillis()-Time)<4000)
									{
									}
									BufferedImage dead = null;
									try {
										dead = ImageIO.read(new File ("blackscreen.jpg"));
									} catch (IOException e) {
									}
									c.drawImage(dead, 0, 0, 1280, 720, null );
									c.println("You have overdosed on a tranqulizer and died.");
								}
								else
								{
									c.println("You are too weak to continue and drop to the floor. As your vision gets blurry you see a figure walking towards you. You pass out and do not wake up.");
								}
							}
						}
					}
					else
					{
						c.println("Congradulations you have escaped the hospital!!! :)");
					}
				}
				else
				{
					c.println("You open the door and get attack by the creature and die");
				}
				// Program ends
			}
		}
	}

}



