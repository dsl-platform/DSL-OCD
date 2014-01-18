module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneIntegers_3 {
    List<Integer>? nullableListOfOneIntegers;

    calculated List<Integer>? calculatedNullableListOfOneIntegers from 'it => it.nullableListOfOneIntegers';

    calculated List<Integer>? persistedNullableListOfOneIntegers from 'it => it.nullableListOfOneIntegers' { persisted; }
  }
}
