module CalculatedPropertyInValueSetup
{
  value OneListOfNullableMaps_5 {
    List<Map?> oneListOfNullableMaps;

    calculated List<Map?> calculatedOneListOfNullableMaps from 'it => it.oneListOfNullableMaps';

    calculated List<Map?> persistedOneListOfNullableMaps from 'it => it.oneListOfNullableMaps' { persisted; }
  }
}
