module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableMaps_5 {
    Set<Map?> oneSetOfNullableMaps;

    calculated Set<Map?> calculatedOneSetOfNullableMaps from 'it => it.oneSetOfNullableMaps';

    calculated Set<Map?> persistedOneSetOfNullableMaps from 'it => it.oneSetOfNullableMaps' { persisted; }
  }
}
