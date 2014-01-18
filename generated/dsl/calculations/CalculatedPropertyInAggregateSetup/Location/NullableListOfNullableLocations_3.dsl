module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableLocations_3 {
    List<Location?>? nullableListOfNullableLocations;

    calculated List<Location?>? calculatedNullableListOfNullableLocations from 'it => it.nullableListOfNullableLocations';

    calculated List<Location?>? persistedNullableListOfNullableLocations from 'it => it.nullableListOfNullableLocations' { persisted; }
  }
}
