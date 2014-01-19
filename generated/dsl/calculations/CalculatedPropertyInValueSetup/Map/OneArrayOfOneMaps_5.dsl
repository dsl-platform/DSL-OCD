module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneMaps_5 {
    Array<Map> oneArrayOfOneMaps;

    calculated Array<Map> calculatedOneArrayOfOneMaps from 'it => it.oneArrayOfOneMaps';

    calculated Array<Map> persistedOneArrayOfOneMaps from 'it => it.oneArrayOfOneMaps' { persisted; }
  }
}
