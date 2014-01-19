module CalculatedPropertyInValueSetup
{
  value OneListOfNullableLocations_4 {
    List<Location?> oneListOfNullableLocations;

    calculated List<Location?> calculatedOneListOfNullableLocations from 'it => it.oneListOfNullableLocations';

    calculated List<Location?> persistedOneListOfNullableLocations from 'it => it.oneListOfNullableLocations' { persisted; }
  }
}
