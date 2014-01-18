module CalculatedPropertyInAggregateSetup
{
  aggregate NullablePoint_3 {
    Point? nullablePoint;

    calculated Point? calculatedNullablePoint from 'it => it.nullablePoint';

    calculated Point? persistedNullablePoint from 'it => it.nullablePoint' { persisted; }
  }
}
