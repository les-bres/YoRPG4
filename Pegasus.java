public class Pegasus extends Character {

    private String _name;
    private boolean _tamed;

    public Pegasus() {
	_health = 100;
	_strength = 90;
	_speed = 6;
	_defense = 50;
	_attackRating = .5;
    }
  
    public Pegasus( String name ) {
	this();
	_name = name;
    }
  
    public String getName() {
	return _name;
    }
    
    public boolean getTame(){
    	return _tamed
    }
  
    public void specialize() {
	_attackRating += .3;
	_defense -= 1;
    }
  
    public void normalize() {
	_attackRating = .5;
	_defense = 50;
    }
  
    public void fly() {
	_speed += 3.0;
	this.specialize();
    }
  
    public void land() {
	_speed -= 3;
	this.normalize();
    }
  
    public void tameMe() {
	_tamed = true;
    }
    
    public void tame( Pegasus target){}
  
    public String about() {
	return "Pegasus is a horse-like creature originating from Greek mythology.  " + 
	    "It can fly using the two large wings on its sides, and uses this ability to its advantage while fighting.  " + 
	    "Normally a fairly amiable creature, the Pegasus often befriends men and aids them in their quests.  " + 
	    "However, the Pegasus can be deadly and should be approached with caution.";
    }

}


