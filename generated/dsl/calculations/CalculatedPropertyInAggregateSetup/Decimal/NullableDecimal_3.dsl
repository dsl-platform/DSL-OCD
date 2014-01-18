module CalculatedPropertyInAggregateSetup
{
  aggregate NullableDecimal_3 {
    Decimal? nullableDecimal;

    calculated Decimal? calculatedNullableDecimal from 'it => it.nullableDecimal';

    calculated Decimal? persistedNullableDecimal from 'it => it.nullableDecimal' { persisted; }
  }
}
