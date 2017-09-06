package fr.romannumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterTest {

  private RomanConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new RomanConverter();
  }

  @Test
  public void should_convert_arabic_1_to_roman_I() throws Exception {
    assertThat(converter.convertFromArabicToRoman(1)).isEqualTo("I");
  }

  @Test
  public void should_convert_arabic_2_to_roman_II() throws Exception {
    assertThat(converter.convertFromArabicToRoman(2)).isEqualTo("II");
  }

  @Test
  public void should_convert_arabic_3_to_roman_III() throws Exception {
    assertThat(converter.convertFromArabicToRoman(3)).isEqualTo("III");
  }

  @Test
  public void should_convert_arabic_4_to_roman_IV() throws Exception {
    assertThat(converter.convertFromArabicToRoman(4)).isEqualTo("IV");
  }

  @Test
  public void should_convert_arabic_5_to_roman_V() throws Exception {
    assertThat(converter.convertFromArabicToRoman(5)).isEqualTo("V");
  }

  @Test
  public void should_convert_arabic_6_to_roman_VI() throws Exception {
    assertThat(converter.convertFromArabicToRoman(6)).isEqualTo("VI");
  }

  @Test
  public void should_convert_7_8_to_roman_VII_VIII() throws Exception {
    assertThat(converter.convertFromArabicToRoman(7)).isEqualTo("VII");
    assertThat(converter.convertFromArabicToRoman(8)).isEqualTo("VIII");
  }

  @Test
  public void should_convert_9_to_roman_IX() throws Exception {
    assertThat(converter.convertFromArabicToRoman(9)).isEqualTo("IX");
  }

  @Test
  public void should_convert_10_to_roman_X() throws Exception {
    assertThat(converter.convertFromArabicToRoman(10)).isEqualTo("X");
  }
}
