public class App {
    public static void main(String[] args) throws Exception {
        // Create an instance of StringApp
        StringApp stringApp = new StringApp();

        // Check if the substring "Java" exists in the main string
        stringApp.checkSubString("Hello, welcome to the world of Java!", "Java");

        // Count occurrences of the character 'a' in the main string
        int count = stringApp.countCharInString("Hello, welcome to the world of Java", 'a');
        System.out.println("Number of occurrences of the character: " + count);

        // Convert the main string to uppercase and print it
        String mainString = "Hello, welcome to the world of Java";
        String upperStr = stringApp.upperCaseToString(mainString);
        System.out.println("String in uppercase: " + upperStr);

        // Check if the provided strings are palindromes
        String testString1 = "BITC";
        String testString2 = "radar";
        stringApp.checkPalindrome(testString1);
        stringApp.checkPalindrome(testString2);
    }
}