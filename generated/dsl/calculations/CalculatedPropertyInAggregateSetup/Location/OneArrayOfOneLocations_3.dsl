module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneLocations_3 {
    Array<Location> oneArrayOfOneLocations;

    calculated Array<Location> calculatedOneArrayOfOneLocations from 'it => it.oneArrayOfOneLocations';

    calculated Array<Location> persistedOneArrayOfOneLocations from 'it => it.oneArrayOfOneLocations' { persisted; }
  }
}
