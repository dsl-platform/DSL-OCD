module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableLongs_3 {
    List<Long?>? nullableListOfNullableLongs;

    calculated List<Long?>? calculatedNullableListOfNullableLongs from 'it => it.nullableListOfNullableLongs';

    calculated List<Long?>? persistedNullableListOfNullableLongs from 'it => it.nullableListOfNullableLongs' { persisted; }
  }
}
