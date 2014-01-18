module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableGuids_3 {
    Set<Guid?>? nullableSetOfNullableGuids;

    calculated Set<Guid?>? calculatedNullableSetOfNullableGuids from 'it => it.nullableSetOfNullableGuids';

    calculated Set<Guid?>? persistedNullableSetOfNullableGuids from 'it => it.nullableSetOfNullableGuids' { persisted; }
  }
}
