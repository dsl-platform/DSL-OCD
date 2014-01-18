module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableDecimals_4 {
    Array<Decimal?> oneArrayOfNullableDecimals;

    calculated Array<Decimal?> calculatedOneArrayOfNullableDecimals from 'it => it.oneArrayOfNullableDecimals';

    calculated Array<Decimal?> persistedOneArrayOfNullableDecimals from 'it => it.oneArrayOfNullableDecimals' { persisted; }
  }
}
