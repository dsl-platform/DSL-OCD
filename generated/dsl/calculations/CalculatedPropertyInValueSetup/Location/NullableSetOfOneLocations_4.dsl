module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneLocations_4 {
    Set<Location>? nullableSetOfOneLocations;

    calculated Set<Location>? calculatedNullableSetOfOneLocations from 'it => it.nullableSetOfOneLocations';

    calculated Set<Location>? persistedNullableSetOfOneLocations from 'it => it.nullableSetOfOneLocations' { persisted; }
  }
}
