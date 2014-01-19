module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneUrls_4 {
    Array<Url>? nullableArrayOfOneUrls;

    calculated Array<Url>? calculatedNullableArrayOfOneUrls from 'it => it.nullableArrayOfOneUrls';

    calculated Array<Url>? persistedNullableArrayOfOneUrls from 'it => it.nullableArrayOfOneUrls' { persisted; }
  }
}
