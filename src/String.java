class StringApp {
    public void checkSubString(String mainString, String subString) {
        if (mainString.contains(subString)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }

    public int countCharInString(String mainString, char character) {
        int count = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public String upperCaseToString(String mainString) {
        return mainString.toUpperCase();
    }

    public void checkPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
