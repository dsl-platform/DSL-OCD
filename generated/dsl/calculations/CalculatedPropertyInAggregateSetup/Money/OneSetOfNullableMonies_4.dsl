module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableMonies_4 {
    Set<Money?> oneSetOfNullableMonies;

    calculated Set<Money?> calculatedOneSetOfNullableMonies from 'it => it.oneSetOfNullableMonies';

    calculated Set<Money?> persistedOneSetOfNullableMonies from 'it => it.oneSetOfNullableMonies' { persisted; }
  }
}
