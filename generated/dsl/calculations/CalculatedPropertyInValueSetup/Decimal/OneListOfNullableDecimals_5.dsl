module CalculatedPropertyInValueSetup
{
  value OneListOfNullableDecimals_5 {
    List<Decimal?> oneListOfNullableDecimals;

    calculated List<Decimal?> calculatedOneListOfNullableDecimals from 'it => it.oneListOfNullableDecimals';

    calculated List<Decimal?> persistedOneListOfNullableDecimals from 'it => it.oneListOfNullableDecimals' { persisted; }
  }
}
