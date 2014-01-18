module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneLocations_3 {
    Set<Location> oneSetOfOneLocations;

    calculated Set<Location> calculatedOneSetOfOneLocations from 'it => it.oneSetOfOneLocations';

    calculated Set<Location> persistedOneSetOfOneLocations from 'it => it.oneSetOfOneLocations' { persisted; }
  }
}
