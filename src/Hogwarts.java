public class Hogwarts {
    public String name;
    public int wizardry;
    public int transgression;

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", wizardry=" + wizardry +
                ", transgression=" + transgression +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWizardry() {
        return wizardry;
    }

    public void setWizardry(int wizardry) {
        this.wizardry = wizardry;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public Hogwarts(String name, int wizardry, int transgression) {
        this.name = name;
        this.wizardry = wizardry;
        this.transgression = transgression;
    }

    public void compareAnyStudents(Hogwarts second) {
        if (this.getWizardry() > second.getWizardry()) {
            System.out.println(this.getName() + " сильнее, чем " + second.getName());
        } else if (this.getWizardry() == second.getWizardry()) {
            System.out.println(this.getName() + " равен по магии " + second.getName());
        } else {
            System.out.println(second.getName() + " сильнее, чем " + this.getName());
        }
        if (this.getTransgression() > second.getTransgression()) {
            System.out.println(this.getName() + " передает дальше, чем " + second.getName());
        } else if (this.getTransgression() == second.getTransgression()) {
            System.out.println(this.getName() + " передает также как " + second.getName());
        } else {
            System.out.println(second.getName() + " передает дальше, чем " + this.getName());
        }
    }
}

