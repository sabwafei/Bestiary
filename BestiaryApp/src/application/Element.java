//The type element specifies the element of the monster. For example "Fire" or "Ice"
//the default "None" element can be used as a place holder or as an actual type
package application;

public class Element {
	public String elementOfMonster;
	// arrays of elements that the monster is weak against
	public String weakAgainst;
	// arrays of elements that the monster is strong against
	public String strongAgainst;

	// getter
	public String geElementOfMonster() {
		return elementOfMonster;
	}

	// setter
	public void setElementOfMonster(String newElementOfMonster) {
		this.elementOfMonster = newElementOfMonster;
	}

	// default constructor creates a type "None"
	Element() {
		elementOfMonster = "None";
	}
	
	@Override
	public String toString() {

		return elementOfMonster;
	}
}
