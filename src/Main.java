// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Habitat habitat = new Habitat("India");
        Animals animals = new Animals("Archa", "ChuyIsanova", 12, Color.ORANGE, habitat);
        System.out.println(animals.getInfo());
        animals.makeVoice();
        animals.makeVoice("Tfrdrfrffdffff");
        Habitat habitat1=new Habitat("Korea");
        Tiger tiger = new Tiger("Beka","Vostoc5",18,Color.BLACK,habitat1,"Jump");
        System.out.println(tiger.getInfo());
        tiger.makeVoice();
        tiger.makeVoice("rrrrrrrrrrrrrrrr");

        Tiger tiger2 = new Tiger("Artur","Vostoc4",19,Color.BLACK,habitat1,"set");
        System.out.println(tiger2.getInfo());
        tiger2.makeVoice();
        tiger2.makeVoice("dtruru");


    }
}