module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableLocations_3 {
    Array<Location?>? nullableArrayOfNullableLocations;

    calculated Array<Location?>? calculatedNullableArrayOfNullableLocations from 'it => it.nullableArrayOfNullableLocations';

    calculated Array<Location?>? persistedNullableArrayOfNullableLocations from 'it => it.nullableArrayOfNullableLocations' { persisted; }
  }
}
