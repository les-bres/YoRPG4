public class Rogue extends Character {
  
    private String _name;

    public Rogue() {
	_health = 75;
	_attackRating = 0.3;
	_defense = 50;
	_strength = 60;
	_speed = 7;
    }
  
    public Rogue( String name ) {
	this();
	_name = name;
    }
  
    public void takeHealth( Character victim ) {
	int damage = (int) (_strength * _attackRating) - victim.getDefense();
	_health += damage;
    }
  
    public String getName() {
	return _name;
    }
  
    public void specialize() {
	_attackRating += .1;
	_defense -= 1;
    }
  
    public void normalize() {
	_attackRating -= .1;
	_defense +=1;
    }

    public void tame( Pegasus target){
    	if ( (int) (Math.random() * 2) == 0 ) {
	    target.tameMe();
	    _speed += 2;
	    _attackRating += .2;
	}
    }
    
    public String about() {
	return "Rogues are seldom seen or heard, but they are nevertheless a constant annoyance to others." +
	    "  They have a passion for stealing, and are very good at it, as their stealth is unmatched by other creatures" + 
	    "  Although they are never achieve the fame of a warrior, a rogue is a significant adversary with many tricks up his sleave.";
    }
  
}

