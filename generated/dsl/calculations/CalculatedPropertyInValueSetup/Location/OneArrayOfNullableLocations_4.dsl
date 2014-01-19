module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableLocations_4 {
    Array<Location?> oneArrayOfNullableLocations;

    calculated Array<Location?> calculatedOneArrayOfNullableLocations from 'it => it.oneArrayOfNullableLocations';

    calculated Array<Location?> persistedOneArrayOfNullableLocations from 'it => it.oneArrayOfNullableLocations' { persisted; }
  }
}
