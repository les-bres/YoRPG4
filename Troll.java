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
    
        public static abstract String about(){
                return "*placeholder*";}
                
        public void useMeme();{}
        
        public void club();{}
        
        public void angry();{
       	if (_health < 100){
    		_strength *= 2;}
       	}
       	}
}
