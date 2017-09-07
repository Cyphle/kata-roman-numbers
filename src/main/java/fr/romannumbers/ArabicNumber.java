package fr.romannumbers;

import static fr.romannumbers.NumbersCorrespondence.ONE;

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
    int finalRestToTreat = restToTreat;
    NumbersCorrespondence correspondenceToRest = NumbersCorrespondence.getValueOrDescendingOrder()
            .stream()
            .filter(correspondence -> correspondence.isLowerOrEqualThan(finalRestToTreat))
            .findAny()
            .orElse(ONE);
    correspondenceToRest.addRomanValueTo(romanNumber);
    restToTreat = correspondenceToRest.subtractArabicValueFrom(restToTreat);

    if (doContinueRecursive(restToTreat)) convertToRoman(restToTreat);
  }

  private boolean doContinueRecursive(int restToTreat) {
    return restToTreat > 0;
  }
}
