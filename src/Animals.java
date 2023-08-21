public class Animals extends Zoo{
    private int age;
    private  Color color;
    private Habitat habitat;


    public Animals(String name, String place, int age, Color color, Habitat habitat) {
        super(name, place);
        this.age = age;
        this.color = color;
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public final void makeVoice (){
        System.out.println("Voice animals");
    }
    public  void makeVoice (String voice){
        System.out.println(voice);
    }
    public String getInfo (){
        return "Zoo name"+this.getName()+"place"+this.getPlace()+"age"+getAge()+getColor()+habitat.getName();
    }

}
