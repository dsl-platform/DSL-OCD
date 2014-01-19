module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableMonies_5 {
    Set<Money?> oneSetOfNullableMonies;

    calculated Set<Money?> calculatedOneSetOfNullableMonies from 'it => it.oneSetOfNullableMonies';

    calculated Set<Money?> persistedOneSetOfNullableMonies from 'it => it.oneSetOfNullableMonies' { persisted; }
  }
}
