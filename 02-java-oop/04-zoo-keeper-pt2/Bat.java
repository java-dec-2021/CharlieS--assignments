public class Bat extends Mammal{

    public Bat(int energyLevel){
        super(energyLevel);
    
    }
    public void fly(){
        System.out.println("Flip Flap");
        energyLevel -= 50;
    }
    public void eatHuman(){
        System.out.println("Rare Please");
        energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("Oh the Horror!");
        energyLevel -=100;
    }
}