module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneUrls_3 {
    Array<Url>? nullableArrayOfOneUrls;

    calculated Array<Url>? calculatedNullableArrayOfOneUrls from 'it => it.nullableArrayOfOneUrls';

    calculated Array<Url>? persistedNullableArrayOfOneUrls from 'it => it.nullableArrayOfOneUrls' { persisted; }
  }
}
