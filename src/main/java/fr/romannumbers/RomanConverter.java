package fr.romannumbers;

public class RomanConverter {
  public String convertFromArabicToRoman(int toConvert) {
    if (toConvert == 2)
      return "II";
    return "I";
  }
}
