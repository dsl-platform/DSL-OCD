module CalculatedPropertyInAggregateSetup
{
  aggregate NullableGuid_3 {
    Guid? nullableGuid;

    calculated Guid? calculatedNullableGuid from 'it => it.nullableGuid';

    calculated Guid? persistedNullableGuid from 'it => it.nullableGuid' { persisted; }
  }
}
