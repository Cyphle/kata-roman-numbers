package fr.romannumbers;

class NumberConverter {
  String convertFromArabicToRoman(int toConvert) {
    StringBuilder romanNumber = new StringBuilder();
    int restToTreat = toConvert;
    while (restToTreat > 0) {
      restToTreat = buildRomanNumber(romanNumber, restToTreat);
    }
    return romanNumber.toString();
  }

  int convertFromRomanToArabic(String toConvert) {
    int arabicValue = 0;
    for (int i = 0; i < toConvert.length(); ++i) {
      NumbersCorrespondence correspondence = NumbersCorrespondence.findByRoman(toConvert.substring(i, i + 1));
      NumbersCorrespondence correspondenceNextChar = correspondence;

      if ((i + 1) < toConvert.length())
        correspondenceNextChar = NumbersCorrespondence.findByRoman(toConvert.substring(i + 1, i + 2));

      if (correspondenceNextChar.arabicValue > correspondence.arabicValue) {
        arabicValue += NumbersCorrespondence.findByRoman(toConvert.substring(i, i + 2)).arabicValue;
        i += 1;
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
