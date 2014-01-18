module CalculatedPropertyInAggregateSetup
{
  aggregate NullableRectangle_3 {
    Rectangle? nullableRectangle;

    calculated Rectangle? calculatedNullableRectangle from 'it => it.nullableRectangle';

    calculated Rectangle? persistedNullableRectangle from 'it => it.nullableRectangle' { persisted; }
  }
}
