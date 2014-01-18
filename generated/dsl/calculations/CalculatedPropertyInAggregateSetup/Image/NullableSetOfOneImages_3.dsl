module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneImages_3 {
    Set<Image>? nullableSetOfOneImages;

    calculated Set<Image>? calculatedNullableSetOfOneImages from 'it => it.nullableSetOfOneImages';

    calculated Set<Image>? persistedNullableSetOfOneImages from 'it => it.nullableSetOfOneImages' { persisted; }
  }
}
