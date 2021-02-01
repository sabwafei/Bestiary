//base monster class serves as the template for creating monsters
package application;

public class Base_Monster {
	//base attributes
	private String name, descripton, flavorText;
	private double hp, mp;
	
	//default constructor creates a placeholder monster useful for testing
	Base_Monster(){
		this.name = "Monster Name";
		this.descripton = "Description";
		this.flavorText = "Some Text";
		this.hp = 100.00;
		this.mp = 50.00;
	}
	
	@Override
	public String toString() {
		
		return "Name: " + name +  " Description: " + descripton + " Flavor Text: " + flavorText + " HP: " + hp + " MP: " + mp; 
	}
}
