module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneBooleans_4 {
    Array<Boolean> oneArrayOfOneBooleans;

    calculated Array<Boolean> calculatedOneArrayOfOneBooleans from 'it => it.oneArrayOfOneBooleans';

    calculated Array<Boolean> persistedOneArrayOfOneBooleans from 'it => it.oneArrayOfOneBooleans' { persisted; }
  }
}
