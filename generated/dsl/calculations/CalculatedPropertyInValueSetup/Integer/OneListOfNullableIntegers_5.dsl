module CalculatedPropertyInValueSetup
{
  value OneListOfNullableIntegers_5 {
    List<Integer?> oneListOfNullableIntegers;

    calculated List<Integer?> calculatedOneListOfNullableIntegers from 'it => it.oneListOfNullableIntegers';

    calculated List<Integer?> persistedOneListOfNullableIntegers from 'it => it.oneListOfNullableIntegers' { persisted; }
  }
}
