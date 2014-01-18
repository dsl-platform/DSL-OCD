module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneLocations_3 {
    Array<Location>? nullableArrayOfOneLocations;

    calculated Array<Location>? calculatedNullableArrayOfOneLocations from 'it => it.nullableArrayOfOneLocations';

    calculated Array<Location>? persistedNullableArrayOfOneLocations from 'it => it.nullableArrayOfOneLocations' { persisted; }
  }
}
