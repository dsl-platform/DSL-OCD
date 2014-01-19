module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableLocations_4 {
    Set<Location?>? nullableSetOfNullableLocations;

    calculated Set<Location?>? calculatedNullableSetOfNullableLocations from 'it => it.nullableSetOfNullableLocations';

    calculated Set<Location?>? persistedNullableSetOfNullableLocations from 'it => it.nullableSetOfNullableLocations' { persisted; }
  }
}
