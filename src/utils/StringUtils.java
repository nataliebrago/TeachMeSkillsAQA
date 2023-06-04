package utils;

public class StringUtils {

    public static void getTwoNumberBlocks(String inputString){
        String resultString = "";
        try {
            resultString = inputString.substring(0,4)  +  inputString.substring(9,13);
            System.out.println("\nResult two blocks : " + resultString);
        }
        catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }

    public static void outputLetterBlocks(String inputString){
        String resultString = "";
        try {
            resultString = inputString.substring(5,8)  + "/" +  inputString.substring(14,17)  + "/" + inputString.charAt(18) + "/" + inputString.charAt(20);
            System.out.println("\nOutput only letters: " + resultString);
        }
        catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }

    public static void outputLetterRegisterBlocks(String inputString){
        StringBuilder mStringBuilder = new StringBuilder("Letters:");
        try {
            mStringBuilder = mStringBuilder.append(inputString.substring(5,8)).append("/")
                            .append(inputString.substring(14,17)).append("/").append( inputString.charAt(18))
                            .append("/").append(inputString.charAt(20));
            System.out.println("\n" + mStringBuilder);
        }
        catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }

    public static void replaceLetterBlocks(String inputString){
        String resultString = "";
        try {
            resultString = inputString.substring(0,5)  + "***" +   inputString.substring(8,14) + "***" + inputString.substring(17,inputString.length());
            System.out.println("\nResult replace letter blocks : " + resultString);
        }
        catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }

    public static void checkABCNumberString(String inputString){
        try {
            if(inputString.contains("ABC") || inputString.contains("abc") )
                System.out.println("\nDocument contains abc(ABC)");
            else
                System.out.println("\nDocument not contains abc(ABC)");
        }
        catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }

    public static void checkStartOn555DocumentNumberString(String inputString){
        String resultString = "";
        try {
            resultString = inputString.substring(0,3);
            if(resultString.equals("555"))
                System.out.println("\nDocument number start : 555");
            else
                System.out.println("\nDocument number start : " + resultString);
        }
        catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }

    public static void checkEndOn1ab2DocumentNumberString(String inputString){
        String resultString = "";
        try {
            resultString = inputString.substring(18,inputString.length());
            if(resultString.equals("1ab2"))
                System.out.println("\nDocument number end : 1ab2");
            else
                System.out.println("\nDocument number end : " + resultString);
        }
        catch (Exception ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }
}
