module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullablePoints_3 {
    Array<Point?> oneArrayOfNullablePoints;

    calculated Array<Point?> calculatedOneArrayOfNullablePoints from 'it => it.oneArrayOfNullablePoints';

    calculated Array<Point?> persistedOneArrayOfNullablePoints from 'it => it.oneArrayOfNullablePoints' { persisted; }
  }
}
