module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneUrls_4 {
    Array<Url> oneArrayOfOneUrls;

    calculated Array<Url> calculatedOneArrayOfOneUrls from 'it => it.oneArrayOfOneUrls';

    calculated Array<Url> persistedOneArrayOfOneUrls from 'it => it.oneArrayOfOneUrls' { persisted; }
  }
}
