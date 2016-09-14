package monster.controller;
import monster.model.MarshmallowMonster;
public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
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
