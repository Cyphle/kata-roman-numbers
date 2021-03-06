package fr.romannumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToArabicConverterTest {
  private RomanToArabicConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new RomanToArabicConverter();
  }

  @Test
  public void should_convert_I_to_arabic_1() throws Exception {
    assertThat(converter.convert("I")).isEqualTo(1);
  }

  @Test
  public void should_convert_II_to_arabic_2() throws Exception {
    assertThat(converter.convert("II")).isEqualTo(2);
  }

  @Test
  public void should_convert_III_to_arabic_3() throws Exception {
    assertThat(converter.convert("III")).isEqualTo(3);
  }

  @Test
  public void should_convert_IV_to_arabic_4() throws Exception {
    assertThat(converter.convert("IV")).isEqualTo(4);
  }

  @Test
  public void should_convert_V_to_arabic_5() throws Exception {
    assertThat(converter.convert("V")).isEqualTo(5);
  }
}
