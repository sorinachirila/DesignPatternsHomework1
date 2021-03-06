# DesignPatternsHomework1
Implement the following Design Patterns
- Creational
    - Factory Method
        - Implement Factory pattern by constructing a ‘FileConverter’ factory, following the steps in the code implemented at the course.
        - It will build three different file converters based on the type received as parameter
        - These three file converters will be (class names)
            - ‘AsciiConverter’
            - ‘PostScriptConverter’
            - ‘PdfConverter’
        - The types received as parameters will be 
            - ASCII
            - PS
            - PDF
    - Builder
        - Implement Builder pattern by constructing a ‘ShopBuilder’, following the steps in the code implemented at the course.
        - The objects that will be constructed will be (class names)
            - ‘Shop’ (with the following fields)
                - String roof
                - String floor
                - String walls
            - ‘ShopBuilder’ (BUILDER)
                - CarrefourBuilder
                - AuchanBuilder
                - KauflandBuilder
            - ‘ShopDirector’ (DIRECTOR)
            - ‘ShopBuilderDemo’ - main class that exercise the functionality of the pattern
- Structural 
    - Decorator
        - Implement Decorator pattern by constructing a ‘CarDecorator’, following the steps in the code implemented at the course.
        - The decorator will work for the following car types (class names)
            - Mercedes
            - Fiat
            - Subaru
        - The decorators will be (class names):
            - Climatronic
            - RadioMP3
            - LeatherSeats
            - LEDHeadlights
    - Proxy
        - Implement Proxy pattern by constructing the classes below, following the steps in the code implemented at the course.
            - class ‘Wizard’ (will be used instead of ‘filename’ used at the course)
                - filed:
                    - private String name
                - constructor
                - override ‘toString’ to return name;
            - Interface ‘WizardTower’ - with one method
                - enter(Wizard wizard)
            - class ‘IvoryRealTower’ implements ‘WizardTower’
                - no fields 
                - one method
                    - enter(wizard)
                        - sout(wizard + “enters the tower…”);
            - class ‘WizardProxyTower’ implements ‘WizardTower’
                - fields:
                    - private static final int NUM_WIZARDS_ALLOWED = 3;
                    - private int numWizards
                    - IvoryRealTower tower (tower to be proxied)
                - constructor 
                    - WizardProxyTower(IvoryRealTower)
                        - initialize tower only
                - method:
                    - enter(wizard)
                        - if numWizards < NUM_WIZARDS_ALLOWED
                            - allow wizard to enter
                            - increment numWizards
                        - else 
                            - sout(wizard + “is not allowed to enter!”)
            - class ‘ProxyPatternDemo’
                - instantiate a new Proxy Tower 
                    - WizardProxyTower proxy = new WizardProxyTower(new IvoryRealTower())
                - let wizards to enter tower...
                    - proxy.enter(new Wizard("RED wizard"));
                    - proxy.enter(new Wizard("GREEN wizard"));
                    - proxy.enter(new Wizard("BLUE wizard"));
                    - proxy.enter(new Wizard("WHITE wizard"));
                    - proxy.enter(new Wizard("BLACK wizard"));
- Behavioural
    - Chain of Responsibility
        - Implement Chain of Responsibility pattern by constructing the classes below, following the steps in the code implemented at the course
            - abstract class ‘PurchaseApproval’
                - fields:
                    - protected static final double BASE = 500
                    - protected PurchaseApproval successor
                    - abstract protected double getAllowed()
                    - abstract protected String getRole()
                    - public void setSuccessor(PurchaseApproval successor)
                    - public void processRequest (cost)
                        - if cost < getAllowed()
                            - sout (getRole() + “ will approve $ “ + cost
                        - else if successor != null
                            - successor will process the request
            - class ‘ManagerApproval’ implements PurchaseApproval
                - getAllowed() - BASE * 10
                - getRole() - “Manager”
            - class ‘DirectorApproval’ implements PurchaseApproval
                - getAllowed() - BASE * 20
                - getRole() - “Director”
            - class ‘VicePresidentApproval’
                - getAllowed() - BASE * 40
                - getRole() - “Vice President”
            - class ‘ChainPatternDemo’
                - public static PurchaseApproval getChainOfApprovers()
                - public static void main()
                    - approversChain = getChainOfApprovers()
                    - approversChain.processRequest(1000)
                    - approversChain.processRequest(5000)
                    - approversChain.processRequest(9000)
                    - approversChain.processRequest(10000)
                    - approversChain.processRequest(18000)
                    - approversChain.processRequest(20000)
