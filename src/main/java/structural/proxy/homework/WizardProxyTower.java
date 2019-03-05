package structural.proxy.homework;

public class WizardProxyTower implements WizardTower {

    private static final int NUM_WIZARDS_ALLOWED = 3;
    private int numWizards = 0;
    IvoryRealTower ivoryRealTower;

    public WizardProxyTower(IvoryRealTower ivoryRealTower) {
        this.ivoryRealTower = ivoryRealTower;
    }

    public void enter(Wizard wizard) {
       if(numWizards < NUM_WIZARDS_ALLOWED){
           ivoryRealTower = new IvoryRealTower();
           ivoryRealTower.enter(wizard);
           numWizards++;
       }else{
           System.out.println(wizard + " is not allowed to enter!");
       }

    }
}
