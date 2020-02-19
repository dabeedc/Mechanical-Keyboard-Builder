package ui;

import model.Keyboard;
import model.components.*;
import model.components.Case;

import java.util.Scanner;

// Keyboard builder application
// Citation: CPSC210 TellerApp for Scanner use
public class BuilderApp {
    private Scanner input;
    private Keyboard keyboard;

    // EFFECTS: runs the builder application
    public BuilderApp() {
        runBuilder();
    }

    // MODIFIES: this
    // EFFECTS: processes user input
    private void runBuilder() {
        boolean keepGoing = true;
        String command = null;
        input = new Scanner(System.in);

        while (keepGoing) {
            displayMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("quit")) {
                keepGoing = false;
            } else {
                processCommand(command);
            }
        }

        System.out.println("\nSee you next time!");
    }

    // MODIFIES: this
    // EFFECTS: processes user command
    private void processCommand(String command) {
        if (command.equals("information")) {
            informationMenu();
        } else if (command.equals("build")) {
            startBuild();
        } else if (command.equals("print")) {
            printBuild();
        } else {
            System.out.println("Invalid selection...");
        }
    }

    // EFFECTS: prints the build to the console
    private void printBuild() {
        System.out.println("\nHere is your completed build:");
        System.out.println("Case Specifications:");
        System.out.println(keyboard.getKeyboardCase().getCaseSize());
        System.out.println(keyboard.getKeyboardCase().getCaseMaterial());
        System.out.println("Keycaps Specifications:");
        System.out.println(keyboard.getKeyboardKeycaps().getKeycapsMaterial());
        System.out.println("Plate Specifications:");
        System.out.println(keyboard.getKeyboardPlate().getPlateMaterial());
        System.out.println(keyboard.getKeyboardPlate().getPlateSize());
        System.out.println("PCB Specifications:");
        System.out.println(keyboard.getKeyboardPrintedCircuitBoard().getPcbSize());
        System.out.println("Keyswitch Specifications:");
        System.out.println(keyboard.getKeyboardSwitches().getSwitchType());
        System.out.println("Silent? " + keyboard.getKeyboardSwitches().isSilentSwitches());
    }

    // EFFECTS: starts the building process of a keyboard
    private void startBuild() {
        keyboard = new Keyboard();
        String selection = "";
        System.out.println("What size keyboard are you interested in: small, medium, or large?");

        while (!(selection.equals("small") || (selection.equals("medium") || (selection.equals("large"))))) {
            selection = input.nextLine();
        }
        if (selection.equals("small")) {
            keyboard.getKeyboardCase().setCaseSize(selection);
        } else if (selection.equals("medium")) {
            keyboard.getKeyboardCase().setCaseSize(selection);
        } else if (selection.equals("large")) {
            keyboard.getKeyboardCase().setCaseSize(selection);
        }
        buildCaseMaterial();
    }

    // EFFECTS: Prompts for user input for case material
    private void buildCaseMaterial() {
        String selection = "";
        System.out.println("Choose a case material for your " + keyboard.getKeyboardCase().getCaseSize()
                + " keyboard: aluminum or plastic?");

        while (!(selection.equals("aluminum") || (selection.equals("plastic")))) {
            selection = input.nextLine();
            keyboard.getKeyboardCase().setCaseMaterial(selection);
        }
        if (selection.equals("aluminum")) {
            keyboard.getKeyboardCase().setCaseMaterial(selection);
        } else if (selection.equals("plastic")) {
            keyboard.getKeyboardCase().setCaseMaterial(selection);
        }
        buildKeycapsMaterial();
    }

    // EFFECTS: Prompts for user input for keycaps material
    private void buildKeycapsMaterial() {
        String selection = "";
        System.out.println("Choose a keycap material for your " + keyboard.getKeyboardCase().getCaseSize()
                + ", " + keyboard.getKeyboardCase().getCaseMaterial()
                + " keyboard: PBT or ABS");

        while (!(selection.equals("pbt") || (selection.equals("abs")))) {
            selection = input.nextLine();
            keyboard.getKeyboardKeycaps().setKeycapsMaterial(selection);
        }
        if (selection.equals("pbt")) {
            keyboard.getKeyboardKeycaps().setKeycapsMaterial(selection);
        } else if (selection.equals("abs")) {
            keyboard.getKeyboardKeycaps().setKeycapsMaterial(selection);
        }
        buildPlateMaterial();
    }

    // EFFECTS: Prompts for user input for plate material
    private void buildPlateMaterial() {
        String selection = "";
        System.out.println("Choose a plate material for your "
                + keyboard.getKeyboardCase().getCaseSize() + ", " + keyboard.getKeyboardCase().getCaseMaterial()
                + " keyboard: brass, aluminum, or polycarbonate?");

        while (!(selection.equals("brass") || (selection.equals("aluminum") || (selection.equals("polycarbonate"))))) {
            selection = input.nextLine();
            keyboard.getKeyboardPlate().setPlateMaterial(selection);
        }
        if (selection.equals("brass")) {
            keyboard.getKeyboardPlate().setPlateMaterial(selection);
        } else if (selection.equals("aluminum")) {
            keyboard.getKeyboardPlate().setPlateMaterial(selection);
        } else if (selection.equals("polycarbonate")) {
            keyboard.getKeyboardPlate().setPlateMaterial(selection);
        }
        buildPlateSize();
    }

    // EFFECTS: Prompts for user input for plate size
    private void buildPlateSize() {
        String selection = "";
        System.out.println("How large is your " + keyboard.getKeyboardPlate().getPlateMaterial() + " plate: small, "
                + "medium, or large?");

        while (!(selection.equals("small") || (selection.equals("medium") || (selection.equals("large"))))) {
            selection = input.nextLine();
            keyboard.getKeyboardPlate().setPlateSize(selection);
        }
        if (selection.equals("small")) {
            keyboard.getKeyboardPlate().setPlateSize(selection);
        } else if (selection.equals("medium")) {
            keyboard.getKeyboardPlate().setPlateSize(selection);
        } else if (selection.equals("large")) {
            keyboard.getKeyboardPlate().setPlateSize(selection);
        }
        buildPrintedCircuitBoardSize();
    }

    // EFFECTS: Prompts for user input for PCB size
    private void buildPrintedCircuitBoardSize() {
        String selection = "";
        System.out.println("Select a PCB size: small, medium or large?");

        while (!(selection.equals("small") || (selection.equals("medium") || (selection.equals("large"))))) {
            selection = input.nextLine();
            keyboard.getKeyboardPrintedCircuitBoard().setPcbSize(selection);
        }
        if (selection.equals("small")) {
            keyboard.getKeyboardPrintedCircuitBoard().setPcbSize(selection);
        } else if (selection.equals("medium")) {
            keyboard.getKeyboardPrintedCircuitBoard().setPcbSize(selection);
        } else if (selection.equals("large")) {
            keyboard.getKeyboardPrintedCircuitBoard().setPcbSize(selection);
        }
        buildSwitchesType();
    }

    // EFFECTS: Prompts for user input for key switch type
    private void buildSwitchesType() {
        String selection = "";
        System.out.println("What switches would you like to use in your keyboard: tactile, linear, or clicky?");

        while (!(selection.equals("tactile") || (selection.equals("linear") || (selection.equals("clicky"))))) {
            selection = input.nextLine();
            keyboard.getKeyboardSwitches().setSwitchType(selection);
        }
        if (selection.equals("tactile")) {
            keyboard.getKeyboardSwitches().setSwitchType(selection);
        } else if (selection.equals("linear")) {
            keyboard.getKeyboardSwitches().setSwitchType(selection);
        } else if (selection.equals("clicky")) {
            keyboard.getKeyboardSwitches().setSwitchType(selection);
        }
        buildSilentSwitches();
    }

    // EFFECTS: Prompts user for preference of silent switches or not
    private void buildSilentSwitches() {
        String selection = "";
        System.out.println("Do you want your " + keyboard.getKeyboardSwitches().getSwitchType()
                + " switches to be silent?");
        selection = input.nextLine();
        boolean b = selection.equals("yes");
        keyboard.getKeyboardSwitches().setSilentSwitches(b);
        rateKeyboard();
    }

    // EFFECTS: gives a rating of the keyboard based on typing sound, typing feel, and weight
    private void rateKeyboard() {
        System.out.println("\nOn a scale of 1 to 10: 1 being quiet, soft, and light; 10 being loud, "
                + "hard, and heavy for the typing sound, feel, and weight of the keyboard, respectively.");
        System.out.println("This is your keyboard rating:");
        keyboard.rateTheKeyboard();
        if (keyboard.getSoundRating() <= 0) {
            keyboard.setSoundRating(1);
        }
        if (keyboard.getSoundRating() >= 10) {
            keyboard.setSoundRating(10);
        }
        System.out.println("Sound level: " + keyboard.getSoundRating());
        System.out.println("Typing feel: " + keyboard.getFeelRating());
        System.out.println("Weight: " + keyboard.getWeightRating());
        stopLoop();
    }

    // EFFECTS: displays information menu to user
    private void informationMenu() {
        System.out.println("\tWhich component would you like to learn about?");
        System.out.println("\tCase");
        System.out.println("\tKeycaps");
        System.out.println("\tPlate");
        System.out.println("\tPCB");
        System.out.println("\tSwitches");
        System.out.println("\tBack to Main Menu");
        giveInformation();
    }

    // EFFECTS: prompts user to select an information item
    private String giveInformation() {
        String selection = "";
        while (!(selection.equals("case") || selection.equals("keycaps") || selection.equals("plate")
                || selection.equals("pcb") || selection.equals("switches") || selection.equals("back"))) {
            selection = input.next();
            selection = selection.toLowerCase();
        }

        if (selection.equals("case")) {
            return caseInfo();
        } else if (selection.equals("keycaps")) {
            return keycapsInfo();
        } else if (selection.equals("plate")) {
            return plateInfo();
        } else if (selection.equals("pcb")) {
            return pcbInfo();
        } else if (selection.equals("switches")) {
            return switchesInfo();
        } else if (selection.equals("back")) {
            stopLoop();
        }
        return null;
    }

    // EFFECTS: stops the loop
    private boolean stopLoop() {
        return false;
    }

    // EFFECTS: gives the user information about the case component
    private String caseInfo() {
        System.out.println(Information.CASE_INFO);
        informationMenu();
        return null;
    }

    // EFFECTS: gives the user information about the keycaps component
    private String keycapsInfo() {
        System.out.println(Information.KEYCAPS_INFO);
        informationMenu();
        return null;
    }

    // EFFECTS: gives the user information about the plate component
    private String plateInfo() {
        System.out.println(Information.PLATE_INFO);
        informationMenu();
        return null;
    }

    // EFFECTS: gives the user information about the printed circuit board component
    private String pcbInfo() {
        System.out.println(Information.PRINTEDCIRCUITBOARD_INFO);
        informationMenu();
        return null;
    }

    // EFFECTS: gives the user information about the switches
    private String switchesInfo() {
        System.out.println(Information.SWITCHES_INFO);
        informationMenu();
        return null;
    }

    // EFFECTS: displays menu of options to user
    private void displayMenu() {
        System.out.println("\nWelcome to MK Parts Picker! What would you like to do?");
        System.out.println("\tInformation");
        System.out.println("\tBuild");
        System.out.println("\tPrint");
        System.out.println("\tor quit");
    }
}