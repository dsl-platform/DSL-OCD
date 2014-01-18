module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneUrls_3 {
    Set<Url>? nullableSetOfOneUrls;

    calculated Set<Url>? calculatedNullableSetOfOneUrls from 'it => it.nullableSetOfOneUrls';

    calculated Set<Url>? persistedNullableSetOfOneUrls from 'it => it.nullableSetOfOneUrls' { persisted; }
  }
}
