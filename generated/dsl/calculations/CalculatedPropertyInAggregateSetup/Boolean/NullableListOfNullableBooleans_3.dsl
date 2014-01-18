module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableBooleans_3 {
    List<Boolean?>? nullableListOfNullableBooleans;

    calculated List<Boolean?>? calculatedNullableListOfNullableBooleans from 'it => it.nullableListOfNullableBooleans';

    calculated List<Boolean?>? persistedNullableListOfNullableBooleans from 'it => it.nullableListOfNullableBooleans' { persisted; }
  }
}
