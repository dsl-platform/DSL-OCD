module CalculatedPropertyInAggregateSetup
{
  aggregate NullableDecimalWithScaleOf9_3 {
    Decimal(9)? nullableDecimalWithScaleOf9;

    calculated Decimal(9)? calculatedNullableDecimalWithScaleOf9 from 'it => it.nullableDecimalWithScaleOf9';

    calculated Decimal(9)? persistedNullableDecimalWithScaleOf9 from 'it => it.nullableDecimalWithScaleOf9' { persisted; }
  }
}
