module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneDecimalsWithScaleOf9_4 {
    Array<Decimal(9)>? nullableArrayOfOneDecimalsWithScaleOf9;

    calculated Array<Decimal(9)>? calculatedNullableArrayOfOneDecimalsWithScaleOf9 from 'it => it.nullableArrayOfOneDecimalsWithScaleOf9';

    calculated Array<Decimal(9)>? persistedNullableArrayOfOneDecimalsWithScaleOf9 from 'it => it.nullableArrayOfOneDecimalsWithScaleOf9' { persisted; }
  }
}
