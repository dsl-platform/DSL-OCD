module CalculatedPropertyInValueSetup
{
  value OneSetOfOneUrls_5 {
    Set<Url> oneSetOfOneUrls;

    calculated Set<Url> calculatedOneSetOfOneUrls from 'it => it.oneSetOfOneUrls';

    calculated Set<Url> persistedOneSetOfOneUrls from 'it => it.oneSetOfOneUrls' { persisted; }
  }
}
