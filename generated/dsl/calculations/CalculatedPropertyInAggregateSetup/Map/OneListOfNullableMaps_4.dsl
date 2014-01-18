module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableMaps_4 {
    List<Map?> oneListOfNullableMaps;

    calculated List<Map?> calculatedOneListOfNullableMaps from 'it => it.oneListOfNullableMaps';

    calculated List<Map?> persistedOneListOfNullableMaps from 'it => it.oneListOfNullableMaps' { persisted; }
  }
}
