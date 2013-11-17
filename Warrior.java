

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
	_speed = 5;
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
    
    public void tame( Pegasus target) {
    	if ( (int) (Math.random() * 2) == 0 ) {
    		target.tameMe();
    		_speed += 2;
    		_attackRating += .2;
    	}
    }

}
