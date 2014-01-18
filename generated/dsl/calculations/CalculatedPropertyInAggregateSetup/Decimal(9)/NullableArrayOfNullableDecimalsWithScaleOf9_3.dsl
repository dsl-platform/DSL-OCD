module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableDecimalsWithScaleOf9_3 {
    Array<Decimal(9)?>? nullableArrayOfNullableDecimalsWithScaleOf9;

    calculated Array<Decimal(9)?>? calculatedNullableArrayOfNullableDecimalsWithScaleOf9 from 'it => it.nullableArrayOfNullableDecimalsWithScaleOf9';

    calculated Array<Decimal(9)?>? persistedNullableArrayOfNullableDecimalsWithScaleOf9 from 'it => it.nullableArrayOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
