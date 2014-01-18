module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneUrls_4 {
    List<Url> oneListOfOneUrls;

    calculated List<Url> calculatedOneListOfOneUrls from 'it => it.oneListOfOneUrls';

    calculated List<Url> persistedOneListOfOneUrls from 'it => it.oneListOfOneUrls' { persisted; }
  }
}
