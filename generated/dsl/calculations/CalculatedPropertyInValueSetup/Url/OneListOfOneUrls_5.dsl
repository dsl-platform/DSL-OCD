module CalculatedPropertyInValueSetup
{
  value OneListOfOneUrls_5 {
    List<Url> oneListOfOneUrls;

    calculated List<Url> calculatedOneListOfOneUrls from 'it => it.oneListOfOneUrls';

    calculated List<Url> persistedOneListOfOneUrls from 'it => it.oneListOfOneUrls' { persisted; }
  }
}
