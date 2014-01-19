module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableUrls_4 {
    List<Url?>? nullableListOfNullableUrls;

    calculated List<Url?>? calculatedNullableListOfNullableUrls from 'it => it.nullableListOfNullableUrls';

    calculated List<Url?>? persistedNullableListOfNullableUrls from 'it => it.nullableListOfNullableUrls' { persisted; }
  }
}
