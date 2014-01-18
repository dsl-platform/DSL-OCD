module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneGuids_3 {
    List<Guid>? nullableListOfOneGuids;

    calculated List<Guid>? calculatedNullableListOfOneGuids from 'it => it.nullableListOfOneGuids';

    calculated List<Guid>? persistedNullableListOfOneGuids from 'it => it.nullableListOfOneGuids' { persisted; }
  }
}
