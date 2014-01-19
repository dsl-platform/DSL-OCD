module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableDecimals_5 {
    Array<Decimal?> oneArrayOfNullableDecimals;

    calculated Array<Decimal?> calculatedOneArrayOfNullableDecimals from 'it => it.oneArrayOfNullableDecimals';

    calculated Array<Decimal?> persistedOneArrayOfNullableDecimals from 'it => it.oneArrayOfNullableDecimals' { persisted; }
  }
}
