module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableBooleans_4 {
    Array<Boolean?> oneArrayOfNullableBooleans;

    calculated Array<Boolean?> calculatedOneArrayOfNullableBooleans from 'it => it.oneArrayOfNullableBooleans';

    calculated Array<Boolean?> persistedOneArrayOfNullableBooleans from 'it => it.oneArrayOfNullableBooleans' { persisted; }
  }
}