module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableMonies_4 {
    Array<Money?> oneArrayOfNullableMonies;

    calculated Array<Money?> calculatedOneArrayOfNullableMonies from 'it => it.oneArrayOfNullableMonies';

    calculated Array<Money?> persistedOneArrayOfNullableMonies from 'it => it.oneArrayOfNullableMonies' { persisted; }
  }
}
