module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneDecimalsWithScaleOf9_3 {
    List<Decimal(9)>? nullableListOfOneDecimalsWithScaleOf9;

    calculated List<Decimal(9)>? calculatedNullableListOfOneDecimalsWithScaleOf9 from 'it => it.nullableListOfOneDecimalsWithScaleOf9';

    calculated List<Decimal(9)>? persistedNullableListOfOneDecimalsWithScaleOf9 from 'it => it.nullableListOfOneDecimalsWithScaleOf9' { persisted; }
  }
}
