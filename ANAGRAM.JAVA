public class AnagramChecker {

  public static boolean isAnagram(String str1, String str2) {
    // Remove whitespaces (optional)
    str1 = str1.replaceAll("\\s", "");
    str2 = str2.replaceAll("\\s", "");

    // Check if lengths are equal, otherwise not anagrams
    if (str1.length() != str2.length()) {
      return false;
    }

    // Convert strings to lowercase for case-insensitive comparison
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // Create character counts for each string
    int[] charCounts = new int[26];
    for (char c : str1.toCharArray()) {
      charCounts[c - 'a']++;
    }

    // Check if characters in str2 have the same count as in str1
    for (char c : str2.toCharArray()) {
      if (charCounts[c - 'a']-- == 0) {
        return false;
      }
    }

    // If loop completes without returning false, all characters matched
    return true;
  }

  public static void main(String[] args) {
    String str1 = "silent";
    String str2 = "listen";

    if (isAnagram(str1, str2)) {
      System.out.println(str1 + " and " + str2 + " are anagrams");
    } else {
      System.out.println(str1 + " and " + str2 + " are not anagrams");
    }
  }
}
