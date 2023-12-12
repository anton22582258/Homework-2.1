public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public Kogtevran(String name, int wizardry, int transgression,
                     int mind, int wisdom, int wit, int creation) {
        super(name, wizardry, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                " name='" + name + '\'' +
                ", wizardry=" + wizardry +
                ", transgression=" + transgression +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    public void compareSummKogtevran(Kogtevran second) {
        int summ1 = this.getMind() + this.getWisdom() + this.getWit() + this.getCreation();
        int summ2 = second.getMind() + second.getWisdom() + second.getWit() + second.getCreation();
        if (summ1 > summ2) {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + this.getName() +
                    " лучший Когтевранец на факультете. ");
        } else {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + second.getName() +
                    " лучший Когтевранец на факультете. ");
        }
        ;
    }
}

