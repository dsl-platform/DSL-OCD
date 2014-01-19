module CalculatedPropertyInValueSetup
{
  value NullableDecimal_4 {
    Decimal? nullableDecimal;

    calculated Decimal? calculatedNullableDecimal from 'it => it.nullableDecimal';

    calculated Decimal? persistedNullableDecimal from 'it => it.nullableDecimal' { persisted; }
  }
}
