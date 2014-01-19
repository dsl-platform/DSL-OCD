module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableGuids_4 {
    Set<Guid?>? nullableSetOfNullableGuids;

    calculated Set<Guid?>? calculatedNullableSetOfNullableGuids from 'it => it.nullableSetOfNullableGuids';

    calculated Set<Guid?>? persistedNullableSetOfNullableGuids from 'it => it.nullableSetOfNullableGuids' { persisted; }
  }
}
