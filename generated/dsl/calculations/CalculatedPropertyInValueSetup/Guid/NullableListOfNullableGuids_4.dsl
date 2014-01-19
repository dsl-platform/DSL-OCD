module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableGuids_4 {
    List<Guid?>? nullableListOfNullableGuids;

    calculated List<Guid?>? calculatedNullableListOfNullableGuids from 'it => it.nullableListOfNullableGuids';

    calculated List<Guid?>? persistedNullableListOfNullableGuids from 'it => it.nullableListOfNullableGuids' { persisted; }
  }
}
