package fr.romannumbers;

public class RomanToArabicConverter {
  public RomanToArabicConverter() {
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
}