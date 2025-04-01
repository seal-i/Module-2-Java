// Custom exception class
class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}

public class BinaryConverter {

    // Method to convert binary string to decimal
    public static int bin2Dec(String binary) throws BinaryFormatException {
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary character: '" + ch + "'");
            }
        }

        // If we get here, input is valid
        return Integer.parseInt(binary, 2);
    }

    // Main method to test
    public static void main(String[] args) {
        String[] testInputs = {"101010", "10012", "1101", "abc"};

        for (String input : testInputs) {
            try {
                int decimal = bin2Dec(input);
                System.out.println("Binary: " + input + " → Decimal: " + decimal);
            } catch (BinaryFormatException e) {
                System.out.println("Binary: " + input + " → Error: " + e.getMessage());
            }
        }
    }
}
