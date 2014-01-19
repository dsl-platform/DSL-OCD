module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableRectangles_4 {
    Array<Rectangle?> oneArrayOfNullableRectangles;

    calculated Array<Rectangle?> calculatedOneArrayOfNullableRectangles from 'it => it.oneArrayOfNullableRectangles';

    calculated Array<Rectangle?> persistedOneArrayOfNullableRectangles from 'it => it.oneArrayOfNullableRectangles' { persisted; }
  }
}
