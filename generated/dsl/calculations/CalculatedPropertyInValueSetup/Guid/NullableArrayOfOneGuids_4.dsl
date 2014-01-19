module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneGuids_4 {
    Array<Guid>? nullableArrayOfOneGuids;

    calculated Array<Guid>? calculatedNullableArrayOfOneGuids from 'it => it.nullableArrayOfOneGuids';

    calculated Array<Guid>? persistedNullableArrayOfOneGuids from 'it => it.nullableArrayOfOneGuids' { persisted; }
  }
}
