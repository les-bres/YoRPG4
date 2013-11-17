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
    int damage = (int) (_strength * attackRating) - victim.getDefense();
    _health += damage;
  }
  
  public String about() {
    return "Rogues are seldom seen or heard, but they are nevertheless a constant annoyance to others." +
    "  They have a passion for stealing, and are very good at it, as their stealth is unmatched by other creatures" + 
    "  Although they are never achieve the fame of a warrior, a rogue is a significant adversary with many tricks up his sleave.";
  }
  
}
