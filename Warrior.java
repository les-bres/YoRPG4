// Leslie Bresnahan
// pd 9
// HW # 25
// 2013-11-14


public class Warrior extends Character{
    
    // attributes:

    private String _name;
    


    // constructor
    public Warrior() {
 	_name = "no name";
	_health = 125;
	_strength = 100;
	_defense = 40;
	_attackRating = .4;
    }

    public Warrior( String newName) {
	this();
 	_name = newName;
    }

    
    public String getName() {
	return _name;
    }
    

    public void specialize() {
	_defense -= 1;
	_attackRating += .1;
    }

    public void normalize() {
	_defense = 40;
	_attackRating = .4;
    }

    public String about() {
    return "Warriors are those of virtue, who exhibit their courage and integrity through their commitment to eradicating all evils from the face of the earth.";
    }


    public static void main( String[] args ) {
	Warrior mike = new Warrior("Mike");

	System.out.println( "Is Alive?" );
	System.out.println( mike.isAlive() );

	System.out.println( "Defense?" );
	System.out.println( mike.getDefense() );

	System.out.println( "Name?" );
	System.out.println( mike.getName() );

	System.out.println( "About?" );
	System.out.println( mike.about() );

    }

}