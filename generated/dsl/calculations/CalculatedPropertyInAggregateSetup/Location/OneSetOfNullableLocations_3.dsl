module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableLocations_3 {
    Set<Location?> oneSetOfNullableLocations;

    calculated Set<Location?> calculatedOneSetOfNullableLocations from 'it => it.oneSetOfNullableLocations';

    calculated Set<Location?> persistedOneSetOfNullableLocations from 'it => it.oneSetOfNullableLocations' { persisted; }
  }
}
