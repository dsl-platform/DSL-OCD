module CalculatedPropertyInValueSetup
{
  value OneListOfOneMonies_5 {
    List<Money> oneListOfOneMonies;

    calculated List<Money> calculatedOneListOfOneMonies from 'it => it.oneListOfOneMonies';

    calculated List<Money> persistedOneListOfOneMonies from 'it => it.oneListOfOneMonies' { persisted; }
  }
}
