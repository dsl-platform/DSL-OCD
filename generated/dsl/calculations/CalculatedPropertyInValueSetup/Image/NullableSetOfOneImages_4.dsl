module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneImages_4 {
    Set<Image>? nullableSetOfOneImages;

    calculated Set<Image>? calculatedNullableSetOfOneImages from 'it => it.nullableSetOfOneImages';

    calculated Set<Image>? persistedNullableSetOfOneImages from 'it => it.nullableSetOfOneImages' { persisted; }
  }
}
