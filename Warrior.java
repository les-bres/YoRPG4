public class Warrior extends Character{
    
    // attributes:
    private String _name;
    private boolean _hasPegasus;
    
    // constructor
    public Warrior() {
         _name = "no name";
        _health = 150;
        _strength = 100;
        _defense = 50;
        _attackRating = .5;
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
        _defense = 25;
        _attackRating = 1;
    }

    public void normalize() {
        _defense = 50;
        _attackRating = .5;
        if (_hasPegasus == true) {
        	_attackRating += .2;
        }
    }
    
    public void tame( Pegasus target) {
            if ( (int) (Math.random() * 2) == 0 ) {
                    target.tameMe();
                    _speed += 2;
                    _attackRating += .2;
                    _hasPegasus = true;
            }
    }

    public String about() {
	return "A warrior is brave, strong, and intelligent.  He slays mighty \ndragons and rescues princesses from high towers.  He dabbles in the art of \ncomputer science and takes pleasure in writing code that promotes his image, \nusually in the form of a role playing game.  He likes copmuter games almost as\n much as his mighty sword.";
    }

}
