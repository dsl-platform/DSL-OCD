module CalculatedPropertyInValueSetup
{
  value NullableGuid_4 {
    Guid? nullableGuid;

    calculated Guid? calculatedNullableGuid from 'it => it.nullableGuid';

    calculated Guid? persistedNullableGuid from 'it => it.nullableGuid' { persisted; }
  }
}
