module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneLongs_3 {
    Set<Long>? nullableSetOfOneLongs;

    calculated Set<Long>? calculatedNullableSetOfOneLongs from 'it => it.nullableSetOfOneLongs';

    calculated Set<Long>? persistedNullableSetOfOneLongs from 'it => it.nullableSetOfOneLongs' { persisted; }
  }
}
