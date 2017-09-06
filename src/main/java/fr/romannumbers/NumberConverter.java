package fr.romannumbers;

public class NumberConverter {
  public String convertFromArabicToRoman(int toConvert) {
    StringBuilder romanNumber = new StringBuilder();
    int restToTreat = toConvert;
    while (restToTreat > 0) {
      restToTreat = buildRomanNumber(romanNumber, restToTreat);
    }
    return romanNumber.toString();
  }

  private int buildRomanNumber(StringBuilder romanNumber, int restToTreat) {
    for (NumbersCorrespondence correspondence : NumbersCorrespondence.values()) {
      restToTreat = findRomanValue(romanNumber, restToTreat, correspondence);
    }
    return restToTreat;
  }

  private int findRomanValue(StringBuilder romanNumber, int restToTreat, NumbersCorrespondence correspondence) {
    if (restToTreat >= correspondence.arabicValue) {
      romanNumber.append(correspondence.romanValue);
      restToTreat -= correspondence.arabicValue;
    }
    return restToTreat;
  }
}
