// Leslie Bresnahan
// pd 9
// HW # 25
// 2013-11-14


public class Monster extends Character{
    

    // constructor
    public Monster() {
	_health = 150;
	_strength =  ((int) (Math.random() * 45)) + 20;
	_defense = 20;
	_attackRating = 1;
    }

    public String about() {
    return "Monsters are those who lurk in shadows, seeking to inflict harm and degrade the world from inside to out.";
    }


    // override abstract methods
    public String getName() {
	return "Monsters do not have names.";
    }

    public void normalize() {}
    public void specialize() {}

    public static void main( String[] args ) {
	Monster mike = new Monster();

	System.out.println( "Is Alive?" );
	System.out.println( mike.isAlive() );

	System.out.println( "Defense?" );
	System.out.println( mike.getDefense() );

	System.out.println( "Name?" );
	System.out.println( mike.getName() );

	System.out.println( "About?" );
	System.out.println( mike.about() );

    }

}