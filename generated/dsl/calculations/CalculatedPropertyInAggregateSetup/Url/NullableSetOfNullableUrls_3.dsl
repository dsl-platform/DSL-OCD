module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableUrls_3 {
    Set<Url?>? nullableSetOfNullableUrls;

    calculated Set<Url?>? calculatedNullableSetOfNullableUrls from 'it => it.nullableSetOfNullableUrls';

    calculated Set<Url?>? persistedNullableSetOfNullableUrls from 'it => it.nullableSetOfNullableUrls' { persisted; }
  }
}
