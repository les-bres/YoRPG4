public abstract class Character {

    // note protected instance variables so subclasses can access:
    protected int _health, _strength, _defense, _speed;
    protected double _attackRating;


    public boolean isAlive() {
        return (_health > 0);
    }


    public int getDefense() {
        return _defense;
    }
    
    public int getSpeed() {
	return _speed;
    }
    
    public int getHealth() {
	return _health;
    }

    public void lowerHP(int decreaser) {
        if (_health > decreaser) {
            _health -= decreaser;
        }
        else {
            _health = 0;
        }
    }


    // Character is parameter type so both monsters and warriors can be accepted

    public int attack( Character victim ) {
        int Damage = (int) ( (_strength * _attackRating) - victim.getDefense() );
        if (Damage < 0) {
	    Damage = 0;
        }
        if (Math.random() * 10.0 > victim.getSpeed()) {
	    victim.lowerHP( Damage );
        }
        return Damage;
    }


    // abstract methods:
    
    public abstract String getName();
    public abstract void normalize();
    public abstract void specialize();
    public abstract String about();

}
