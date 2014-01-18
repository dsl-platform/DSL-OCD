module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableGuids_3 {
    List<Guid?>? nullableListOfNullableGuids;

    calculated List<Guid?>? calculatedNullableListOfNullableGuids from 'it => it.nullableListOfNullableGuids';

    calculated List<Guid?>? persistedNullableListOfNullableGuids from 'it => it.nullableListOfNullableGuids' { persisted; }
  }
}
