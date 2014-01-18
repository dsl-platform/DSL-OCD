module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableRectangles_3 {
    List<Rectangle?> oneListOfNullableRectangles;

    calculated List<Rectangle?> calculatedOneListOfNullableRectangles from 'it => it.oneListOfNullableRectangles';

    calculated List<Rectangle?> persistedOneListOfNullableRectangles from 'it => it.oneListOfNullableRectangles' { persisted; }
  }
}
