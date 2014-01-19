module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneGuids_4 {
    Set<Guid>? nullableSetOfOneGuids;

    calculated Set<Guid>? calculatedNullableSetOfOneGuids from 'it => it.nullableSetOfOneGuids';

    calculated Set<Guid>? persistedNullableSetOfOneGuids from 'it => it.nullableSetOfOneGuids' { persisted; }
  }
}
