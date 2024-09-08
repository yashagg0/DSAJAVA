public class new_Cat {
    String name;
    String color;
    String breed;

    // DEFAULT CONSTRUCTOR
    public new_Cat() {
        this.name = "Whiskers";
        this.color = "Orange";
        this.breed = "Persian";
    } 

    //CUSTOM CONSTRUCTOR
    public new_Cat(
    String name, 
    String color, 
    String breed
    ) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void callCat(){
        System.out.println(this.name+ " of color " +this.color+ " says Meow" + " is of breed " +this.breed);
    }
    
}
