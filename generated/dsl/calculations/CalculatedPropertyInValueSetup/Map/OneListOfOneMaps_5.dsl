module CalculatedPropertyInValueSetup
{
  value OneListOfOneMaps_5 {
    List<Map> oneListOfOneMaps;

    calculated List<Map> calculatedOneListOfOneMaps from 'it => it.oneListOfOneMaps';

    calculated List<Map> persistedOneListOfOneMaps from 'it => it.oneListOfOneMaps' { persisted; }
  }
}
