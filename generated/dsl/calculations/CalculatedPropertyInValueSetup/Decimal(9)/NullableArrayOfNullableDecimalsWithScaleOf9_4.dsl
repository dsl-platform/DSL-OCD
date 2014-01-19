module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableDecimalsWithScaleOf9_4 {
    Array<Decimal(9)?>? nullableArrayOfNullableDecimalsWithScaleOf9;

    calculated Array<Decimal(9)?>? calculatedNullableArrayOfNullableDecimalsWithScaleOf9 from 'it => it.nullableArrayOfNullableDecimalsWithScaleOf9';

    calculated Array<Decimal(9)?>? persistedNullableArrayOfNullableDecimalsWithScaleOf9 from 'it => it.nullableArrayOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
