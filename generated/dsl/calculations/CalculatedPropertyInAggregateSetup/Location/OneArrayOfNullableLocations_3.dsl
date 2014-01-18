module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableLocations_3 {
    Array<Location?> oneArrayOfNullableLocations;

    calculated Array<Location?> calculatedOneArrayOfNullableLocations from 'it => it.oneArrayOfNullableLocations';

    calculated Array<Location?> persistedOneArrayOfNullableLocations from 'it => it.oneArrayOfNullableLocations' { persisted; }
  }
}
