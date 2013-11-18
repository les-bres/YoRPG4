public class Mage extends Character{
    
    // attributes:
    private String _magicType;


    // constructor
    public Mage() {
	_magicType = "earth";
        _health = 125;
        _strength = 100;
        _defense = 40;
        _attackRating = .6;
        _speed = 2;
    }


    public Mage( String newMagicType) {
        this();
	_magicType = newMagicType;
    }
    
    public Mage( String newMagicType, Pegasus pegasus ) {
	_magicType = newMagicType;
	_health = 125;
	_strength = 150;
	_defense = 40;
	_attackRating = .8;
	_speed = 8;
    }

    
    public String getMagicType() {
        return _magicType;
    }
    

    public void specialize() {
        _defense = 20;
        _attackRating = 1.2;
    }

    public void normalize() {
        _defense = 40;
        _attackRating = .6;
    }

    public String about() {
	return "Mages are those who possess power, with specialization in categories like earth, water, or fire... They must make the decision between good and evil for themselves.";
    }


    public String getName() {
        return "Mages do not have names.";
    }
    
    public void tame( Pegasus target) {
	if ( (int) (Math.random() * 2) == 0 ) {
	    target.tameMe();
	    _speed += 2;
	    _attackRating += .2;
	}
    }
    
}
