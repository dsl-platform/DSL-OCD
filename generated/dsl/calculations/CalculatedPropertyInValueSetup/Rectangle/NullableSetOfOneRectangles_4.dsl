module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneRectangles_4 {
    Set<Rectangle>? nullableSetOfOneRectangles;

    calculated Set<Rectangle>? calculatedNullableSetOfOneRectangles from 'it => it.nullableSetOfOneRectangles';

    calculated Set<Rectangle>? persistedNullableSetOfOneRectangles from 'it => it.nullableSetOfOneRectangles' { persisted; }
  }
}
