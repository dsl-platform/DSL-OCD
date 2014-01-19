module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableDecimalsWithScaleOf9_4 {
    Set<Decimal(9)?>? nullableSetOfNullableDecimalsWithScaleOf9;

    calculated Set<Decimal(9)?>? calculatedNullableSetOfNullableDecimalsWithScaleOf9 from 'it => it.nullableSetOfNullableDecimalsWithScaleOf9';

    calculated Set<Decimal(9)?>? persistedNullableSetOfNullableDecimalsWithScaleOf9 from 'it => it.nullableSetOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
