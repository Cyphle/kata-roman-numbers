package fr.romannumbers;

public class RomanConverter {
  public String convertFromArabicToRoman(int toConvert) {
    if (toConvert == 9) return "IX";

    if (toConvert == 4) return "IV";

    StringBuilder romanNumber = new StringBuilder();
    int end = toConvert;

    if (toConvert >= 5) {
      romanNumber.append("V");
      end = toConvert - 5;
    }

    for (int i = 1; i <= end; ++i)
      romanNumber.append("I");

    return romanNumber.toString();
  }
}
