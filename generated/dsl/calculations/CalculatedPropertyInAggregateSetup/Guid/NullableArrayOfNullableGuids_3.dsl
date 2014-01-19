module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableGuids_3 {
    Array<Guid?>? nullableArrayOfNullableGuids;

    calculated Array<Guid?>? calculatedNullableArrayOfNullableGuids from 'it => it.nullableArrayOfNullableGuids';

    calculated Array<Guid?>? persistedNullableArrayOfNullableGuids from 'it => it.nullableArrayOfNullableGuids' { persisted; }
  }
}