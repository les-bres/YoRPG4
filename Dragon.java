public class Dragon extends Character{

    public Dragon (){
	_health = 300;
	_strength = 80;
	_defense = 50;
	_attackRating = 1;
	_speed = 5;}

	public String getName(){
		return "Jabberwocky";}
		
	public void specialize() {}
	
  public void normalize(){}
    
	public static abstract String about(){
		return "*placeholder*"}

  //Dragon's attacks
  
  public void breathFire(Character victim){
    int Damage = _strength; //ignores defense
    victim.lowerHP (Damage);
    //victem.setStatus(Burned);
    }
  
  public void Swipe (Character victim){
    int Damage = (int) ( (_strength * _attackRating * 1.5) - victim.getDefense() );
    victim.lowerHP (Damage);}
}
