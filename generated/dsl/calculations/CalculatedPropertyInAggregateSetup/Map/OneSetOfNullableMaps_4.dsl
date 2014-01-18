module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableMaps_4 {
    Set<Map?> oneSetOfNullableMaps;

    calculated Set<Map?> calculatedOneSetOfNullableMaps from 'it => it.oneSetOfNullableMaps';

    calculated Set<Map?> persistedOneSetOfNullableMaps from 'it => it.oneSetOfNullableMaps' { persisted; }
  }
}
