package monster.model;

public class MarshmallowMonster
{
	private String name;
	private Double armCount;
	private int eyeCount;
	private int antennaCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	private boolean hasHair;
	
	public MarshmallowMonster ()
	{
		this.name = "no name";
		this.antennaCount = -1234;
		this.eyeCount = -21312;
		this.legCount = -234234342;
		this.noseCount = -2;
		this.hasBellyButton = false;
	}
	public MarshmallowMonster(String name, int eyeCount, double armCount, int antennaCount, int legCount, int noseCount, boolean hasBellyButton, boolean hasHair)
	{
		this.name = name;
		this.armCount = armCount;
		this.eyeCount = eyeCount;
		this.antennaCount = antennaCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		this.hasHair = hasHair;		
	}
	
	public String toString()
	{
		String description = "Monster says: Name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getLegCount()
	{
		return legCount; 
	}
	
	public boolean getHasHair()
	{
		return hasHair;
	}
	
	public double getArmCount()
	{
		return armCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public int getAntennaCount()
	{
		return antennaCount;
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
