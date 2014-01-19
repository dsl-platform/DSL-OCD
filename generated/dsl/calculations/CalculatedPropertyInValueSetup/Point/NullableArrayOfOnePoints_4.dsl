module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOnePoints_4 {
    Array<Point>? nullableArrayOfOnePoints;

    calculated Array<Point>? calculatedNullableArrayOfOnePoints from 'it => it.nullableArrayOfOnePoints';

    calculated Array<Point>? persistedNullableArrayOfOnePoints from 'it => it.nullableArrayOfOnePoints' { persisted; }
  }
}
