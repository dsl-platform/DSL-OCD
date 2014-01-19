module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneRectangles_4 {
    Array<Rectangle>? nullableArrayOfOneRectangles;

    calculated Array<Rectangle>? calculatedNullableArrayOfOneRectangles from 'it => it.nullableArrayOfOneRectangles';

    calculated Array<Rectangle>? persistedNullableArrayOfOneRectangles from 'it => it.nullableArrayOfOneRectangles' { persisted; }
  }
}
