module CalculatedPropertyInValueSetup
{
  value NullablePoint_4 {
    Point? nullablePoint;

    calculated Point? calculatedNullablePoint from 'it => it.nullablePoint';

    calculated Point? persistedNullablePoint from 'it => it.nullablePoint' { persisted; }
  }
}
