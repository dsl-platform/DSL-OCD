module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneUrls_3 {
    List<Url>? nullableListOfOneUrls;

    calculated List<Url>? calculatedNullableListOfOneUrls from 'it => it.nullableListOfOneUrls';

    calculated List<Url>? persistedNullableListOfOneUrls from 'it => it.nullableListOfOneUrls' { persisted; }
  }
}
