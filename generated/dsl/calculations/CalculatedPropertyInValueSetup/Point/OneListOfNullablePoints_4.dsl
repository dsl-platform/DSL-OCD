module CalculatedPropertyInValueSetup
{
  value OneListOfNullablePoints_4 {
    List<Point?> oneListOfNullablePoints;

    calculated List<Point?> calculatedOneListOfNullablePoints from 'it => it.oneListOfNullablePoints';

    calculated List<Point?> persistedOneListOfNullablePoints from 'it => it.oneListOfNullablePoints' { persisted; }
  }
}
