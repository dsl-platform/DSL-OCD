module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneUrls_5 {
    Array<Url> oneArrayOfOneUrls;

    calculated Array<Url> calculatedOneArrayOfOneUrls from 'it => it.oneArrayOfOneUrls';

    calculated Array<Url> persistedOneArrayOfOneUrls from 'it => it.oneArrayOfOneUrls' { persisted; }
  }
}
