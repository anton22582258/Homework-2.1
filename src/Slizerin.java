public class Slizerin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    @Override
    public String toString() {
        return "Slizerin{" +
                " name='" + name + '\'' +
                ", wizardry=" + wizardry +
                ", transgression=" + transgression +
                ", cunning=" + cunning +
                ", resoluteness=" + resoluteness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slizerin(String name, int wizardry, int transgression, int cunning, int resoluteness, int ambition,
                    int resourcefulness, int lustForPower) {
        super(name, wizardry, transgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }

    public void compareSummSlizerin(Slizerin second) {
        int summ1 = this.getCunning() + this.getResoluteness() + this.getAmbition() +
                this.getResourcefulness() + this.getLustForPower();
        int summ2 = second.getCunning() + second.getResoluteness() + second.getAmbition() +
                second.getResourcefulness() + second.getLustForPower();
        if (summ1 > summ2) {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + this.getName() +
                    " лучший Слизеринец на факультете. ");
        } else {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + second.getName() +
                    " лучший Слизеринец на факультете. ");
        }
        ;
    }
}
