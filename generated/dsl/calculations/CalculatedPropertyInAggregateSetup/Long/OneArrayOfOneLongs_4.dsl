module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneLongs_4 {
    Array<Long> oneArrayOfOneLongs;

    calculated Array<Long> calculatedOneArrayOfOneLongs from 'it => it.oneArrayOfOneLongs';

    calculated Array<Long> persistedOneArrayOfOneLongs from 'it => it.oneArrayOfOneLongs' { persisted; }
  }
}
