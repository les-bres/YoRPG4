public class Troll extends Character{
  

    public Troll (){
        _health = 200;
        _strength = 80;
        _defense = 30;
        _attackRating = 1;
        _speed = 1;}

    public String getName(){
	return "Troll";}
                
    public void specialize() {}
        
    public void normalize(){}
    
    public String about(){
	return "Trolls are descendants of giants and carry their same temperment.  " + 
"Traditionally nomads, trolls are often found in caves hording gold or feasting on meat of any sort.  " + 
"They are of very small intellect, which serves to make them extremely violent.  " +
"The club is their typical weapon in combat, and when they fight they use little technique and much brute strength.";}
                
    public void useMeme(){
    	int Damage = (int) ( (_strength * _attackRating) - victim.getDefense() );
        if (Damage < 0) {
            Damage = 0;
        }
        if (Math.random() * 10.0 > victim.getSpeed()) {
            victim.lowerHP( Damage );
        }
        return Damage;
    }
        
    public void club(Character victim) {
	int Damage = (int) ( (_strength * _attackRating * 1.5) - victim.getDefense() );
	victim.lowerHP (Damage);
    }
        
    public void angry() {
	if (_health < 100){
	    _strength *= 2;}
    }
}
