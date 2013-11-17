public class Monster extends Character{
    

    // constructor
    public Monster() {
        _health = 150;
        _strength =  ((int) (Math.random() * 45)) + 20;
        _defense = 20;
        _attackRating = 1;
        _speed = 3;
    }


    // override abstract methods
    public String getName() {
        return "Monsters do not have names.";
    }

    public void normalize() {}
    public void specialize() {}

    public String about() {
	return "A monster is the most misunderstood being in the realm.  He constantly " + 
	"tries to befriend humans, but can never get his message across quite right. " + 
	"Most monsters do not speak English or any language whatsoever, thus his cries " + 
	"for love come across as ferocious growls and, in some cases, fire-breath.  Even " + 
	"with their most good-hearted attempts at provoking a loving relationship between " + 
	"him and the humans, he always ends up destroying a village or kidnapping \na maiden.  " + 
	"Monsters are said to be mean, destructive, and scary, but the truth is that they " + 
	"are clumsy and unintelligable, but have hearts of gold.";
    }

}
