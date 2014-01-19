module CalculatedPropertyInValueSetup
{
  value NullableListOfOneLocations_4 {
    List<Location>? nullableListOfOneLocations;

    calculated List<Location>? calculatedNullableListOfOneLocations from 'it => it.nullableListOfOneLocations';

    calculated List<Location>? persistedNullableListOfOneLocations from 'it => it.nullableListOfOneLocations' { persisted; }
  }
}
