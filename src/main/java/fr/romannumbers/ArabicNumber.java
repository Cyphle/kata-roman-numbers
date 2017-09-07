package fr.romannumbers;

public class ArabicNumber {
  private final StringBuilder romanNumber;
  private int arabicNumber;

  public ArabicNumber(int arabicNumber) {
    this.arabicNumber = arabicNumber;
    this.romanNumber = new StringBuilder();
  }

  public String toRoman() {
    convertToRoman(this.arabicNumber);
    return romanNumber.toString();
  }

  private void convertToRoman(int restToTreat) {
    if (restToTreat > 0) {
      for (NumbersCorrespondence correspondence : NumbersCorrespondence.values()) {
        if (restToTreat >= correspondence.arabicValue) {
          romanNumber.append(correspondence.romanValue);
          restToTreat -= correspondence.arabicValue;
        }
      }
      convertToRoman(restToTreat);
    }
  }
}