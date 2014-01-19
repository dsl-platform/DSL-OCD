module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableRectangles_4 {
    List<Rectangle?>? nullableListOfNullableRectangles;

    calculated List<Rectangle?>? calculatedNullableListOfNullableRectangles from 'it => it.nullableListOfNullableRectangles';

    calculated List<Rectangle?>? persistedNullableListOfNullableRectangles from 'it => it.nullableListOfNullableRectangles' { persisted; }
  }
}
