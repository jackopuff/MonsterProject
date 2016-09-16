package monster.controller;
import monster.model.MarshmallowMonster;
import java.util.Scanner;
public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	public MonsterController()
	{
		keyboardInput= new Scanner(System.in);
		firstMonster = new MarshmallowMonster("herman",1,1.7,1,2,1,true,true);
	}
	public void start ()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine " + firstMonster);
		System.out.println("He has " +firstMonster.getLegCount() + " legs.");
		System.out.println("He has " +firstMonster.getArmCount() + " arms.");
		System.out.println("He has " +firstMonster.getNoseCount() + " nose.");
		System.out.println("He has " +firstMonster.getEyeCount() + " eye.");
		System.out.println("He has " +firstMonster.getAntennaCount() + " antennae.");
		System.out.println("It is " +firstMonster.getHasHair() + " that he has hair.");
		System.out.println("It is " +firstMonster.getHasBellyButton() + " that he has a belly button.");
		
		
		System.out.println("would you like to change my name??");
		String answer =keyboardInput.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("what do you want my name to be??");
			String newName=keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("I get to keep my name grrr I don\'t like it angry emoji >:(");
		}
		System.out.println(firstMonster);
		
		
		System.out.println("do you want to eat my eye?");
		String eyeAnswer=keyboardInput.nextLine();
		if(eyeAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("aaaaah!");
			firstMonster.setEyeCount(0);
		}
		else
		{
			System.out.println("phew thats a relief");
		}
		System.out.println("my current number of eyes is:");
		System.out.println(firstMonster.getEyeCount());
		
		
		System.out.println("would you like to eat one of my legs?");
		String legAnswer=keyboardInput.nextLine();
		if (legAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("oh no!");
			firstMonster.setLegCount(firstMonster.getLegCount()-1);
		}
		else
		{
			System.out.println("good I like my legs.");			
		}
		System.out.println("I have " + firstMonster.getLegCount() +" legs.");
	}
	/*monster name is herman
	 * has 1 antenna
	 * has2 legs
	 * has 2 arms
	 * has 1 nose
	 * has 1 eye
	 * has belly button
	 * has hair
	 */
}
