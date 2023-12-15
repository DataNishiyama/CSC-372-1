// Superclass
class Character {
String name;
int level;

Character(String name, int level){
    this.name = name;
    this.level = level;
}

//Character attack method
void attack(){
    System.out.println(name + " " + "attacks!");
}

}

//Subclass
class Warrior extends Character {

Warrior(String name, int level){
    super(name, level);
}

//Warrior Mortal Strike Method
void mortalstrike() {
    System.out.println(name + " " + "mortal strikes the target!");
}

}

//Main
public class WoWClone {
    public static void main(String[] args){
    
        //Create Instance of Warrior
        Warrior newWarrior = new Warrior("Varg", 0);

        newWarrior.attack();
        newWarrior.mortalstrike();

    }

// End Main
}
