module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneRectangles_3 {
    Array<Rectangle> oneArrayOfOneRectangles;

    calculated Array<Rectangle> calculatedOneArrayOfOneRectangles from 'it => it.oneArrayOfOneRectangles';

    calculated Array<Rectangle> persistedOneArrayOfOneRectangles from 'it => it.oneArrayOfOneRectangles' { persisted; }
  }
}
