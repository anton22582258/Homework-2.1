public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int wizardry, int transgression,
                      int nobility, int honor, int bravery) {
        super(name, wizardry, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                " name='" + name + '\'' +
                ", wizardry=" + wizardry +
                ", transgression=" + transgression +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void compareSummGriffindor(Griffindor second) {
        int summ1 = this.getNobility() + this.getHonor() + this.getBravery();
        int summ2 = second.getNobility() + second.getHonor() + second.getBravery();
        if (summ1 > summ2) {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + this.getName() +
                    " лучший Гриффиндорец на факультете. ");
        } else {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + second.getName() +
                    " лучший Гриффиндорец на факультете. ");
        }
        ;
    }

}

