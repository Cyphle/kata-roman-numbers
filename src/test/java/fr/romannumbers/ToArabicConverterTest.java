package fr.romannumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToArabicConverterTest {

  private NumberConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new NumberConverter();
  }

  @Test
  public void should_convert_I_to_arabic_1() throws Exception {
    assertThat(converter.convertFromRomanToArabic("I")).isEqualTo(1);
  }

  @Test
  public void should_convert_II_to_arabic_2() throws Exception {
    assertThat(converter.convertFromRomanToArabic("II")).isEqualTo(2);
  }

  @Test
  public void should_convert_III_to_arabic_3() throws Exception {
    assertThat(converter.convertFromRomanToArabic("III")).isEqualTo(3);
  }
}
