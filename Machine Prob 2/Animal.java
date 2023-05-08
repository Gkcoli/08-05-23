public class Animal{
    protected String animalType;
    protected String animalName;
    protected String animalBreed;

    public Animal(String animalType, String animalName, String animalBreed){
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalBreed = animalBreed;

    }
    public String getanimalType(){
        return animalType;

    }
    public String getanimalPangalan(){
        return animalName;
    }
    public String getanimalBreed(){
        return animalBreed;
    }
    
    
}
