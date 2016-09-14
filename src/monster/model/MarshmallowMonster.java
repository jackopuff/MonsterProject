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
	public MarshmallowMonster(String name, double armCount, int eyeCount, int antennaCount, int legCount, int noseCount, boolean hasBellyButton, boolean hasHair)
	{
		this.name = name;
		this.armCount = armCount;
		this.antennaCount = antennaCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		this.hasHair = hasHair;		
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
