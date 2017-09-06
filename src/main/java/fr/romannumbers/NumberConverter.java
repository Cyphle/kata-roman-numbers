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

  public int convertFromRomanToArabic(String toConvert) {
    int arabicValue = 0;
    for (int i = 0; i < toConvert.length(); ++i) {
      NumbersCorrespondence correspondence = NumbersCorrespondence.findByRoman(toConvert.substring(i, i + 1));

      if ((i + 1) < toConvert.length()) {
        NumbersCorrespondence correspondenceNextChar = NumbersCorrespondence.findByRoman(toConvert.substring(i + 1, i + 2));
        if (correspondenceNextChar.arabicValue > correspondence.arabicValue) {
          NumbersCorrespondence doubleCharCorrespondence = NumbersCorrespondence.findByRoman(toConvert.substring(i, i + 2));
          arabicValue += doubleCharCorrespondence.arabicValue;
          i += 1;
        } else
          arabicValue += correspondence.arabicValue;
      } else
        arabicValue += correspondence.arabicValue;
    }

    return arabicValue;
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
