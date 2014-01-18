module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOnePoints_3 {
    Array<Point>? nullableArrayOfOnePoints;

    calculated Array<Point>? calculatedNullableArrayOfOnePoints from 'it => it.nullableArrayOfOnePoints';

    calculated Array<Point>? persistedNullableArrayOfOnePoints from 'it => it.nullableArrayOfOnePoints' { persisted; }
  }
}
