module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableRectangles_4 {
    Array<Rectangle?>? nullableArrayOfNullableRectangles;

    calculated Array<Rectangle?>? calculatedNullableArrayOfNullableRectangles from 'it => it.nullableArrayOfNullableRectangles';

    calculated Array<Rectangle?>? persistedNullableArrayOfNullableRectangles from 'it => it.nullableArrayOfNullableRectangles' { persisted; }
  }
}
