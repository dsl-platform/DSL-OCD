module CalculatedPropertyInValueSetup
{
  value OneArrayOfOnePoints_4 {
    Array<Point> oneArrayOfOnePoints;

    calculated Array<Point> calculatedOneArrayOfOnePoints from 'it => it.oneArrayOfOnePoints';

    calculated Array<Point> persistedOneArrayOfOnePoints from 'it => it.oneArrayOfOnePoints' { persisted; }
  }
}
