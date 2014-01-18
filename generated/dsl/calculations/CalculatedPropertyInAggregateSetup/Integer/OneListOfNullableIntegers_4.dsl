module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableIntegers_4 {
    List<Integer?> oneListOfNullableIntegers;

    calculated List<Integer?> calculatedOneListOfNullableIntegers from 'it => it.oneListOfNullableIntegers';

    calculated List<Integer?> persistedOneListOfNullableIntegers from 'it => it.oneListOfNullableIntegers' { persisted; }
  }
}
