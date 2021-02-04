//The type class specifies the type of monster. For example A "Dragon" or a "Beast"
//the default "None" type can be used as a place holder or as an actual type

package application;

public class Type {
	// type attribute can be used to give monster strengths and weaknesses
	public String typeOfMonster;

	// array of types that the monster is weak against
	public String weakness;
	// array of types that the monster is strong against
	public String strongAgainst;

	// getter
	public String getTypeOfMonster() {
		return typeOfMonster;
	}

	// setter
	public void setTypeOfMonster(String newTypeOfMonster) {
		this.typeOfMonster = newTypeOfMonster;
	}

	// default constructor creates a type "None"
	Type() {
		typeOfMonster = "None";
	}
	
	@Override
	public String toString() {

		return typeOfMonster;
	}
	
}
