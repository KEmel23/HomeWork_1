public final class Tiger extends Animals {
    private String comands;

    public Tiger(String name, String place, int age, Color color, Habitat habitat, String comands) {
        super(name, place, age, color, habitat);
        this.comands = comands;
    }

    @Override
    public void makeVoice(String voice) {
        System.out.println("рррррррррр");
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"commands"+this.comands;
    }
}
