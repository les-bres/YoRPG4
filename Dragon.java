public class Dragon extends Character{

    public Dragon (){
        _health = 300;
        _strength = 100;
        _defense = 50;
        _attackRating = 1;
        _speed = 5;}

    public String getName(){
	return "Dragon";}
                
    public void specialize() {}
        
    public void normalize(){}
    
    public void tame( Pegasus target){}
    
    public String about(){
	return "Legend has it , Dragons are the largest known flying creature and among the rarest." +
		"It is also the most feared creature with the ability to breath fire, impenetrable scales, and razor sharp claws" +
		"Even for the most skilled adventurer, defeating this overgrown reptile is no easy feat." +
		"However the greater the risk, the greater the reward, as dragons are known for hoarding valuable treasure.";}

    //Dragon's attacks
  
    public int breathFire(Character victim){
	int Damage = _strength / 2; //ignores defense
	victim.lowerHP (Damage);
	return Damage;
    }
  
    public int swipe (Character victim) {
	int Damage = (int) ( (_strength * _attackRating * 1.5) - victim.getDefense() );
	victim.lowerHP (Damage);
	return Damage;
    }

}
