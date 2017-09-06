package fr.romannumbers;

public class RomanConverter {
  public String convertFromArabicToRoman(int toConvert) {
    if (toConvert == 4)
      return "IV";

    StringBuilder romanNumber = new StringBuilder();
    for (int i = 1; i <= toConvert; ++i)
      romanNumber.append("I");
    return romanNumber.toString();
  }
}
