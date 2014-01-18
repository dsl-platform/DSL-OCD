module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneMonies_4 {
    Set<Money> oneSetOfOneMonies;

    calculated Set<Money> calculatedOneSetOfOneMonies from 'it => it.oneSetOfOneMonies';

    calculated Set<Money> persistedOneSetOfOneMonies from 'it => it.oneSetOfOneMonies' { persisted; }
  }
}
