module CalculatedPropertyInValueSetup
{
  value NullableListOfOneStrings_4 {
    List<String>? nullableListOfOneStrings;

    calculated List<String>? calculatedNullableListOfOneStrings from 'it => it.nullableListOfOneStrings';

    calculated List<String>? persistedNullableListOfOneStrings from 'it => it.nullableListOfOneStrings' { persisted; }
  }
}
