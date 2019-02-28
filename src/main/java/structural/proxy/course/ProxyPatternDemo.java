package structural.proxy.course;

public class ProxyPatternDemo {
    public static void main(String[] args) {

        WizardTour proxy = new WizardProxyTower(new IvoryRealTower());
        proxy.enter(new Wizard("RED wizard"));
        proxy.enter(new Wizard("GREEN wizard"));
        proxy.enter(new Wizard("BLUE wizard"));
        proxy.enter(new Wizard("WHITE wizard"));
        proxy.enter(new Wizard("BLACK wizard"));

//        RED wizard enters the tower...
//        GREEN wizard enters the tower...
//        BLUE wizard enters the tower...
//        WHITE wizard is not allowed to enter!
//        BLACK wizard is not allowed to enter!
    }

}
