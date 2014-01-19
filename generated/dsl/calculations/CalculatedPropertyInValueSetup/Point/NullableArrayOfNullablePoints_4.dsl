module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullablePoints_4 {
    Array<Point?>? nullableArrayOfNullablePoints;

    calculated Array<Point?>? calculatedNullableArrayOfNullablePoints from 'it => it.nullableArrayOfNullablePoints';

    calculated Array<Point?>? persistedNullableArrayOfNullablePoints from 'it => it.nullableArrayOfNullablePoints' { persisted; }
  }
}
