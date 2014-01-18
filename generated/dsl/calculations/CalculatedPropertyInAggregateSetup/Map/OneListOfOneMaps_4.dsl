module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneMaps_4 {
    List<Map> oneListOfOneMaps;

    calculated List<Map> calculatedOneListOfOneMaps from 'it => it.oneListOfOneMaps';

    calculated List<Map> persistedOneListOfOneMaps from 'it => it.oneListOfOneMaps' { persisted; }
  }
}
