module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableDecimalsWithScaleOf9_3 {
    List<Decimal(9)?>? nullableListOfNullableDecimalsWithScaleOf9;

    calculated List<Decimal(9)?>? calculatedNullableListOfNullableDecimalsWithScaleOf9 from 'it => it.nullableListOfNullableDecimalsWithScaleOf9';

    calculated List<Decimal(9)?>? persistedNullableListOfNullableDecimalsWithScaleOf9 from 'it => it.nullableListOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
