module CalculatedPropertyInValueSetup
{
  value OneListOfNullableRectangles_4 {
    List<Rectangle?> oneListOfNullableRectangles;

    calculated List<Rectangle?> calculatedOneListOfNullableRectangles from 'it => it.oneListOfNullableRectangles';

    calculated List<Rectangle?> persistedOneListOfNullableRectangles from 'it => it.oneListOfNullableRectangles' { persisted; }
  }
}
