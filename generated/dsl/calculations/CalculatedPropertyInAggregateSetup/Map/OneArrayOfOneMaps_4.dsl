module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneMaps_4 {
    Array<Map> oneArrayOfOneMaps;

    calculated Array<Map> calculatedOneArrayOfOneMaps from 'it => it.oneArrayOfOneMaps';

    calculated Array<Map> persistedOneArrayOfOneMaps from 'it => it.oneArrayOfOneMaps' { persisted; }
  }
}
