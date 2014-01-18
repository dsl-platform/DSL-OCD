module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableBooleans_4 {
    Set<Boolean?> oneSetOfNullableBooleans;

    calculated Set<Boolean?> calculatedOneSetOfNullableBooleans from 'it => it.oneSetOfNullableBooleans';

    calculated Set<Boolean?> persistedOneSetOfNullableBooleans from 'it => it.oneSetOfNullableBooleans' { persisted; }
  }
}
