package structural.proxy.course;

public class IvoryRealTower implements WizardTour {
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower...");
    }
}
