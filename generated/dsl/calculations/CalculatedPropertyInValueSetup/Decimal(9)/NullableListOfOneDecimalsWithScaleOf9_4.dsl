module CalculatedPropertyInValueSetup
{
  value NullableListOfOneDecimalsWithScaleOf9_4 {
    List<Decimal(9)>? nullableListOfOneDecimalsWithScaleOf9;

    calculated List<Decimal(9)>? calculatedNullableListOfOneDecimalsWithScaleOf9 from 'it => it.nullableListOfOneDecimalsWithScaleOf9';

    calculated List<Decimal(9)>? persistedNullableListOfOneDecimalsWithScaleOf9 from 'it => it.nullableListOfOneDecimalsWithScaleOf9' { persisted; }
  }
}
