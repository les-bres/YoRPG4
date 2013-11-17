public class Goblin extends Character{

    public Goblin (){
        _health = 200;
        _strength = 10;
        _defense = 10;
        _attackRating = 10;
        _speed = 10;}

    public String getName(){
	return "Goblin Swarm";}
                
    public void specialize() {}
        
    public void normalize(){}
    
    public String about(){
	return "Evil, mischievous creatures, the Goblin often travels in tribes." +
		"Although small, they are fast and cunning." +
		"Never underestimate the strength of a Goblin Swarm and never trust the words of a Goblin.";}


    public void swarm (){
        _attackRating = _health / 20;}
  
}
