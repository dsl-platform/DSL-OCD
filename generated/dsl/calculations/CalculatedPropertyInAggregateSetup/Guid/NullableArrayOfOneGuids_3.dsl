module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneGuids_3 {
    Array<Guid>? nullableArrayOfOneGuids;

    calculated Array<Guid>? calculatedNullableArrayOfOneGuids from 'it => it.nullableArrayOfOneGuids';

    calculated Array<Guid>? persistedNullableArrayOfOneGuids from 'it => it.nullableArrayOfOneGuids' { persisted; }
  }
}
