module CalculatedPropertyInValueSetup
{
  value NullableListOfOneImages_4 {
    List<Image>? nullableListOfOneImages;

    calculated List<Image>? calculatedNullableListOfOneImages from 'it => it.nullableListOfOneImages';

    calculated List<Image>? persistedNullableListOfOneImages from 'it => it.nullableListOfOneImages' { persisted; }
  }
}
