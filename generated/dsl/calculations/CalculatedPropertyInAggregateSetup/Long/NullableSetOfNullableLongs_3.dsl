module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableLongs_3 {
    Set<Long?>? nullableSetOfNullableLongs;

    calculated Set<Long?>? calculatedNullableSetOfNullableLongs from 'it => it.nullableSetOfNullableLongs';

    calculated Set<Long?>? persistedNullableSetOfNullableLongs from 'it => it.nullableSetOfNullableLongs' { persisted; }
  }
}
