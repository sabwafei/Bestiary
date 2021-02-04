//the MONSTER class will take the Base_Monster class, TYPE class, and ELEMENT class and create a MONSTER instance
package application;

public class Monster extends Base_Monster{
	//each monster will have a unique type and element
	private Element monsterElement;
	private Type monsterType;
	
	//getters
	public Element getElement() {
		return monsterElement;
	}
	
	public Type getTyep() {
		return monsterType;
	}
	
	//setters
	public void setType(Type newMonsterType) {
		this.monsterType = newMonsterType;
	}
	
	public void setElement(Element newMonsterElement) {
		this.monsterElement = newMonsterElement;
	}
}
