module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneImages_5 {
    Array<Image> oneArrayOfOneImages;

    calculated Array<Image> calculatedOneArrayOfOneImages from 'it => it.oneArrayOfOneImages';

    calculated Array<Image> persistedOneArrayOfOneImages from 'it => it.oneArrayOfOneImages' { persisted; }
  }
}
