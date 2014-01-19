module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableMaps_5 {
    Array<Map?> oneArrayOfNullableMaps;

    calculated Array<Map?> calculatedOneArrayOfNullableMaps from 'it => it.oneArrayOfNullableMaps';

    calculated Array<Map?> persistedOneArrayOfNullableMaps from 'it => it.oneArrayOfNullableMaps' { persisted; }
  }
}
