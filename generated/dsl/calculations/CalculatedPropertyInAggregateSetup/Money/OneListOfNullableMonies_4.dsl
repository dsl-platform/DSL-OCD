module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableMonies_4 {
    List<Money?> oneListOfNullableMonies;

    calculated List<Money?> calculatedOneListOfNullableMonies from 'it => it.oneListOfNullableMonies';

    calculated List<Money?> persistedOneListOfNullableMonies from 'it => it.oneListOfNullableMonies' { persisted; }
  }
}
