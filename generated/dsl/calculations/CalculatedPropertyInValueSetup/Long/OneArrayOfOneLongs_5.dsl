module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneLongs_5 {
    Array<Long> oneArrayOfOneLongs;

    calculated Array<Long> calculatedOneArrayOfOneLongs from 'it => it.oneArrayOfOneLongs';

    calculated Array<Long> persistedOneArrayOfOneLongs from 'it => it.oneArrayOfOneLongs' { persisted; }
  }
}
