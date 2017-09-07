package fr.romannumbers;

public class RomanNumber {
  private String romanNumber;

  public RomanNumber(String romanNumber) {
    this.romanNumber = romanNumber;
  }

  public int toArabic() {
    int arabicValue = 0;
    for (int i = 0; i < romanNumber.length(); ++i) {
      NumbersCorrespondence correspondence = NumbersCorrespondence.findByRoman(romanNumber.substring(i, i + 1));
      NumbersCorrespondence correspondenceNextChar = correspondence;

      if ((i + 1) < romanNumber.length())
        correspondenceNextChar = NumbersCorrespondence.findByRoman(romanNumber.substring(i + 1, i + 2));

      if (correspondenceNextChar.arabicValue > correspondence.arabicValue) {
        arabicValue += NumbersCorrespondence.findByRoman(romanNumber.substring(i, i + 2)).arabicValue;
        i += 1;
      } else
        arabicValue += correspondence.arabicValue;
    }
    return arabicValue;
  }
}
