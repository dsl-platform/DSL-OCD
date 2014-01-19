module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableImages_5 {
    Array<Image?> oneArrayOfNullableImages;

    calculated Array<Image?> calculatedOneArrayOfNullableImages from 'it => it.oneArrayOfNullableImages';

    calculated Array<Image?> persistedOneArrayOfNullableImages from 'it => it.oneArrayOfNullableImages' { persisted; }
  }
}
