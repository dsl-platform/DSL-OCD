module CalculatedPropertyInValueSetup
{
  value OneListOfOneImages_5 {
    List<Image> oneListOfOneImages;

    calculated List<Image> calculatedOneListOfOneImages from 'it => it.oneListOfOneImages';

    calculated List<Image> persistedOneListOfOneImages from 'it => it.oneListOfOneImages' { persisted; }
  }
}
