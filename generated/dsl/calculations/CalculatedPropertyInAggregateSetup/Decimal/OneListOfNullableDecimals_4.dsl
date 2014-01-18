module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableDecimals_4 {
    List<Decimal?> oneListOfNullableDecimals;

    calculated List<Decimal?> calculatedOneListOfNullableDecimals from 'it => it.oneListOfNullableDecimals';

    calculated List<Decimal?> persistedOneListOfNullableDecimals from 'it => it.oneListOfNullableDecimals' { persisted; }
  }
}
