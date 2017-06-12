package virtualpetamok;


public class OrgKoalaStretch extends Koala implements OrganicPet {

	protected int cageMessiness;
	protected int hunger;
	protected int thirst;

	public OrgKoalaStretch(String newName, String newDescription) {
		super(newName, newDescription);
		cageMessiness = 30;
		hunger = 40;
		thirst = 60;

	}

	public void feed() {
		hunger -= 10;
		mood += 50;
		cageMessiness += 15;
	}

	public void water() {
		thirst -= 30;
		mood += 30;
		cageMessiness += 10;
	}

	@Override
	public void play() {
		mood += 20;
		hunger += 10;
		thirst += 10;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public int getMood() {
		return mood;
	}

	@Override
	public int tick() {
		hunger += (4 + generateRandom());
		thirst += (6 + generateRandom());
		mood -= (7 + generateRandom());
		cageMessiness += (5 + generateRandom());
		return cageMessiness;
	}

	@Override
	public int generateRandom() {
		return generator.nextInt(10);
	}

	@Override
	public int getHunger() {
		return hunger;
	}

	public int getCageMessiness() {
		
		return cageMessiness;
	}

	public void cleanCage() {
		cageMessiness = 0;
		mood += 10;
		health += 10;
	}

	@Override
	public int getThirst() {
		return thirst;
	}



}