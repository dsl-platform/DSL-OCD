module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableLocations_4 {
    List<Location?>? nullableListOfNullableLocations;

    calculated List<Location?>? calculatedNullableListOfNullableLocations from 'it => it.nullableListOfNullableLocations';

    calculated List<Location?>? persistedNullableListOfNullableLocations from 'it => it.nullableListOfNullableLocations' { persisted; }
  }
}
