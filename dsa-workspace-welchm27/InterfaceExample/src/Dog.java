public class Dog implements Animal{

    private String name;

    public void animalSound() {
        System.out.println("The dog " + getName() + " barks");
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void sleep(){
        System.out.println("ZZZZZZzzzzzz");
    }

    public void setMeal(){

    }

}   // END OF CLASS