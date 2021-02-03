//base monster class serves as the template for creating monsters
package application;

public class Base_Monster {
	// base attributes
	private String name, descripton, flavorText;
	private double hp, mp;

	// default constructor creates a placeholder monster useful for testing
	Base_Monster() {
		this.name = "Monster Name";
		this.descripton = "Description";
		this.flavorText = "Some Text";
		this.hp = 100.00;
		this.mp = 50.00;
	}

	// getters 
	public String getName() {
		return name;
	}

	public String getDescription() {
		return descripton;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public double getHp() {
		return hp;
	}

	public double getMp() {
		return mp;
	}

	// Setters
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setDescription(String newDescription) {
		this.descripton = newDescription;
	}
	
	public void setFlavorText(String newFlavorText) {
		this.flavorText = newFlavorText;
	}
	
	public void setHp(double newHp) {
		this.hp = newHp;
	}
	
	public void setMp(double newMp) {
		this.mp = newMp;
	}

	@Override
	public String toString() {

		return "Monster Name: " + name;
	}
	
	//display full data of created monster
	public String displayFullData() {

		return "Name: " + name + " Description: " + descripton + " Flavor Text: " + flavorText + " HP: " + hp + " MP: "
				+ mp;
	}
}
