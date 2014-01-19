module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableRectangles_4 {
    Set<Rectangle?>? nullableSetOfNullableRectangles;

    calculated Set<Rectangle?>? calculatedNullableSetOfNullableRectangles from 'it => it.nullableSetOfNullableRectangles';

    calculated Set<Rectangle?>? persistedNullableSetOfNullableRectangles from 'it => it.nullableSetOfNullableRectangles' { persisted; }
  }
}
