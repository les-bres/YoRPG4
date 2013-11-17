public class Rogue {

  public Rogue() {
    _health = 75;
    _attackRating = 0.3;
    _defense = 50;
    _strength = 60;
    _speed = 100;
  }
  
  public Rogue( String name ) {
    this();
    _name = name;
  }
  
  public void takeHealth( Character victim ) {
    int damage = (int) (_strength * attackRating) - 
  }
