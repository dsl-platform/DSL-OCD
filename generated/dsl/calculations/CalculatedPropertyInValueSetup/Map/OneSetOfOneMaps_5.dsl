module CalculatedPropertyInValueSetup
{
  value OneSetOfOneMaps_5 {
    Set<Map> oneSetOfOneMaps;

    calculated Set<Map> calculatedOneSetOfOneMaps from 'it => it.oneSetOfOneMaps';

    calculated Set<Map> persistedOneSetOfOneMaps from 'it => it.oneSetOfOneMaps' { persisted; }
  }
}
