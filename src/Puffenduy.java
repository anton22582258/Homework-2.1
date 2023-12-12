public class Puffenduy extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public Puffenduy(String name, int wizardry, int transgression,
                     int hardWork, int loyalty, int honesty) {
        super(name, wizardry, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                " name='" + name + '\'' +
                ", wizardry=" + wizardry +
                ", transgression=" + transgression +
                ", hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void compareSummPuffenduy(Puffenduy second) {
        int summ1 = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int summ2 = second.getHardWork() + second.getLoyalty() + second.getHonesty();
        if (summ1 > summ2) {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + this.getName() +
                    " лучший Пуффендуец на факультете. ");
        } else {
            System.out.println(" У " + this.getName() + " " + summ1 + " баллов. У "
                    + second.getName() + " " + summ2 + " баллов. " + second.getName() +
                    " лучший Пуффендуец на факультете. ");
        }
        ;
    }
}

