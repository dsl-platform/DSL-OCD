module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneRectangles_3 {
    Array<Rectangle>? nullableArrayOfOneRectangles;

    calculated Array<Rectangle>? calculatedNullableArrayOfOneRectangles from 'it => it.nullableArrayOfOneRectangles';

    calculated Array<Rectangle>? persistedNullableArrayOfOneRectangles from 'it => it.nullableArrayOfOneRectangles' { persisted; }
  }
}
