module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableDecimals_5 {
    Set<Decimal?> oneSetOfNullableDecimals;

    calculated Set<Decimal?> calculatedOneSetOfNullableDecimals from 'it => it.oneSetOfNullableDecimals';

    calculated Set<Decimal?> persistedOneSetOfNullableDecimals from 'it => it.oneSetOfNullableDecimals' { persisted; }
  }
}
