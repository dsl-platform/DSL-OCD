module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableStrings_4 {
    List<String?>? nullableListOfNullableStrings;

    calculated List<String?>? calculatedNullableListOfNullableStrings from 'it => it.nullableListOfNullableStrings';

    calculated List<String?>? persistedNullableListOfNullableStrings from 'it => it.nullableListOfNullableStrings' { persisted; }
  }
}
