module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableBooleans_4 {
    List<Boolean?> oneListOfNullableBooleans;

    calculated List<Boolean?> calculatedOneListOfNullableBooleans from 'it => it.oneListOfNullableBooleans';

    calculated List<Boolean?> persistedOneListOfNullableBooleans from 'it => it.oneListOfNullableBooleans' { persisted; }
  }
}
