package fr.romannumbers;

class RomanNumber {
  private String romanNumber;
  private int arabicValue;

  RomanNumber(String romanNumber) {
    this.romanNumber = romanNumber;
    this.arabicValue = 0;
  }

  int toArabic() {
    convertToArabic();
    return arabicValue;
  }

  private void convertToArabic() {
    for (int i = 0; i < romanNumber.length(); ++i) {
      NumbersCorrespondence correspondence = NumbersCorrespondence.findByRoman(String.valueOf(romanNumber.charAt(i)));
      int valueToAdd = correspondence.arabicValue;

      if (isADoubleCharRomanValue(i, correspondence)) {
        NumbersCorrespondence doubleCharRomanValue = NumbersCorrespondence.findByRoman(romanNumber.substring(i, i + 2));
        valueToAdd = doubleCharRomanValue.arabicValue;
        i += 1;
      }

      arabicValue += valueToAdd;
    }
  }

  private boolean isADoubleCharRomanValue(int i, NumbersCorrespondence correspondence) {
    return hasNextChar(i) && hasNextCharAHigherArabicValueThan(i + 1, correspondence);
  }

  private boolean hasNextCharAHigherArabicValueThan(int position, NumbersCorrespondence correspondence) {
    NumbersCorrespondence nextCharCorrespondence = NumbersCorrespondence.findByRoman(String.valueOf(romanNumber.charAt(position)));
    return nextCharCorrespondence.arabicValue > correspondence.arabicValue;
  }

  private boolean hasNextChar(int position) {
    return (position + 1) < romanNumber.length();
  }
}
