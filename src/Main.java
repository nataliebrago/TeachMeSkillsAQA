import java.util.Scanner;

import static utils.StringUtils.*;

public class Main {
    private static final String documentNumber = "1234-ABC-5678-abc-a1b2";
    private static final String documentNumber555 = "5554-acb-5678-ACB-a2b1";

    public static void main(String[] args) {
        System.out.println("\nInput string : " + documentNumber);
        getTwoNumberBlocks(documentNumber);
        replaceLetterBlocks(documentNumber);

        outputLetterBlocks(documentNumber);

        outputLetterRegisterBlocks(documentNumber);

        checkABCNumberString(documentNumber);
        checkABCNumberString(documentNumber555);

        checkStartOn555DocumentNumberString(documentNumber);
        checkStartOn555DocumentNumberString(documentNumber555);

        checkEndOn1ab2DocumentNumberString(documentNumber);
        checkEndOn1ab2DocumentNumberString(documentNumber555);
    }
}