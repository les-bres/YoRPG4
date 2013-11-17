public class Ent extends Character {

    private String _name;

    public Ent() {
	_health = 150;
	_strength = 150;
	_defense = 20;
	_speed = 0;
	_attackRating = .2;
    }
  
    public Ent ( String name ) {
	this();
	_name = name;
    }
  
    public void specialize() {
	_attackRating += .1;
	_defense -= 1;
    }
  
    public void normalize() {
	_attackRating = .2;
	_defense = 20;
    }
  
    public String getName() {
	return _name;
    }
  
    public void tame( Pegasus target){} 
 
    public String about() {
	return "Ents are essentially living trees.  They are the guardians of the forests and detest anything that may threaten them.  " + 
	    "They are extremely slow-talking and slow-moving creatures with extremely long lifespans.  They are some of the oldest creatures on Earth.  " +
	    "Generally pacifists, Ents are calm, wise, and never too hasty.  Once they have made a decision, however, they stick to it.";
    }
  
}

