module CalculatedPropertyInValueSetup
{
  value NullableListOfOneRectangles_4 {
    List<Rectangle>? nullableListOfOneRectangles;

    calculated List<Rectangle>? calculatedNullableListOfOneRectangles from 'it => it.nullableListOfOneRectangles';

    calculated List<Rectangle>? persistedNullableListOfOneRectangles from 'it => it.nullableListOfOneRectangles' { persisted; }
  }
}
