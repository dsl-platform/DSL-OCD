module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneGuids_3 {
    Set<Guid>? nullableSetOfOneGuids;

    calculated Set<Guid>? calculatedNullableSetOfOneGuids from 'it => it.nullableSetOfOneGuids';

    calculated Set<Guid>? persistedNullableSetOfOneGuids from 'it => it.nullableSetOfOneGuids' { persisted; }
  }
}
