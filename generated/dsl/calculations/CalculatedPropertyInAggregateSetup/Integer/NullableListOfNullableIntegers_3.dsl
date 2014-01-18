module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableIntegers_3 {
    List<Integer?>? nullableListOfNullableIntegers;

    calculated List<Integer?>? calculatedNullableListOfNullableIntegers from 'it => it.nullableListOfNullableIntegers';

    calculated List<Integer?>? persistedNullableListOfNullableIntegers from 'it => it.nullableListOfNullableIntegers' { persisted; }
  }
}
