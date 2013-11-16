// Leslie Bresnahan
// pd 9
// HW # 25
// 2013-11-14


public class Mage extends Character{
    
    // attributes:
    private String _magicType;
    


    // constructor
    public Mage() {
 	_magicType = "earth";
	_health = 125;
	_strength = 100;
	_defense = 40;
	_attackRating = .4;
    }

    public Mage( String newMagicType) {
	this();
 	_magicType = newMagicType;
    }

    
    public String getMagicType() {
	return _magicType;
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
    return "Mages are those who possess power, with specialization in categories like earth, water, or fire... They must make the decision between good and evil for themselves.";
    }


    public String getName() {
	return "Mages do not have names.";
    }


    public static void main( String[] args ) {
	Mage mike = new Mage("fire");

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