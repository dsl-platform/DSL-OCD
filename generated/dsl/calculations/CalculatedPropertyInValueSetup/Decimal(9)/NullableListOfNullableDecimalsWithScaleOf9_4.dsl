module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableDecimalsWithScaleOf9_4 {
    List<Decimal(9)?>? nullableListOfNullableDecimalsWithScaleOf9;

    calculated List<Decimal(9)?>? calculatedNullableListOfNullableDecimalsWithScaleOf9 from 'it => it.nullableListOfNullableDecimalsWithScaleOf9';

    calculated List<Decimal(9)?>? persistedNullableListOfNullableDecimalsWithScaleOf9 from 'it => it.nullableListOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
