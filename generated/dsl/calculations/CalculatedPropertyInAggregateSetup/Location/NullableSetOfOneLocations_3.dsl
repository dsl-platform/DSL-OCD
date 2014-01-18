module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneLocations_3 {
    Set<Location>? nullableSetOfOneLocations;

    calculated Set<Location>? calculatedNullableSetOfOneLocations from 'it => it.nullableSetOfOneLocations';

    calculated Set<Location>? persistedNullableSetOfOneLocations from 'it => it.nullableSetOfOneLocations' { persisted; }
  }
}
