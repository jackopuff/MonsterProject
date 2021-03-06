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
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAntennaCount(int antennaCount)
	{
		this.antennaCount=antennaCount;
	}
	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton=hasBellyButton;
	}
	public void setArmCount(double armCount)
	{
		this.armCount = armCount;
	}
	public void setLegCount(int legCount)
	{
		this.legCount=legCount;
	}
	public void setNoseCount(int noseCount)
	{
		this.noseCount=noseCount;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount=eyeCount;
	}
	public void setHasHair(boolean hasHair)
	{
		this.hasHair=hasHair;
	}
	
}
