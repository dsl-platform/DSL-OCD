module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableDecimals_4 {
    Set<Decimal?>? nullableSetOfNullableDecimals;

    calculated Set<Decimal?>? calculatedNullableSetOfNullableDecimals from 'it => it.nullableSetOfNullableDecimals';

    calculated Set<Decimal?>? persistedNullableSetOfNullableDecimals from 'it => it.nullableSetOfNullableDecimals' { persisted; }
  }
}
