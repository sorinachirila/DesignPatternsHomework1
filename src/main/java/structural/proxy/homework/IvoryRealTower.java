package structural.proxy.homework;

public class IvoryRealTower implements WizardTower {
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower...");
    }
}
