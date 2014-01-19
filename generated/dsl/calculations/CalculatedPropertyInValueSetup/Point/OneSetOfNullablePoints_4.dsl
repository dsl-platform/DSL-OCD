module CalculatedPropertyInValueSetup
{
  value OneSetOfNullablePoints_4 {
    Set<Point?> oneSetOfNullablePoints;

    calculated Set<Point?> calculatedOneSetOfNullablePoints from 'it => it.oneSetOfNullablePoints';

    calculated Set<Point?> persistedOneSetOfNullablePoints from 'it => it.oneSetOfNullablePoints' { persisted; }
  }
}
