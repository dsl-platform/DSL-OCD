module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneDecimalsWithScaleOf9_3 {
    Set<Decimal(9)>? nullableSetOfOneDecimalsWithScaleOf9;

    calculated Set<Decimal(9)>? calculatedNullableSetOfOneDecimalsWithScaleOf9 from 'it => it.nullableSetOfOneDecimalsWithScaleOf9';

    calculated Set<Decimal(9)>? persistedNullableSetOfOneDecimalsWithScaleOf9 from 'it => it.nullableSetOfOneDecimalsWithScaleOf9' { persisted; }
  }
}
